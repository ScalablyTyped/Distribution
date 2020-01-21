package typings.materialUiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.materialUiCore.materialUiCoreStrings.light
  - typings.materialUiCore.materialUiCoreStrings.dark
*/
trait PaletteType extends js.Object

object PaletteType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typings.materialUiCore.materialUiCoreStrings.dark = this.cast("dark")
  @scala.inline
  def light: typings.materialUiCore.materialUiCoreStrings.light = this.cast("light")
}

