package typings.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderEndpointOptions extends js.Object {
  var stopOnEndOfStream: js.UndefOr[Boolean] = js.undefined
  var uri: String
}

object RecorderEndpointOptions {
  @scala.inline
  def apply(uri: String, stopOnEndOfStream: js.UndefOr[Boolean] = js.undefined): RecorderEndpointOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnEndOfStream)) __obj.updateDynamic("stopOnEndOfStream")(stopOnEndOfStream.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderEndpointOptions]
  }
}

