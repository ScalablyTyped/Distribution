package typings
package intlDashMessageformatLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: stdLib.ConstructorParameters[intlDashMessageformatLib.Anon_LocalesOptions]
  ): stdLib.IntlNs.DateTimeFormat
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: stdLib.ConstructorParameters[intlDashMessageformatLib.Anon_Locales]
  ): stdLib.IntlNs.NumberFormat
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: stdLib.ConstructorParameters[intlDashMessageformatLib.Anon_LocalesOptionsSupportedLocalesOf]
  ): stdLib.IntlNs.PluralRules
}

object Formatters {
  @scala.inline
  def apply(
    getDateTimeFormat: stdLib.ConstructorParameters[intlDashMessageformatLib.Anon_LocalesOptions] => stdLib.IntlNs.DateTimeFormat,
    getNumberFormat: stdLib.ConstructorParameters[intlDashMessageformatLib.Anon_Locales] => stdLib.IntlNs.NumberFormat,
    getPluralRules: stdLib.ConstructorParameters[intlDashMessageformatLib.Anon_LocalesOptionsSupportedLocalesOf] => stdLib.IntlNs.PluralRules
  ): Formatters = {
    val __obj = js.Dynamic.literal(getDateTimeFormat = js.Any.fromFunction1(getDateTimeFormat), getNumberFormat = js.Any.fromFunction1(getNumberFormat), getPluralRules = js.Any.fromFunction1(getPluralRules))
  
    __obj.asInstanceOf[Formatters]
  }
}

