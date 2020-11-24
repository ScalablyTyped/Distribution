package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，流应用恢复运行的参数
  * 设置流应用恢复运行时的参数、splash、首页等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
  */
@js.native
trait PlusStreamStreamRestoreOptions extends js.Object {
  
  /**
    * 流应用运行参数
    * 启动流应用的扩展参数，可在流应用中通过plus.runtime.arguments获取。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var extras: js.UndefOr[js.Any] = js.native
  
  /**
    * 应用启动界面样式
    * 可取值：
    *     "auto"：自动选择启动界面，如果流应用自动关闭时截图成功则使用截图，如果splash图片已经下载则显示splash图片，否则使用默认加载流应用界面；
    *     "default"：使用默认加载流应用界面（如在360浏览器环境中在标题栏下显示加载进度条）。
    *     默认值为"auto"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var splash: js.UndefOr[String] = js.native
  
  /**
    * 流应用恢复运行时启动界面配置参数
    * 用于流应用自动关闭后恢复运行时调整启动界面配置参数，如将自动关闭splash调整为手动关闭，以便恢复上次运行状态后再进入应用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var splashscreen: js.UndefOr[PlusStreamStreamRestoreSplashscreenOptions] = js.native
  
  /**
    * 流应用首页窗口对象样式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var styles: js.UndefOr[PlusStreamLaunchWebviewStyles] = js.native
}
object PlusStreamStreamRestoreOptions {
  
  @scala.inline
  def apply(): PlusStreamStreamRestoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusStreamStreamRestoreOptions]
  }
  
  @scala.inline
  implicit class PlusStreamStreamRestoreOptionsOps[Self <: PlusStreamStreamRestoreOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtras(value: js.Any): Self = this.set("extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtras: Self = this.set("extras", js.undefined)
    
    @scala.inline
    def setSplash(value: String): Self = this.set("splash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplash: Self = this.set("splash", js.undefined)
    
    @scala.inline
    def setSplashscreen(value: PlusStreamStreamRestoreSplashscreenOptions): Self = this.set("splashscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplashscreen: Self = this.set("splashscreen", js.undefined)
    
    @scala.inline
    def setStyles(value: PlusStreamLaunchWebviewStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
