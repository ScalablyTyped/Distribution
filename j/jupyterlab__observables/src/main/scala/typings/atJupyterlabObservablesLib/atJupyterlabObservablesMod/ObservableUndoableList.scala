package typings
package atJupyterlabObservablesLib.atJupyterlabObservablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables", "ObservableUndoableList")
@js.native
class ObservableUndoableList[T] protected ()
  extends atJupyterlabObservablesLib.libUndoablelistMod.ObservableUndoableList[T] {
  /**
    * Construct a new undoable observable list.
    */
  def this(serializer: atJupyterlabObservablesLib.libUndoablelistMod.ISerializer[T]) = this()
}

