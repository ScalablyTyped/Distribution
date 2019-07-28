package typings.h2o2.h2o2Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyTarget extends js.Object {
  /** The headers with which to request `uri` */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /** The URI to request */
  var uri: String
}

object ProxyTarget {
  @scala.inline
  def apply(uri: String, headers: StringDictionary[String] = null): ProxyTarget = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[ProxyTarget]
  }
}

