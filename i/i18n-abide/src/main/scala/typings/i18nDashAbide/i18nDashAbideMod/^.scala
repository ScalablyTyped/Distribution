package typings.i18nDashAbide.i18nDashAbideMod

import typings.express.expressMod.RequestHandler
import typings.i18nDashAbide.Anon_Lang
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18n-abide", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def abide(): RequestHandler = js.native
  def abide(options: AbideOptions): RequestHandler = js.native
  def bestLanguage(languages: js.Array[Anon_Lang], supported_languages: js.Array[String], defaultLanguage: String): String = js.native
  def format(fmt: String): String = js.native
  def format(fmt: String, obj: js.Any): String = js.native
  def format(fmt: String, obj: js.Any, named: Boolean): String = js.native
  def getLocales(): js.Array[String] = js.native
  def languageFrom(): String = js.native
  def languageFrom(locale: String): String = js.native
  def localeFrom(): String = js.native
  def localeFrom(language: String): String = js.native
  def normalizeLanguage(): String = js.native
  def normalizeLanguage(language: String): String = js.native
  def normalizeLocale(): String = js.native
  def normalizeLocale(locale: String): String = js.native
  def parseAcceptLanguage(): js.Array[Anon_Lang] = js.native
  def parseAcceptLanguage(header: String): js.Array[Anon_Lang] = js.native
}

