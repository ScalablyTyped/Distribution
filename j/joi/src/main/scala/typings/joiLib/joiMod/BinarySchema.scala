package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- joiLib.joiMod._Schema because Already inherited */ @js.native
trait BinarySchema extends AnySchema {
  /**
    * Sets the string encoding format if a string input is converted to a buffer.
    */
  def encoding(encoding: java.lang.String): this.type = js.native
  /**
    * Specifies the exact length of the buffer:
    */
  def length(limit: scala.Double): this.type = js.native
  /**
    * Specifies the maximum length of the buffer.
    */
  def max(limit: scala.Double): this.type = js.native
  /**
    * Specifies the minimum length of the buffer.
    */
  def min(limit: scala.Double): this.type = js.native
}

