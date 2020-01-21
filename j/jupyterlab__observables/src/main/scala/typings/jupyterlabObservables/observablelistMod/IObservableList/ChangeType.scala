package typings.jupyterlabObservables.observablelistMod.IObservableList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The change types which occur on an observable list.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabObservables.jupyterlabObservablesStrings.add
  - typings.jupyterlabObservables.jupyterlabObservablesStrings.move
  - typings.jupyterlabObservables.jupyterlabObservablesStrings.remove
  - typings.jupyterlabObservables.jupyterlabObservablesStrings.set
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  def add: typings.jupyterlabObservables.jupyterlabObservablesStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def move: typings.jupyterlabObservables.jupyterlabObservablesStrings.move = this.cast("move")
  @scala.inline
  def remove: typings.jupyterlabObservables.jupyterlabObservablesStrings.remove = this.cast("remove")
  @scala.inline
  def set: typings.jupyterlabObservables.jupyterlabObservablesStrings.set = this.cast("set")
}

