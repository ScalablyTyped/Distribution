package typings.grpcGrpcJs.callCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallMetadataOptions extends js.Object {
  var service_url: String = js.native
}

object CallMetadataOptions {
  @scala.inline
  def apply(service_url: String): CallMetadataOptions = {
    val __obj = js.Dynamic.literal(service_url = service_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallMetadataOptions]
  }
  @scala.inline
  implicit class CallMetadataOptionsOps[Self <: CallMetadataOptions] (val x: Self) extends AnyVal {
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
    def setService_url(value: String): Self = this.set("service_url", value.asInstanceOf[js.Any])
  }
  
}

