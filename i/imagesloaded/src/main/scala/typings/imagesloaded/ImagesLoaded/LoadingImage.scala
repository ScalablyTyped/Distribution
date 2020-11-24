package typings.imagesloaded.ImagesLoaded

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** interface for an image currently loading or completed */
@js.native
trait LoadingImage extends js.Object {
  
  var img: HTMLImageElement = js.native
  
  var isLoaded: Boolean = js.native
}
object LoadingImage {
  
  @scala.inline
  def apply(img: HTMLImageElement, isLoaded: Boolean): LoadingImage = {
    val __obj = js.Dynamic.literal(img = img.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingImage]
  }
  
  @scala.inline
  implicit class LoadingImageOps[Self <: LoadingImage] (val x: Self) extends AnyVal {
    
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
    def setImg(value: HTMLImageElement): Self = this.set("img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoaded(value: Boolean): Self = this.set("isLoaded", value.asInstanceOf[js.Any])
  }
}
