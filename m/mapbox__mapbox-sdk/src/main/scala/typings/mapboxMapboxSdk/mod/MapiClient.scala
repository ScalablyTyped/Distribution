package typings.mapboxMapboxSdk.mod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapiClient extends js.Object {
  var accessToken: String = js.native
  var origin: js.UndefOr[String] = js.native
  def createRequest(requestOptions: js.Any): MapiRequest = js.native
}

object MapiClient {
  @scala.inline
  def apply(accessToken: String, createRequest: js.Any => MapiRequest): MapiClient = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], createRequest = js.Any.fromFunction1(createRequest))
    __obj.asInstanceOf[MapiClient]
  }
  @scala.inline
  implicit class MapiClientOps[Self <: MapiClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateRequest(value: js.Any => MapiRequest): Self = this.set("createRequest", js.Any.fromFunction1(value))
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

