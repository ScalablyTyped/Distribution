package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateSchema extends AnySchema {
  /**
    * Specifies the allowed date format:
    * @param format - string or array of strings that follow the moment.js format.
    */
  def format(format: java.lang.String): this.type = js.native
  def format(format: js.Array[java.lang.String]): this.type = js.native
  def greater(date: java.lang.String): this.type = js.native
  def greater(date: Reference): this.type = js.native
  def greater(date: scala.Double): this.type = js.native
  def greater(date: stdLib.Date): this.type = js.native
  /**
    * Specifies that the value must be greater than date.
    * Notes: 'now' can be passed in lieu of date so as to always compare relatively to the current date,
    * allowing to explicitly ensure a date is either in the past or in the future.
    * It can also be a reference to another field.
    */
  @JSName("greater")
  def greater_now(date: joiLib.joiLibStrings.now): this.type = js.native
  /**
    * Requires the string value to be in valid ISO 8601 date format.
    */
  def iso(): this.type = js.native
  def less(date: java.lang.String): this.type = js.native
  def less(date: Reference): this.type = js.native
  def less(date: scala.Double): this.type = js.native
  def less(date: stdLib.Date): this.type = js.native
  /**
    * Specifies that the value must be less than date.
    * Notes: 'now' can be passed in lieu of date so as to always compare relatively to the current date,
    * allowing to explicitly ensure a date is either in the past or in the future.
    * It can also be a reference to another field.
    */
  @JSName("less")
  def less_now(date: joiLib.joiLibStrings.now): this.type = js.native
  def max(date: java.lang.String): this.type = js.native
  def max(date: Reference): this.type = js.native
  def max(date: scala.Double): this.type = js.native
  def max(date: stdLib.Date): this.type = js.native
  /**
    * Specifies the latest date allowed.
    * Notes: 'now' can be passed in lieu of date so as to always compare relatively to the current date,
    * allowing to explicitly ensure a date is either in the past or in the future.
    * It can also be a reference to another field.
    */
  @JSName("max")
  def max_now(date: joiLib.joiLibStrings.now): this.type = js.native
  def min(date: java.lang.String): this.type = js.native
  def min(date: Reference): this.type = js.native
  def min(date: scala.Double): this.type = js.native
  def min(date: stdLib.Date): this.type = js.native
  /**
    * Specifies the oldest date allowed.
    * Notes: 'now' can be passed in lieu of date so as to always compare relatively to the current date,
    * allowing to explicitly ensure a date is either in the past or in the future.
    * It can also be a reference to another field.
    */
  @JSName("min")
  def min_now(date: joiLib.joiLibStrings.now): this.type = js.native
  /**
    * Requires the value to be a timestamp interval from Unix Time.
    * @param type - the type of timestamp (allowed values are unix or javascript [default])
    */
  def timestamp(): this.type = js.native
  @JSName("timestamp")
  def timestamp_javascript(`type`: joiLib.joiLibStrings.javascript): this.type = js.native
  @JSName("timestamp")
  def timestamp_unix(`type`: joiLib.joiLibStrings.unix): this.type = js.native
}

