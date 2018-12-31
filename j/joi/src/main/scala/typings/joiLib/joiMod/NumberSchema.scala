package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberSchema extends AnySchema {
  def greater(limit: Reference): this.type = js.native
  /**
    * Specifies that the value must be greater than limit.
    * It can also be a reference to another field.
    */
  def greater(limit: scala.Double): this.type = js.native
  /**
    * Requires the number to be an integer (no floating point).
    */
  def integer(): this.type = js.native
  def less(limit: Reference): this.type = js.native
  /**
    * Specifies that the value must be less than limit.
    * It can also be a reference to another field.
    */
  def less(limit: scala.Double): this.type = js.native
  def max(limit: Reference): this.type = js.native
  /**
    * Specifies the maximum value.
    * It can also be a reference to another field.
    */
  def max(limit: scala.Double): this.type = js.native
  def min(limit: Reference): this.type = js.native
  /**
    * Specifies the minimum value.
    * It can also be a reference to another field.
    */
  def min(limit: scala.Double): this.type = js.native
  /**
    * Specifies that the value must be a multiple of base.
    */
  def multiple(base: scala.Double): this.type = js.native
  /**
    * Requires the number to be negative.
    */
  def negative(): this.type = js.native
  /**
    * Requires the number to be a TCP port, so between 0 and 65535.
    */
  def port(): this.type = js.native
  /**
    * Requires the number to be positive.
    */
  def positive(): this.type = js.native
  /**
    * Specifies the maximum number of decimal places where:
    * @param limit - the maximum number of decimal places allowed.
    */
  def precision(limit: scala.Double): this.type = js.native
  /**
    * Allows the number to be outside of JavaScript's safety range (Number.MIN_SAFE_INTEGER & Number.MAX_SAFE_INTEGER).
    */
  def unsafe(): this.type = js.native
  def unsafe(enabled: scala.Boolean): this.type = js.native
}

