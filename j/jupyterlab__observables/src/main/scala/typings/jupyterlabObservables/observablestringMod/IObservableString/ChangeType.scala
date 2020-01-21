package typings.jupyterlabObservables.observablestringMod.IObservableString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The change types which occur on an observable string.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabObservables.jupyterlabObservablesStrings.insert
  - typings.jupyterlabObservables.jupyterlabObservablesStrings.remove
  - typings.jupyterlabObservables.jupyterlabObservablesStrings.set
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def insert: typings.jupyterlabObservables.jupyterlabObservablesStrings.insert = this.cast("insert")
  @scala.inline
  def remove: typings.jupyterlabObservables.jupyterlabObservablesStrings.remove = this.cast("remove")
  @scala.inline
  def set: typings.jupyterlabObservables.jupyterlabObservablesStrings.set = this.cast("set")
}

