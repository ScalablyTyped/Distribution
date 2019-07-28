package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，启动流应用的首页窗口属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
  */
trait PlusStreamLaunchWebviewStyles extends js.Object {
  /**
    * 流应用首页是否阻塞网络图片的加载
    * true表示阻塞网络图片的加载，false表示不阻塞网络图片的加载。默认值为false。
    * 	设置后可通过Webview窗口对象的setBlockNetworkImage(false)方法修改设置来继续加载网络图片。
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
    * 	也可使用特定地址：
    * 	about:blank - 使用空白首页，仅加载内置注入的脚本（如all.js、wap2app.js、config.js等）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var launch_path: js.UndefOr[String] = js.undefined
  /**
    * 流应用首页是否显示
    * true表示显示，false表示不显示。默认值为true。
    * 	注意：流应用首页隐藏后，需要调用首页的setVisible方法显示，如plus.webview.getLaunchWebview().setVisible(true)。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PlusStreamLaunchWebviewStyles {
  @scala.inline
  def apply(
    blockNetworkImage: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    launch_path: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PlusStreamLaunchWebviewStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockNetworkImage)) __obj.updateDynamic("blockNetworkImage")(blockNetworkImage)
    if (id != null) __obj.updateDynamic("id")(id)
    if (launch_path != null) __obj.updateDynamic("launch_path")(launch_path)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PlusStreamLaunchWebviewStyles]
  }
}

