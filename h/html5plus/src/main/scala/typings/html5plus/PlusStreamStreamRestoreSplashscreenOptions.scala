package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 流应用恢复运行时启动界面配置参数
  * 设置流应用恢复运行时启动界面，如是否自动关闭、延时关闭时间、超时时间等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
  */
@js.native
trait PlusStreamStreamRestoreSplashscreenOptions extends js.Object {
  
  /**
    * 是否自动关闭启动界面
    * true表示应用启动后自动关闭启动界面，false表示应用启动后不自动关闭启动界面，需要在应用调用plus.navigator.closeSplashscreen()方法关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var autoclose: js.UndefOr[Boolean] = js.native
  
  /**
    * 启动界面超时时间
    * 单位为毫秒（ms），当启动界面超过此时间仍然未关闭时（不管autoclose值设置true还是false），应用将自动关闭启动界面。
    *     默认值为6000（即6秒）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var timeout: js.UndefOr[Double] = js.native
}
object PlusStreamStreamRestoreSplashscreenOptions {
  
  @scala.inline
  def apply(): PlusStreamStreamRestoreSplashscreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusStreamStreamRestoreSplashscreenOptions]
  }
  
  @scala.inline
  implicit class PlusStreamStreamRestoreSplashscreenOptionsOps[Self <: PlusStreamStreamRestoreSplashscreenOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoclose(value: Boolean): Self = this.set("autoclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoclose: Self = this.set("autoclose", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
