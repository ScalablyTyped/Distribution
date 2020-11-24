package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceImage extends js.Object {
  
  var cachedId: js.UndefOr[String] = js.native
  
  var ext: String = js.native
  
  var height: Double = js.native
  
  var imageId: js.UndefOr[String] = js.native
  
  var path: String = js.native
  
  var platform: String = js.native
  
  var resType: String = js.native
  
  var vector: Boolean = js.native
  
  var width: Double = js.native
}
object SourceImage {
  
  @scala.inline
  def apply(
    ext: String,
    height: Double,
    path: String,
    platform: String,
    resType: String,
    vector: Boolean,
    width: Double
  ): SourceImage = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], resType = resType.asInstanceOf[js.Any], vector = vector.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceImage]
  }
  
  @scala.inline
  implicit class SourceImageOps[Self <: SourceImage] (val x: Self) extends AnyVal {
    
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
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResType(value: String): Self = this.set("resType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVector(value: Boolean): Self = this.set("vector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachedId(value: String): Self = this.set("cachedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachedId: Self = this.set("cachedId", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = this.set("imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("imageId", js.undefined)
  }
}
