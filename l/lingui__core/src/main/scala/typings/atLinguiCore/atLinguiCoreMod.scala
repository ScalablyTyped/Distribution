package typings.atLinguiCore

import typings.atLinguiCore.i18nMod.setupI18nProps
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/core", JSImport.Namespace)
@js.native
object atLinguiCoreMod extends js.Object {
  @js.native
  class I18n ()
    extends typings.atLinguiCore.i18nMod.I18n
  
  val i18n: typings.atLinguiCore.i18nMod.I18n = js.native
  def date(language: String): js.Function1[/* value */ Date, String] = js.native
  def date(language: String, format: DateTimeFormatOptions): js.Function1[/* value */ Date, String] = js.native
  def i18nMark(id: String): String = js.native
  def number(language: String): js.Function1[/* value */ Double, String] = js.native
  def number(language: String, format: NumberFormatOptions): js.Function1[/* value */ Double, String] = js.native
  def setupI18n(): typings.atLinguiCore.i18nMod.I18n = js.native
  def setupI18n(params: setupI18nProps): typings.atLinguiCore.i18nMod.I18n = js.native
}

