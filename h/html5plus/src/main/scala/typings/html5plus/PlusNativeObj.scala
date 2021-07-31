package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * nativeObj管理系统原生对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObj extends StObject {
  
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
    *     输入文本内容在指定区域水平居左，垂直居中显示。
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
  def apply(): PlusNativeObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObj]
  }
  
  @scala.inline
  implicit class PlusNativeObjMutableBuilder[Self <: PlusNativeObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationOptions(value: PlusNativeObjAnimationOptions): Self = StObject.set(x, "AnimationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptionsUndefined: Self = StObject.set(x, "AnimationOptions", js.undefined)
    
    @scala.inline
    def setAnimationViewStyles(value: PlusNativeObjAnimationViewStyles): Self = StObject.set(x, "AnimationViewStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationViewStylesUndefined: Self = StObject.set(x, "AnimationViewStyles", js.undefined)
    
    @scala.inline
    def setBitmap(value: PlusNativeObjBitmap): Self = StObject.set(x, "Bitmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitmapSaveOptions(value: PlusNativeObjBitmapSaveOptions): Self = StObject.set(x, "BitmapSaveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitmapSaveOptionsUndefined: Self = StObject.set(x, "BitmapSaveOptions", js.undefined)
    
    @scala.inline
    def setBitmapUndefined: Self = StObject.set(x, "Bitmap", js.undefined)
    
    @scala.inline
    def setImageSlider(value: PlusNativeObjImageSlider): Self = StObject.set(x, "ImageSlider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSliderImageStyles(value: PlusNativeObjImageSliderImageStyles): Self = StObject.set(x, "ImageSliderImageStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSliderImageStylesUndefined: Self = StObject.set(x, "ImageSliderImageStyles", js.undefined)
    
    @scala.inline
    def setImageSliderStyles(value: PlusNativeObjImageSliderStyles): Self = StObject.set(x, "ImageSliderStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSliderStylesUndefined: Self = StObject.set(x, "ImageSliderStyles", js.undefined)
    
    @scala.inline
    def setImageSliderUndefined: Self = StObject.set(x, "ImageSlider", js.undefined)
    
    @scala.inline
    def setInputStyles(value: PlusNativeObjInputStyles): Self = StObject.set(x, "InputStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStylesUndefined: Self = StObject.set(x, "InputStyles", js.undefined)
    
    @scala.inline
    def setPosition(value: PlusNativeObjPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "Position", js.undefined)
    
    @scala.inline
    def setRect(value: PlusNativeObjRect): Self = StObject.set(x, "Rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectStyles(value: PlusNativeObjRectStyles): Self = StObject.set(x, "RectStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectStylesUndefined: Self = StObject.set(x, "RectStyles", js.undefined)
    
    @scala.inline
    def setRectUndefined: Self = StObject.set(x, "Rect", js.undefined)
    
    @scala.inline
    def setRichTextStyles(value: PlusNativeObjRichTextStyles): Self = StObject.set(x, "RichTextStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichTextStylesUndefined: Self = StObject.set(x, "RichTextStyles", js.undefined)
    
    @scala.inline
    def setTextStyles(value: PlusNativeObjTextStyles): Self = StObject.set(x, "TextStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStylesUndefined: Self = StObject.set(x, "TextStyles", js.undefined)
    
    @scala.inline
    def setView(value: PlusNativeObjView): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewAnimationOptions(value: PlusNativeObjViewAnimationOptions): Self = StObject.set(x, "ViewAnimationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewAnimationOptionsUndefined: Self = StObject.set(x, "ViewAnimationOptions", js.undefined)
    
    @scala.inline
    def setViewDrawTagStyles(value: PlusNativeObjViewDrawTagStyles): Self = StObject.set(x, "ViewDrawTagStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewDrawTagStylesUndefined: Self = StObject.set(x, "ViewDrawTagStyles", js.undefined)
    
    @scala.inline
    def setViewEvents(value: PlusNativeObjViewEvents): Self = StObject.set(x, "ViewEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewEventsUndefined: Self = StObject.set(x, "ViewEvents", js.undefined)
    
    @scala.inline
    def setViewStatusbarStyles(value: PlusNativeObjViewStatusbarStyles): Self = StObject.set(x, "ViewStatusbarStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewStatusbarStylesUndefined: Self = StObject.set(x, "ViewStatusbarStyles", js.undefined)
    
    @scala.inline
    def setViewStyles(value: PlusNativeObjViewStyles): Self = StObject.set(x, "ViewStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewStylesUndefined: Self = StObject.set(x, "ViewStyles", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "View", js.undefined)
  }
}
