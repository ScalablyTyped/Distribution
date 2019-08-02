package typings.atMapboxMapboxDashSdk.libClassesMapiDashClientMod

import typings.atMapboxMapboxDashSdk.libClassesMapiDashRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapiClient extends js.Object {
  var accessToken: String
  var origin: js.UndefOr[String] = js.undefined
  def createRequest(requestOptions: js.Any): MapiRequest
}

object MapiClient {
  @scala.inline
  def apply(accessToken: String, createRequest: js.Any => MapiRequest, origin: String = null): MapiClient = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, createRequest = js.Any.fromFunction1(createRequest))
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[MapiClient]
  }
}

