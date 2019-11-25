package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestCookie extends js.Object {
  /** Name. */
  var name: String
  /** Whether configured to override VU cookie jar. */
  var replace: Boolean
  /** Value. */
  var value: String
}

object RequestCookie {
  @scala.inline
  def apply(name: String, replace: Boolean, value: String): RequestCookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestCookie]
  }
}

