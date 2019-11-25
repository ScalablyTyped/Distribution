package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nativeObj管理系统原生对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObj extends js.Object {
  /**
    * 原生动画参数
    * 指定动画的类型、持续时间等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var AnimationOptions: js.UndefOr[PlusNativeObjAnimationOptions] = js.undefined
  /**
    * 原生动画窗口样式
    * 指定动画窗口的样式，如背景图片，绘制的文字等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var AnimationViewStyles: js.UndefOr[PlusNativeObjAnimationViewStyles] = js.undefined
  /**
    * 原生图片对象
    * 原生图片对象会占用较大的内存资源，在使用时需谨慎管理，当图片不再使用时应该及时调用clear方法进行销毁。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var Bitmap: js.UndefOr[PlusNativeObjBitmap] = js.undefined
  /**
    * JSON对象，保存图片的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var BitmapSaveOptions: js.UndefOr[PlusNativeObjBitmapSaveOptions] = js.undefined
  /**
    * 原生图片轮播控件对象
    * 原生图片轮播控件对象从原生View控件（plus.nativeObj.View）继承而来，用于绘制图片轮播内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ImageSlider: js.UndefOr[PlusNativeObjImageSlider] = js.undefined
  /**
    * 图片轮播控件中图片项配置参数
    * 用于指定图片地址等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ImageSliderImageStyles: js.UndefOr[PlusNativeObjImageSliderImageStyles] = js.undefined
  /**
    * 图片轮播控件样式
    * 从ViewStyles继承而来，扩展支持轮播图片等配置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ImageSliderStyles: js.UndefOr[PlusNativeObjImageSliderStyles] = js.undefined
  /**
    * 输入框样式
    * 用于定义输入框的显示样式，如字体大小，提示内容等信息。
    * 	输入文本内容在指定区域水平居左，垂直居中显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var InputStyles: js.UndefOr[PlusNativeObjInputStyles] = js.undefined
  /**
    * 区域信息对象
    * 包括位置、大小等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var Position: js.UndefOr[PlusNativeObjPosition] = js.undefined
  /**
    * 区域信息对象
    * 包括位置、大小等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var Rect: js.UndefOr[PlusNativeObjRect] = js.undefined
  /**
    * 绘制区域样式对象
    * 用于定义矩形区域的显示样式，如空心/实心样式、圆角等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var RectStyles: js.UndefOr[PlusNativeObjRectStyles] = js.undefined
  /**
    * 富文本样式
    * 用于定义富文本使用的默认使用的字体名称、字体文件路径等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var RichTextStyles: js.UndefOr[PlusNativeObjRichTextStyles] = js.undefined
  /**
    * 绘制文本样式对象
    * 用于定义文本的显示样式，如字体大小、字体颜色、字体粗细、字体样式、字体名称等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var TextStyles: js.UndefOr[PlusNativeObjTextStyles] = js.undefined
  /**
    * 原生控件对象
    * 原生控件对象可用于在屏幕上绘制图片或文本内容，当控件不再使用时需要调用close方法销毁控件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var View: js.UndefOr[PlusNativeObjView] = js.undefined
  /**
    * View控件动画参数
    * 指定动画的类型、持续时间等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewAnimationOptions: js.UndefOr[PlusNativeObjViewAnimationOptions] = js.undefined
  /**
    * View控件绘制元素参数
    * 指定绘制图片、矩形区域、文本内容等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewDrawTagStyles: js.UndefOr[PlusNativeObjViewDrawTagStyles] = js.undefined
  /**
    * View控件事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewEvents: js.UndefOr[PlusNativeObjViewEvents] = js.undefined
  /**
    * JSON对象，View控件的系统状态栏区域样式
    * 仅在应用设置为沉浸式状态栏样式下有效，非沉浸式状态栏样式下忽略此属性。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewStatusbarStyles: js.UndefOr[PlusNativeObjViewStatusbarStyles] = js.undefined
  /**
    * View控件样式
    * 包括位置、大小等信息等，其中位置信息相对于父容器控件进行计算。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var ViewStyles: js.UndefOr[PlusNativeObjViewStyles] = js.undefined
}

object PlusNativeObj {
  @scala.inline
  def apply(
    AnimationOptions: PlusNativeObjAnimationOptions = null,
    AnimationViewStyles: PlusNativeObjAnimationViewStyles = null,
    Bitmap: PlusNativeObjBitmap = null,
    BitmapSaveOptions: PlusNativeObjBitmapSaveOptions = null,
    ImageSlider: PlusNativeObjImageSlider = null,
    ImageSliderImageStyles: PlusNativeObjImageSliderImageStyles = null,
    ImageSliderStyles: PlusNativeObjImageSliderStyles = null,
    InputStyles: PlusNativeObjInputStyles = null,
    Position: PlusNativeObjPosition = null,
    Rect: PlusNativeObjRect = null,
    RectStyles: PlusNativeObjRectStyles = null,
    RichTextStyles: PlusNativeObjRichTextStyles = null,
    TextStyles: PlusNativeObjTextStyles = null,
    View: PlusNativeObjView = null,
    ViewAnimationOptions: PlusNativeObjViewAnimationOptions = null,
    ViewDrawTagStyles: PlusNativeObjViewDrawTagStyles = null,
    ViewEvents: PlusNativeObjViewEvents = null,
    ViewStatusbarStyles: PlusNativeObjViewStatusbarStyles = null,
    ViewStyles: PlusNativeObjViewStyles = null
  ): PlusNativeObj = {
    val __obj = js.Dynamic.literal()
    if (AnimationOptions != null) __obj.updateDynamic("AnimationOptions")(AnimationOptions.asInstanceOf[js.Any])
    if (AnimationViewStyles != null) __obj.updateDynamic("AnimationViewStyles")(AnimationViewStyles.asInstanceOf[js.Any])
    if (Bitmap != null) __obj.updateDynamic("Bitmap")(Bitmap.asInstanceOf[js.Any])
    if (BitmapSaveOptions != null) __obj.updateDynamic("BitmapSaveOptions")(BitmapSaveOptions.asInstanceOf[js.Any])
    if (ImageSlider != null) __obj.updateDynamic("ImageSlider")(ImageSlider.asInstanceOf[js.Any])
    if (ImageSliderImageStyles != null) __obj.updateDynamic("ImageSliderImageStyles")(ImageSliderImageStyles.asInstanceOf[js.Any])
    if (ImageSliderStyles != null) __obj.updateDynamic("ImageSliderStyles")(ImageSliderStyles.asInstanceOf[js.Any])
    if (InputStyles != null) __obj.updateDynamic("InputStyles")(InputStyles.asInstanceOf[js.Any])
    if (Position != null) __obj.updateDynamic("Position")(Position.asInstanceOf[js.Any])
    if (Rect != null) __obj.updateDynamic("Rect")(Rect.asInstanceOf[js.Any])
    if (RectStyles != null) __obj.updateDynamic("RectStyles")(RectStyles.asInstanceOf[js.Any])
    if (RichTextStyles != null) __obj.updateDynamic("RichTextStyles")(RichTextStyles.asInstanceOf[js.Any])
    if (TextStyles != null) __obj.updateDynamic("TextStyles")(TextStyles.asInstanceOf[js.Any])
    if (View != null) __obj.updateDynamic("View")(View.asInstanceOf[js.Any])
    if (ViewAnimationOptions != null) __obj.updateDynamic("ViewAnimationOptions")(ViewAnimationOptions.asInstanceOf[js.Any])
    if (ViewDrawTagStyles != null) __obj.updateDynamic("ViewDrawTagStyles")(ViewDrawTagStyles.asInstanceOf[js.Any])
    if (ViewEvents != null) __obj.updateDynamic("ViewEvents")(ViewEvents.asInstanceOf[js.Any])
    if (ViewStatusbarStyles != null) __obj.updateDynamic("ViewStatusbarStyles")(ViewStatusbarStyles.asInstanceOf[js.Any])
    if (ViewStyles != null) __obj.updateDynamic("ViewStyles")(ViewStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusNativeObj]
  }
}

