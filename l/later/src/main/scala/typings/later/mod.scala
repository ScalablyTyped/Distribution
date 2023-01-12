package typings.later

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("later", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  trait DateProvider extends StObject {
    
    /**
      * Set later to use UTC time.
      */
    def UTC(): Unit
    
    /**
      * Set later to use local time.
      */
    def localTime(): Unit
    
    /**
      * Builds and returns a new Date using the specified values.  Date
      * returned is either using Local time or UTC based on isLocal.
      *
      * @param [Y]: Four digit year
      * @param [M]: Month between 1 and 12, defaults to 1
      * @param [D]: Date between 1 and 31, defaults to 1
      * @param [h]: Hour between 0 and 23, defaults to 0
      * @param [m]: Minute between 0 and 59, defaults to 0
      * @param [s]: Second between 0 and 59, defaults to 0
      */
    def next(
      Y: js.UndefOr[Double],
      M: js.UndefOr[Double],
      D: js.UndefOr[Double],
      h: js.UndefOr[Double],
      m: js.UndefOr[Double],
      s: js.UndefOr[Double]
    ): js.Date
    
    /**
      * Determines if a value will cause a particular constraint to rollover to the
      * next largest time period. Used primarily when a constraint has a
      * variable extent.
      *
      * @param d: Date
      * @param val: Value
      * @param constraint: A modifier
      * @param period: A time period
      */
    def nextRollover(d: js.Date, `val`: Double, constraint: Modifier, period: TimePeriod): js.Date
    
    /**
      * Builds and returns a new Date using the specified values.  Date
      * returned is either using Local time or UTC based on isLocal.
      *
      * @param [Y]: Four digit year
      * @param [M]: Month between 0 and 11, defaults to 11
      * @param [D]: Date between 1 and 31, defaults to last day of month
      * @param [h]: Hour between 0 and 23, defaults to 23
      * @param [m]: Minute between 0 and 59, defaults to 59
      * @param [s]: Second between 0 and 59, defaults to 59
      */
    def prev(
      Y: js.UndefOr[Double],
      M: js.UndefOr[Double],
      D: js.UndefOr[Double],
      h: js.UndefOr[Double],
      m: js.UndefOr[Double],
      s: js.UndefOr[Double]
    ): js.Date
    
    /**
      * Determines if a value will cause a particular constraint to rollover to the
      * previous largest time period. Used primarily when a constraint has a
      * variable extent.
      *
      * @param d: Date
      * @param val: Value
      * @param constraint: A modifier
      * @param period: A time period
      */
    def prevRollover(d: js.Date, `val`: Double, constraint: Modifier, period: TimePeriod): js.Date
  }
  object DateProvider {
    
    inline def apply(
      UTC: () => Unit,
      localTime: () => Unit,
      next: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double]) => js.Date,
      nextRollover: (js.Date, Double, Modifier, TimePeriod) => js.Date,
      prev: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double]) => js.Date,
      prevRollover: (js.Date, Double, Modifier, TimePeriod) => js.Date
    ): DateProvider = {
      val __obj = js.Dynamic.literal(UTC = js.Any.fromFunction0(UTC), localTime = js.Any.fromFunction0(localTime), next = js.Any.fromFunction6(next), nextRollover = js.Any.fromFunction4(nextRollover), prev = js.Any.fromFunction6(prev), prevRollover = js.Any.fromFunction4(prevRollover))
      __obj.asInstanceOf[DateProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateProvider] (val x: Self) extends AnyVal {
      
      inline def setLocalTime(value: () => Unit): Self = StObject.set(x, "localTime", js.Any.fromFunction0(value))
      
      inline def setNext(
        value: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double]) => js.Date
      ): Self = StObject.set(x, "next", js.Any.fromFunction6(value))
      
      inline def setNextRollover(value: (js.Date, Double, Modifier, TimePeriod) => js.Date): Self = StObject.set(x, "nextRollover", js.Any.fromFunction4(value))
      
      inline def setPrev(
        value: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double]) => js.Date
      ): Self = StObject.set(x, "prev", js.Any.fromFunction6(value))
      
      inline def setPrevRollover(value: (js.Date, Double, Modifier, TimePeriod) => js.Date): Self = StObject.set(x, "prevRollover", js.Any.fromFunction4(value))
      
      inline def setUTC(value: () => Unit): Self = StObject.set(x, "UTC", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Modifier
    extends StObject
       with TimePeriod {
    
    /**
      * Creates a new modified constraint.
      *
      * @param constraint: The constraint to be modified
      * @param value: The starting value of the after constraint
      */
    def apply(constraint: TimePeriod, value: Double): TimePeriod = js.native
  }
  
  trait ModifierStatic extends StObject {
    
    /**
      * Creates a new modified constraint.
      *
      * @param constraint: The constraint to be modified
      * @param value: The starting value of the after constraint
      */
    /**
      * After Modifier
      */
    def after(constraint: TimePeriod, value: Double): TimePeriod
    /**
      * After Modifier
      */
    @JSName("after")
    var after_Original: Modifier
    
    /**
      * Creates a new modified constraint.
      *
      * @param constraint: The constraint to be modified
      * @param value: The starting value of the after constraint
      */
    /**
      * Before Modifier
      */
    def before(constraint: TimePeriod, value: Double): TimePeriod
    /**
      * Before Modifier
      */
    @JSName("before")
    var before_Original: Modifier
  }
  object ModifierStatic {
    
    inline def apply(after: Modifier, before: Modifier): ModifierStatic = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModifierStatic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModifierStatic] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: Modifier): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: Modifier): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseStatic extends StObject {
    
    /**
      * Create schedule data by parsing a cron string
      *
      * @param [input] - A string value to parse.
      * @param [hasSeconds] - Whether the cron expression has second part.
      */
    def cron(): ScheduleData = js.native
    def cron(input: String): ScheduleData = js.native
    def cron(input: String, hasSeconds: Boolean): ScheduleData = js.native
    def cron(input: Unit, hasSeconds: Boolean): ScheduleData = js.native
    
    /**
      * Create a recurrence builder for building schedule data.
      */
    def recur(): RecurrenceBuilder = js.native
    
    /**
      * Create schedule data by paring a human readable string.
      *
      * @param [input] - A string value to parse.
      */
    def text(): ScheduleData = js.native
    def text(input: String): ScheduleData = js.native
  }
  
  trait Recurrence
    extends StObject
       with /*
    * Custom Time Periods and Modifiers
    * For acces to custom time periods created as extension to the later static type
    * and modifiers created on the later modifier static type.
    */
  /* timeperiodAndModifierName */ StringDictionary[js.UndefOr[js.Array[Double]]] {
    
    /** Day of the month. */
    var D: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** After modifiers. */
    var D_a: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Before modifiers. */
    var D_b: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Month in year. */
    var M: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** After modifiers. */
    var M_a: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Before modifiers. */
    var M_b: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Year. */
    var Y: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** After modifiers. */
    var Y_a: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Before modifiers. */
    var Y_b: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Nth day of the week in month. */
    var dc: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** After modifiers. */
    var dc_a: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Before modifiers. */
    var dc_b: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Day in week. */
    var dw: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** After modifiers. */
    var dw_a: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Before modifiers. */
    var dw_b: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Day in year. */
    var dy: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** After modifiers. */
    var dy_a: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Before modifiers. */
    var dy_b: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Hour in day. */
    var h: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** After modifiers. */
    var h_a: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Before modifiers. */
    var h_b: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Minutes in hour. */
    var m: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** After modifiers. */
    var m_a: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Before modifiers. */
    var m_b: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Seconds in minute. */
    var s: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** After modifiers. */
    var s_a: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Before modifiers. */
    var s_b: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Time in seconds from midnight. */
    var t: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** After modifiers. */
    var t_a: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Before modifiers. */
    var t_b: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Week in month. */
    var wm: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** After modifiers. */
    var wm_a: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Before modifiers. */
    var wm_b: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** ISO week in year. */
    var wy: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** After modifiers. */
    var wy_a: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Before modifiers. */
    var wy_b: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Recurrence {
    
    inline def apply(): Recurrence = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Recurrence]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Recurrence] (val x: Self) extends AnyVal {
      
      inline def setD(value: js.Array[Double]): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "D", js.undefined)
      
      inline def setDVarargs(value: Double*): Self = StObject.set(x, "D", js.Array(value*))
      
      inline def setD_a(value: js.Array[Double]): Self = StObject.set(x, "D_a", value.asInstanceOf[js.Any])
      
      inline def setD_aUndefined: Self = StObject.set(x, "D_a", js.undefined)
      
      inline def setD_aVarargs(value: Double*): Self = StObject.set(x, "D_a", js.Array(value*))
      
      inline def setD_b(value: js.Array[Double]): Self = StObject.set(x, "D_b", value.asInstanceOf[js.Any])
      
      inline def setD_bUndefined: Self = StObject.set(x, "D_b", js.undefined)
      
      inline def setD_bVarargs(value: Double*): Self = StObject.set(x, "D_b", js.Array(value*))
      
      inline def setDc(value: js.Array[Double]): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
      
      inline def setDcUndefined: Self = StObject.set(x, "dc", js.undefined)
      
      inline def setDcVarargs(value: Double*): Self = StObject.set(x, "dc", js.Array(value*))
      
      inline def setDc_a(value: js.Array[Double]): Self = StObject.set(x, "dc_a", value.asInstanceOf[js.Any])
      
      inline def setDc_aUndefined: Self = StObject.set(x, "dc_a", js.undefined)
      
      inline def setDc_aVarargs(value: Double*): Self = StObject.set(x, "dc_a", js.Array(value*))
      
      inline def setDc_b(value: js.Array[Double]): Self = StObject.set(x, "dc_b", value.asInstanceOf[js.Any])
      
      inline def setDc_bUndefined: Self = StObject.set(x, "dc_b", js.undefined)
      
      inline def setDc_bVarargs(value: Double*): Self = StObject.set(x, "dc_b", js.Array(value*))
      
      inline def setDw(value: js.Array[Double]): Self = StObject.set(x, "dw", value.asInstanceOf[js.Any])
      
      inline def setDwUndefined: Self = StObject.set(x, "dw", js.undefined)
      
      inline def setDwVarargs(value: Double*): Self = StObject.set(x, "dw", js.Array(value*))
      
      inline def setDw_a(value: js.Array[Double]): Self = StObject.set(x, "dw_a", value.asInstanceOf[js.Any])
      
      inline def setDw_aUndefined: Self = StObject.set(x, "dw_a", js.undefined)
      
      inline def setDw_aVarargs(value: Double*): Self = StObject.set(x, "dw_a", js.Array(value*))
      
      inline def setDw_b(value: js.Array[Double]): Self = StObject.set(x, "dw_b", value.asInstanceOf[js.Any])
      
      inline def setDw_bUndefined: Self = StObject.set(x, "dw_b", js.undefined)
      
      inline def setDw_bVarargs(value: Double*): Self = StObject.set(x, "dw_b", js.Array(value*))
      
      inline def setDy(value: js.Array[Double]): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setDyVarargs(value: Double*): Self = StObject.set(x, "dy", js.Array(value*))
      
      inline def setDy_a(value: js.Array[Double]): Self = StObject.set(x, "dy_a", value.asInstanceOf[js.Any])
      
      inline def setDy_aUndefined: Self = StObject.set(x, "dy_a", js.undefined)
      
      inline def setDy_aVarargs(value: Double*): Self = StObject.set(x, "dy_a", js.Array(value*))
      
      inline def setDy_b(value: js.Array[Double]): Self = StObject.set(x, "dy_b", value.asInstanceOf[js.Any])
      
      inline def setDy_bUndefined: Self = StObject.set(x, "dy_b", js.undefined)
      
      inline def setDy_bVarargs(value: Double*): Self = StObject.set(x, "dy_b", js.Array(value*))
      
      inline def setH(value: js.Array[Double]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setHVarargs(value: Double*): Self = StObject.set(x, "h", js.Array(value*))
      
      inline def setH_a(value: js.Array[Double]): Self = StObject.set(x, "h_a", value.asInstanceOf[js.Any])
      
      inline def setH_aUndefined: Self = StObject.set(x, "h_a", js.undefined)
      
      inline def setH_aVarargs(value: Double*): Self = StObject.set(x, "h_a", js.Array(value*))
      
      inline def setH_b(value: js.Array[Double]): Self = StObject.set(x, "h_b", value.asInstanceOf[js.Any])
      
      inline def setH_bUndefined: Self = StObject.set(x, "h_b", js.undefined)
      
      inline def setH_bVarargs(value: Double*): Self = StObject.set(x, "h_b", js.Array(value*))
      
      inline def setM(value: js.Array[Double]): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "M", js.undefined)
      
      inline def setMVarargs(value: Double*): Self = StObject.set(x, "M", js.Array(value*))
      
      inline def setM_a(value: js.Array[Double]): Self = StObject.set(x, "M_a", value.asInstanceOf[js.Any])
      
      inline def setM_aUndefined: Self = StObject.set(x, "M_a", js.undefined)
      
      inline def setM_aVarargs(value: Double*): Self = StObject.set(x, "M_a", js.Array(value*))
      
      inline def setM_b(value: js.Array[Double]): Self = StObject.set(x, "M_b", value.asInstanceOf[js.Any])
      
      inline def setM_bUndefined: Self = StObject.set(x, "M_b", js.undefined)
      
      inline def setM_bVarargs(value: Double*): Self = StObject.set(x, "M_b", js.Array(value*))
      
      inline def setS(value: js.Array[Double]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setSVarargs(value: Double*): Self = StObject.set(x, "s", js.Array(value*))
      
      inline def setS_a(value: js.Array[Double]): Self = StObject.set(x, "s_a", value.asInstanceOf[js.Any])
      
      inline def setS_aUndefined: Self = StObject.set(x, "s_a", js.undefined)
      
      inline def setS_aVarargs(value: Double*): Self = StObject.set(x, "s_a", js.Array(value*))
      
      inline def setS_b(value: js.Array[Double]): Self = StObject.set(x, "s_b", value.asInstanceOf[js.Any])
      
      inline def setS_bUndefined: Self = StObject.set(x, "s_b", js.undefined)
      
      inline def setS_bVarargs(value: Double*): Self = StObject.set(x, "s_b", js.Array(value*))
      
      inline def setT(value: js.Array[Double]): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
      
      inline def setTVarargs(value: Double*): Self = StObject.set(x, "t", js.Array(value*))
      
      inline def setT_a(value: js.Array[Double]): Self = StObject.set(x, "t_a", value.asInstanceOf[js.Any])
      
      inline def setT_aUndefined: Self = StObject.set(x, "t_a", js.undefined)
      
      inline def setT_aVarargs(value: Double*): Self = StObject.set(x, "t_a", js.Array(value*))
      
      inline def setT_b(value: js.Array[Double]): Self = StObject.set(x, "t_b", value.asInstanceOf[js.Any])
      
      inline def setT_bUndefined: Self = StObject.set(x, "t_b", js.undefined)
      
      inline def setT_bVarargs(value: Double*): Self = StObject.set(x, "t_b", js.Array(value*))
      
      inline def setWm(value: js.Array[Double]): Self = StObject.set(x, "wm", value.asInstanceOf[js.Any])
      
      inline def setWmUndefined: Self = StObject.set(x, "wm", js.undefined)
      
      inline def setWmVarargs(value: Double*): Self = StObject.set(x, "wm", js.Array(value*))
      
      inline def setWm_a(value: js.Array[Double]): Self = StObject.set(x, "wm_a", value.asInstanceOf[js.Any])
      
      inline def setWm_aUndefined: Self = StObject.set(x, "wm_a", js.undefined)
      
      inline def setWm_aVarargs(value: Double*): Self = StObject.set(x, "wm_a", js.Array(value*))
      
      inline def setWm_b(value: js.Array[Double]): Self = StObject.set(x, "wm_b", value.asInstanceOf[js.Any])
      
      inline def setWm_bUndefined: Self = StObject.set(x, "wm_b", js.undefined)
      
      inline def setWm_bVarargs(value: Double*): Self = StObject.set(x, "wm_b", js.Array(value*))
      
      inline def setWy(value: js.Array[Double]): Self = StObject.set(x, "wy", value.asInstanceOf[js.Any])
      
      inline def setWyUndefined: Self = StObject.set(x, "wy", js.undefined)
      
      inline def setWyVarargs(value: Double*): Self = StObject.set(x, "wy", js.Array(value*))
      
      inline def setWy_a(value: js.Array[Double]): Self = StObject.set(x, "wy_a", value.asInstanceOf[js.Any])
      
      inline def setWy_aUndefined: Self = StObject.set(x, "wy_a", js.undefined)
      
      inline def setWy_aVarargs(value: Double*): Self = StObject.set(x, "wy_a", js.Array(value*))
      
      inline def setWy_b(value: js.Array[Double]): Self = StObject.set(x, "wy_b", value.asInstanceOf[js.Any])
      
      inline def setWy_bUndefined: Self = StObject.set(x, "wy_b", js.undefined)
      
      inline def setWy_bVarargs(value: Double*): Self = StObject.set(x, "wy_b", js.Array(value*))
      
      inline def setY(value: js.Array[Double]): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "Y", js.undefined)
      
      inline def setYVarargs(value: Double*): Self = StObject.set(x, "Y", js.Array(value*))
      
      inline def setY_a(value: js.Array[Double]): Self = StObject.set(x, "Y_a", value.asInstanceOf[js.Any])
      
      inline def setY_aUndefined: Self = StObject.set(x, "Y_a", js.undefined)
      
      inline def setY_aVarargs(value: Double*): Self = StObject.set(x, "Y_a", js.Array(value*))
      
      inline def setY_b(value: js.Array[Double]): Self = StObject.set(x, "Y_b", value.asInstanceOf[js.Any])
      
      inline def setY_bUndefined: Self = StObject.set(x, "Y_b", js.undefined)
      
      inline def setY_bVarargs(value: Double*): Self = StObject.set(x, "Y_b", js.Array(value*))
    }
  }
  
  @js.native
  trait RecurrenceBuilder
    extends StObject
       with ScheduleData {
    
    def after(value: String): RecurrenceBuilder = js.native
    /**
      * After a time period.
      *
      * @param value - A number or string representing your value.
      */
    def after(value: Double): RecurrenceBuilder = js.native
    
    /**
      * Add a new schedule value to schedules, composite schedule.
      */
    def and(): RecurrenceBuilder = js.native
    
    def before(value: String): RecurrenceBuilder = js.native
    /**
      * Before a time period.
      *
      * @param value - A number or string representing your value.
      */
    def before(value: Double): RecurrenceBuilder = js.native
    
    /**
      * Preceed a time period.
      *
      * @param start - A string representing your start value.
      * @param end - A string representing your end value.
      */
    def between(start: String, end: String): RecurrenceBuilder = js.native
    /**
      * Preceed a time period.
      *
      * @param start - A number representing your start value.
      * @param end - A number representing your end value.
      */
    def between(start: Double, end: Double): RecurrenceBuilder = js.native
    
    /**
      * Customise Recurrences.
      * Using a key as defined by the custom modifier in any extension to Later.IModifierStatic.
      */
    def customModifier(key: String, values: Double): RecurrenceBuilder = js.native
    
    /**
      * Custom Timeperiod Recurrences.
      * Using a key as defined by the custom period in any extension to Later.IStatic.
      */
    def customPeriod(key: String): RecurrenceBuilder = js.native
    
    /** a time period */
    def dayOfMonth(): RecurrenceBuilder = js.native
    
    /** a time period */
    def dayOfWeek(): RecurrenceBuilder = js.native
    
    /** a time period */
    def dayOfWeekCount(): RecurrenceBuilder = js.native
    
    /** a time period */
    def dayOfYear(): RecurrenceBuilder = js.native
    
    /**
      * Preceed a time period.
      *
      * @param [value] - A number or string representing your value.
      */
    def every(): RecurrenceBuilder = js.native
    def every(value: String): RecurrenceBuilder = js.native
    def every(value: Double): RecurrenceBuilder = js.native
    
    /**
      * Add exceptions.
      */
    def except(): RecurrenceBuilder = js.native
    
    /**
      * Equivalent to .on(min)
      */
    def first(): RecurrenceBuilder = js.native
    
    /** a time period */
    def fullDate(): RecurrenceBuilder = js.native
    
    /** a time period */
    def hour(): RecurrenceBuilder = js.native
    
    /**
      * Equivalent to .on(max)
      */
    def last(): RecurrenceBuilder = js.native
    
    /** a time period */
    def minute(): RecurrenceBuilder = js.native
    
    /** a time period */
    def month(): RecurrenceBuilder = js.native
    
    def on(value: String): RecurrenceBuilder = js.native
    /**
      * Specifies one or more specific vals of a time period information provider.
      * When used to specify a time, a string indicating the 24-hour time may be used.
      *
      * @param value - A Date or string representing your value.
      */
    def on(value: js.Date): RecurrenceBuilder = js.native
    /**
      * Specifies one or more specific vals of a time period information provider.
      * When used to specify a time, a string indicating the 24-hour time may be used.
      *
      * @param values - A list of values.
      */
    def on(values: Double*): RecurrenceBuilder = js.native
    
    /**
      * Equivalent to .on(2,3,4,5,6).dayOfWeek()
      */
    def onWeekday(): RecurrenceBuilder = js.native
    
    /**
      * Equivalent to .on(1,7).dayOfWeek()
      */
    def onWeekend(): RecurrenceBuilder = js.native
    
    /** a time period */
    def second(): RecurrenceBuilder = js.native
    
    def startingOn(value: String): RecurrenceBuilder = js.native
    /**
      * After a time period.
      *
      * @param value - A number or string representing your value.
      */
    def startingOn(value: Double): RecurrenceBuilder = js.native
    
    /** a time period */
    def time(): RecurrenceBuilder = js.native
    
    /** a time period */
    def weekOfMonth(): RecurrenceBuilder = js.native
    
    /** a time period */
    def weekOfYear(): RecurrenceBuilder = js.native
    
    /** a time period */
    def year(): RecurrenceBuilder = js.native
  }
  
  @js.native
  trait Schedule extends StObject {
    
    /**
      * Finds the next valid instance or instances of the current schedule,
      * optionally between a specified start and end date. Start date is
      * Date.now() by default, end date is unspecified. Start date must be
      * smaller than end date.
      *
      * @param numberOfInst: The number of instances to return
      * @param dateFrom: The earliest a valid instance can occur
      * @param dateTo: The latest a valid instance can occur
      */
    def next(numberOfInst: Double): js.Array[js.Date] | js.Date = js.native
    def next(numberOfInst: Double, dateFrom: js.Date): js.Array[js.Date] | js.Date = js.native
    def next(numberOfInst: Double, dateFrom: js.Date, dateTo: js.Date): js.Array[js.Date] | js.Date = js.native
    def next(numberOfInst: Double, dateFrom: Unit, dateTo: js.Date): js.Array[js.Date] | js.Date = js.native
    
    /**
      * Finds the next valid range or ranges of the current schedule,
      * optionally between a specified start and end date. Start date is
      * Date.now() by default, end date is unspecified. Start date must be
      * greater than end date.
      *
      * @param numberOfInst: The number of ranges to return
      * @param dateFrom: The earliest a valid range can occur
      * @param dateTo: The latest a valid range can occur
      */
    def nextRange(numberOfInst: Double): js.Array[js.Date] | js.Date = js.native
    def nextRange(numberOfInst: Double, dateFrom: js.Date): js.Array[js.Date] | js.Date = js.native
    def nextRange(numberOfInst: Double, dateFrom: js.Date, dateTo: js.Date): js.Array[js.Date] | js.Date = js.native
    def nextRange(numberOfInst: Double, dateFrom: Unit, dateTo: js.Date): js.Array[js.Date] | js.Date = js.native
    
    /**
      * Finds the previous valid instance or instances of the current schedule,
      * optionally between a specified start and end date. Start date is
      * Date.now() by default, end date is unspecified. Start date must be
      * greater than end date.
      *
      * @param numberOfInst: The number of instances to return
      * @param dateFrom: The earliest a valid instance can occur
      * @param dateTo: The latest a valid instance can occur
      */
    def prev(numberOfInst: Double): js.Array[js.Date] | js.Date = js.native
    def prev(numberOfInst: Double, dateFrom: js.Date): js.Array[js.Date] | js.Date = js.native
    def prev(numberOfInst: Double, dateFrom: js.Date, dateTo: js.Date): js.Array[js.Date] | js.Date = js.native
    def prev(numberOfInst: Double, dateFrom: Unit, dateTo: js.Date): js.Array[js.Date] | js.Date = js.native
    
    /**
      * Finds the previous valid range or ranges of the current schedule,
      * optionally between a specified start and end date. Start date is
      * Date.now() by default, end date is unspecified. Start date must be
      * greater than end date.
      *
      * @param numberOfInst: The number of ranges to return
      * @param dateFrom: The earliest a valid range can occur
      * @param dateTo: The latest a valid range can occur
      */
    def prevRange(numberOfInst: Double): js.Array[js.Date] | js.Date = js.native
    def prevRange(numberOfInst: Double, dateFrom: js.Date): js.Array[js.Date] | js.Date = js.native
    def prevRange(numberOfInst: Double, dateFrom: js.Date, dateTo: js.Date): js.Array[js.Date] | js.Date = js.native
    def prevRange(numberOfInst: Double, dateFrom: Unit, dateTo: js.Date): js.Array[js.Date] | js.Date = js.native
  }
  
  trait ScheduleData extends StObject {
    
    /**
      * A code to identify any errors in the composite schedule and exceptions.
      * The number tells you the position of the error within the schedule.
      */
    var error: Double
    
    /**
      * A list of exceptions to the composite recurrence information.
      */
    var exceptions: js.Array[Recurrence]
    
    /**
      * A list of recurrence information as a composite schedule.
      */
    var schedules: js.Array[Recurrence]
  }
  object ScheduleData {
    
    inline def apply(error: Double, exceptions: js.Array[Recurrence], schedules: js.Array[Recurrence]): ScheduleData = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], exceptions = exceptions.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScheduleData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScheduleData] (val x: Self) extends AnyVal {
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setExceptions(value: js.Array[Recurrence]): Self = StObject.set(x, "exceptions", value.asInstanceOf[js.Any])
      
      inline def setExceptionsVarargs(value: Recurrence*): Self = StObject.set(x, "exceptions", js.Array(value*))
      
      inline def setSchedules(value: js.Array[Recurrence]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
      
      inline def setSchedulesVarargs(value: Recurrence*): Self = StObject.set(x, "schedules", js.Array(value*))
    }
  }
  
  trait Static extends StObject {
    
    /** Date Provider */
    var date: DateProvider
    
    /**
      * Day time period information provider.
      */
    var day: TimePeriod
    
    /**
      * Day of week time period information provider.
      */
    var dayOfWeek: TimePeriod
    
    /**
      * Day of week in month time period information provider.
      */
    var dayOfWeekCount: TimePeriod
    
    /**
      * Day in year time period information provider.
      */
    var dayOfYear: TimePeriod
    
    /**
      * Hour time period information provider.
      */
    var hour: TimePeriod
    
    /**
      * Minute time period information provider.
      */
    var minute: TimePeriod
    
    /**
      * Later Modifiers:
      *
      * This type can be easily extended to include any custom IModifiers that you desire.
      * These can then be used to create schedules of your own custom type.
      *
      * interface IGandalfsLaterModifier extends Later.IModifierStatic {
      *     duringTheThirdAge: IModifier
      * }
      *
      * Be sure to use this interface when dealing with Later.modifier
      */
    var modifier: ModifierStatic
    
    /**
      * Month time period information provider.
      */
    var month: TimePeriod
    
    /**
      * Parse
      * For generating schedule data.
      */
    var parse: ParseStatic
    
    /**
      * Schedule
      * Generates instances from schedule data.
      */
    def schedule(input: Any): Schedule
    
    /**
      * Second time period information provider.
      */
    var second: TimePeriod
    
    /**
      * Set interval on window using given recurrence
      *
      * @param callback - A callback called after each instance of recurrence pattern.
      * @param - A recurrence instance.
      */
    def setInterval(callback: js.Function0[Unit], time: ScheduleData): Timer
    
    /**
      * Set timeout on window using given recurrence next.
      *
      * @param callback - A callback called after first instance of recurrence pattern.
      * @param - A recurrence instance.
      */
    def setTimeout(callback: js.Function0[Unit], time: ScheduleData): Timer
    
    /**
      * time period information provider.
      */
    var time: TimePeriod
    
    /**
      * Week of mobth time period information provider.
      */
    var weekOfMonth: TimePeriod
    
    /**
      * Week of yearfrom ISO 8601 time period information provider.
      */
    var weekOfYear: TimePeriod
    
    /**
      * Year time period information provider.
      */
    var year: TimePeriod
  }
  object Static {
    
    inline def apply(
      date: DateProvider,
      day: TimePeriod,
      dayOfWeek: TimePeriod,
      dayOfWeekCount: TimePeriod,
      dayOfYear: TimePeriod,
      hour: TimePeriod,
      minute: TimePeriod,
      modifier: ModifierStatic,
      month: TimePeriod,
      parse: ParseStatic,
      schedule: Any => Schedule,
      second: TimePeriod,
      setInterval: (js.Function0[Unit], ScheduleData) => Timer,
      setTimeout: (js.Function0[Unit], ScheduleData) => Timer,
      time: TimePeriod,
      weekOfMonth: TimePeriod,
      weekOfYear: TimePeriod,
      year: TimePeriod
    ): Static = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], dayOfWeek = dayOfWeek.asInstanceOf[js.Any], dayOfWeekCount = dayOfWeekCount.asInstanceOf[js.Any], dayOfYear = dayOfYear.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], schedule = js.Any.fromFunction1(schedule), second = second.asInstanceOf[js.Any], setInterval = js.Any.fromFunction2(setInterval), setTimeout = js.Any.fromFunction2(setTimeout), time = time.asInstanceOf[js.Any], weekOfMonth = weekOfMonth.asInstanceOf[js.Any], weekOfYear = weekOfYear.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      inline def setDate(value: DateProvider): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDay(value: TimePeriod): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayOfWeek(value: TimePeriod): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDayOfWeekCount(value: TimePeriod): Self = StObject.set(x, "dayOfWeekCount", value.asInstanceOf[js.Any])
      
      inline def setDayOfYear(value: TimePeriod): Self = StObject.set(x, "dayOfYear", value.asInstanceOf[js.Any])
      
      inline def setHour(value: TimePeriod): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: TimePeriod): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setModifier(value: ModifierStatic): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: TimePeriod): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setParse(value: ParseStatic): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setSchedule(value: Any => Schedule): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
      
      inline def setSecond(value: TimePeriod): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSetInterval(value: (js.Function0[Unit], ScheduleData) => Timer): Self = StObject.set(x, "setInterval", js.Any.fromFunction2(value))
      
      inline def setSetTimeout(value: (js.Function0[Unit], ScheduleData) => Timer): Self = StObject.set(x, "setTimeout", js.Any.fromFunction2(value))
      
      inline def setTime(value: TimePeriod): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setWeekOfMonth(value: TimePeriod): Self = StObject.set(x, "weekOfMonth", value.asInstanceOf[js.Any])
      
      inline def setWeekOfYear(value: TimePeriod): Self = StObject.set(x, "weekOfYear", value.asInstanceOf[js.Any])
      
      inline def setYear(value: TimePeriod): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimePeriod extends StObject {
    
    /**
      * The last second in which the value is the same as the value of the specified date.
      * For example, the end of an hour would be the hour with 59 minutes and 59 seconds.
      *
      * @param date - The given date.
      */
    def end(date: js.Date): js.Date = js.native
    
    /**
      * The minimum and maximum valid values for the time period for the specified date.
      * If the minimum value is not 0, 0 can be specified in schedules to indicate the maximum value.
      * This makes working with non - constant extents(like days in a month) easier.
      *
      * @param [date] - The given date.
      */
    def extent(): js.Array[Double] = js.native
    def extent(date: js.Date): js.Array[Double] = js.native
    
    /**
      * True if the specified value is valid for the specified date, false otherwise.
      *
      * @param date - The given date.
      * @param value - The value to test for the date.
      */
    def isValid(date: js.Date, value: Any): Boolean = js.native
    
    /**
      * The name of the time period information provider.
      */
    var name: String = js.native
    
    /**
      * Returns the next date where the value is the value specified.
      * Sets the value to 1 if value specified is greater than the max allowed value.
      *
      * @param date - The given date.
      * @param value - The value to test for the date.
      */
    def next(date: js.Date, value: Any): js.Date = js.native
    
    /**
      * Returns the previous date where the value is the value specified.
      * Sets the value to the max allowed value if the value specified is greater than the max allowed value.
      *
      * @param date - The given date.
      * @param value - The value to test for the date.
      */
    def prev(date: js.Date, value: Any): js.Date = js.native
    
    /**
      * The rough number of seconds that are covered when moving from one instance of this time period to the next instance.
      */
    var range: Double = js.native
    
    /**
      * The first second in which the value is the same as the value of the specified date.
      *  For example, the start of an hour would be the hour with 0 minutes and 0 seconds.
      *
      * @param date - The given date.
      */
    def start(date: js.Date): js.Date = js.native
    
    /**
      * The value of this time period for the date specified.
      *
      * @param date - The given date.
      */
    def `val`(date: js.Date): Double = js.native
  }
  
  trait Timer extends StObject {
    
    /**
      * Clear the timer and end execution.
      */
    def clear(): Unit
  }
  object Timer {
    
    inline def apply(clear: () => Unit): Timer = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[Timer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
