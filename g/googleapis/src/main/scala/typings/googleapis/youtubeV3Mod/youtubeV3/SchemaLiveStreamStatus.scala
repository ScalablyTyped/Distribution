package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Brief description of the live stream status.
  */
@js.native
trait SchemaLiveStreamStatus extends js.Object {
  
  /**
    * The health status of the stream.
    */
  var healthStatus: js.UndefOr[SchemaLiveStreamHealthStatus] = js.native
  
  var streamStatus: js.UndefOr[String] = js.native
}
object SchemaLiveStreamStatus {
  
  @scala.inline
  def apply(): SchemaLiveStreamStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveStreamStatus]
  }
  
  @scala.inline
  implicit class SchemaLiveStreamStatusOps[Self <: SchemaLiveStreamStatus] (val x: Self) extends AnyVal {
    
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
    def setHealthStatus(value: SchemaLiveStreamHealthStatus): Self = this.set("healthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthStatus: Self = this.set("healthStatus", js.undefined)
    
    @scala.inline
    def setStreamStatus(value: String): Self = this.set("streamStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamStatus: Self = this.set("streamStatus", js.undefined)
  }
}
