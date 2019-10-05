package typings.atLinguiCore

import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/core/formats", JSImport.Namespace)
@js.native
object formatsMod extends js.Object {
  def date(language: String): js.Function1[/* value */ Date, String] = js.native
  def date(language: String, format: DateTimeFormatOptions): js.Function1[/* value */ Date, String] = js.native
  def number(language: String): js.Function1[/* value */ Double, String] = js.native
  def number(language: String, format: NumberFormatOptions): js.Function1[/* value */ Double, String] = js.native
}

