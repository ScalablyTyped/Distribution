package typings.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderEndpointOptions extends js.Object {
  var stopOnEndOfStream: js.UndefOr[Boolean] = js.native
  var uri: String = js.native
}

object RecorderEndpointOptions {
  @scala.inline
  def apply(uri: String): RecorderEndpointOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderEndpointOptions]
  }
  @scala.inline
  implicit class RecorderEndpointOptionsOps[Self <: RecorderEndpointOptions] (val x: Self) extends AnyVal {
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
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopOnEndOfStream(value: Boolean): Self = this.set("stopOnEndOfStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOnEndOfStream: Self = this.set("stopOnEndOfStream", js.undefined)
  }
  
}

