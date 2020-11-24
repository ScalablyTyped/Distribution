package typings.jimpJpeg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Imagejpeg extends js.Object {
  
  @JSName("image/jpeg")
  var imageSlashjpeg: js.Array[String] = js.native
}
object Imagejpeg {
  
  @scala.inline
  def apply(imageSlashjpeg: js.Array[String]): Imagejpeg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/jpeg")(imageSlashjpeg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imagejpeg]
  }
  
  @scala.inline
  implicit class ImagejpegOps[Self <: Imagejpeg] (val x: Self) extends AnyVal {
    
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
    def setImageSlashjpegVarargs(value: String*): Self = this.set("image/jpeg", js.Array(value :_*))
    
    @scala.inline
    def setImageSlashjpeg(value: js.Array[String]): Self = this.set("image/jpeg", value.asInstanceOf[js.Any])
  }
}
