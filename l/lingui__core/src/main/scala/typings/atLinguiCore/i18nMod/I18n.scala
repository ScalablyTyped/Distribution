package typings.atLinguiCore.i18nMod

import org.scalablytyped.runtime.TopLevel
import typings.atLinguiCore.atLinguiCoreStrings.cardinal
import typings.atLinguiCore.atLinguiCoreStrings.ordinal
import typings.atLinguiCore.selectMod.PluralProps
import typings.atLinguiCore.selectMod.SelectProps
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/core/i18n", "I18n")
@js.native
class I18n () extends js.Object {
  var availableLanguages: js.Array[String] = js.native
  var language: String = js.native
  var languageData: LanguageData = js.native
  var messages: Messages = js.native
  @JSName("_")
  def _underscore(id: String): String = js.native
  @JSName("_")
  def _underscore(id: String, values: js.Object): String = js.native
  @JSName("_")
  def _underscore(id: String, values: js.Object, messageOptions: MessageOptions): String = js.native
  @JSName("_")
  def _underscore(id: MessageDescriptor): String = js.native
  def activate(language: String): Unit = js.native
  def load(catalogs: Catalogs): Unit = js.native
  def plural(config: PluralProps): String = js.native
  def plural(id: String, config: PluralProps): String = js.native
  def pluralForm(n: Double): String = js.native
  @JSName("pluralForm")
  def pluralForm_cardinal(n: Double, pluralType: cardinal): String = js.native
  @JSName("pluralForm")
  def pluralForm_ordinal(n: Double, pluralType: ordinal): String = js.native
  def select(config: SelectProps): String = js.native
  def select(id: String, config: SelectProps): String = js.native
  def selectOrdinal(config: PluralProps): String = js.native
  def selectOrdinal(id: String, config: PluralProps): String = js.native
  def t(id: String): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  def t(strings: TemplateStringsArray, values: js.Any*): String = js.native
  def use(language: String): I18n = js.native
}

@JSImport("@lingui/core/i18n", "i18n")
@js.native
object i18n extends TopLevel[I18n]

