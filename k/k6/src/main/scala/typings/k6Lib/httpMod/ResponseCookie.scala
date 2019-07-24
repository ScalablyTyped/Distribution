package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseCookie extends js.Object {
  /** Domain allowed to receive. */
  var domain: java.lang.String
  /** Expiry time in millisecond Unix time. */
  var expires: scala.Double
  /** HTTP only. */
  var httpOnly: scala.Boolean
  /** Seconds until expiration. */
  var maxAge: scala.Double
  /** Name. */
  var name: java.lang.String
  /** Scope path. */
  var path: java.lang.String
  /** Secure. */
  var secure: scala.Boolean
  /** Value. */
  var value: java.lang.String
}

object ResponseCookie {
  @scala.inline
  def apply(
    domain: java.lang.String,
    expires: scala.Double,
    httpOnly: scala.Boolean,
    maxAge: scala.Double,
    name: java.lang.String,
    path: java.lang.String,
    secure: scala.Boolean,
    value: java.lang.String
  ): ResponseCookie = {
    val __obj = js.Dynamic.literal(domain = domain, expires = expires, httpOnly = httpOnly, maxAge = maxAge, name = name, path = path, secure = secure, value = value)
  
    __obj.asInstanceOf[ResponseCookie]
  }
}

