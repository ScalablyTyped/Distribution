package typings.html5plus

import typings.html5plus.html5plusStrings._docSlash
import typings.html5plus.html5plusStrings._documentsSlash
import typings.html5plus.html5plusStrings._downloadsSlash
import typings.html5plus.html5plusStrings._wwwSlash
import typings.html5plus.html5plusStrings.`180`
import typings.html5plus.html5plusStrings.`270`
import typings.html5plus.html5plusStrings.`90`
import typings.html5plus.html5plusStrings.jpg
import typings.html5plus.html5plusStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，配置图片压缩转换的参数
  * 设置width/height属性则表示需对图片进行缩放转换操作；
  *     设置rotate属性则表示需对图片进行旋转转换操作；
  *     设置clip属性则表示需对图片进行裁剪转换操作；
  *     如同时设置了多个转换操作，则按缩放、旋转、裁剪顺序进行操作。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
  */
trait PlusZipCompressImageOptions extends StObject {
  
  /**
    * 裁剪图片的区域
    * 值参考ClipImageOptions定义，若设置clip属性值不合法，则不对图片进行裁剪操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var clip: js.UndefOr[PlusZipClipImageOptions] = js.undefined
  
  /**
    * 压缩转换目标图片的路径
    * 支持以下图片路径：
    *     绝对路径 - 系统绝对路径，如Android平台"/storage/sdcard0/Android/data/io.dcloud.HBuilder/.HBuilder/apps/HBuilder/doc/ａ.jpg"，iOS平台"/var/mobile/Containers/Data/Application/757966CF-345C-4348-B07F-EEF83CF9A369/Library/Pandora/apps/HBuilder/doc/a.png"；
    *     相对路径URL(RelativeURL) - 以"_"开头的相对路径，如"_doc/b.jpg"、"_documents/c.jpg"、"_downloads/d.jpg"，注意不支持"_www"开头的路径；
    *     本地路径URL - 以“file://”开头，后面跟随系统绝对路径。
    *     注意：如果设置的路径无权限访问，则返回失败。
    * - _doc/: 应用私有文档目录
    * - _documents/: 共享文档目录
    * - _downloads/: 共享下载目录
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var dst: js.UndefOr[_docSlash | _documentsSlash | _downloadsSlash] = js.undefined
  
  /**
    * 压缩转换后的图片格式
    * 支持"jpg"、"png",如果未指定则使用源图片的格式。
    * - jpg: JPG格式图片
    * - png: PNG格式图片
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var format: js.UndefOr[jpg | png] = js.undefined
  
  /**
    * 缩放图片的高度
    * 支持像素值（如"100px"）、百分比（如"50%"）、自动计算（如"auto"，即根据width与源图宽的缩放比例计算，若未设置width则使用源图高度）；
    *     默认值为"auto"。
    *     注意：若设置了height属性值不合法（如"0px"），则不对图片进行缩放操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * 覆盖生成新文件
    * 仅在dst制定的路径文件存在时有效：
    *     true表示覆盖存在的文件；
    *     false表示不覆盖，如果文件存在，则返回失败。
    *     默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 压缩图片的质量
    * 取值范围为1-100，1表示使用最低的图片质量（转换后的图片文件最小）、100表示使用最高的图片质量（转换后的图片文件最大）；
    *     默认值为50。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * 旋转图片的角度
    * 支持值：90-表示旋转90度；180-表示旋转180度；270-表示旋转270度。
    *     注意：若设置rotate属性值不合法，则不对图片进行旋转操作。
    * - 90: 旋转90度
    * - 180: 旋转180度
    * - 270: 旋转270度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var rotate: js.UndefOr[`90` | `180` | `270`] = js.undefined
  
  /**
    * 压缩转换原始图片的路径
    * 支持以下图片路径：
    *     相对路径 - 相对于当前页面的host位置，如"a.jpg"，注意当前页面为网络地址则不支持；
    *     绝对路径 - 系统绝对路径，如Android平台"/storage/sdcard0/Android/data/io.dcloud.HBuilder/.HBuilder/apps/HBuilder/www/ａ.jpg"，iOS平台"/var/mobile/Containers/Data/Application/757966CF-345C-4348-B07F-EEF83CF9A369/Library/Pandora/apps/HBuilder/www/a.png"；
    *     相对路径URL(RelativeURL) - 以"_"开头的相对路径，如"_www/a.jpg"、"_doc/b.jpg"、"_documents/c.jpg"、"_downloads/d.jpg"；
    *     本地路径URL - 以“file://”开头，后面跟随系统绝对路径。
    * - _www/: 应用资源目录
    * - _doc/: 应用私有文档目录
    * - _documents/: 共享文档目录
    * - _downloads/: 共享下载目录
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var src: js.UndefOr[_wwwSlash | _docSlash | _documentsSlash | _downloadsSlash] = js.undefined
  
  /**
    * 缩放图片的宽度
    * 支持像素值（如"100px"）、百分比（如"50%"）、自动计算（如"auto"，即根据height与源图高的缩放比例计算，若未设置height则使用源图高度）；
    *     默认值为"auto"。
    *     注意：若设置了width属性值不合法（如"0px"），则不对图片进行缩放操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var width: js.UndefOr[String] = js.undefined
}
object PlusZipCompressImageOptions {
  
  inline def apply(): PlusZipCompressImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusZipCompressImageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusZipCompressImageOptions] (val x: Self) extends AnyVal {
    
    inline def setClip(value: PlusZipClipImageOptions): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setDst(value: _docSlash | _documentsSlash | _downloadsSlash): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
    
    inline def setDstUndefined: Self = StObject.set(x, "dst", js.undefined)
    
    inline def setFormat(value: jpg | png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setRotate(value: `90` | `180` | `270`): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setSrc(value: _wwwSlash | _docSlash | _documentsSlash | _downloadsSlash): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
