package typings.jsforce.httpApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpApiOptions extends js.Object {
  var noContentResponse: js.UndefOr[js.Object] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var transport: js.UndefOr[js.Object] = js.undefined
}

object HttpApiOptions {
  @scala.inline
  def apply(noContentResponse: js.Object = null, responseType: String = null, transport: js.Object = null): HttpApiOptions = {
    val __obj = js.Dynamic.literal()
    if (noContentResponse != null) __obj.updateDynamic("noContentResponse")(noContentResponse.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpApiOptions]
  }
}

