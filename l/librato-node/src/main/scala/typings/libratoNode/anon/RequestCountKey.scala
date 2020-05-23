package typings.libratoNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestCountKey extends js.Object {
  var requestCountKey: js.UndefOr[String] = js.undefined
  var responseTimeKey: js.UndefOr[String] = js.undefined
  var statusCodeKey: js.UndefOr[String] = js.undefined
}

object RequestCountKey {
  @scala.inline
  def apply(requestCountKey: String = null, responseTimeKey: String = null, statusCodeKey: String = null): RequestCountKey = {
    val __obj = js.Dynamic.literal()
    if (requestCountKey != null) __obj.updateDynamic("requestCountKey")(requestCountKey.asInstanceOf[js.Any])
    if (responseTimeKey != null) __obj.updateDynamic("responseTimeKey")(responseTimeKey.asInstanceOf[js.Any])
    if (statusCodeKey != null) __obj.updateDynamic("statusCodeKey")(statusCodeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCountKey]
  }
}

