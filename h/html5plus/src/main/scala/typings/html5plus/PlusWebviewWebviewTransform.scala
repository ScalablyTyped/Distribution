package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 一组用于定义页面或控件变形的属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewTransform extends StObject {
  
  /**
    * 暂不支持
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var matrix: js.UndefOr[String] = js.undefined
  
  /**
    * 暂不支持
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var rotate: js.UndefOr[String] = js.undefined
  
  /**
    * 暂不支持
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var scale: js.UndefOr[String] = js.undefined
  
  /**
    * 暂不支持
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var skew: js.UndefOr[String] = js.undefined
  
  /**
    * 暂不支持
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var translate: js.UndefOr[String] = js.undefined
}
object PlusWebviewWebviewTransform {
  
  inline def apply(): PlusWebviewWebviewTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewTransform]
  }
  
  extension [Self <: PlusWebviewWebviewTransform](x: Self) {
    
    inline def setMatrix(value: String): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSkew(value: String): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
    
    inline def setSkewUndefined: Self = StObject.set(x, "skew", js.undefined)
    
    inline def setTranslate(value: String): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
  }
}
