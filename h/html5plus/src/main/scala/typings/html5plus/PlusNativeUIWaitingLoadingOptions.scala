package typings.html5plus

import typings.html5plus.html5plusStrings.`inline`
import typings.html5plus.html5plusStrings.block
import typings.html5plus.html5plusStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，原生等待对话框上loading图标自定义样式
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
trait PlusNativeUIWaitingLoadingOptions extends StObject {
  
  /**
    * loading图标显示样式
    * 可取值：
    *     "block"表示图标与文字分开两行显示，上面显示loading图标，下面显示文字；
    *     "inline"表示loading图标与文字在同一行显示，左边显示loading图标，右边显示文字；
    *     "none"表示不显示loading图标；
    * - block: 
    *     loading图标与文字分开两行显示，上面显示loading图标，下面显示文字。
    *                                 
    * - inline: 
    *     loading图标与文字在同一行显示，左边显示loading图标，右边显示文字。
    *                                 
    * - none: 
    *     不显示loading图标。
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var display: js.UndefOr[block | `inline` | none] = js.undefined
  
  /**
    * loading图标高度
    * 设置loading图标的高度（宽度等比率缩放），取值类型：像素值，如"14px"表示14像素高。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * loading图标路径
    * 自定义loading图标的路径，png格式，并且必须是本地资源地址；
    *     loading图要求宽是高的整数倍，显示等待框时按照图片的高横向截取每帧刷新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * loading图每帧刷新间隔
    * 单位为ms（毫秒），默认值为100ms。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var interval: js.UndefOr[Double] = js.undefined
}
object PlusNativeUIWaitingLoadingOptions {
  
  inline def apply(): PlusNativeUIWaitingLoadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeUIWaitingLoadingOptions]
  }
  
  extension [Self <: PlusNativeUIWaitingLoadingOptions](x: Self) {
    
    inline def setDisplay(value: block | `inline` | none): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
