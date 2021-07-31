package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 标题栏控件的进度条样式
  * 显示在标题栏控件底部。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewProgressStyles extends StObject {
  
  /**
    * 进度条颜色
    * 可取值： "#RRGGBB"格式字符串，如"#FF0000"表示绘制红色分割线；
    *     "rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    *     默认值为"#00FF00"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * 进度条高度
    * 可取值：像素值（逻辑像素），支持小数点，如"1px"表示1像素高；百分比，如"1%"，相对于标题栏控件的高度。
    *     默认值为"2px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var height: js.UndefOr[String] = js.undefined
}
object PlusWebviewWebviewProgressStyles {
  
  @scala.inline
  def apply(): PlusWebviewWebviewProgressStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewProgressStyles]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewProgressStylesMutableBuilder[Self <: PlusWebviewWebviewProgressStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
  }
}
