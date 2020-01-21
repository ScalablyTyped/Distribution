package typings.mapboxMapboxSdk.mod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
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
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], createRequest = js.Any.fromFunction1(createRequest))
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapiClient]
  }
}

