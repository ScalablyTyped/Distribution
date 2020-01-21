package typings.linguiMacro.mod

import typings.linguiCore.i18nMod.MessageDescriptor
import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/macro", "number")
@js.native
object number extends js.Object {
  def apply(value: Double): MessageDescriptor = js.native
  def apply(value: Double, format: NumberFormatOptions): MessageDescriptor = js.native
}

