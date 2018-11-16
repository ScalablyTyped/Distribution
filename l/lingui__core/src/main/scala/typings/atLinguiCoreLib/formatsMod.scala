package typings
package atLinguiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/core/formats", JSImport.Namespace)
@js.native
object formatsMod extends js.Object {
  def date(language: java.lang.String): js.Function1[/* value */ stdLib.Date, java.lang.String] = js.native
  def date(language: java.lang.String, format: stdLib.IntlNs.DateTimeFormatOptions): js.Function1[/* value */ stdLib.Date, java.lang.String] = js.native
  def number(language: java.lang.String): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  def number(language: java.lang.String, format: stdLib.IntlNs.NumberFormatOptions): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
}

