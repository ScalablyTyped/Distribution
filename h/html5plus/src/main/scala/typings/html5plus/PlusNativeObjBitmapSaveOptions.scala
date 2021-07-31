package typings.html5plus

import typings.html5plus.html5plusStrings.jpg
import typings.html5plus.html5plusStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，保存图片的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjBitmapSaveOptions extends StObject {
  
  /**
    * 指定裁剪区域保存图片
    * 相对于图片的区域信息，默认值为{top:'0px',left:'0px',width:'100%',height:'100%'}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var clip: js.UndefOr[PlusNativeObjRect] = js.undefined
  
  /**
    * 保存图片的格式
    * 支持"jpg"、"png"，如果未指定则默认使用指定的保存路径后缀对应的文件格式，如果后缀文件格式无效则使用jpg格式。
    * - jpg: JPG格式图片
    * - png: PNG格式图片
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var format: js.UndefOr[jpg | png] = js.undefined
  
  /**
    * 覆盖保存图片文件
    * 仅在保存的图片路径文件存在时有效：
    *     true表示覆盖存在的文件；
    *     false表示不覆盖，如果文件存在，则返回失败。
    *     默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 保存图片的质量
    * 取值范围为1-100，1表示使用最低的图片质量（保存后的图片文件最小）、100表示使用最高的图片质量（保存后的图片文件最大）；
    *     默认值为50。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var quality: js.UndefOr[Double] = js.undefined
}
object PlusNativeObjBitmapSaveOptions {
  
  @scala.inline
  def apply(): PlusNativeObjBitmapSaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjBitmapSaveOptions]
  }
  
  @scala.inline
  implicit class PlusNativeObjBitmapSaveOptionsMutableBuilder[Self <: PlusNativeObjBitmapSaveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClip(value: PlusNativeObjRect): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setFormat(value: jpg | png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
