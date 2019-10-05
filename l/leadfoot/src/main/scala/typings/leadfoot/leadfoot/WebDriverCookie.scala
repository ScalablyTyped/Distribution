package typings.leadfoot.leadfoot

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An object that describes an HTTP cookie.
	 */
trait WebDriverCookie extends js.Object {
  /**
  		 * The registered domain for the cookie.
  		 */
  var domain: String
  /**
  		 * The expiration date of the cookie.
  		 */
  var expiry: Date
  /**
  		 * True if the cookie should be inaccessible to client-side scripting.
  		 */
  var httpOnly: Boolean
  /**
  		 * The name of the cookie.
  		 */
  var name: String
  /**
  		 * The registered path for the cookie.
  		 */
  var path: String
  /**
  		 * True if the cookie should only be transmitted over HTTPS.
  		 */
  var secure: Boolean
  /**
  		 * The value of the cookie.
  		 */
  var value: String
}

object WebDriverCookie {
  @scala.inline
  def apply(
    domain: String,
    expiry: Date,
    httpOnly: Boolean,
    name: String,
    path: String,
    secure: Boolean,
    value: String
  ): WebDriverCookie = {
    val __obj = js.Dynamic.literal(domain = domain, expiry = expiry, httpOnly = httpOnly, name = name, path = path, secure = secure, value = value)
  
    __obj.asInstanceOf[WebDriverCookie]
  }
}

