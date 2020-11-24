package typings.mapnik.anon

import typings.mapnik.mapnikStrings.jpeg
import typings.mapnik.mapnikStrings.png
import typings.mapnik.mapnikStrings.tiff
import typings.mapnik.mapnikStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Imagescaling extends js.Object {
  
  var image_format: js.UndefOr[webp | jpeg | png | tiff] = js.native
  
  var image_scaling: js.UndefOr[String] = js.native
}
object Imagescaling {
  
  @scala.inline
  def apply(): Imagescaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Imagescaling]
  }
  
  @scala.inline
  implicit class ImagescalingOps[Self <: Imagescaling] (val x: Self) extends AnyVal {
    
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
    def setImage_format(value: webp | jpeg | png | tiff): Self = this.set("image_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_format: Self = this.set("image_format", js.undefined)
    
    @scala.inline
    def setImage_scaling(value: String): Self = this.set("image_scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_scaling: Self = this.set("image_scaling", js.undefined)
  }
}
