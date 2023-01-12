package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，启动流应用的首页窗口属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
  */
trait PlusStreamLaunchWebviewStyles extends StObject {
  
  /**
    * 流应用首页是否阻塞网络图片的加载
    * true表示阻塞网络图片的加载，false表示不阻塞网络图片的加载。默认值为false。
    *     设置后可通过Webview窗口对象的setBlockNetworkImage(false)方法修改设置来继续加载网络图片。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var blockNetworkImage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 指定首页Webview的id
    * 如果未指定id，则使用应用的appid作为首页Webview的id。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * 指定流应用首页地址
    * 可使用网络地址（http://或https://开头），也可使用本地地址（相对应用资源路径）。
    *     也可使用特定地址：
    *     about:blank - 使用空白首页，仅加载内置注入的脚本（如all.js、wap2app.js、config.js等）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var launch_path: js.UndefOr[String] = js.undefined
  
  /**
    * 流应用首页是否显示
    * true表示显示，false表示不显示。默认值为true。
    *     注意：流应用首页隐藏后，需要调用首页的setVisible方法显示，如plus.webview.getLaunchWebview().setVisible(true)。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object PlusStreamLaunchWebviewStyles {
  
  inline def apply(): PlusStreamLaunchWebviewStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusStreamLaunchWebviewStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusStreamLaunchWebviewStyles] (val x: Self) extends AnyVal {
    
    inline def setBlockNetworkImage(value: Boolean): Self = StObject.set(x, "blockNetworkImage", value.asInstanceOf[js.Any])
    
    inline def setBlockNetworkImageUndefined: Self = StObject.set(x, "blockNetworkImage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLaunch_path(value: String): Self = StObject.set(x, "launch_path", value.asInstanceOf[js.Any])
    
    inline def setLaunch_pathUndefined: Self = StObject.set(x, "launch_path", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
