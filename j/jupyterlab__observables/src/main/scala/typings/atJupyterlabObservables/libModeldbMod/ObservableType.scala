package typings.atJupyterlabObservables.libModeldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.Map
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.List
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.String
  - typings.atJupyterlabObservables.atJupyterlabObservablesStrings.Value
*/
trait ObservableType extends js.Object

object ObservableType {
  @scala.inline
  def List: typings.atJupyterlabObservables.atJupyterlabObservablesStrings.List = this.cast("List")
  @scala.inline
  def Map: typings.atJupyterlabObservables.atJupyterlabObservablesStrings.Map = this.cast("Map")
  @scala.inline
  def String: typings.atJupyterlabObservables.atJupyterlabObservablesStrings.String = this.cast("String")
  @scala.inline
  def Value: typings.atJupyterlabObservables.atJupyterlabObservablesStrings.Value = this.cast("Value")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

