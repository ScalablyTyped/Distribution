package typings
package laterLib.laterMod.laterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Static extends js.Object {
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
           * Second time period information provider.
           */
  var second: TimePeriod
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
  /**
           * Schedule
           * Generates instances from schedule data.
           */
  def schedule(input: js.Any): Schedule
  /**
           * Set interval on window using given recurrence
           *
           * @param callback - A callback called after each instance of recurrence pattern.
           * @param - A recurrence instance.
           */
  def setInterval(callback: js.Function0[scala.Unit], time: ScheduleData): Timer
  /**
           * Set timeout on window using given recurrence next.
           *
           * @param callback - A callback called after first instance of recurrence pattern.
           * @param - A recurrence instance.
           */
  def setTimeout(callback: js.Function0[scala.Unit], time: ScheduleData): Timer
}

