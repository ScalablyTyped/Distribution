package typings.atJupyterlabObservables.libUndoablelistMod

import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/undoablelist", "ObservableUndoableList")
@js.native
object ObservableUndoableListNs extends js.Object {
  /**
    * A default, identity serializer.
    */
  @js.native
  class IdentitySerializer[T /* <: JSONValue */] () extends ISerializer[T] {
    /**
      * Deserialize the object from JSON.
      */
    /* CompleteClass */
    override def fromJSON(value: JSONValue): T = js.native
    /**
      * Convert the object to JSON.
      */
    /* CompleteClass */
    override def toJSON(value: T): JSONValue = js.native
  }
  
}

