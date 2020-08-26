package typings.grpcGrpcJs.resolverDnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DnsUrl extends js.Object {
  var host: String = js.native
  var port: js.UndefOr[String] = js.native
}

object DnsUrl {
  @scala.inline
  def apply(host: String): DnsUrl = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsUrl]
  }
  @scala.inline
  implicit class DnsUrlOps[Self <: DnsUrl] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

