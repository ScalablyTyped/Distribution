package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 原生动画窗口样式
  * 指定动画窗口的样式，如背景图片，绘制的文字等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjAnimationViewStyles extends StObject {
  
  /**
    * 动画窗口上绘制的背景图片
    * 图片可以通过Webview对象的draw方法截图，也可以通过Bitmap的API从本地文件中加载。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var bitmap: js.UndefOr[PlusNativeObjBitmap] = js.undefined
  
  /**
    * 动画窗口上绘制的文本内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * 动画窗口上绘制的文本区域
    * 默认值为{top:'0px',left:'0px',width:'100%',height:'44px'}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var textRect: js.UndefOr[PlusNativeObjRect] = js.undefined
  
  /**
    * 动画窗口上绘制的文本样式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var textStyles: js.UndefOr[PlusNativeObjTextStyles] = js.undefined
}
object PlusNativeObjAnimationViewStyles {
  
  inline def apply(): PlusNativeObjAnimationViewStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjAnimationViewStyles]
  }
  
  extension [Self <: PlusNativeObjAnimationViewStyles](x: Self) {
    
    inline def setBitmap(value: PlusNativeObjBitmap): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
    
    inline def setBitmapUndefined: Self = StObject.set(x, "bitmap", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextRect(value: PlusNativeObjRect): Self = StObject.set(x, "textRect", value.asInstanceOf[js.Any])
    
    inline def setTextRectUndefined: Self = StObject.set(x, "textRect", js.undefined)
    
    inline def setTextStyles(value: PlusNativeObjTextStyles): Self = StObject.set(x, "textStyles", value.asInstanceOf[js.Any])
    
    inline def setTextStylesUndefined: Self = StObject.set(x, "textStyles", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
