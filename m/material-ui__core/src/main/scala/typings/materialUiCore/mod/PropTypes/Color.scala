package typings.materialUiCore.mod.PropTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.materialUiCore.materialUiCoreStrings.inherit
  - typings.materialUiCore.materialUiCoreStrings.primary
  - typings.materialUiCore.materialUiCoreStrings.secondary
  - typings.materialUiCore.materialUiCoreStrings.default
*/
trait Color extends js.Object

object Color {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.materialUiCore.materialUiCoreStrings.default = this.cast("default")
  @scala.inline
  def inherit: typings.materialUiCore.materialUiCoreStrings.inherit = this.cast("inherit")
  @scala.inline
  def primary: typings.materialUiCore.materialUiCoreStrings.primary = this.cast("primary")
  @scala.inline
  def secondary: typings.materialUiCore.materialUiCoreStrings.secondary = this.cast("secondary")
}

