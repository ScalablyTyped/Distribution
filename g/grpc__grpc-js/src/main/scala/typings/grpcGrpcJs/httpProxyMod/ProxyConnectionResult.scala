package typings.grpcGrpcJs.httpProxyMod

import typings.grpcGrpcJs.uriParserMod.GrpcUri
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConnectionResult extends js.Object {
  var realTarget: js.UndefOr[GrpcUri] = js.native
  var socket: js.UndefOr[Socket] = js.native
}

object ProxyConnectionResult {
  @scala.inline
  def apply(): ProxyConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyConnectionResult]
  }
  @scala.inline
  implicit class ProxyConnectionResultOps[Self <: ProxyConnectionResult] (val x: Self) extends AnyVal {
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
    def setRealTarget(value: GrpcUri): Self = this.set("realTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealTarget: Self = this.set("realTarget", js.undefined)
    @scala.inline
    def setSocket(value: Socket): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
  }
  
}

