package typings.luxon

import typings.luxon.luxonMod.CalendarSystem
import typings.luxon.luxonMod.ConversionAccuracy
import typings.luxon.luxonMod.DurationUnit
import typings.luxon.luxonMod.HourCycle
import typings.luxon.luxonMod.NumberUnitLength
import typings.luxon.luxonMod.NumberingSystem
import typings.luxon.luxonMod.StringUnitLength
import typings.luxon.luxonMod.ToRelativeUnit
import typings.luxon.luxonMod.UnitLength
import typings.luxon.luxonMod.ZoneOffsetFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object luxonStrings {
  @js.native
  sealed trait `2-digit`
    extends NumberUnitLength
       with UnitLength
  
  @js.native
  sealed trait arab extends NumberingSystem
  
  @js.native
  sealed trait arabext extends NumberingSystem
  
  @js.native
  sealed trait bali extends NumberingSystem
  
  @js.native
  sealed trait beng extends NumberingSystem
  
  @js.native
  sealed trait buddhist extends CalendarSystem
  
  @js.native
  sealed trait casual extends ConversionAccuracy
  
  @js.native
  sealed trait chinese extends CalendarSystem
  
  @js.native
  sealed trait coptic extends CalendarSystem
  
  @js.native
  sealed trait day extends DurationUnit
  
  @js.native
  sealed trait days
    extends DurationUnit
       with ToRelativeUnit
  
  @js.native
  sealed trait deva extends NumberingSystem
  
  @js.native
  sealed trait ethioaa extends CalendarSystem
  
  @js.native
  sealed trait ethiopic extends CalendarSystem
  
  @js.native
  sealed trait fullwide extends NumberingSystem
  
  @js.native
  sealed trait gregory extends CalendarSystem
  
  @js.native
  sealed trait gujr extends NumberingSystem
  
  @js.native
  sealed trait guru extends NumberingSystem
  
  @js.native
  sealed trait h11 extends HourCycle
  
  @js.native
  sealed trait h12 extends HourCycle
  
  @js.native
  sealed trait h23 extends HourCycle
  
  @js.native
  sealed trait h24 extends HourCycle
  
  @js.native
  sealed trait hanidec extends NumberingSystem
  
  @js.native
  sealed trait hebrew extends CalendarSystem
  
  @js.native
  sealed trait hour extends DurationUnit
  
  @js.native
  sealed trait hours
    extends DurationUnit
       with ToRelativeUnit
  
  @js.native
  sealed trait indian extends CalendarSystem
  
  @js.native
  sealed trait islamic extends CalendarSystem
  
  @js.native
  sealed trait islamicc extends CalendarSystem
  
  @js.native
  sealed trait iso8601 extends CalendarSystem
  
  @js.native
  sealed trait japanese extends CalendarSystem
  
  @js.native
  sealed trait khmr extends NumberingSystem
  
  @js.native
  sealed trait knda extends NumberingSystem
  
  @js.native
  sealed trait laoo extends NumberingSystem
  
  @js.native
  sealed trait latn extends NumberingSystem
  
  @js.native
  sealed trait limb extends NumberingSystem
  
  @js.native
  sealed trait long
    extends StringUnitLength
       with UnitLength
  
  @js.native
  sealed trait longterm extends ConversionAccuracy
  
  @js.native
  sealed trait millisecond extends DurationUnit
  
  @js.native
  sealed trait milliseconds extends DurationUnit
  
  @js.native
  sealed trait minute extends DurationUnit
  
  @js.native
  sealed trait minutes
    extends DurationUnit
       with ToRelativeUnit
  
  @js.native
  sealed trait mlym extends NumberingSystem
  
  @js.native
  sealed trait mong extends NumberingSystem
  
  @js.native
  sealed trait month extends DurationUnit
  
  @js.native
  sealed trait months
    extends DurationUnit
       with ToRelativeUnit
  
  @js.native
  sealed trait mymr extends NumberingSystem
  
  @js.native
  sealed trait narrow
    extends StringUnitLength
       with UnitLength
       with ZoneOffsetFormat
  
  @js.native
  sealed trait numeric
    extends NumberUnitLength
       with UnitLength
  
  @js.native
  sealed trait orya extends NumberingSystem
  
  @js.native
  sealed trait persian extends CalendarSystem
  
  @js.native
  sealed trait quarter extends DurationUnit
  
  @js.native
  sealed trait quarters
    extends DurationUnit
       with ToRelativeUnit
  
  @js.native
  sealed trait roc extends CalendarSystem
  
  @js.native
  sealed trait second extends DurationUnit
  
  @js.native
  sealed trait seconds
    extends DurationUnit
       with ToRelativeUnit
  
  @js.native
  sealed trait short
    extends StringUnitLength
       with UnitLength
       with ZoneOffsetFormat
  
  @js.native
  sealed trait tamldec extends NumberingSystem
  
  @js.native
  sealed trait techie extends ZoneOffsetFormat
  
  @js.native
  sealed trait telu extends NumberingSystem
  
  @js.native
  sealed trait thai extends NumberingSystem
  
  @js.native
  sealed trait tibt extends NumberingSystem
  
  @js.native
  sealed trait week extends DurationUnit
  
  @js.native
  sealed trait weeks
    extends DurationUnit
       with ToRelativeUnit
  
  @js.native
  sealed trait year extends DurationUnit
  
  @js.native
  sealed trait years
    extends DurationUnit
       with ToRelativeUnit
  
  @scala.inline
  def `2-digit`: `2-digit` = "2-digit".asInstanceOf[`2-digit`]
  @scala.inline
  def arab: arab = "arab".asInstanceOf[arab]
  @scala.inline
  def arabext: arabext = "arabext".asInstanceOf[arabext]
  @scala.inline
  def bali: bali = "bali".asInstanceOf[bali]
  @scala.inline
  def beng: beng = "beng".asInstanceOf[beng]
  @scala.inline
  def buddhist: buddhist = "buddhist".asInstanceOf[buddhist]
  @scala.inline
  def casual: casual = "casual".asInstanceOf[casual]
  @scala.inline
  def chinese: chinese = "chinese".asInstanceOf[chinese]
  @scala.inline
  def coptic: coptic = "coptic".asInstanceOf[coptic]
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  @scala.inline
  def days: days = "days".asInstanceOf[days]
  @scala.inline
  def deva: deva = "deva".asInstanceOf[deva]
  @scala.inline
  def ethioaa: ethioaa = "ethioaa".asInstanceOf[ethioaa]
  @scala.inline
  def ethiopic: ethiopic = "ethiopic".asInstanceOf[ethiopic]
  @scala.inline
  def fullwide: fullwide = "fullwide".asInstanceOf[fullwide]
  @scala.inline
  def gregory: gregory = "gregory".asInstanceOf[gregory]
  @scala.inline
  def gujr: gujr = "gujr".asInstanceOf[gujr]
  @scala.inline
  def guru: guru = "guru".asInstanceOf[guru]
  @scala.inline
  def h11: h11 = "h11".asInstanceOf[h11]
  @scala.inline
  def h12: h12 = "h12".asInstanceOf[h12]
  @scala.inline
  def h23: h23 = "h23".asInstanceOf[h23]
  @scala.inline
  def h24: h24 = "h24".asInstanceOf[h24]
  @scala.inline
  def hanidec: hanidec = "hanidec".asInstanceOf[hanidec]
  @scala.inline
  def hebrew: hebrew = "hebrew".asInstanceOf[hebrew]
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  @scala.inline
  def hours: hours = "hours".asInstanceOf[hours]
  @scala.inline
  def indian: indian = "indian".asInstanceOf[indian]
  @scala.inline
  def islamic: islamic = "islamic".asInstanceOf[islamic]
  @scala.inline
  def islamicc: islamicc = "islamicc".asInstanceOf[islamicc]
  @scala.inline
  def iso8601: iso8601 = "iso8601".asInstanceOf[iso8601]
  @scala.inline
  def japanese: japanese = "japanese".asInstanceOf[japanese]
  @scala.inline
  def khmr: khmr = "khmr".asInstanceOf[khmr]
  @scala.inline
  def knda: knda = "knda".asInstanceOf[knda]
  @scala.inline
  def laoo: laoo = "laoo".asInstanceOf[laoo]
  @scala.inline
  def latn: latn = "latn".asInstanceOf[latn]
  @scala.inline
  def limb: limb = "limb".asInstanceOf[limb]
  @scala.inline
  def long: long = "long".asInstanceOf[long]
  @scala.inline
  def longterm: longterm = "longterm".asInstanceOf[longterm]
  @scala.inline
  def millisecond: millisecond = "millisecond".asInstanceOf[millisecond]
  @scala.inline
  def milliseconds: milliseconds = "milliseconds".asInstanceOf[milliseconds]
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  @scala.inline
  def minutes: minutes = "minutes".asInstanceOf[minutes]
  @scala.inline
  def mlym: mlym = "mlym".asInstanceOf[mlym]
  @scala.inline
  def mong: mong = "mong".asInstanceOf[mong]
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  @scala.inline
  def months: months = "months".asInstanceOf[months]
  @scala.inline
  def mymr: mymr = "mymr".asInstanceOf[mymr]
  @scala.inline
  def narrow: narrow = "narrow".asInstanceOf[narrow]
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  @scala.inline
  def orya: orya = "orya".asInstanceOf[orya]
  @scala.inline
  def persian: persian = "persian".asInstanceOf[persian]
  @scala.inline
  def quarter: quarter = "quarter".asInstanceOf[quarter]
  @scala.inline
  def quarters: quarters = "quarters".asInstanceOf[quarters]
  @scala.inline
  def roc: roc = "roc".asInstanceOf[roc]
  @scala.inline
  def second: second = "second".asInstanceOf[second]
  @scala.inline
  def seconds: seconds = "seconds".asInstanceOf[seconds]
  @scala.inline
  def short: short = "short".asInstanceOf[short]
  @scala.inline
  def tamldec: tamldec = "tamldec".asInstanceOf[tamldec]
  @scala.inline
  def techie: techie = "techie".asInstanceOf[techie]
  @scala.inline
  def telu: telu = "telu".asInstanceOf[telu]
  @scala.inline
  def thai: thai = "thai".asInstanceOf[thai]
  @scala.inline
  def tibt: tibt = "tibt".asInstanceOf[tibt]
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  @scala.inline
  def weeks: weeks = "weeks".asInstanceOf[weeks]
  @scala.inline
  def year: year = "year".asInstanceOf[year]
  @scala.inline
  def years: years = "years".asInstanceOf[years]
}

