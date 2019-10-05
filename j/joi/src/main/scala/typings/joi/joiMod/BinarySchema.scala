package typings.joi.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.joi.joiMod._SchemaLike because Already inherited
- typings.joi.joiMod._Schema because Already inherited */ @js.native
trait BinarySchema extends AnySchema {
  /**
    * Sets the string encoding format if a string input is converted to a buffer.
    */
  def encoding(encoding: String): this.type = js.native
  /**
    * Specifies the exact length of the buffer:
    */
  def length(limit: Double): this.type = js.native
  /**
    * Specifies the maximum length of the buffer.
    */
  def max(limit: Double): this.type = js.native
  /**
    * Specifies the minimum length of the buffer.
    */
  def min(limit: Double): this.type = js.native
}

