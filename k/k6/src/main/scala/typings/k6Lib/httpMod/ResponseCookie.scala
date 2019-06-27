package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseCookie extends js.Object {
  var domain: java.lang.String
  var expires: scala.Double
  var httpOnly: scala.Boolean
  var maxAge: scala.Double
  var name: java.lang.String
  var path: java.lang.String
  var secure: scala.Boolean
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

