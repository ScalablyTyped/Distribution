package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoSourceRaw
  extends Source
     with VideoSourceOptions
     with AnySourceData {
  
  @JSName("type")
  var type_VideoSourceRaw: video = js.native
}
object VideoSourceRaw {
  
  @scala.inline
  def apply(`type`: video): VideoSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSourceRaw]
  }
  
  @scala.inline
  implicit class VideoSourceRawOps[Self <: VideoSourceRaw] (val x: Self) extends AnyVal {
    
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
    def setType(value: video): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
