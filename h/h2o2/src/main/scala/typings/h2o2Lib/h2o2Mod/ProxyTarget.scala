package typings
package h2o2Lib.h2o2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyTarget extends js.Object {
  /** The headers with which to request `uri` */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /** The URI to request */
  var uri: java.lang.String
}

object ProxyTarget {
  @scala.inline
  def apply(
    uri: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): ProxyTarget = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[ProxyTarget]
  }
}

