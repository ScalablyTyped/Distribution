package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@js-joda/core", "Temporal")
@js.native
abstract class Temporal () extends TemporalAccessor {
  
  /* protected */ def _minusAmount(amount: TemporalAmount): Temporal = js.native
  
  /* protected */ def _minusUnit(amountToSubtract: Double, unit: TemporalUnit): Temporal = js.native
  
  /* protected */ def _plusAmount(amount: TemporalAmount): Temporal = js.native
  
  /* protected */ def _plusUnit(amountToAdd: Double, unit: TemporalUnit): Temporal = js.native
  
  /* protected */ def _withAdjuster(adjuster: TemporalAdjuster): Temporal = js.native
  
  /* protected */ def _withField(field: TemporalField, newValue: Double): Temporal = js.native
  
  /**
    * Checks if the specified unit is supported.
    *
    * This checks if the date-time can be queried for the specified unit. If false, then calling
    * the plus and minus methods will throw an exception.
    */
  def isSupported(unit: TemporalUnit): Boolean = js.native
  
  def minus(amountToSubtract: Double, unit: TemporalUnit): Temporal = js.native
  /**
    * Returns an object of the same type as this object with an amount subtracted.
    *
    * This adjusts this temporal, subtracting according to the rules of the specified amount.
    * The amount is typically a `Period` but may be any other type implementing `TemporalAmount`,
    * such as `Duration`.
    *
    * Some example code indicating how and why this method is used:
    * ```
    * date = date.minus(period);                  // subtract a Period instance
    * date = date.minus(duration);                // subtract a Duration instance
    * date = date.minus(workingDays(6));          // example user-written workingDays method
    * ```
    *
    * Note that calling plus followed by minus is not guaranteed to return the same date-time.
    */
  def minus(amount: TemporalAmount): Temporal = js.native
  
  def plus(amountToAdd: Double, unit: TemporalUnit): Temporal = js.native
  /**
    * Returns an object of the same type as this object with an amount added.
    *
    * This adjusts this temporal, adding according to the rules of the specified amount. The
    * amount is typically a `Period` but may be any other type implementing `TemporalAmount`,
    * such as `Duration`.
    *
    * Some example code indicating how and why this method is used:
    * ```
    * date = date.plus(period);                  // add a Period instance
    * date = date.plus(duration);                // add a Duration instance
    * date = date.plus(workingDays(6));          // example user-written workingDays method
    * ```
    *
    * Note that calling plus followed by minus is not guaranteed to return the same date-time.
    */
  def plus(amount: TemporalAmount): Temporal = js.native
  
  /**
    * Calculates the period between this temporal and another temporal in terms of the
    * specified unit.
    *
    * This calculates the period between two temporals in terms of a single unit. The start
    * and end points are this and the specified temporal. The result will be negative if the
    * end is before the start. For example, the period in hours between two temporal objects
    * can be calculated using `startTime.until(endTime, HOURS)`.
    *
    * The calculation returns a whole number, representing the number of complete units between
    * the two temporals. For example, the period in hours between the times 11:30 and 13:29 will
    * only be one hour as it is one minute short of two hours.
    *
    * There are two equivalent ways of using this method. The first is to invoke this method
    * directly. The second is to use `TemporalUnit.between(Temporal, Temporal)`:
    * ```
    * // these two lines are equivalent
    * between = thisUnit.between(start, end);
    * between = start.until(end, thisUnit);
    * ```
    *
    * The choice should be made based on which makes the code more readable.
    *
    * For example, this method allows the number of days between two dates to be calculated:
    * ```
    * const daysBetween = DAYS.between(start, end);
    * // or alternatively
    * const daysBetween = start.until(end, DAYS);
    * ```
    */
  def until(endTemporal: Temporal, unit: TemporalUnit): Double = js.native
  
  /**
    * Returns an adjusted object of the same type as this object with the adjustment made.
    *
    * This adjusts this date-time according to the rules of the specified adjuster. A simple
    * adjuster might simply set the one of the fields, such as the year field. A more complex
    * adjuster might set the date to the last day of the month. A selection of common adjustments
    * is provided in `TemporalAdjusters`. These include finding the "last day of the month" and
    * "next Wednesday". The adjuster is responsible for handling special cases, such as the
    * varying lengths of month and leap years.
    *
    * Some example code indicating how and why this method is used:
    * ```
    * date = date.with(Month.JULY);        // most key classes implement TemporalAdjuster
    * date = date.with(lastDayOfMonth());  // static import from TemporalAdjusters
    * date = date.with(next(WEDNESDAY));   // static import from TemporalAdjusters and DayOfWeek
    * ```
    */
  def `with`(adjuster: TemporalAdjuster): Temporal = js.native
  /**
    * Returns an object of the same type as this object with the specified field altered.
    *
    * This returns a new object based on this one with the value for the specified field changed.
    * For example, on a `LocalDate`, this could be used to set the year, month or day-of-month.
    * The returned object will have the same observable type as this object.
    *
    * In some cases, changing a field is not fully defined. For example, if the target object is
    * a date representing the 31st January, then changing the month to February would be unclear.
    * In cases like this, the field is responsible for resolving the result. Typically it will
    * choose the previous valid date, which would be the last valid day of February in this
    * example.
    */
  def `with`(field: TemporalField, newValue: Double): Temporal = js.native
}
