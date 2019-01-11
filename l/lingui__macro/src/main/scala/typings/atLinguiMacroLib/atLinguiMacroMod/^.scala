package typings
package atLinguiMacroLib.atLinguiMacroMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/macro", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DateFormat: reactLib.reactMod.ReactNs.ComponentClass[
    atLinguiMacroLib.createFormatMod.FormatPropsWithoutI18n[stdLib.Date, stdLib.IntlNs.DateTimeFormatOptions], 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  val NumberFormat: reactLib.reactMod.ReactNs.ComponentClass[
    atLinguiMacroLib.createFormatMod.FormatPropsWithoutI18n[scala.Double, stdLib.IntlNs.NumberFormatOptions], 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def date(value: stdLib.Date): java.lang.String = js.native
  def date(value: stdLib.Date, format: stdLib.IntlNs.DateTimeFormatOptions): java.lang.String = js.native
  def number(value: scala.Double): java.lang.String = js.native
  def number(value: scala.Double, format: stdLib.IntlNs.NumberFormatOptions): java.lang.String = js.native
  def plural(config: atLinguiMacroLib.selectMod.PluralProps): java.lang.String = js.native
  def plural(id: java.lang.String, config: atLinguiMacroLib.selectMod.PluralProps): java.lang.String = js.native
  def select(config: atLinguiMacroLib.selectMod.SelectProps): java.lang.String = js.native
  def select(id: java.lang.String, config: atLinguiMacroLib.selectMod.SelectProps): java.lang.String = js.native
  def selectOrdinal(config: atLinguiMacroLib.selectMod.PluralProps): java.lang.String = js.native
  def selectOrdinal(id: java.lang.String, config: atLinguiMacroLib.selectMod.PluralProps): java.lang.String = js.native
  def t(id: java.lang.String): js.Function2[/* strings */ stdLib.TemplateStringsArray, /* repeated */ js.Any, java.lang.String] = js.native
  def t(strings: stdLib.TemplateStringsArray, values: js.Any*): java.lang.String = js.native
}

