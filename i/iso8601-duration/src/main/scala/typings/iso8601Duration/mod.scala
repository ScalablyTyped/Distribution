package typings.iso8601Duration

import typings.std.Date
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iso8601-duration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("iso8601-duration", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("iso8601-duration", "default.end")
    @js.native
    def end: js.Function2[/* duration */ Duration, /* startDate */ js.UndefOr[Date], Date] = js.native
    @scala.inline
    def end(duration: Duration): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("end")(duration.asInstanceOf[js.Any]).asInstanceOf[Date]
    @scala.inline
    def end(duration: Duration, startDate: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("end")(duration.asInstanceOf[js.Any], startDate.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def end_=(x: js.Function2[/* duration */ Duration, /* startDate */ js.UndefOr[Date], Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("end")(x.asInstanceOf[js.Any])
    
    @JSImport("iso8601-duration", "default.parse")
    @js.native
    def parse: js.Function1[/* durationString */ String, Duration] = js.native
    @scala.inline
    def parse(durationString: String): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(durationString.asInstanceOf[js.Any]).asInstanceOf[Duration]
    @scala.inline
    def parse_=(x: js.Function1[/* durationString */ String, Duration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("iso8601-duration", "default.pattern")
    @js.native
    def pattern: RegExp = js.native
    @scala.inline
    def pattern_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pattern")(x.asInstanceOf[js.Any])
    
    @JSImport("iso8601-duration", "default.toSeconds")
    @js.native
    def toSeconds: js.Function2[/* duration */ Duration, /* startDate */ js.UndefOr[Date], Double] = js.native
    @scala.inline
    def toSeconds(duration: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toSeconds")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def toSeconds(duration: Duration, startDate: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toSeconds")(duration.asInstanceOf[js.Any], startDate.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def toSeconds_=(x: js.Function2[/* duration */ Duration, /* startDate */ js.UndefOr[Date], Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toSeconds")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def end(duration: Duration): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("end")(duration.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def end(duration: Duration, startDate: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("end")(duration.asInstanceOf[js.Any], startDate.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def parse(durationString: String): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(durationString.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  @JSImport("iso8601-duration", "pattern")
  @js.native
  val pattern: RegExp = js.native
  
  @scala.inline
  def toSeconds(duration: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toSeconds")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def toSeconds(duration: Duration, startDate: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toSeconds")(duration.asInstanceOf[js.Any], startDate.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait Duration extends StObject {
    
    var days: js.UndefOr[Double] = js.undefined
    
    var hours: js.UndefOr[Double] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var months: js.UndefOr[Double] = js.undefined
    
    var seconds: js.UndefOr[Double] = js.undefined
    
    var weeks: js.UndefOr[Double] = js.undefined
    
    var years: js.UndefOr[Double] = js.undefined
  }
  object Duration {
    
    @scala.inline
    def apply(): Duration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Duration]
    }
    
    @scala.inline
    implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      @scala.inline
      def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      @scala.inline
      def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      @scala.inline
      def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      @scala.inline
      def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      @scala.inline
      def setWeeks(value: Double): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
      
      @scala.inline
      def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
    }
  }
}
