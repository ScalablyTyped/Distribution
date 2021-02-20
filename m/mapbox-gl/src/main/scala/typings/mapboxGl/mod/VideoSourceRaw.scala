package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.video
import org.scalablytyped.runtime.StObject
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
  implicit class VideoSourceRawMutableBuilder[Self <: VideoSourceRaw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
