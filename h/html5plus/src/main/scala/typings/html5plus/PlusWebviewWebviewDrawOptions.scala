package typings.html5plus

import typings.html5plus.html5plusStrings.ARGB
import typings.html5plus.html5plusStrings.RGB565
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 截屏绘制操作参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewDrawOptions extends js.Object {
  /**
    * 截屏图片的位深
    * 可取值：
    * 		"RGB565" - RGB565彩色模式,一个像素占两个字节；
    * 		"ARGB" - ARGB彩色模式,保存透明度信息。
    * - RGB565: 
    * 	RGB565彩色模式,一个像素占两个字节。
    * 								
    * - ARGB: 
    * 	ARGB彩色模式,保存透明度信息。
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var bit: js.UndefOr[RGB565 | ARGB] = js.undefined
  /**
    * 是否检测截屏图片是否为空白
    * 可取值：
    * 		true - 表示检测到截屏到空白图片时认为操作失败（触发错误回调函数）；
    * 		false - 表示不检测，即使为空白图片仍然返回成功。
    * 	默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var check: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否检测当前是否弹出软键盘
    * 可取值：
    * 		true - 表示检测到弹出软键盘是认为截屏操作失败（触发错误回调函数）；
    * 		false - 表示不检测软键盘状态，直接截屏。
    * 	默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var checkKeyboard: js.UndefOr[Boolean] = js.undefined
  /**
    * 设置截屏区域
    * 相对于Webview窗口的区域信息，默认值为{top:'0px',left:'0px',width:'100%',height:'100%'}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var clip: js.UndefOr[PlusNativeObj] = js.undefined
}

object PlusWebviewWebviewDrawOptions {
  @scala.inline
  def apply(
    bit: RGB565 | ARGB = null,
    check: js.UndefOr[Boolean] = js.undefined,
    checkKeyboard: js.UndefOr[Boolean] = js.undefined,
    clip: PlusNativeObj = null
  ): PlusWebviewWebviewDrawOptions = {
    val __obj = js.Dynamic.literal()
    if (bit != null) __obj.updateDynamic("bit")(bit.asInstanceOf[js.Any])
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check)
    if (!js.isUndefined(checkKeyboard)) __obj.updateDynamic("checkKeyboard")(checkKeyboard)
    if (clip != null) __obj.updateDynamic("clip")(clip)
    __obj.asInstanceOf[PlusWebviewWebviewDrawOptions]
  }
}

