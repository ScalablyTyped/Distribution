package typings.materialUiCore.colorManipulatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.materialUiCore.materialUiCoreStrings.rgb
  - typings.materialUiCore.materialUiCoreStrings.rgba
  - typings.materialUiCore.materialUiCoreStrings.hsl
  - typings.materialUiCore.materialUiCoreStrings.hsla
*/
trait ColorFormat extends js.Object

object ColorFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hsl: typings.materialUiCore.materialUiCoreStrings.hsl = this.cast("hsl")
  @scala.inline
  def hsla: typings.materialUiCore.materialUiCoreStrings.hsla = this.cast("hsla")
  @scala.inline
  def rgb: typings.materialUiCore.materialUiCoreStrings.rgb = this.cast("rgb")
  @scala.inline
  def rgba: typings.materialUiCore.materialUiCoreStrings.rgba = this.cast("rgba")
}

