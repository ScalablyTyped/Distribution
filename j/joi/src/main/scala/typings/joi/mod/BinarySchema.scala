package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinarySchema
  extends StObject
     with AnySchema[Any]
     with _Schema[Any] {
  
  /**
    * Sets the string encoding format if a string input is converted to a buffer.
    */
  def encoding(encoding: String): this.type = js.native
  
  /**
    * Specifies the exact length of the buffer:
    */
  def length(limit: Double): this.type = js.native
  def length(limit: Reference): this.type = js.native
  
  /**
    * Specifies the maximum length of the buffer.
    */
  def max(limit: Double): this.type = js.native
  def max(limit: Reference): this.type = js.native
  
  /**
    * Specifies the minimum length of the buffer.
    */
  def min(limit: Double): this.type = js.native
  def min(limit: Reference): this.type = js.native
}
