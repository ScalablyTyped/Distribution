package typings
package httpDashLinkDashHeaderLib.httpDashLinkDashHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference
  extends /* index */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var rel: java.lang.String
  var uri: java.lang.String
}

object Reference {
  @scala.inline
  def apply(
    rel: java.lang.String,
    uri: java.lang.String,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Reference = {
    val __obj = js.Dynamic.literal(rel = rel, uri = uri)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Reference]
  }
}

