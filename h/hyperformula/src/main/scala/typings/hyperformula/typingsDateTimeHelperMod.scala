package typings.hyperformula

import typings.hyperformula.anon.PartialdateTimeDateTimeda
import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsInterpreterInterpreterValueMod.ExtendedNumber
import typings.hyperformula.typingsMaybeMod.Maybe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDateTimeHelperMod {
  
  @JSImport("hyperformula/typings/DateTimeHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/DateTimeHelper", "DateTimeHelper")
  @js.native
  open class DateTimeHelper protected () extends StObject {
    def this(config: Config) = this()
    
    /* private */ val config: Any = js.native
    
    /* private */ var countLeapDays: Any = js.native
    
    def dateStringToDateNumber(dateTimeString: String): Maybe[ExtendedNumber] = js.native
    
    def dateToNumber(date: SimpleDate): Double = js.native
    
    /* private */ var dateToNumberFromZero: Any = js.native
    
    def daysInMonth(year: Double, month: Double): Double = js.native
    
    def endOfMonth(date: SimpleDate): SimpleDate = js.native
    
    /* private */ val epochYearZero: Any = js.native
    
    def getEpochYearZero(): Double = js.native
    
    def getNullYear(): Double = js.native
    
    def getWithinBounds(dayNumber: Double): Maybe[Double] = js.native
    
    /* private */ var isLeapYear: Any = js.native
    
    def isValidDate(date: SimpleDate): Boolean = js.native
    
    /* private */ val leapYear1900: Any = js.native
    
    def leapYearsCount(year: Double): Double = js.native
    
    /* private */ val maxDateValue: Any = js.native
    
    /* private */ val minDateAbsoluteValue: Any = js.native
    
    def numberToSimpleDate(arg: Double): SimpleDate = js.native
    
    def numberToSimpleDateTime(arg: Double): SimpleDateTime = js.native
    
    /* private */ val parseDateTime: Any = js.native
    
    def parseDateTimeFromConfigFormats(dateTimeString: String): PartialdateTimeDateTimeda = js.native
    
    /* private */ var parseDateTimeFromFormats: Any = js.native
    
    /* private */ var parseSingleFormat: Any = js.native
    
    def relativeNumberToAbsoluteNumber(arg: Double): Double = js.native
    
    def toBasisUS(start: SimpleDate, end: SimpleDate): js.Tuple2[SimpleDate, SimpleDate] = js.native
    
    def yearLengthForBasis(start: SimpleDate, end: SimpleDate): Double = js.native
  }
  
  inline def instanceOfSimpleDate(obj: Any): /* is hyperformula.hyperformula/typings/DateTimeHelper.SimpleDate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOfSimpleDate")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is hyperformula.hyperformula/typings/DateTimeHelper.SimpleDate */ Boolean]
  
  inline def instanceOfSimpleTime(obj: Any): /* is hyperformula.hyperformula/typings/DateTimeHelper.SimpleTime */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOfSimpleTime")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is hyperformula.hyperformula/typings/DateTimeHelper.SimpleTime */ Boolean]
  
  @JSImport("hyperformula/typings/DateTimeHelper", "maxDate")
  @js.native
  val maxDate: SimpleDate = js.native
  
  inline def numberToSimpleTime(arg: Double): SimpleTime = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToSimpleTime")(arg.asInstanceOf[js.Any]).asInstanceOf[SimpleTime]
  
  inline def offsetMonth(date: SimpleDate, offset: Double): SimpleDate = (^.asInstanceOf[js.Dynamic].applyDynamic("offsetMonth")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[SimpleDate]
  
  inline def roundToNearestSecond(arg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("roundToNearestSecond")(arg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def timeToNumber(time: SimpleTime): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timeToNumber")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toBasisEU(date: SimpleDate): SimpleDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toBasisEU")(date.asInstanceOf[js.Any]).asInstanceOf[SimpleDate]
  
  inline def truncateDayInMonth(date: SimpleDate): SimpleDate = ^.asInstanceOf[js.Dynamic].applyDynamic("truncateDayInMonth")(date.asInstanceOf[js.Any]).asInstanceOf[SimpleDate]
  
  /* Rewritten from type alias, can be one of: 
    - typings.hyperformula.typingsDateTimeHelperMod.SimpleTime
    - typings.hyperformula.typingsDateTimeHelperMod.SimpleDate
    - typings.hyperformula.typingsDateTimeHelperMod.SimpleDateTime
  */
  trait DateTime extends StObject
  object DateTime {
    
    inline def SimpleDate(day: Double, month: Double, year: Double): typings.hyperformula.typingsDateTimeHelperMod.SimpleDate = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.hyperformula.typingsDateTimeHelperMod.SimpleDate]
    }
    
    inline def SimpleDateTime(day: Double, hours: Double, minutes: Double, month: Double, seconds: Double, year: Double): typings.hyperformula.typingsDateTimeHelperMod.SimpleDateTime = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.hyperformula.typingsDateTimeHelperMod.SimpleDateTime]
    }
    
    inline def SimpleTime(hours: Double, minutes: Double, seconds: Double): typings.hyperformula.typingsDateTimeHelperMod.SimpleTime = {
      val __obj = js.Dynamic.literal(hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.hyperformula.typingsDateTimeHelperMod.SimpleTime]
    }
  }
  
  trait SimpleDate
    extends StObject
       with DateTime {
    
    var day: Double
    
    var month: Double
    
    var year: Double
  }
  object SimpleDate {
    
    inline def apply(day: Double, month: Double, year: Double): SimpleDate = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleDate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleDate] (val x: Self) extends AnyVal {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.hyperformula.typingsDateTimeHelperMod.DateTime because Already inherited */ trait SimpleDateTime
    extends StObject
       with SimpleDate
       with SimpleTime
  object SimpleDateTime {
    
    inline def apply(day: Double, hours: Double, minutes: Double, month: Double, seconds: Double, year: Double): SimpleDateTime = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleDateTime]
    }
  }
  
  trait SimpleTime
    extends StObject
       with DateTime {
    
    var hours: Double
    
    var minutes: Double
    
    var seconds: Double
  }
  object SimpleTime {
    
    inline def apply(hours: Double, minutes: Double, seconds: Double): SimpleTime = {
      val __obj = js.Dynamic.literal(hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleTime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleTime] (val x: Self) extends AnyVal {
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
