package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 保存图片到相册成功事件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
  */
trait PlusGalleryGallerySaveEvent extends StObject {
  
  /**
    * 保存到相册的图片路径
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var path: js.UndefOr[String] = js.undefined
}
object PlusGalleryGallerySaveEvent {
  
  inline def apply(): PlusGalleryGallerySaveEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusGalleryGallerySaveEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusGalleryGallerySaveEvent] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
