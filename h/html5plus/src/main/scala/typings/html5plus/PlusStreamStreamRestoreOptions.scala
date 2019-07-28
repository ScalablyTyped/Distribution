package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，流应用恢复运行的参数
  * 设置流应用恢复运行时的参数、splash、首页等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
  */
trait PlusStreamStreamRestoreOptions extends js.Object {
  /**
    * 流应用运行参数
    * 启动流应用的扩展参数，可在流应用中通过plus.runtime.arguments获取。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var extras: js.UndefOr[js.Any] = js.undefined
  /**
    * 应用启动界面样式
    * 可取值：
    * 	"auto"：自动选择启动界面，如果流应用自动关闭时截图成功则使用截图，如果splash图片已经下载则显示splash图片，否则使用默认加载流应用界面；
    * 	"default"：使用默认加载流应用界面（如在360浏览器环境中在标题栏下显示加载进度条）。
    * 	默认值为"auto"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var splash: js.UndefOr[String] = js.undefined
  /**
    * 流应用恢复运行时启动界面配置参数
    * 用于流应用自动关闭后恢复运行时调整启动界面配置参数，如将自动关闭splash调整为手动关闭，以便恢复上次运行状态后再进入应用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var splashscreen: js.UndefOr[PlusStreamStreamRestoreSplashscreenOptions] = js.undefined
  /**
    * 流应用首页窗口对象样式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var styles: js.UndefOr[PlusStreamLaunchWebviewStyles] = js.undefined
}

object PlusStreamStreamRestoreOptions {
  @scala.inline
  def apply(
    extras: js.Any = null,
    splash: String = null,
    splashscreen: PlusStreamStreamRestoreSplashscreenOptions = null,
    styles: PlusStreamLaunchWebviewStyles = null
  ): PlusStreamStreamRestoreOptions = {
    val __obj = js.Dynamic.literal()
    if (extras != null) __obj.updateDynamic("extras")(extras)
    if (splash != null) __obj.updateDynamic("splash")(splash)
    if (splashscreen != null) __obj.updateDynamic("splashscreen")(splashscreen)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[PlusStreamStreamRestoreOptions]
  }
}

