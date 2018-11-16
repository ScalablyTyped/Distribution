package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object luxonNs {
  type DateObject = DateObjectUnits with LocaleOptions with luxonLib.Anon_ZoneString
  type DateTimeFormatOptions = stdLib.IntlNs.DateTimeFormatOptions
  type DateTimeJSOptions = LocaleOptions with luxonLib.Anon_ZoneString
  type DateTimeOptions = LocaleOptions with luxonLib.Anon_Zone
  type DurationObject = DurationObjectUnits with DurationOptions
  type DurationUnit = luxonLib.luxonLibStrings.year | luxonLib.luxonLibStrings.years | luxonLib.luxonLibStrings.quarter | luxonLib.luxonLibStrings.quarters | luxonLib.luxonLibStrings.month | luxonLib.luxonLibStrings.months | luxonLib.luxonLibStrings.week | luxonLib.luxonLibStrings.weeks | luxonLib.luxonLibStrings.day | luxonLib.luxonLibStrings.days | luxonLib.luxonLibStrings.hour | luxonLib.luxonLibStrings.hours | luxonLib.luxonLibStrings.minute | luxonLib.luxonLibStrings.minutes | luxonLib.luxonLibStrings.second | luxonLib.luxonLibStrings.seconds | luxonLib.luxonLibStrings.millisecond | luxonLib.luxonLibStrings.milliseconds
  type EraLength = luxonLib.luxonLibStrings.short | luxonLib.luxonLibStrings.long
  type IANAZone = Zone
  type ToFormatOptions = DateTimeFormatOptions with luxonLib.Anon_Round
  type UnitLength = EraLength | luxonLib.luxonLibStrings.numeric | luxonLib.luxonLibStrings.`2-digit` | luxonLib.luxonLibStrings.narrow
  type UnitOptions = InfoOptions with luxonLib.Anon_NumberingSystem
}
