package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nativeObj管理系统原生对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObj extends js.Object {
  /**
    * 原生动画参数
    * 指定动画的类型、持续时间等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var AnimationOptions: js.UndefOr[PlusNativeObjAnimationOptions] = js.native
  /**
    * 原生动画窗口样式
    * 指定动画窗口的样式，如背景图片，绘制的文字等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var AnimationViewStyles: js.UndefOr[PlusNativeObjAnimationViewStyles] = js.native
  /**
    * 原生图片对象
    * 原生图片对象会占用较大的内存资源，在使用时需谨慎管理，当图片不再使用时应该及时调用clear方法进行销毁。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var Bitmap: js.UndefOr[PlusNativeObjBitmap] = js.native
  /**
    * JSON对象，保存图片的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var BitmapSaveOptions: js.UndefOr[PlusNativeObjBitmapSaveOptions] = js.native
  /**
    * 原生图片轮播控件对象
    * 原生图片轮播控件对象从原生View控件（plus.nativeObj.View）继承而来，用于绘制图片轮播内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ImageSlider: js.UndefOr[PlusNativeObjImageSlider] = js.native
  /**
    * 图片轮播控件中图片项配置参数
    * 用于指定图片地址等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ImageSliderImageStyles: js.UndefOr[PlusNativeObjImageSliderImageStyles] = js.native
  /**
    * 图片轮播控件样式
    * 从ViewStyles继承而来，扩展支持轮播图片等配置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ImageSliderStyles: js.UndefOr[PlusNativeObjImageSliderStyles] = js.native
  /**
    * 输入框样式
    * 用于定义输入框的显示样式，如字体大小，提示内容等信息。
    *     输入文本内容在指定区域水平居左，垂直居中显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var InputStyles: js.UndefOr[PlusNativeObjInputStyles] = js.native
  /**
    * 区域信息对象
    * 包括位置、大小等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var Position: js.UndefOr[PlusNativeObjPosition] = js.native
  /**
    * 区域信息对象
    * 包括位置、大小等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var Rect: js.UndefOr[PlusNativeObjRect] = js.native
  /**
    * 绘制区域样式对象
    * 用于定义矩形区域的显示样式，如空心/实心样式、圆角等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var RectStyles: js.UndefOr[PlusNativeObjRectStyles] = js.native
  /**
    * 富文本样式
    * 用于定义富文本使用的默认使用的字体名称、字体文件路径等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var RichTextStyles: js.UndefOr[PlusNativeObjRichTextStyles] = js.native
  /**
    * 绘制文本样式对象
    * 用于定义文本的显示样式，如字体大小、字体颜色、字体粗细、字体样式、字体名称等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var TextStyles: js.UndefOr[PlusNativeObjTextStyles] = js.native
  /**
    * 原生控件对象
    * 原生控件对象可用于在屏幕上绘制图片或文本内容，当控件不再使用时需要调用close方法销毁控件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var View: js.UndefOr[PlusNativeObjView] = js.native
  /**
    * View控件动画参数
    * 指定动画的类型、持续时间等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewAnimationOptions: js.UndefOr[PlusNativeObjViewAnimationOptions] = js.native
  /**
    * View控件绘制元素参数
    * 指定绘制图片、矩形区域、文本内容等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewDrawTagStyles: js.UndefOr[PlusNativeObjViewDrawTagStyles] = js.native
  /**
    * View控件事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewEvents: js.UndefOr[PlusNativeObjViewEvents] = js.native
  /**
    * JSON对象，View控件的系统状态栏区域样式
    * 仅在应用设置为沉浸式状态栏样式下有效，非沉浸式状态栏样式下忽略此属性。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewStatusbarStyles: js.UndefOr[PlusNativeObjViewStatusbarStyles] = js.native
  /**
    * View控件样式
    * 包括位置、大小等信息等，其中位置信息相对于父容器控件进行计算。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewStyles: js.UndefOr[PlusNativeObjViewStyles] = js.native
}

object PlusNativeObj {
  @scala.inline
  def apply(): PlusNativeObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObj]
  }
  @scala.inline
  implicit class PlusNativeObjOps[Self <: PlusNativeObj] (val x: Self) extends AnyVal {
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
    def setAnimationOptions(value: PlusNativeObjAnimationOptions): Self = this.set("AnimationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOptions: Self = this.set("AnimationOptions", js.undefined)
    @scala.inline
    def setAnimationViewStyles(value: PlusNativeObjAnimationViewStyles): Self = this.set("AnimationViewStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationViewStyles: Self = this.set("AnimationViewStyles", js.undefined)
    @scala.inline
    def setBitmap(value: PlusNativeObjBitmap): Self = this.set("Bitmap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitmap: Self = this.set("Bitmap", js.undefined)
    @scala.inline
    def setBitmapSaveOptions(value: PlusNativeObjBitmapSaveOptions): Self = this.set("BitmapSaveOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitmapSaveOptions: Self = this.set("BitmapSaveOptions", js.undefined)
    @scala.inline
    def setImageSlider(value: PlusNativeObjImageSlider): Self = this.set("ImageSlider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSlider: Self = this.set("ImageSlider", js.undefined)
    @scala.inline
    def setImageSliderImageStyles(value: PlusNativeObjImageSliderImageStyles): Self = this.set("ImageSliderImageStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSliderImageStyles: Self = this.set("ImageSliderImageStyles", js.undefined)
    @scala.inline
    def setImageSliderStyles(value: PlusNativeObjImageSliderStyles): Self = this.set("ImageSliderStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSliderStyles: Self = this.set("ImageSliderStyles", js.undefined)
    @scala.inline
    def setInputStyles(value: PlusNativeObjInputStyles): Self = this.set("InputStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyles: Self = this.set("InputStyles", js.undefined)
    @scala.inline
    def setPosition(value: PlusNativeObjPosition): Self = this.set("Position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("Position", js.undefined)
    @scala.inline
    def setRect(value: PlusNativeObjRect): Self = this.set("Rect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRect: Self = this.set("Rect", js.undefined)
    @scala.inline
    def setRectStyles(value: PlusNativeObjRectStyles): Self = this.set("RectStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRectStyles: Self = this.set("RectStyles", js.undefined)
    @scala.inline
    def setRichTextStyles(value: PlusNativeObjRichTextStyles): Self = this.set("RichTextStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRichTextStyles: Self = this.set("RichTextStyles", js.undefined)
    @scala.inline
    def setTextStyles(value: PlusNativeObjTextStyles): Self = this.set("TextStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyles: Self = this.set("TextStyles", js.undefined)
    @scala.inline
    def setView(value: PlusNativeObjView): Self = this.set("View", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("View", js.undefined)
    @scala.inline
    def setViewAnimationOptions(value: PlusNativeObjViewAnimationOptions): Self = this.set("ViewAnimationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewAnimationOptions: Self = this.set("ViewAnimationOptions", js.undefined)
    @scala.inline
    def setViewDrawTagStyles(value: PlusNativeObjViewDrawTagStyles): Self = this.set("ViewDrawTagStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewDrawTagStyles: Self = this.set("ViewDrawTagStyles", js.undefined)
    @scala.inline
    def setViewEvents(value: PlusNativeObjViewEvents): Self = this.set("ViewEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewEvents: Self = this.set("ViewEvents", js.undefined)
    @scala.inline
    def setViewStatusbarStyles(value: PlusNativeObjViewStatusbarStyles): Self = this.set("ViewStatusbarStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewStatusbarStyles: Self = this.set("ViewStatusbarStyles", js.undefined)
    @scala.inline
    def setViewStyles(value: PlusNativeObjViewStyles): Self = this.set("ViewStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewStyles: Self = this.set("ViewStyles", js.undefined)
  }
  
}

