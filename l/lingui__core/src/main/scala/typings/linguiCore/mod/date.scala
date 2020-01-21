package typings.linguiCore.mod

import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/core", "date")
@js.native
object date extends js.Object {
  def apply(language: String): js.Function1[/* value */ Date, String] = js.native
  def apply(language: String, format: DateTimeFormatOptions): js.Function1[/* value */ Date, String] = js.native
}

