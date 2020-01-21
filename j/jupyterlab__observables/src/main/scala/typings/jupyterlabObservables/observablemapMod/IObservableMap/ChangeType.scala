package typings.jupyterlabObservables.observablemapMod.IObservableMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The change types which occur on an observable map.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabObservables.jupyterlabObservablesStrings.add
  - typings.jupyterlabObservables.jupyterlabObservablesStrings.remove
  - typings.jupyterlabObservables.jupyterlabObservablesStrings.change
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  def add: typings.jupyterlabObservables.jupyterlabObservablesStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.jupyterlabObservables.jupyterlabObservablesStrings.change = this.cast("change")
  @scala.inline
  def remove: typings.jupyterlabObservables.jupyterlabObservablesStrings.remove = this.cast("remove")
}

