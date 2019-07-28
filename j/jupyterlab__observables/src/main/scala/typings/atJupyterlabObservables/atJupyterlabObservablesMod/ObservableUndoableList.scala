package typings.atJupyterlabObservables.atJupyterlabObservablesMod

import typings.atJupyterlabObservables.libUndoablelistMod.ISerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables", "ObservableUndoableList")
@js.native
class ObservableUndoableList[T] protected ()
  extends typings.atJupyterlabObservables.libUndoablelistMod.ObservableUndoableList[T] {
  /**
    * Construct a new undoable observable list.
    */
  def this(serializer: ISerializer[T]) = this()
}

