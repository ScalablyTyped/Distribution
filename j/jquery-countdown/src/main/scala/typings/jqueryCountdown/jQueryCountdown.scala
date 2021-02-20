package typings.jqueryCountdown

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jQueryCountdown {
  
  /* Rewritten from type alias, can be one of: 
    - typings.jqueryCountdown.jqueryCountdownStrings.start
    - typings.jqueryCountdown.jqueryCountdownStrings.stop
    - typings.jqueryCountdown.jqueryCountdownStrings.pause
    - typings.jqueryCountdown.jqueryCountdownStrings.resume
  */
  trait Controls extends StObject
  object Controls {
    
    @scala.inline
    def pause: typings.jqueryCountdown.jqueryCountdownStrings.pause = "pause".asInstanceOf[typings.jqueryCountdown.jqueryCountdownStrings.pause]
    
    @scala.inline
    def resume: typings.jqueryCountdown.jqueryCountdownStrings.resume = "resume".asInstanceOf[typings.jqueryCountdown.jqueryCountdownStrings.resume]
    
    @scala.inline
    def start: typings.jqueryCountdown.jqueryCountdownStrings.start = "start".asInstanceOf[typings.jqueryCountdown.jqueryCountdownStrings.start]
    
    @scala.inline
    def stop: typings.jqueryCountdown.jqueryCountdownStrings.stop = "stop".asInstanceOf[typings.jqueryCountdown.jqueryCountdownStrings.stop]
  }
  
  @js.native
  trait Event
    extends typings.jquery.JQuery.Event {
    
    /**
      * Passed away the final date?
      */
    var elapsed: Boolean = js.native
    
    /**
      * The parsed final date native object
      */
    var finalDate: Date = js.native
    
    var offset: OffsetEvent = js.native
    
    /**
      * The formatter function
      */
    def strftime(format: String): String = js.native
  }
  object Event {
    
    @scala.inline
    def apply(
      elapsed: Boolean,
      finalDate: Date,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      offset: OffsetEvent,
      preventDefault: () => Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      strftime: String => String,
      timeStamp: Double,
      `type`: String
    ): Event = {
      val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], finalDate = finalDate.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), offset = offset.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), strftime = js.Any.fromFunction1(strftime), timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElapsed(value: Boolean): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalDate(value: Date): Self = StObject.set(x, "finalDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: OffsetEvent): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrftime(value: String => String): Self = StObject.set(x, "strftime", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jqueryCountdown.jqueryCountdownStrings.updateDotcountdown
    - typings.jqueryCountdown.jqueryCountdownStrings.finishDotcountdown
    - typings.jqueryCountdown.jqueryCountdownStrings.stopDotcountdown
  */
  trait Methods extends StObject
  object Methods {
    
    @scala.inline
    def finishDotcountdown: typings.jqueryCountdown.jqueryCountdownStrings.finishDotcountdown = "finish.countdown".asInstanceOf[typings.jqueryCountdown.jqueryCountdownStrings.finishDotcountdown]
    
    @scala.inline
    def stopDotcountdown: typings.jqueryCountdown.jqueryCountdownStrings.stopDotcountdown = "stop.countdown".asInstanceOf[typings.jqueryCountdown.jqueryCountdownStrings.stopDotcountdown]
    
    @scala.inline
    def updateDotcountdown: typings.jqueryCountdown.jqueryCountdownStrings.updateDotcountdown = "update.countdown".asInstanceOf[typings.jqueryCountdown.jqueryCountdownStrings.updateDotcountdown]
  }
  
  @js.native
  trait OffsetEvent extends StObject {
    
    /**
      * Days left until next week
      */
    var days: Double = js.native
    
    /**
      * Days left until next month
      */
    var daysToMonth: Double = js.native
    
    /**
      * Days left until next week
      */
    var daysToWeek: Double = js.native
    
    /**
      * Hours left until next day
      */
    var hours: Double = js.native
    
    /**
      * Minutes left for the next hour
      */
    var minutes: Double = js.native
    
    /**
      * Months left until final date
      */
    var months: Double = js.native
    
    /**
      * Seconds left for the next minute
      */
    var seconds: Double = js.native
    
    /**
      * Total amount of days left until final date
      */
    var totalDays: Double = js.native
    
    /**
      * Total amount of hours left until final date
      */
    var totalHours: Double = js.native
    
    /**
      * Total amount of minutes left until final date
      */
    var totalMinutes: Double = js.native
    
    /**
      * Total amount of seconds left until final date
      */
    var totalSeconds: Double = js.native
    
    /**
      * Weeks left until the final date
      */
    var weeks: Double = js.native
    
    /**
      * Weeks left until the next month
      */
    var weeksToMonth: Double = js.native
    
    /**
      * Years left until final date
      */
    var years: Double = js.native
  }
  object OffsetEvent {
    
    @scala.inline
    def apply(
      days: Double,
      daysToMonth: Double,
      daysToWeek: Double,
      hours: Double,
      minutes: Double,
      months: Double,
      seconds: Double,
      totalDays: Double,
      totalHours: Double,
      totalMinutes: Double,
      totalSeconds: Double,
      weeks: Double,
      weeksToMonth: Double,
      years: Double
    ): OffsetEvent = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], daysToMonth = daysToMonth.asInstanceOf[js.Any], daysToWeek = daysToWeek.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], totalDays = totalDays.asInstanceOf[js.Any], totalHours = totalHours.asInstanceOf[js.Any], totalMinutes = totalMinutes.asInstanceOf[js.Any], totalSeconds = totalSeconds.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any], weeksToMonth = weeksToMonth.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
      __obj.asInstanceOf[OffsetEvent]
    }
    
    @scala.inline
    implicit class OffsetEventMutableBuilder[Self <: OffsetEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysToMonth(value: Double): Self = StObject.set(x, "daysToMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysToWeek(value: Double): Self = StObject.set(x, "daysToWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalDays(value: Double): Self = StObject.set(x, "totalDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalHours(value: Double): Self = StObject.set(x, "totalHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalMinutes(value: Double): Self = StObject.set(x, "totalMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalSeconds(value: Double): Self = StObject.set(x, "totalSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeeks(value: Double): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeeksToMonth(value: Double): Self = StObject.set(x, "weeksToMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Deferred initialization mode
      */
    var defer: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow to continue after finishes
      */
    var elapse: js.UndefOr[Boolean] = js.native
    
    /**
      * The update rate in milliseconds
      */
    var precision: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setElapse(value: Boolean): Self = StObject.set(x, "elapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElapseUndefined: Self = StObject.set(x, "elapse", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    }
  }
}
