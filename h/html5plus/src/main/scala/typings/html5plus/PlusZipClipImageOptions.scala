package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，图片裁剪区域的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
  */
@js.native
trait PlusZipClipImageOptions extends js.Object {
  /**
    * 图片裁剪区域的高度
    * 支持像素值（如"100px"）、百分比（如"50%"）、自动计算（如"auto"，即从top位置到图片下边界的高度）；默认值为"auto"。
    *     注意：如果top值加height值超出原图片高度，则使用"auto"值进行裁剪。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var height: js.UndefOr[String] = js.native
  /**
    * 图片裁剪区域与原图片左边界的偏移距离
    * 支持像素值（如"10px"）、百分比（如"10%"）；默认值为"0px"。
    *     注意：如果left值超出原图片宽度，则图片裁剪失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var left: js.UndefOr[String] = js.native
  /**
    * 图片裁剪区域与原图片上边界的偏移距离
    * 支持像素值（如"10px"）、百分比（如"10%"）；默认值为"0px"。
    *     注意：如果top值超出原图片高度，则图片裁剪失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var top: js.UndefOr[String] = js.native
  /**
    * 图片裁剪区域的宽度
    * 支持像素值（如"100px"）、百分比（如"50%"）、自动计算（如"auto"，即从left位置到图片右边界的宽度）；默认值为"auto"。
    *     注意：如果left值加width值超出原图片宽度，则使用"auto"值进行裁剪。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var width: js.UndefOr[String] = js.native
}

object PlusZipClipImageOptions {
  @scala.inline
  def apply(): PlusZipClipImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusZipClipImageOptions]
  }
  @scala.inline
  implicit class PlusZipClipImageOptionsOps[Self <: PlusZipClipImageOptions] (val x: Self) extends AnyVal {
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

