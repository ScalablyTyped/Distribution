package typings
package atLinguiCoreLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/core", JSImport.Namespace)
@js.native
object coreModMembers extends js.Object {
  val i18n: atLinguiCoreLib.i18nMod.I18n = js.native
  def date(language: java.lang.String): js.Function1[/* value */ stdLib.Date, java.lang.String] = js.native
  def date(language: java.lang.String, format: stdLib.IntlNs.DateTimeFormatOptions): js.Function1[/* value */ stdLib.Date, java.lang.String] = js.native
  def i18nMark(id: java.lang.String): java.lang.String = js.native
  def number(language: java.lang.String): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  def number(language: java.lang.String, format: stdLib.IntlNs.NumberFormatOptions): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  def setupI18n(): atLinguiCoreLib.i18nMod.I18n = js.native
  def setupI18n(params: atLinguiCoreLib.i18nMod.setupI18nProps): atLinguiCoreLib.i18nMod.I18n = js.native
}

