package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of the Video.
  */
@js.native
trait SchemaVideoProperties extends js.Object {
  
  /**
    * Whether to enable video autoplay when the page is displayed in present
    * mode. Defaults to false.
    */
  var autoPlay: js.UndefOr[Boolean] = js.native
  
  /**
    * The time at which to end playback, measured in seconds from the beginning
    * of the video. If set, the end time should be after the start time. If not
    * set or if you set this to a value that exceeds the video&#39;s length,
    * the video will be played until its end.
    */
  var end: js.UndefOr[Double] = js.native
  
  /**
    * Whether to mute the audio during video playback. Defaults to false.
    */
  var mute: js.UndefOr[Boolean] = js.native
  
  /**
    * The outline of the video. The default outline matches the defaults for
    * new videos created in the Slides editor.
    */
  var outline: js.UndefOr[SchemaOutline] = js.native
  
  /**
    * The time at which to start playback, measured in seconds from the
    * beginning of the video. If set, the start time should be before the end
    * time. If you set this to a value that exceeds the video&#39;s length in
    * seconds, the video will be played from the last second. If not set, the
    * video will be played from the beginning.
    */
  var start: js.UndefOr[Double] = js.native
}
object SchemaVideoProperties {
  
  @scala.inline
  def apply(): SchemaVideoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoProperties]
  }
  
  @scala.inline
  implicit class SchemaVideoPropertiesOps[Self <: SchemaVideoProperties] (val x: Self) extends AnyVal {
    
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
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setMute(value: Boolean): Self = this.set("mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMute: Self = this.set("mute", js.undefined)
    
    @scala.inline
    def setOutline(value: SchemaOutline): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
