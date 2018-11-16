package typings
package atLinguiCoreLib.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/core/i18n", "I18n")
@js.native
class I18n () extends js.Object {
  var availableLanguages: js.Array[java.lang.String] = js.native
  var language: java.lang.String = js.native
  var languageData: LanguageData = js.native
  var messages: Messages = js.native
  def `_`(id: java.lang.String): java.lang.String = js.native
  def `_`(id: java.lang.String, values: js.Object): java.lang.String = js.native
  def `_`(id: java.lang.String, values: js.Object, messageOptions: MessageOptions): java.lang.String = js.native
  def activate(language: java.lang.String): scala.Unit = js.native
  def load(catalogs: Catalogs): scala.Unit = js.native
  def plural(config: atLinguiCoreLib.selectMod.PluralProps): java.lang.String = js.native
  def plural(id: java.lang.String, config: atLinguiCoreLib.selectMod.PluralProps): java.lang.String = js.native
  def pluralForm(n: scala.Double): java.lang.String = js.native
  @JSName("pluralForm")
  def pluralForm_cardinal(n: scala.Double, pluralType: atLinguiCoreLib.atLinguiCoreLibStrings.cardinal): java.lang.String = js.native
  @JSName("pluralForm")
  def pluralForm_ordinal(n: scala.Double, pluralType: atLinguiCoreLib.atLinguiCoreLibStrings.ordinal): java.lang.String = js.native
  def select(config: atLinguiCoreLib.selectMod.SelectProps): java.lang.String = js.native
  def select(id: java.lang.String, config: atLinguiCoreLib.selectMod.SelectProps): java.lang.String = js.native
  def selectOrdinal(config: atLinguiCoreLib.selectMod.PluralProps): java.lang.String = js.native
  def selectOrdinal(id: java.lang.String, config: atLinguiCoreLib.selectMod.PluralProps): java.lang.String = js.native
  def t(id: java.lang.String): js.Function2[/* strings */ stdLib.TemplateStringsArray, /* repeated */js.Any, java.lang.String] = js.native
  def t(strings: stdLib.TemplateStringsArray, values: js.Any*): java.lang.String = js.native
  def use(language: java.lang.String): I18n = js.native
}

