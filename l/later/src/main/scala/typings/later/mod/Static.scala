package typings.later.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends js.Object {
  
  /** Date Provider */
  var date: DateProvider = js.native
  
  /**
    * Day time period information provider.
    */
  var day: TimePeriod = js.native
  
  /**
    * Day of week time period information provider.
    */
  var dayOfWeek: TimePeriod = js.native
  
  /**
    * Day of week in month time period information provider.
    */
  var dayOfWeekCount: TimePeriod = js.native
  
  /**
    * Day in year time period information provider.
    */
  var dayOfYear: TimePeriod = js.native
  
  /**
    * Hour time period information provider.
    */
  var hour: TimePeriod = js.native
  
  /**
    * Minute time period information provider.
    */
  var minute: TimePeriod = js.native
  
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
  var modifier: ModifierStatic = js.native
  
  /**
    * Month time period information provider.
    */
  var month: TimePeriod = js.native
  
  /**
    * Parse
    * For generating schedule data.
    */
  var parse: ParseStatic = js.native
  
  /**
    * Schedule
    * Generates instances from schedule data.
    */
  def schedule(input: js.Any): Schedule = js.native
  
  /**
    * Second time period information provider.
    */
  var second: TimePeriod = js.native
  
  /**
    * Set interval on window using given recurrence
    *
    * @param callback - A callback called after each instance of recurrence pattern.
    * @param - A recurrence instance.
    */
  def setInterval(callback: js.Function0[Unit], time: ScheduleData): Timer = js.native
  
  /**
    * Set timeout on window using given recurrence next.
    *
    * @param callback - A callback called after first instance of recurrence pattern.
    * @param - A recurrence instance.
    */
  def setTimeout(callback: js.Function0[Unit], time: ScheduleData): Timer = js.native
  
  /**
    * time period information provider.
    */
  var time: TimePeriod = js.native
  
  /**
    * Week of mobth time period information provider.
    */
  var weekOfMonth: TimePeriod = js.native
  
  /**
    * Week of yearfrom ISO 8601 time period information provider.
    */
  var weekOfYear: TimePeriod = js.native
  
  /**
    * Year time period information provider.
    */
  var year: TimePeriod = js.native
}
object Static {
  
  @scala.inline
  def apply(
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
    schedule: js.Any => Schedule,
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
  implicit class StaticOps[Self <: Static] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: DateProvider): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay(value: TimePeriod): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeek(value: TimePeriod): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekCount(value: TimePeriod): Self = this.set("dayOfWeekCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfYear(value: TimePeriod): Self = this.set("dayOfYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: TimePeriod): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: TimePeriod): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifier(value: ModifierStatic): Self = this.set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: TimePeriod): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: ParseStatic): Self = this.set("parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedule(value: js.Any => Schedule): Self = this.set("schedule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSecond(value: TimePeriod): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetInterval(value: (js.Function0[Unit], ScheduleData) => Timer): Self = this.set("setInterval", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetTimeout(value: (js.Function0[Unit], ScheduleData) => Timer): Self = this.set("setTimeout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTime(value: TimePeriod): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekOfMonth(value: TimePeriod): Self = this.set("weekOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekOfYear(value: TimePeriod): Self = this.set("weekOfYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: TimePeriod): Self = this.set("year", value.asInstanceOf[js.Any])
  }
}
