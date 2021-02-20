package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，弹出拍照或摄像界面指示位置
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
  */
@js.native
trait PlusGalleryPopPosition extends StObject {
  
  /**
    * 指示区域的高度
    * 弹出拍照或摄像窗口指示区域的高度，单位支持像素值（如"100px"）和百分比（如"50%"），如不写单位则为像素值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * 指示区域距离容器左侧的距离
    * 弹出拍照或摄像窗口指示区域距离容器左侧的距离，单位支持像素值（如"100px"）和百分比（如"50%"），如不写单位则为像素值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var left: js.UndefOr[String] = js.native
  
  /**
    * 指示区域距离容器顶部的距离
    * 弹出拍照或摄像窗口指示区域距离容器顶部的距离，单位支持像素值（如"100px"）和百分比（如"50%"），如不写单位则为像素值值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var top: js.UndefOr[String] = js.native
  
  /**
    * 指示区域的宽度
    * 弹出拍照或摄像窗口指示区域的宽度，单位支持像素值（如"100px"）和百分比（如"50%"），如不写单位则为像素值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var width: js.UndefOr[String] = js.native
}
object PlusGalleryPopPosition {
  
  @scala.inline
  def apply(): PlusGalleryPopPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusGalleryPopPosition]
  }
  
  @scala.inline
  implicit class PlusGalleryPopPositionMutableBuilder[Self <: PlusGalleryPopPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
