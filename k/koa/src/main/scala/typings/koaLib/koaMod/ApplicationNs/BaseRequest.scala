package typings
package koaLib.koaMod.ApplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseRequest
  extends koaLib.koaMod.ContextDelegatedRequest {
  /**
    * Get the charset when present or undefined.
    */
  var charset: java.lang.String = js.native
  /**
    * Return parsed Content-Length when present.
    */
  var length: scala.Double = js.native
  /**
    * Return the request mime type void of
    * parameters such as "charset".
    */
  var `type`: java.lang.String = js.native
  /**
    * Inspect implementation.
    */
  def inspect(): js.Any = js.native
  /**
    * Return JSON representation.
    */
  def toJSON(): js.Any = js.native
}

