package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamingStageLocation extends js.Object {
  
  /** Identifies the particular stream within the streaming Dataflow job. */
  var streamId: js.UndefOr[String] = js.native
}
object StreamingStageLocation {
  
  @scala.inline
  def apply(): StreamingStageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingStageLocation]
  }
  
  @scala.inline
  implicit class StreamingStageLocationOps[Self <: StreamingStageLocation] (val x: Self) extends AnyVal {
    
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
    def setStreamId(value: String): Self = this.set("streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamId: Self = this.set("streamId", js.undefined)
  }
}
