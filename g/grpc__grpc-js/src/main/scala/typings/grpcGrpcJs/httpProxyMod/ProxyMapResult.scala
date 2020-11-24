package typings.grpcGrpcJs.httpProxyMod

import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.uriParserMod.GrpcUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyMapResult extends js.Object {
  
  var extraOptions: ChannelOptions = js.native
  
  var target: GrpcUri = js.native
}
object ProxyMapResult {
  
  @scala.inline
  def apply(extraOptions: ChannelOptions, target: GrpcUri): ProxyMapResult = {
    val __obj = js.Dynamic.literal(extraOptions = extraOptions.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyMapResult]
  }
  
  @scala.inline
  implicit class ProxyMapResultOps[Self <: ProxyMapResult] (val x: Self) extends AnyVal {
    
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
    def setExtraOptions(value: ChannelOptions): Self = this.set("extraOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: GrpcUri): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
