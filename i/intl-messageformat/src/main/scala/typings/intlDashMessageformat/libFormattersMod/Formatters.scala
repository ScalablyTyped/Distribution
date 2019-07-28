package typings.intlDashMessageformat.libFormattersMod

import typings.intlDashMessageformat.Anon_Locales
import typings.intlDashMessageformat.Anon_LocalesOptions
import typings.intlDashMessageformat.Anon_LocalesOptionsSupportedLocalesOf
import typings.std.ConstructorParameters
import typings.std.IntlNs.DateTimeFormat
import typings.std.IntlNs.NumberFormat
import typings.std.IntlNs.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[Anon_LocalesOptions]
  ): DateTimeFormat
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[Anon_Locales]
  ): NumberFormat
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[Anon_LocalesOptionsSupportedLocalesOf]
  ): PluralRules
}

object Formatters {
  @scala.inline
  def apply(
    getDateTimeFormat: ConstructorParameters[Anon_LocalesOptions] => DateTimeFormat,
    getNumberFormat: ConstructorParameters[Anon_Locales] => NumberFormat,
    getPluralRules: ConstructorParameters[Anon_LocalesOptionsSupportedLocalesOf] => PluralRules
  ): Formatters = {
    val __obj = js.Dynamic.literal(getDateTimeFormat = js.Any.fromFunction1(getDateTimeFormat), getNumberFormat = js.Any.fromFunction1(getNumberFormat), getPluralRules = js.Any.fromFunction1(getPluralRules))
  
    __obj.asInstanceOf[Formatters]
  }
}

