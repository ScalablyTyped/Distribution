package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.joi.mod._Schema because Already inherited */ @js.native
trait BooleanSchema extends AnySchema {
  
  /**
    * Allows for additional values to be considered valid booleans by converting them to false during validation.
    * String comparisons are by default case insensitive,
    * see `boolean.sensitive()` to change this behavior.
    * @param values - strings, numbers or arrays of them
    */
  def falsy(values: (String | Double)*): this.type = js.native
  
  /**
    * Allows the values provided to truthy and falsy as well as the "true" and "false" default conversion
    * (when not in `strict()` mode) to be matched in a case insensitive manner.
    */
  def sensitive(): this.type = js.native
  def sensitive(enabled: Boolean): this.type = js.native
  
  /**
    * Allows for additional values to be considered valid booleans by converting them to true during validation.
    * String comparisons are by default case insensitive, see `boolean.sensitive()` to change this behavior.
    * @param values - strings, numbers or arrays of them
    */
  def truthy(values: (String | Double)*): this.type = js.native
}
