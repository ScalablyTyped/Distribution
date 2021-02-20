package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 相册选择文件过滤类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
  */
@js.native
trait PlusGalleryGalleryFilter extends StObject {
  
  /**
    * 仅可选择图片文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var image: js.UndefOr[String] = js.native
  
  /**
    * 不过滤，可选择图片或视频文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var none: js.UndefOr[String] = js.native
  
  /**
    * 仅可选择视频文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var video: js.UndefOr[String] = js.native
}
object PlusGalleryGalleryFilter {
  
  @scala.inline
  def apply(): PlusGalleryGalleryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusGalleryGalleryFilter]
  }
  
  @scala.inline
  implicit class PlusGalleryGalleryFilterMutableBuilder[Self <: PlusGalleryGalleryFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    @scala.inline
    def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
