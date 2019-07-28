package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseCookie extends js.Object {
  /** Domain allowed to receive. */
  var domain: String
  /** Expiry time in millisecond Unix time. */
  var expires: Double
  /** HTTP only. */
  var httpOnly: Boolean
  /** Seconds until expiration. */
  var maxAge: Double
  /** Name. */
  var name: String
  /** Scope path. */
  var path: String
  /** Secure. */
  var secure: Boolean
  /** Value. */
  var value: String
}

object ResponseCookie {
  @scala.inline
  def apply(
    domain: String,
    expires: Double,
    httpOnly: Boolean,
    maxAge: Double,
    name: String,
    path: String,
    secure: Boolean,
    value: String
  ): ResponseCookie = {
    val __obj = js.Dynamic.literal(domain = domain, expires = expires, httpOnly = httpOnly, maxAge = maxAge, name = name, path = path, secure = secure, value = value)
  
    __obj.asInstanceOf[ResponseCookie]
  }
}

