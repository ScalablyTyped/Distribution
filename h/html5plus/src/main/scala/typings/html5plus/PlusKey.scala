package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Key管理设备按键事件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
  */
@js.native
trait PlusKey extends js.Object {
  /**
    * 按键事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var KeyEvent: js.UndefOr[PlusKeyKeyEvent] = js.native
  /**
    * 按键类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var KeyType: js.UndefOr[PlusKeyKeyType] = js.native
  /**
    * 添加按键事件监听器
    * 添加按键事件监听器，当指定的按键事件发生时，回调函数将触发。
    *     应用中存在多个Webview窗口时，按照窗口的显示栈顺序从后往前查找，查找到添加按键事件监听器的窗口后停止（中断前面Webview窗口对按键事件的监听），并向窗口触发执行按键回调事件。
    *     在同一Webview窗口中可多次调用此方法对同一事件添加多个监听器，触发时按照添加的顺序先后调用。
    *     注意：此方法无法监听软键盘的按键事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  def addEventListener(): Unit = js.native
  def addEventListener(event: PlusKeyKeyType): Unit = js.native
  def addEventListener(event: PlusKeyKeyType, listener: js.Function1[/* result */ PlusKeyKeyEvent, Unit]): Unit = js.native
  def addEventListener(
    event: PlusKeyKeyType,
    listener: js.Function1[/* result */ PlusKeyKeyEvent, Unit],
    capture: Boolean
  ): Unit = js.native
  /**
    * 隐藏软键盘
    * 隐藏已经显示的软键盘，如果软键盘没有显示则不做任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  def hideSoftKeybord(): Unit = js.native
  /**
    * 移除按键事件监听器
    * 从窗口移除指定的事件监听器。若没有查找到对应的事件监听器，则无任何作用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  def removeEventListener(): Unit = js.native
  def removeEventListener(event: PlusKeyKeyType): Unit = js.native
  def removeEventListener(event: PlusKeyKeyType, listener: js.Function1[/* result */ PlusKeyKeyEvent, Unit]): Unit = js.native
  /**
    * 设置辅助输入类型
    * input的type类型为text获取焦点时，在软键盘上方显示辅助输入条方便用户快速输入。
    *     在页面中input编辑框type类型不为"tel"、"email"时生效（type为tel类型时一定显示tel的辅助输入条，type为email时一定显示email的辅助输入条）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  def setAssistantType(): Unit = js.native
  def setAssistantType(`type`: String): Unit = js.native
  /**
    * 显示软键盘
    * 强制显示系统软键盘，如果软键盘已经显示则不做任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  def showSoftKeybord(): Unit = js.native
}

