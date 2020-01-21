package typings.linguiMacro.mod

import typings.linguiCore.i18nMod.MessageDescriptor
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/macro", "date")
@js.native
object date extends js.Object {
  def apply(value: Date): MessageDescriptor = js.native
  def apply(value: Date, format: DateTimeFormatOptions): MessageDescriptor = js.native
}

