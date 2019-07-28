package typings.i18nDashJs.i18nDashJsMod

import typings.i18nDashJs.i18nDashJsStrings.currency
import typings.i18nDashJs.i18nDashJsStrings.guess
import typings.i18nDashJs.i18nDashJsStrings.message
import typings.i18nDashJs.i18nDashJsStrings.number
import typings.i18nDashJs.i18nDashJsStrings.percentage
import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18n-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultLocale: String = js.native
  var defaultSeparator: String = js.native
  var fallbacks: Boolean = js.native
  var locale: String = js.native
  var missingBehaviour: message | guess = js.native
  // tslint:disable-next-line prefer-declare-function
  var missingPlaceholder: js.Function3[
    /* placeholder */ String, 
    /* message */ String, 
    /* options */ js.UndefOr[InterpolateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  // tslint:disable-next-line prefer-declare-function
  var missingTranslation: js.Function2[
    /* scope */ String, 
    /* options */ js.UndefOr[TranslateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  var missingTranslationPrefix: String = js.native
  // tslint:disable-next-line prefer-declare-function
  var nullPlaceholder: js.Function3[
    /* placeholder */ String, 
    /* message */ String, 
    /* options */ js.UndefOr[InterpolateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  var placeholder: RegExp = js.native
  def currentLocale(): String = js.native
  def l(scope: Scope, value: String): String = js.native
  def l(scope: Scope, value: String, options: InterpolateOptions): String = js.native
  def l(scope: Scope, value: Double): String = js.native
  def l(scope: Scope, value: Double, options: InterpolateOptions): String = js.native
  def l(scope: Scope, value: Date): String = js.native
  def l(scope: Scope, value: Date, options: InterpolateOptions): String = js.native
  @JSName("l")
  def l_currency(scope: currency, value: Double): String = js.native
  @JSName("l")
  def l_currency(scope: currency, value: Double, options: InterpolateOptions): String = js.native
  @JSName("l")
  def l_number(scope: number, value: Double): String = js.native
  @JSName("l")
  def l_number(scope: number, value: Double, options: InterpolateOptions): String = js.native
  @JSName("l")
  def l_percentage(scope: percentage, value: Double): String = js.native
  @JSName("l")
  def l_percentage(scope: percentage, value: Double, options: InterpolateOptions): String = js.native
  def localize(scope: Scope, value: String): String = js.native
  def localize(scope: Scope, value: String, options: InterpolateOptions): String = js.native
  def localize(scope: Scope, value: Double): String = js.native
  def localize(scope: Scope, value: Double, options: InterpolateOptions): String = js.native
  def localize(scope: Scope, value: Date): String = js.native
  def localize(scope: Scope, value: Date, options: InterpolateOptions): String = js.native
  @JSName("localize")
  def localize_currency(scope: currency, value: Double): String = js.native
  @JSName("localize")
  def localize_currency(scope: currency, value: Double, options: InterpolateOptions): String = js.native
  @JSName("localize")
  def localize_number(scope: number, value: Double): String = js.native
  @JSName("localize")
  def localize_number(scope: number, value: Double, options: InterpolateOptions): String = js.native
  @JSName("localize")
  def localize_percentage(scope: percentage, value: Double): String = js.native
  @JSName("localize")
  def localize_percentage(scope: percentage, value: Double, options: InterpolateOptions): String = js.native
  def reset(): Unit = js.native
  def strftime(date: Date, format: String): String = js.native
  def t(scope: Scope): String = js.native
  def t(scope: Scope, options: TranslateOptions): String = js.native
  def toCurrency(num: Double): String = js.native
  def toCurrency(num: Double, options: ToCurrencyOptions): String = js.native
  def toHumanSize(num: Double): String = js.native
  def toHumanSize(num: Double, options: ToHumanSizeOptions): String = js.native
  def toNumber(num: Double): String = js.native
  def toNumber(num: Double, options: ToNumberOptions): String = js.native
  def toPercentage(num: Double): String = js.native
  def toPercentage(num: Double, options: ToPercentageOptions): String = js.native
  def toTime(scope: Scope, value: String): String = js.native
  def toTime(scope: Scope, value: Double): String = js.native
  def toTime(scope: Scope, value: Date): String = js.native
  def translate(scope: Scope): String = js.native
  def translate(scope: Scope, options: TranslateOptions): String = js.native
}

