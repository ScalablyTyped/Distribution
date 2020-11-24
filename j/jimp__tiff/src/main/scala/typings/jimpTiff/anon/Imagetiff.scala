package typings.jimpTiff.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Imagetiff extends js.Object {
  
  @JSName("image/tiff")
  var imageSlashtiff: js.Array[String] = js.native
}
object Imagetiff {
  
  @scala.inline
  def apply(imageSlashtiff: js.Array[String]): Imagetiff = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/tiff")(imageSlashtiff.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imagetiff]
  }
  
  @scala.inline
  implicit class ImagetiffOps[Self <: Imagetiff] (val x: Self) extends AnyVal {
    
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
    def setImageSlashtiffVarargs(value: String*): Self = this.set("image/tiff", js.Array(value :_*))
    
    @scala.inline
    def setImageSlashtiff(value: js.Array[String]): Self = this.set("image/tiff", value.asInstanceOf[js.Any])
  }
}
