package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，打开文件参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
  */
trait PlusRuntimeOpenFileOptions extends StObject {
  
  /**
    * 优先使用的程序包名
    * 如果指定包名的程序已经安装，则调用其打开文件，若程序不支持打开文件则触发错误回调。
    *     如果指定包名的程序未安装，则弹出系统支持打开此文件的列表，由用户选择程序打开。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var pname: js.UndefOr[String] = js.undefined
  
  /**
    * 弹出系统选择程序界面指示区域
    * JSON对象，格式如{top:10;left:10;width:200;height:200;}，所有值为像素值，左上坐标相对于容器webview的位置。仅在iPad设备平台有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var popover: js.UndefOr[Any] = js.undefined
}
object PlusRuntimeOpenFileOptions {
  
  inline def apply(): PlusRuntimeOpenFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusRuntimeOpenFileOptions]
  }
  
  extension [Self <: PlusRuntimeOpenFileOptions](x: Self) {
    
    inline def setPname(value: String): Self = StObject.set(x, "pname", value.asInstanceOf[js.Any])
    
    inline def setPnameUndefined: Self = StObject.set(x, "pname", js.undefined)
    
    inline def setPopover(value: Any): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    inline def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
  }
}
