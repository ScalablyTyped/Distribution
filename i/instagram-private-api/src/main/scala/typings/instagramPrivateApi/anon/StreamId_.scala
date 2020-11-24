package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamId_ extends js.Object {
  
  var ruploadParams: js.Any = js.native
  
  var streamId: js.Any = js.native
}
object StreamId_ {
  
  @scala.inline
  def apply(ruploadParams: js.Any, streamId: js.Any): StreamId_ = {
    val __obj = js.Dynamic.literal(ruploadParams = ruploadParams.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamId_]
  }
  
  @scala.inline
  implicit class StreamId_Ops[Self <: StreamId_] (val x: Self) extends AnyVal {
    
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
    def setRuploadParams(value: js.Any): Self = this.set("ruploadParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: js.Any): Self = this.set("streamId", value.asInstanceOf[js.Any])
  }
}
