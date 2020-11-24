package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.image_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSourceRaw
  extends Source
     with ImageSourceOptions
     with AnySourceData {
  
  @JSName("type")
  var type_ImageSourceRaw: image_ = js.native
}
object ImageSourceRaw {
  
  @scala.inline
  def apply(`type`: image_): ImageSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSourceRaw]
  }
  
  @scala.inline
  implicit class ImageSourceRawOps[Self <: ImageSourceRaw] (val x: Self) extends AnyVal {
    
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
    def setType(value: image_): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
