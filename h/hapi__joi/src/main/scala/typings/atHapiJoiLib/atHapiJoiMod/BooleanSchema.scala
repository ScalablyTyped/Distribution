package typings
package atHapiJoiLib.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atHapiJoiLib.atHapiJoiMod._Schema because Already inherited */ @js.native
trait BooleanSchema extends AnySchema {
  /**
    * Allows for additional values to be considered valid booleans by converting them to false during validation.
    * Accepts a value or an array of values. String comparisons are by default case insensitive,
    * see boolean.insensitive() to change this behavior.
    * @param values - strings, numbers or arrays of them
    */
  def falsy(values: (java.lang.String | scala.Double | (js.Array[scala.Double | java.lang.String]))*): this.type = js.native
  /**
    * Allows the values provided to truthy and falsy as well as the "true" and "false" default conversion
    * (when not in strict() mode) to be matched in a case insensitive manner.
    */
  def insensitive(): this.type = js.native
  def insensitive(enabled: scala.Boolean): this.type = js.native
  /**
    * Allows for additional values to be considered valid booleans by converting them to true during validation.
    * Accepts a value or an array of values. String comparisons are by default case insensitive,
    * see boolean.insensitive() to change this behavior.
    * @param values - strings, numbers or arrays of them
    */
  def truthy(values: (java.lang.String | scala.Double | (js.Array[scala.Double | java.lang.String]))*): this.type = js.native
}

