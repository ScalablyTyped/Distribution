package typings.luxon

import typings.luxon.mod.CalendarSystem
import typings.luxon.mod.ConversionAccuracy
import typings.luxon.mod.DurationUnit
import typings.luxon.mod.HourCycle
import typings.luxon.mod.NumberUnitLength
import typings.luxon.mod.NumberingSystem
import typings.luxon.mod.StringUnitLength
import typings.luxon.mod.ToRelativeUnit
import typings.luxon.mod.UnitLength
import typings.luxon.mod.ZoneOffsetFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object luxonStrings {
  @js.native
  sealed trait `2-digit`
    extends NumberUnitLength
       with UnitLength
  
  @js.native
  sealed trait DATETIME_FULL extends js.Object
  
  @js.native
  sealed trait DATETIME_FULL_WITH_SECONDS extends js.Object
  
  @js.native
  sealed trait DATETIME_HUGE extends js.Object
  
  @js.native
  sealed trait DATETIME_HUGE_WITH_SECONDS extends js.Object
  
  @js.native
  sealed trait DATETIME_MED extends js.Object
  
  @js.native
  sealed trait DATETIME_MED_WITH_SECONDS extends js.Object
  
  @js.native
  sealed trait DATETIME_SHORT extends js.Object
  
  @js.native
  sealed trait DATETIME_SHORT_WITH_SECONDS extends js.Object
  
  @js.native
  sealed trait DATE_FULL extends js.Object
  
  @js.native
  sealed trait DATE_HUGE extends js.Object
  
  @js.native
  sealed trait DATE_MED extends js.Object
  
  @js.native
  sealed trait DATE_SHORT extends js.Object
  
  @js.native
  sealed trait TIME_24_SIMPLE extends js.Object
  
  @js.native
  sealed trait TIME_24_WITH_LONG_OFFSET extends js.Object
  
  @js.native
  sealed trait TIME_24_WITH_SECONDS extends js.Object
  
  @js.native
  sealed trait TIME_24_WITH_SHORT_OFFSET extends js.Object
  
  @js.native
  sealed trait TIME_SIMPLE extends js.Object
  
  @js.native
  sealed trait TIME_WITH_LONG_OFFSET extends js.Object
  
  @js.native
  sealed trait TIME_WITH_SECONDS extends js.Object
  
  @js.native
  sealed trait TIME_WITH_SHORT_OFFSET extends js.Object
  
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
  sealed trait daysInMonth extends js.Object
  
  @js.native
  sealed trait daysInYear extends js.Object
  
  @js.native
  sealed trait deva extends NumberingSystem
  
  @js.native
  sealed trait diff extends js.Object
  
  @js.native
  sealed trait diffNow extends js.Object
  
  @js.native
  sealed trait endOf extends js.Object
  
  @js.native
  sealed trait equals extends js.Object
  
  @js.native
  sealed trait ethioaa extends CalendarSystem
  
  @js.native
  sealed trait ethiopic extends CalendarSystem
  
  @js.native
  sealed trait fromFormat extends js.Object
  
  @js.native
  sealed trait fromFormatExplain extends js.Object
  
  @js.native
  sealed trait fromHTTP extends js.Object
  
  @js.native
  sealed trait fromISO extends js.Object
  
  @js.native
  sealed trait fromJSDate extends js.Object
  
  @js.native
  sealed trait fromMillis extends js.Object
  
  @js.native
  sealed trait fromObject extends js.Object
  
  @js.native
  sealed trait fromRFC2822 extends js.Object
  
  @js.native
  sealed trait fromSQL extends js.Object
  
  @js.native
  sealed trait fromSeconds extends js.Object
  
  @js.native
  sealed trait fromString extends js.Object
  
  @js.native
  sealed trait fromStringExplain extends js.Object
  
  @js.native
  sealed trait fullwide extends NumberingSystem
  
  @js.native
  sealed trait get extends js.Object
  
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
  sealed trait hasSame extends js.Object
  
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
  sealed trait invalid extends js.Object
  
  @js.native
  sealed trait invalidExplanation extends js.Object
  
  @js.native
  sealed trait invalidReason extends js.Object
  
  @js.native
  sealed trait isDateTime extends js.Object
  
  @js.native
  sealed trait isInDST extends js.Object
  
  @js.native
  sealed trait isInLeapYear extends js.Object
  
  @js.native
  sealed trait isOffsetFixed extends js.Object
  
  @js.native
  sealed trait isValid extends js.Object
  
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
  sealed trait local extends js.Object
  
  @js.native
  sealed trait locale extends js.Object
  
  @js.native
  sealed trait long
    extends StringUnitLength
       with UnitLength
  
  @js.native
  sealed trait longterm extends ConversionAccuracy
  
  @js.native
  sealed trait max extends js.Object
  
  @js.native
  sealed trait millisecond extends DurationUnit
  
  @js.native
  sealed trait milliseconds extends DurationUnit
  
  @js.native
  sealed trait min extends js.Object
  
  @js.native
  sealed trait minus extends js.Object
  
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
  sealed trait monthLong extends js.Object
  
  @js.native
  sealed trait monthShort extends js.Object
  
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
  sealed trait numberingSystem extends js.Object
  
  @js.native
  sealed trait numeric
    extends NumberUnitLength
       with UnitLength
  
  @js.native
  sealed trait offset extends js.Object
  
  @js.native
  sealed trait offsetNameLong extends js.Object
  
  @js.native
  sealed trait offsetNameShort extends js.Object
  
  @js.native
  sealed trait ordinal extends js.Object
  
  @js.native
  sealed trait orya extends NumberingSystem
  
  @js.native
  sealed trait outputCalendar extends js.Object
  
  @js.native
  sealed trait persian extends CalendarSystem
  
  @js.native
  sealed trait plus extends js.Object
  
  @js.native
  sealed trait quarter extends DurationUnit
  
  @js.native
  sealed trait quarters
    extends DurationUnit
       with ToRelativeUnit
  
  @js.native
  sealed trait reconfigure extends js.Object
  
  @js.native
  sealed trait resolvedLocaleOpts extends js.Object
  
  @js.native
  sealed trait roc extends CalendarSystem
  
  @js.native
  sealed trait second extends DurationUnit
  
  @js.native
  sealed trait seconds
    extends DurationUnit
       with ToRelativeUnit
  
  @js.native
  sealed trait set extends js.Object
  
  @js.native
  sealed trait setLocale extends js.Object
  
  @js.native
  sealed trait setZone extends js.Object
  
  @js.native
  sealed trait short
    extends StringUnitLength
       with UnitLength
       with ZoneOffsetFormat
  
  @js.native
  sealed trait startOf extends js.Object
  
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
  sealed trait toBSON extends js.Object
  
  @js.native
  sealed trait toFormat extends js.Object
  
  @js.native
  sealed trait toHTTP extends js.Object
  
  @js.native
  sealed trait toISO extends js.Object
  
  @js.native
  sealed trait toISODate extends js.Object
  
  @js.native
  sealed trait toISOTime extends js.Object
  
  @js.native
  sealed trait toISOWeekDate extends js.Object
  
  @js.native
  sealed trait toJSDate extends js.Object
  
  @js.native
  sealed trait toJSON extends js.Object
  
  @js.native
  sealed trait toLocal extends js.Object
  
  @js.native
  sealed trait toLocaleParts extends js.Object
  
  @js.native
  sealed trait toLocaleString extends js.Object
  
  @js.native
  sealed trait toMillis extends js.Object
  
  @js.native
  sealed trait toObject extends js.Object
  
  @js.native
  sealed trait toRFC2822 extends js.Object
  
  @js.native
  sealed trait toRelative extends js.Object
  
  @js.native
  sealed trait toRelativeCalendar extends js.Object
  
  @js.native
  sealed trait toSQL extends js.Object
  
  @js.native
  sealed trait toSQLDate extends js.Object
  
  @js.native
  sealed trait toSQLTime extends js.Object
  
  @js.native
  sealed trait toSeconds extends js.Object
  
  @js.native
  sealed trait toString extends js.Object
  
  @js.native
  sealed trait toUTC extends js.Object
  
  @js.native
  sealed trait until extends js.Object
  
  @js.native
  sealed trait utc extends js.Object
  
  @js.native
  sealed trait valueOf extends js.Object
  
  @js.native
  sealed trait week extends DurationUnit
  
  @js.native
  sealed trait weekNumber extends js.Object
  
  @js.native
  sealed trait weekYear extends js.Object
  
  @js.native
  sealed trait weekday extends js.Object
  
  @js.native
  sealed trait weekdayLong extends js.Object
  
  @js.native
  sealed trait weekdayShort extends js.Object
  
  @js.native
  sealed trait weeks
    extends DurationUnit
       with ToRelativeUnit
  
  @js.native
  sealed trait weeksInWeekYear extends js.Object
  
  @js.native
  sealed trait year extends DurationUnit
  
  @js.native
  sealed trait years
    extends DurationUnit
       with ToRelativeUnit
  
  @js.native
  sealed trait zone extends js.Object
  
  @js.native
  sealed trait zoneName extends js.Object
  
  @scala.inline
  def `2-digit`: `2-digit` = "2-digit".asInstanceOf[`2-digit`]
  @scala.inline
  def DATETIME_FULL: DATETIME_FULL = "DATETIME_FULL".asInstanceOf[DATETIME_FULL]
  @scala.inline
  def DATETIME_FULL_WITH_SECONDS: DATETIME_FULL_WITH_SECONDS = "DATETIME_FULL_WITH_SECONDS".asInstanceOf[DATETIME_FULL_WITH_SECONDS]
  @scala.inline
  def DATETIME_HUGE: DATETIME_HUGE = "DATETIME_HUGE".asInstanceOf[DATETIME_HUGE]
  @scala.inline
  def DATETIME_HUGE_WITH_SECONDS: DATETIME_HUGE_WITH_SECONDS = "DATETIME_HUGE_WITH_SECONDS".asInstanceOf[DATETIME_HUGE_WITH_SECONDS]
  @scala.inline
  def DATETIME_MED: DATETIME_MED = "DATETIME_MED".asInstanceOf[DATETIME_MED]
  @scala.inline
  def DATETIME_MED_WITH_SECONDS: DATETIME_MED_WITH_SECONDS = "DATETIME_MED_WITH_SECONDS".asInstanceOf[DATETIME_MED_WITH_SECONDS]
  @scala.inline
  def DATETIME_SHORT: DATETIME_SHORT = "DATETIME_SHORT".asInstanceOf[DATETIME_SHORT]
  @scala.inline
  def DATETIME_SHORT_WITH_SECONDS: DATETIME_SHORT_WITH_SECONDS = "DATETIME_SHORT_WITH_SECONDS".asInstanceOf[DATETIME_SHORT_WITH_SECONDS]
  @scala.inline
  def DATE_FULL: DATE_FULL = "DATE_FULL".asInstanceOf[DATE_FULL]
  @scala.inline
  def DATE_HUGE: DATE_HUGE = "DATE_HUGE".asInstanceOf[DATE_HUGE]
  @scala.inline
  def DATE_MED: DATE_MED = "DATE_MED".asInstanceOf[DATE_MED]
  @scala.inline
  def DATE_SHORT: DATE_SHORT = "DATE_SHORT".asInstanceOf[DATE_SHORT]
  @scala.inline
  def TIME_24_SIMPLE: TIME_24_SIMPLE = "TIME_24_SIMPLE".asInstanceOf[TIME_24_SIMPLE]
  @scala.inline
  def TIME_24_WITH_LONG_OFFSET: TIME_24_WITH_LONG_OFFSET = "TIME_24_WITH_LONG_OFFSET".asInstanceOf[TIME_24_WITH_LONG_OFFSET]
  @scala.inline
  def TIME_24_WITH_SECONDS: TIME_24_WITH_SECONDS = "TIME_24_WITH_SECONDS".asInstanceOf[TIME_24_WITH_SECONDS]
  @scala.inline
  def TIME_24_WITH_SHORT_OFFSET: TIME_24_WITH_SHORT_OFFSET = "TIME_24_WITH_SHORT_OFFSET".asInstanceOf[TIME_24_WITH_SHORT_OFFSET]
  @scala.inline
  def TIME_SIMPLE: TIME_SIMPLE = "TIME_SIMPLE".asInstanceOf[TIME_SIMPLE]
  @scala.inline
  def TIME_WITH_LONG_OFFSET: TIME_WITH_LONG_OFFSET = "TIME_WITH_LONG_OFFSET".asInstanceOf[TIME_WITH_LONG_OFFSET]
  @scala.inline
  def TIME_WITH_SECONDS: TIME_WITH_SECONDS = "TIME_WITH_SECONDS".asInstanceOf[TIME_WITH_SECONDS]
  @scala.inline
  def TIME_WITH_SHORT_OFFSET: TIME_WITH_SHORT_OFFSET = "TIME_WITH_SHORT_OFFSET".asInstanceOf[TIME_WITH_SHORT_OFFSET]
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
  def daysInMonth: daysInMonth = "daysInMonth".asInstanceOf[daysInMonth]
  @scala.inline
  def daysInYear: daysInYear = "daysInYear".asInstanceOf[daysInYear]
  @scala.inline
  def deva: deva = "deva".asInstanceOf[deva]
  @scala.inline
  def diff: diff = "diff".asInstanceOf[diff]
  @scala.inline
  def diffNow: diffNow = "diffNow".asInstanceOf[diffNow]
  @scala.inline
  def endOf: endOf = "endOf".asInstanceOf[endOf]
  @scala.inline
  def equals: equals = "equals".asInstanceOf[equals]
  @scala.inline
  def ethioaa: ethioaa = "ethioaa".asInstanceOf[ethioaa]
  @scala.inline
  def ethiopic: ethiopic = "ethiopic".asInstanceOf[ethiopic]
  @scala.inline
  def fromFormat: fromFormat = "fromFormat".asInstanceOf[fromFormat]
  @scala.inline
  def fromFormatExplain: fromFormatExplain = "fromFormatExplain".asInstanceOf[fromFormatExplain]
  @scala.inline
  def fromHTTP: fromHTTP = "fromHTTP".asInstanceOf[fromHTTP]
  @scala.inline
  def fromISO: fromISO = "fromISO".asInstanceOf[fromISO]
  @scala.inline
  def fromJSDate: fromJSDate = "fromJSDate".asInstanceOf[fromJSDate]
  @scala.inline
  def fromMillis: fromMillis = "fromMillis".asInstanceOf[fromMillis]
  @scala.inline
  def fromObject: fromObject = "fromObject".asInstanceOf[fromObject]
  @scala.inline
  def fromRFC2822: fromRFC2822 = "fromRFC2822".asInstanceOf[fromRFC2822]
  @scala.inline
  def fromSQL: fromSQL = "fromSQL".asInstanceOf[fromSQL]
  @scala.inline
  def fromSeconds: fromSeconds = "fromSeconds".asInstanceOf[fromSeconds]
  @scala.inline
  def fromString: fromString = "fromString".asInstanceOf[fromString]
  @scala.inline
  def fromStringExplain: fromStringExplain = "fromStringExplain".asInstanceOf[fromStringExplain]
  @scala.inline
  def fullwide: fullwide = "fullwide".asInstanceOf[fullwide]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
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
  def hasSame: hasSame = "hasSame".asInstanceOf[hasSame]
  @scala.inline
  def hebrew: hebrew = "hebrew".asInstanceOf[hebrew]
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  @scala.inline
  def hours: hours = "hours".asInstanceOf[hours]
  @scala.inline
  def indian: indian = "indian".asInstanceOf[indian]
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  @scala.inline
  def invalidExplanation: invalidExplanation = "invalidExplanation".asInstanceOf[invalidExplanation]
  @scala.inline
  def invalidReason: invalidReason = "invalidReason".asInstanceOf[invalidReason]
  @scala.inline
  def isDateTime: isDateTime = "isDateTime".asInstanceOf[isDateTime]
  @scala.inline
  def isInDST: isInDST = "isInDST".asInstanceOf[isInDST]
  @scala.inline
  def isInLeapYear: isInLeapYear = "isInLeapYear".asInstanceOf[isInLeapYear]
  @scala.inline
  def isOffsetFixed: isOffsetFixed = "isOffsetFixed".asInstanceOf[isOffsetFixed]
  @scala.inline
  def isValid: isValid = "isValid".asInstanceOf[isValid]
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
  def local: local = "local".asInstanceOf[local]
  @scala.inline
  def locale: locale = "locale".asInstanceOf[locale]
  @scala.inline
  def long: long = "long".asInstanceOf[long]
  @scala.inline
  def longterm: longterm = "longterm".asInstanceOf[longterm]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def millisecond: millisecond = "millisecond".asInstanceOf[millisecond]
  @scala.inline
  def milliseconds: milliseconds = "milliseconds".asInstanceOf[milliseconds]
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  @scala.inline
  def minus: minus = "minus".asInstanceOf[minus]
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
  def monthLong: monthLong = "monthLong".asInstanceOf[monthLong]
  @scala.inline
  def monthShort: monthShort = "monthShort".asInstanceOf[monthShort]
  @scala.inline
  def months: months = "months".asInstanceOf[months]
  @scala.inline
  def mymr: mymr = "mymr".asInstanceOf[mymr]
  @scala.inline
  def narrow: narrow = "narrow".asInstanceOf[narrow]
  @scala.inline
  def numberingSystem: numberingSystem = "numberingSystem".asInstanceOf[numberingSystem]
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  @scala.inline
  def offset: offset = "offset".asInstanceOf[offset]
  @scala.inline
  def offsetNameLong: offsetNameLong = "offsetNameLong".asInstanceOf[offsetNameLong]
  @scala.inline
  def offsetNameShort: offsetNameShort = "offsetNameShort".asInstanceOf[offsetNameShort]
  @scala.inline
  def ordinal: ordinal = "ordinal".asInstanceOf[ordinal]
  @scala.inline
  def orya: orya = "orya".asInstanceOf[orya]
  @scala.inline
  def outputCalendar: outputCalendar = "outputCalendar".asInstanceOf[outputCalendar]
  @scala.inline
  def persian: persian = "persian".asInstanceOf[persian]
  @scala.inline
  def plus: plus = "plus".asInstanceOf[plus]
  @scala.inline
  def quarter: quarter = "quarter".asInstanceOf[quarter]
  @scala.inline
  def quarters: quarters = "quarters".asInstanceOf[quarters]
  @scala.inline
  def reconfigure: reconfigure = "reconfigure".asInstanceOf[reconfigure]
  @scala.inline
  def resolvedLocaleOpts: resolvedLocaleOpts = "resolvedLocaleOpts".asInstanceOf[resolvedLocaleOpts]
  @scala.inline
  def roc: roc = "roc".asInstanceOf[roc]
  @scala.inline
  def second: second = "second".asInstanceOf[second]
  @scala.inline
  def seconds: seconds = "seconds".asInstanceOf[seconds]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  @scala.inline
  def setLocale: setLocale = "setLocale".asInstanceOf[setLocale]
  @scala.inline
  def setZone: setZone = "setZone".asInstanceOf[setZone]
  @scala.inline
  def short: short = "short".asInstanceOf[short]
  @scala.inline
  def startOf: startOf = "startOf".asInstanceOf[startOf]
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
  def toBSON: toBSON = "toBSON".asInstanceOf[toBSON]
  @scala.inline
  def toFormat: toFormat = "toFormat".asInstanceOf[toFormat]
  @scala.inline
  def toHTTP: toHTTP = "toHTTP".asInstanceOf[toHTTP]
  @scala.inline
  def toISO: toISO = "toISO".asInstanceOf[toISO]
  @scala.inline
  def toISODate: toISODate = "toISODate".asInstanceOf[toISODate]
  @scala.inline
  def toISOTime: toISOTime = "toISOTime".asInstanceOf[toISOTime]
  @scala.inline
  def toISOWeekDate: toISOWeekDate = "toISOWeekDate".asInstanceOf[toISOWeekDate]
  @scala.inline
  def toJSDate: toJSDate = "toJSDate".asInstanceOf[toJSDate]
  @scala.inline
  def toJSON: toJSON = "toJSON".asInstanceOf[toJSON]
  @scala.inline
  def toLocal: toLocal = "toLocal".asInstanceOf[toLocal]
  @scala.inline
  def toLocaleParts: toLocaleParts = "toLocaleParts".asInstanceOf[toLocaleParts]
  @scala.inline
  def toMillis: toMillis = "toMillis".asInstanceOf[toMillis]
  @scala.inline
  def toObject: toObject = "toObject".asInstanceOf[toObject]
  @scala.inline
  def toRFC2822: toRFC2822 = "toRFC2822".asInstanceOf[toRFC2822]
  @scala.inline
  def toRelative: toRelative = "toRelative".asInstanceOf[toRelative]
  @scala.inline
  def toRelativeCalendar: toRelativeCalendar = "toRelativeCalendar".asInstanceOf[toRelativeCalendar]
  @scala.inline
  def toSQL: toSQL = "toSQL".asInstanceOf[toSQL]
  @scala.inline
  def toSQLDate: toSQLDate = "toSQLDate".asInstanceOf[toSQLDate]
  @scala.inline
  def toSQLTime: toSQLTime = "toSQLTime".asInstanceOf[toSQLTime]
  @scala.inline
  def toSeconds: toSeconds = "toSeconds".asInstanceOf[toSeconds]
  @scala.inline
  def toUTC: toUTC = "toUTC".asInstanceOf[toUTC]
  @scala.inline
  def until: until = "until".asInstanceOf[until]
  @scala.inline
  def utc: utc = "utc".asInstanceOf[utc]
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  @scala.inline
  def weekNumber: weekNumber = "weekNumber".asInstanceOf[weekNumber]
  @scala.inline
  def weekYear: weekYear = "weekYear".asInstanceOf[weekYear]
  @scala.inline
  def weekday: weekday = "weekday".asInstanceOf[weekday]
  @scala.inline
  def weekdayLong: weekdayLong = "weekdayLong".asInstanceOf[weekdayLong]
  @scala.inline
  def weekdayShort: weekdayShort = "weekdayShort".asInstanceOf[weekdayShort]
  @scala.inline
  def weeks: weeks = "weeks".asInstanceOf[weeks]
  @scala.inline
  def weeksInWeekYear: weeksInWeekYear = "weeksInWeekYear".asInstanceOf[weeksInWeekYear]
  @scala.inline
  def year: year = "year".asInstanceOf[year]
  @scala.inline
  def years: years = "years".asInstanceOf[years]
  @scala.inline
  def zone: zone = "zone".asInstanceOf[zone]
  @scala.inline
  def zoneName: zoneName = "zoneName".asInstanceOf[zoneName]
}

