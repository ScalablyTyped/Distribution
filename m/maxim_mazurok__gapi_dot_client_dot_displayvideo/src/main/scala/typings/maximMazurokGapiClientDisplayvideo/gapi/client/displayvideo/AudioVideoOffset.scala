package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioVideoOffset extends js.Object {
  
  /** The offset in percentage of the audio or video duration. */
  var percentage: js.UndefOr[String] = js.native
  
  /** The offset in seconds from the start of the audio or video. */
  var seconds: js.UndefOr[String] = js.native
}
object AudioVideoOffset {
  
  @scala.inline
  def apply(): AudioVideoOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioVideoOffset]
  }
  
  @scala.inline
  implicit class AudioVideoOffsetOps[Self <: AudioVideoOffset] (val x: Self) extends AnyVal {
    
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
    def setPercentage(value: String): Self = this.set("percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
    
    @scala.inline
    def setSeconds(value: String): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
  }
}
