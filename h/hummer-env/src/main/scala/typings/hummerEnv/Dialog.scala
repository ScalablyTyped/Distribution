package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dialog extends StObject {
  
  /**
    * 显示提示对话框（用户需要点击【确定】按钮才能继续进行操作）
    *
    * @param msg 内容
    * @param btnText 按钮内容
    * @param callback 按钮点击回调
    */
  def alert(msg: String): Unit = js.native
  def alert(msg: String, btnText: String): Unit = js.native
  def alert(msg: String, btnText: String, callback: js.Function0[Unit]): Unit = js.native
  def alert(msg: String, btnText: Unit, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * @summary 是否可以被取消（按返回键或者点击空白区域是否可以关闭对话框）默认 true
    */
  var cancelable: Boolean = js.native
  
  /**
    * 显示确认对话框（用户需要点击【确定】或【取消】按钮才能继续进行操作）
    *
    * @param title 标题
    * @param msg 内容
    * @param okBtnText [确认]按钮内容
    * @param cancelBtnText [取消]按钮内容
    * @param okCallback [确认]按钮点击回调
    * @param cancelCallback [取消]按钮点击回调
    */
  def confirm(title: String): Unit = js.native
  def confirm(title: String, msg: String): Unit = js.native
  def confirm(title: String, msg: String, okBtnText: String): Unit = js.native
  def confirm(title: String, msg: String, okBtnText: String, cancelBtnText: String): Unit = js.native
  def confirm(
    title: String,
    msg: String,
    okBtnText: String,
    cancelBtnText: String,
    okCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(
    title: String,
    msg: String,
    okBtnText: String,
    cancelBtnText: String,
    okCallback: js.Function0[Unit],
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(
    title: String,
    msg: String,
    okBtnText: String,
    cancelBtnText: String,
    okCallback: Unit,
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(title: String, msg: String, okBtnText: String, cancelBtnText: Unit, okCallback: js.Function0[Unit]): Unit = js.native
  def confirm(
    title: String,
    msg: String,
    okBtnText: String,
    cancelBtnText: Unit,
    okCallback: js.Function0[Unit],
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(
    title: String,
    msg: String,
    okBtnText: String,
    cancelBtnText: Unit,
    okCallback: Unit,
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(title: String, msg: String, okBtnText: Unit, cancelBtnText: String): Unit = js.native
  def confirm(title: String, msg: String, okBtnText: Unit, cancelBtnText: String, okCallback: js.Function0[Unit]): Unit = js.native
  def confirm(
    title: String,
    msg: String,
    okBtnText: Unit,
    cancelBtnText: String,
    okCallback: js.Function0[Unit],
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(
    title: String,
    msg: String,
    okBtnText: Unit,
    cancelBtnText: String,
    okCallback: Unit,
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(title: String, msg: String, okBtnText: Unit, cancelBtnText: Unit, okCallback: js.Function0[Unit]): Unit = js.native
  def confirm(
    title: String,
    msg: String,
    okBtnText: Unit,
    cancelBtnText: Unit,
    okCallback: js.Function0[Unit],
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(
    title: String,
    msg: String,
    okBtnText: Unit,
    cancelBtnText: Unit,
    okCallback: Unit,
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(title: String, msg: Unit, okBtnText: String): Unit = js.native
  def confirm(title: String, msg: Unit, okBtnText: String, cancelBtnText: String): Unit = js.native
  def confirm(title: String, msg: Unit, okBtnText: String, cancelBtnText: String, okCallback: js.Function0[Unit]): Unit = js.native
  def confirm(
    title: String,
    msg: Unit,
    okBtnText: String,
    cancelBtnText: String,
    okCallback: js.Function0[Unit],
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(
    title: String,
    msg: Unit,
    okBtnText: String,
    cancelBtnText: String,
    okCallback: Unit,
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(title: String, msg: Unit, okBtnText: String, cancelBtnText: Unit, okCallback: js.Function0[Unit]): Unit = js.native
  def confirm(
    title: String,
    msg: Unit,
    okBtnText: String,
    cancelBtnText: Unit,
    okCallback: js.Function0[Unit],
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(
    title: String,
    msg: Unit,
    okBtnText: String,
    cancelBtnText: Unit,
    okCallback: Unit,
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(title: String, msg: Unit, okBtnText: Unit, cancelBtnText: String): Unit = js.native
  def confirm(title: String, msg: Unit, okBtnText: Unit, cancelBtnText: String, okCallback: js.Function0[Unit]): Unit = js.native
  def confirm(
    title: String,
    msg: Unit,
    okBtnText: Unit,
    cancelBtnText: String,
    okCallback: js.Function0[Unit],
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(
    title: String,
    msg: Unit,
    okBtnText: Unit,
    cancelBtnText: String,
    okCallback: Unit,
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(title: String, msg: Unit, okBtnText: Unit, cancelBtnText: Unit, okCallback: js.Function0[Unit]): Unit = js.native
  def confirm(
    title: String,
    msg: Unit,
    okBtnText: Unit,
    cancelBtnText: Unit,
    okCallback: js.Function0[Unit],
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  def confirm(
    title: String,
    msg: Unit,
    okBtnText: Unit,
    cancelBtnText: Unit,
    okCallback: Unit,
    cancelCallback: js.Function0[Unit]
  ): Unit = js.native
  
  /**
    * 显示自定义对话框
    *
    * @param view 自定义View
    */
  def custom(view: HummerComponent): Unit = js.native
  
  /**
    * 关闭对话框
    */
  def dismiss(): Unit = js.native
  
  /**
    * 显示等待对话框（只能通过调用dismiss方法关闭对话框）
    * @param msg message to display, can only be closed by dismiss method
    */
  def loading(msg: String): Unit = js.native
  
  /**
    * @summary 对话框显示层级是否是低层级（比系统对话框层级低）默认 false
    */
  var lowLayer: Boolean = js.native
}
