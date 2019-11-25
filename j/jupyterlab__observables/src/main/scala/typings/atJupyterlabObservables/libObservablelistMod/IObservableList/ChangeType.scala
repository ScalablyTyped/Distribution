package typings.atJupyterlabObservables.libObservablelistMod.IObservableList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The change types which occur on an observable list.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.add
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.move
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.remove
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.set
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  def add: typings.atJupyterlabObservables.atJupyterlabObservablesStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def move: typings.atJupyterlabObservables.atJupyterlabObservablesStrings.move = this.cast("move")
  @scala.inline
  def remove: typings.atJupyterlabObservables.atJupyterlabObservablesStrings.remove = this.cast("remove")
  @scala.inline
  def set: typings.atJupyterlabObservables.atJupyterlabObservablesStrings.set = this.cast("set")
}

