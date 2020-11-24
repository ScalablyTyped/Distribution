package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings and Info of the monitor stream
  */
@js.native
trait SchemaMonitorStreamInfo extends js.Object {
  
  /**
    * If you have set the enableMonitorStream property to true, then this
    * property determines the length of the live broadcast delay.
    */
  var broadcastStreamDelayMs: js.UndefOr[Double] = js.native
  
  /**
    * HTML code that embeds a player that plays the monitor stream.
    */
  var embedHtml: js.UndefOr[String] = js.native
  
  /**
    * This value determines whether the monitor stream is enabled for the
    * broadcast. If the monitor stream is enabled, then YouTube will broadcast
    * the event content on a special stream intended only for the
    * broadcaster&#39;s consumption. The broadcaster can use the stream to
    * review the event content and also to identify the optimal times to insert
    * cuepoints.  You need to set this value to true if you intend to have a
    * broadcast delay for your event.  Note: This property cannot be updated
    * once the broadcast is in the testing or live state.
    */
  var enableMonitorStream: js.UndefOr[Boolean] = js.native
}
object SchemaMonitorStreamInfo {
  
  @scala.inline
  def apply(): SchemaMonitorStreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitorStreamInfo]
  }
  
  @scala.inline
  implicit class SchemaMonitorStreamInfoOps[Self <: SchemaMonitorStreamInfo] (val x: Self) extends AnyVal {
    
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
    def setBroadcastStreamDelayMs(value: Double): Self = this.set("broadcastStreamDelayMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBroadcastStreamDelayMs: Self = this.set("broadcastStreamDelayMs", js.undefined)
    
    @scala.inline
    def setEmbedHtml(value: String): Self = this.set("embedHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbedHtml: Self = this.set("embedHtml", js.undefined)
    
    @scala.inline
    def setEnableMonitorStream(value: Boolean): Self = this.set("enableMonitorStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMonitorStream: Self = this.set("enableMonitorStream", js.undefined)
  }
}
