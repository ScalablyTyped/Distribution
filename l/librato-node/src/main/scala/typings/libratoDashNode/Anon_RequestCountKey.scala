package typings.libratoDashNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RequestCountKey extends js.Object {
  var requestCountKey: js.UndefOr[String] = js.undefined
  var responseTimeKey: js.UndefOr[String] = js.undefined
  var statusCodeKey: js.UndefOr[String] = js.undefined
}

object Anon_RequestCountKey {
  @scala.inline
  def apply(requestCountKey: String = null, responseTimeKey: String = null, statusCodeKey: String = null): Anon_RequestCountKey = {
    val __obj = js.Dynamic.literal()
    if (requestCountKey != null) __obj.updateDynamic("requestCountKey")(requestCountKey.asInstanceOf[js.Any])
    if (responseTimeKey != null) __obj.updateDynamic("responseTimeKey")(responseTimeKey.asInstanceOf[js.Any])
    if (statusCodeKey != null) __obj.updateDynamic("statusCodeKey")(statusCodeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RequestCountKey]
  }
}

