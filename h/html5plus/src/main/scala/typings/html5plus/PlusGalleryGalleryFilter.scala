package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 相册选择文件过滤类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
  */
trait PlusGalleryGalleryFilter extends StObject {
  
  /**
    * 仅可选择图片文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * 不过滤，可选择图片或视频文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var none: js.UndefOr[String] = js.undefined
  
  /**
    * 仅可选择视频文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var video: js.UndefOr[String] = js.undefined
}
object PlusGalleryGalleryFilter {
  
  inline def apply(): PlusGalleryGalleryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusGalleryGalleryFilter]
  }
  
  extension [Self <: PlusGalleryGalleryFilter](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    inline def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
