package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，图片裁剪区域的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
  */
trait PlusZipClipImageOptions extends js.Object {
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
  @scala.inline
  def apply(height: String = null, left: String = null, top: String = null, width: String = null): PlusZipClipImageOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusZipClipImageOptions]
  }
}

