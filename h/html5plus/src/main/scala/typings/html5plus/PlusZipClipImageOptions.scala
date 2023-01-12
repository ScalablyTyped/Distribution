package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，图片裁剪区域的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
  */
trait PlusZipClipImageOptions extends StObject {
  
  /**
    * 图片裁剪区域的高度
    * 支持像素值（如"100px"）、百分比（如"50%"）、自动计算（如"auto"，即从top位置到图片下边界的高度）；默认值为"auto"。
    *     注意：如果top值加height值超出原图片高度，则使用"auto"值进行裁剪。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * 图片裁剪区域与原图片左边界的偏移距离
    * 支持像素值（如"10px"）、百分比（如"10%"）；默认值为"0px"。
    *     注意：如果left值超出原图片宽度，则图片裁剪失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var left: js.UndefOr[String] = js.undefined
  
  /**
    * 图片裁剪区域与原图片上边界的偏移距离
    * 支持像素值（如"10px"）、百分比（如"10%"）；默认值为"0px"。
    *     注意：如果top值超出原图片高度，则图片裁剪失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var top: js.UndefOr[String] = js.undefined
  
  /**
    * 图片裁剪区域的宽度
    * 支持像素值（如"100px"）、百分比（如"50%"）、自动计算（如"auto"，即从left位置到图片右边界的宽度）；默认值为"auto"。
    *     注意：如果left值加width值超出原图片宽度，则使用"auto"值进行裁剪。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var width: js.UndefOr[String] = js.undefined
}
object PlusZipClipImageOptions {
  
  inline def apply(): PlusZipClipImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusZipClipImageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusZipClipImageOptions] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
