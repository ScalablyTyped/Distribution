package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 系统等待对话框对象
  * 从NativeUIObj对象继承而来，通过plus.nativeUI.showWaiting方法创建时返回。
  * 	用于控制系统样式等待对话框的操作，如关闭、设置标题内容等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
@js.native
trait PlusNativeUIWaitingObj extends js.Object {
  /**
    * 等待对话框关闭事件
    * 等待框关闭时触发，当调用close方法或用户点击返回按钮导致等待框关闭时触发。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var onclose: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /**
    * 关闭显示的系统等待对话框
    * 调用plus.nativeUI.showWaiting方法创建并显示系统等待界后，可通过其close方法将原生等待控件关闭。
    * 	一个系统等待对话框只能关闭一次，多次调用将无任何作用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def close(): scala.Unit = js.native
  /**
    * 设置等待对话框上显示的文字内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def setTitle(): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
}

