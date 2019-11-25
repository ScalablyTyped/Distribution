package typings.atJupyterlabObservables.libObservablestringMod.IObservableString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The change types which occur on an observable string.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.insert
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.remove
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.set
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def insert: typings.atJupyterlabObservables.atJupyterlabObservablesStrings.insert = this.cast("insert")
  @scala.inline
  def remove: typings.atJupyterlabObservables.atJupyterlabObservablesStrings.remove = this.cast("remove")
  @scala.inline
  def set: typings.atJupyterlabObservables.atJupyterlabObservablesStrings.set = this.cast("set")
}

