package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestCookie extends js.Object {
  /** Name. */
  var name: java.lang.String
  /** Whether configured to override VU cookie jar. */
  var replace: scala.Boolean
  /** Value. */
  var value: java.lang.String
}

object RequestCookie {
  @scala.inline
  def apply(name: java.lang.String, replace: scala.Boolean, value: java.lang.String): RequestCookie = {
    val __obj = js.Dynamic.literal(name = name, replace = replace, value = value)
  
    __obj.asInstanceOf[RequestCookie]
  }
}

