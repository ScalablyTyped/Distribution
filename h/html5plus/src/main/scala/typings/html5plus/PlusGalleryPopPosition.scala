package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，弹出拍照或摄像界面指示位置
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
  */
@js.native
trait PlusGalleryPopPosition extends js.Object {
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
  implicit class PlusGalleryPopPositionOps[Self <: PlusGalleryPopPosition] (val x: Self) extends AnyVal {
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

