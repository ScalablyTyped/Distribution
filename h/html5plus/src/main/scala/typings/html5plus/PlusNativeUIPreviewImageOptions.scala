package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，图片预览的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
@js.native
trait PlusNativeUIPreviewImageOptions extends StObject {
  
  /**
    * 图片预览的背景颜色
    * 颜色值格式为"#RRGGBB"，如"#FF0000"表示为红色背景。
    *     默认值为黑色（"#000000"）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var background: js.UndefOr[String] = js.native
  
  /**
    * 默认显示图片的索引值
    * 索引值从0开始，默认值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var current: js.UndefOr[Double] = js.native
  
  /**
    * 图片指示器样式
    * 可取值：
    *         "default" - 默认指示器（底部圆点样式）；
    *         "number" - 顶部数字指示器（顶部居中显示，文字为%当前图片索引值（从1开始）%/%图片总数%）；
    *         "none" - 不显示指示器。
    *     默认值为"default"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var indicator: js.UndefOr[String] = js.native
  
  /**
    * 是否可循环预览
    * 可取值：
    *         "true" - 支持循环预览；
    *         "false" - 不支持循环预览。
    *     默认值为"false"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var loop: js.UndefOr[Boolean] = js.native
}
object PlusNativeUIPreviewImageOptions {
  
  @scala.inline
  def apply(): PlusNativeUIPreviewImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeUIPreviewImageOptions]
  }
  
  @scala.inline
  implicit class PlusNativeUIPreviewImageOptionsMutableBuilder[Self <: PlusNativeUIPreviewImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setIndicator(value: String): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
  }
}
