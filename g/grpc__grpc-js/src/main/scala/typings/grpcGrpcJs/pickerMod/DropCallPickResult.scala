package typings.grpcGrpcJs.pickerMod

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.pickerMod.PickResultType.DROP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropCallPickResult extends PickResult {
  
  @JSName("extraFilterFactory")
  var extraFilterFactory_DropCallPickResult: Null = js.native
  
  @JSName("onCallStarted")
  var onCallStarted_DropCallPickResult: Null = js.native
  
  @JSName("pickResultType")
  var pickResultType_DropCallPickResult: DROP = js.native
  
  @JSName("status")
  var status_DropCallPickResult: StatusObject = js.native
  
  @JSName("subchannel")
  var subchannel_DropCallPickResult: Null = js.native
}
object DropCallPickResult {
  
  @scala.inline
  def apply(
    extraFilterFactory: Null,
    onCallStarted: Null,
    pickResultType: DROP,
    status: StatusObject,
    subchannel: Null
  ): DropCallPickResult = {
    val __obj = js.Dynamic.literal(extraFilterFactory = extraFilterFactory.asInstanceOf[js.Any], onCallStarted = onCallStarted.asInstanceOf[js.Any], pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropCallPickResult]
  }
  
  @scala.inline
  implicit class DropCallPickResultOps[Self <: DropCallPickResult] (val x: Self) extends AnyVal {
    
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
    def setExtraFilterFactory(value: Null): Self = this.set("extraFilterFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCallStarted(value: Null): Self = this.set("onCallStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickResultType(value: DROP): Self = this.set("pickResultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: StatusObject): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubchannel(value: Null): Self = this.set("subchannel", value.asInstanceOf[js.Any])
  }
}
