package typings.atHapiH2o2.atHapiH2o2Mod

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
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyTarget]
  }
}

