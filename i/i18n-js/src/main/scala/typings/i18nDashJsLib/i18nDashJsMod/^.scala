package typings
package i18nDashJsLib.i18nDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18n-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultLocale: java.lang.String = js.native
  var defaultSeparator: java.lang.String = js.native
  var fallbacks: scala.Boolean = js.native
  var locale: java.lang.String = js.native
  var missingBehaviour: i18nDashJsLib.i18nDashJsLibStrings.message | i18nDashJsLib.i18nDashJsLibStrings.guess = js.native
  // tslint:disable-next-line prefer-declare-function
  var missingPlaceholder: js.Function3[
    /* placeholder */ java.lang.String, 
    /* message */ java.lang.String, 
    /* options */ js.UndefOr[InterpolateOptions], 
    js.UndefOr[java.lang.String | scala.Null]
  ] = js.native
  // tslint:disable-next-line prefer-declare-function
  var missingTranslation: js.Function2[
    /* scope */ java.lang.String, 
    /* options */ js.UndefOr[TranslateOptions], 
    js.UndefOr[java.lang.String | scala.Null]
  ] = js.native
  var missingTranslationPrefix: java.lang.String = js.native
  // tslint:disable-next-line prefer-declare-function
  var nullPlaceholder: js.Function3[
    /* placeholder */ java.lang.String, 
    /* message */ java.lang.String, 
    /* options */ js.UndefOr[InterpolateOptions], 
    js.UndefOr[java.lang.String | scala.Null]
  ] = js.native
  var placeholder: stdLib.RegExp = js.native
  def currentLocale(): java.lang.String = js.native
  def l(scope: Scope, value: java.lang.String): java.lang.String = js.native
  def l(scope: Scope, value: java.lang.String, options: InterpolateOptions): java.lang.String = js.native
  def l(scope: Scope, value: scala.Double): java.lang.String = js.native
  def l(scope: Scope, value: scala.Double, options: InterpolateOptions): java.lang.String = js.native
  def l(scope: Scope, value: stdLib.Date): java.lang.String = js.native
  def l(scope: Scope, value: stdLib.Date, options: InterpolateOptions): java.lang.String = js.native
  @JSName("l")
  def l_currency(scope: i18nDashJsLib.i18nDashJsLibStrings.currency, value: scala.Double): java.lang.String = js.native
  @JSName("l")
  def l_currency(
    scope: i18nDashJsLib.i18nDashJsLibStrings.currency,
    value: scala.Double,
    options: InterpolateOptions
  ): java.lang.String = js.native
  @JSName("l")
  def l_number(scope: i18nDashJsLib.i18nDashJsLibStrings.number, value: scala.Double): java.lang.String = js.native
  @JSName("l")
  def l_number(scope: i18nDashJsLib.i18nDashJsLibStrings.number, value: scala.Double, options: InterpolateOptions): java.lang.String = js.native
  @JSName("l")
  def l_percentage(scope: i18nDashJsLib.i18nDashJsLibStrings.percentage, value: scala.Double): java.lang.String = js.native
  @JSName("l")
  def l_percentage(
    scope: i18nDashJsLib.i18nDashJsLibStrings.percentage,
    value: scala.Double,
    options: InterpolateOptions
  ): java.lang.String = js.native
  def localize(scope: Scope, value: java.lang.String): java.lang.String = js.native
  def localize(scope: Scope, value: java.lang.String, options: InterpolateOptions): java.lang.String = js.native
  def localize(scope: Scope, value: scala.Double): java.lang.String = js.native
  def localize(scope: Scope, value: scala.Double, options: InterpolateOptions): java.lang.String = js.native
  def localize(scope: Scope, value: stdLib.Date): java.lang.String = js.native
  def localize(scope: Scope, value: stdLib.Date, options: InterpolateOptions): java.lang.String = js.native
  @JSName("localize")
  def localize_currency(scope: i18nDashJsLib.i18nDashJsLibStrings.currency, value: scala.Double): java.lang.String = js.native
  @JSName("localize")
  def localize_currency(
    scope: i18nDashJsLib.i18nDashJsLibStrings.currency,
    value: scala.Double,
    options: InterpolateOptions
  ): java.lang.String = js.native
  @JSName("localize")
  def localize_number(scope: i18nDashJsLib.i18nDashJsLibStrings.number, value: scala.Double): java.lang.String = js.native
  @JSName("localize")
  def localize_number(scope: i18nDashJsLib.i18nDashJsLibStrings.number, value: scala.Double, options: InterpolateOptions): java.lang.String = js.native
  @JSName("localize")
  def localize_percentage(scope: i18nDashJsLib.i18nDashJsLibStrings.percentage, value: scala.Double): java.lang.String = js.native
  @JSName("localize")
  def localize_percentage(
    scope: i18nDashJsLib.i18nDashJsLibStrings.percentage,
    value: scala.Double,
    options: InterpolateOptions
  ): java.lang.String = js.native
  def reset(): scala.Unit = js.native
  def strftime(date: stdLib.Date, format: java.lang.String): java.lang.String = js.native
  def t(scope: Scope): java.lang.String = js.native
  def t(scope: Scope, options: TranslateOptions): java.lang.String = js.native
  def toCurrency(num: scala.Double): java.lang.String = js.native
  def toCurrency(num: scala.Double, options: ToCurrencyOptions): java.lang.String = js.native
  def toHumanSize(num: scala.Double): java.lang.String = js.native
  def toHumanSize(num: scala.Double, options: ToHumanSizeOptions): java.lang.String = js.native
  def toNumber(num: scala.Double): java.lang.String = js.native
  def toNumber(num: scala.Double, options: ToNumberOptions): java.lang.String = js.native
  def toPercentage(num: scala.Double): java.lang.String = js.native
  def toPercentage(num: scala.Double, options: ToPercentageOptions): java.lang.String = js.native
  def toTime(scope: Scope, value: java.lang.String): java.lang.String = js.native
  def toTime(scope: Scope, value: scala.Double): java.lang.String = js.native
  def toTime(scope: Scope, value: stdLib.Date): java.lang.String = js.native
  def translate(scope: Scope): java.lang.String = js.native
  def translate(scope: Scope, options: TranslateOptions): java.lang.String = js.native
}

