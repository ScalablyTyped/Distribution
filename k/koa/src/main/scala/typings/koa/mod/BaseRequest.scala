package typings.koa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseRequest extends ContextDelegatedRequest {
  
  /**
    * Get the charset when present or undefined.
    */
  var charset: String = js.native
  
  /**
    * Inspect implementation.
    */
  def inspect(): js.Any = js.native
  
  /**
    * Return parsed Content-Length when present.
    */
  var length: Double = js.native
  
  /**
    * Return JSON representation.
    */
  def toJSON(): js.Any = js.native
  
  /**
    * Return the request mime type void of
    * parameters such as "charset".
    */
  var `type`: String = js.native
}
