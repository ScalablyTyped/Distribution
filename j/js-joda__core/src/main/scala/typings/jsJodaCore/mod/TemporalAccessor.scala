package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@js-joda/core", "TemporalAccessor")
@js.native
open class TemporalAccessor () extends StObject {
  
  /**
    * Gets the value of the specified field as an integer number.
    *
    * This queries the date-time for the value for the specified field. The returned value will
    * always be within the valid range of values for the field. If the date-time cannot return
    * the value, because the field is unsupported or for some other reason, an exception will
    * be thrown.
    */
  def get(field: TemporalField): Double = js.native
  
  def getLong(field: TemporalField): Double = js.native
  
  /**
    * Checks if the specified field is supported.
    *
    * This checks if the date-time can be queried for the specified field. If false, then
    * calling the `range` and `get` methods will throw an exception.
    */
  def isSupported(field: TemporalField): Boolean = js.native
  
  /**
    * Queries this date-time.
    *
    * This queries this date-time using the specified query strategy object.
    *
    * Queries are a key tool for extracting information from date-times. They exists to
    * externalize the process of querying, permitting different approaches, as per the strategy
    * design pattern. Examples might be a query that checks if the date is the day before
    * February 29th in a leap year, or calculates the number of days to your next birthday.
    *
    * The most common query implementations are method references, such as `LocalDate::FROM` and
    * `ZoneId::FROM`. Further implementations are on `TemporalQueries`. Queries may also be
    * defined by applications.
    */
  def query[R](query: TemporalQuery[R]): R | Null = js.native
  
  /**
    * Gets the range of valid values for the specified field.
    *
    * All fields can be expressed as an integer number. This method returns an object that
    * describes the valid range for that value. The value of this temporal object is used to
    * enhance the accuracy of the returned range. If the date-time cannot return the range,
    * because the field is unsupported or for some other reason, an exception will be thrown.
    *
    * Note that the result only describes the minimum and maximum valid values and it is
    * important not to read too much into them. For example, there could be values within the
    * range that are invalid for the field.
    */
  def range(field: TemporalField): ValueRange = js.native
}
