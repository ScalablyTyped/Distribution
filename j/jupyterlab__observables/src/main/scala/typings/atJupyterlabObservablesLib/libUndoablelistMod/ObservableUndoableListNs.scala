package typings
package atJupyterlabObservablesLib.libUndoablelistMod

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
  class IdentitySerializer[T /* <: atPhosphorCoreutilsLib.libJsonMod.JSONValue */] ()
    extends atJupyterlabObservablesLib.libUndoablelistMod.ISerializer[T] {
    /**
      * Deserialize the object from JSON.
      */
    /* CompleteClass */
    override def fromJSON(value: atPhosphorCoreutilsLib.libJsonMod.JSONValue): T = js.native
    /**
      * Convert the object to JSON.
      */
    /* CompleteClass */
    override def toJSON(value: T): atPhosphorCoreutilsLib.libJsonMod.JSONValue = js.native
  }
  
}

