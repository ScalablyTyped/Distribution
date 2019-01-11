package typings
package i18nDashAbideLib.i18nDashAbideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18n-abide", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def abide(): expressLib.expressMod.eNs.RequestHandler = js.native
  def abide(options: i18nDashAbideLib.i18nDashAbideMod.AbideOptions): expressLib.expressMod.eNs.RequestHandler = js.native
  def bestLanguage(
    languages: js.Array[i18nDashAbideLib.Anon_Lang],
    supported_languages: js.Array[java.lang.String],
    defaultLanguage: java.lang.String
  ): java.lang.String = js.native
  def format(fmt: java.lang.String): java.lang.String = js.native
  def format(fmt: java.lang.String, obj: js.Any): java.lang.String = js.native
  def format(fmt: java.lang.String, obj: js.Any, named: scala.Boolean): java.lang.String = js.native
  def getLocales(): js.Array[java.lang.String] = js.native
  def languageFrom(): java.lang.String = js.native
  def languageFrom(locale: java.lang.String): java.lang.String = js.native
  def localeFrom(): java.lang.String = js.native
  def localeFrom(language: java.lang.String): java.lang.String = js.native
  def normalizeLanguage(): java.lang.String = js.native
  def normalizeLanguage(language: java.lang.String): java.lang.String = js.native
  def normalizeLocale(): java.lang.String = js.native
  def normalizeLocale(locale: java.lang.String): java.lang.String = js.native
  def parseAcceptLanguage(): js.Array[i18nDashAbideLib.Anon_Lang] = js.native
  def parseAcceptLanguage(header: java.lang.String): js.Array[i18nDashAbideLib.Anon_Lang] = js.native
}

