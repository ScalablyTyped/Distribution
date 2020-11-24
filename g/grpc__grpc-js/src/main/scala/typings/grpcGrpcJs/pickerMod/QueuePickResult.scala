package typings.grpcGrpcJs.pickerMod

import typings.grpcGrpcJs.pickerMod.PickResultType.QUEUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueuePickResult extends PickResult {
  
  @JSName("extraFilterFactory")
  var extraFilterFactory_QueuePickResult: Null = js.native
  
  @JSName("onCallStarted")
  var onCallStarted_QueuePickResult: Null = js.native
  
  @JSName("pickResultType")
  var pickResultType_QueuePickResult: QUEUE = js.native
  
  @JSName("status")
  var status_QueuePickResult: Null = js.native
  
  @JSName("subchannel")
  var subchannel_QueuePickResult: Null = js.native
}
object QueuePickResult {
  
  @scala.inline
  def apply(
    extraFilterFactory: Null,
    onCallStarted: Null,
    pickResultType: QUEUE,
    status: Null,
    subchannel: Null
  ): QueuePickResult = {
    val __obj = js.Dynamic.literal(extraFilterFactory = extraFilterFactory.asInstanceOf[js.Any], onCallStarted = onCallStarted.asInstanceOf[js.Any], pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueuePickResult]
  }
  
  @scala.inline
  implicit class QueuePickResultOps[Self <: QueuePickResult] (val x: Self) extends AnyVal {
    
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
    def setPickResultType(value: QUEUE): Self = this.set("pickResultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Null): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubchannel(value: Null): Self = this.set("subchannel", value.asInstanceOf[js.Any])
  }
}
