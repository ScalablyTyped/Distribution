package typings.html5plus

import typings.html5plus.html5plusStrings.ARGB
import typings.html5plus.html5plusStrings.RGB565
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 截屏绘制操作参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewDrawOptions extends js.Object {
  
  /**
    * 截屏图片的位深
    * 可取值：
    *         "RGB565" - RGB565彩色模式,一个像素占两个字节；
    *         "ARGB" - ARGB彩色模式,保存透明度信息。
    * - RGB565: 
    *     RGB565彩色模式,一个像素占两个字节。
    *                                 
    * - ARGB: 
    *     ARGB彩色模式,保存透明度信息。
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var bit: js.UndefOr[RGB565 | ARGB] = js.native
  
  /**
    * 是否检测截屏图片是否为空白
    * 可取值：
    *         true - 表示检测到截屏到空白图片时认为操作失败（触发错误回调函数）；
    *         false - 表示不检测，即使为空白图片仍然返回成功。
    *     默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var check: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否检测当前是否弹出软键盘
    * 可取值：
    *         true - 表示检测到弹出软键盘是认为截屏操作失败（触发错误回调函数）；
    *         false - 表示不检测软键盘状态，直接截屏。
    *     默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var checkKeyboard: js.UndefOr[Boolean] = js.native
  
  /**
    * 设置截屏区域
    * 相对于Webview窗口的区域信息，默认值为{top:'0px',left:'0px',width:'100%',height:'100%'}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var clip: js.UndefOr[PlusNativeObj] = js.native
}
object PlusWebviewWebviewDrawOptions {
  
  @scala.inline
  def apply(): PlusWebviewWebviewDrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewDrawOptions]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewDrawOptionsOps[Self <: PlusWebviewWebviewDrawOptions] (val x: Self) extends AnyVal {
    
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
    def setBit(value: RGB565 | ARGB): Self = this.set("bit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBit: Self = this.set("bit", js.undefined)
    
    @scala.inline
    def setCheck(value: Boolean): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setCheckKeyboard(value: Boolean): Self = this.set("checkKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckKeyboard: Self = this.set("checkKeyboard", js.undefined)
    
    @scala.inline
    def setClip(value: PlusNativeObj): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
  }
}
