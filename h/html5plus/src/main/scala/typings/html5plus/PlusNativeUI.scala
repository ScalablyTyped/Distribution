package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * nativeUI管理系统原生界面，可用于弹出系统原生提示对话框窗口、时间日期选择对话框、等待对话框等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
@js.native
trait PlusNativeUI extends StObject {
  
  /**
    * JSON对象，原生选择按钮框上按钮的样式参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var ActionButtonStyles: js.UndefOr[PlusNativeUIActionButtonStyles] = js.native
  
  /**
    * JSON对象，原生选择按钮框的样式参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var ActionSheetStyles: js.UndefOr[PlusNativeUIActionSheetStyles] = js.native
  
  /**
    * 确认对话框的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var ConfirmOptions: js.UndefOr[PlusNativeUIConfirmOptions] = js.native
  
  /**
    * 系统原生界面基类对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var NativeUIObj: js.UndefOr[PlusNativeUINativeUIObj] = js.native
  
  /**
    * 日期选择对话框的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var PickDateOption: js.UndefOr[PlusNativeUIPickDateOption] = js.native
  
  /**
    * JSON对象，时间选择对话框的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var PickTimeOption: js.UndefOr[PlusNativeUIPickTimeOption] = js.native
  
  /**
    * JSON对象，图片预览的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var PreviewImageOptions: js.UndefOr[PlusNativeUIPreviewImageOptions] = js.native
  
  /**
    * JSON对象，系统提示消息框要设置的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var ToastOptions: js.UndefOr[PlusNativeUIToastOptions] = js.native
  
  /**
    * JSON对象，原生等待对话框上loading图标自定义样式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var WaitingLoadingOptions: js.UndefOr[PlusNativeUIWaitingLoadingOptions] = js.native
  
  /**
    * 系统等待对话框对象
    * 从NativeUIObj对象继承而来，通过plus.nativeUI.showWaiting方法创建时返回。
    *     用于控制系统样式等待对话框的操作，如关闭、设置标题内容等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var WaitingObj: js.UndefOr[PlusNativeUIWaitingObj] = js.native
  
  /**
    * JSON对象，原生等待对话框的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var WaitingOptions: js.UndefOr[PlusNativeUIWaitingOptions] = js.native
  
  /**
    * 弹出系统选择按钮框
    * 从底部动画弹出系统样式选择按钮框，可设置选择框的标题、按钮文字等。
    *     弹出的提示框为非阻塞模式，用户点击选择框上的按钮后关闭，并通过actionsheetCallback回调函数通知用户选择的按钮。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def actionSheet(): PlusNativeUINativeUIObj = js.native
  def actionSheet(actionsheetStyle: Unit, actionsheetCallback: js.Function1[/* result */ js.Any, Unit]): PlusNativeUINativeUIObj = js.native
  def actionSheet(actionsheetStyle: PlusNativeUIActionSheetStyles): PlusNativeUINativeUIObj = js.native
  def actionSheet(
    actionsheetStyle: PlusNativeUIActionSheetStyles,
    actionsheetCallback: js.Function1[/* result */ js.Any, Unit]
  ): PlusNativeUINativeUIObj = js.native
  
  /**
    * 弹出系统提示对话框
    * 创建并显示系统样式提示对话框，可设置提示对话框的标题、内容、按钮文字等。
    *     弹出的提示对话框为非阻塞模式，用户点击提示对话框上的按钮后关闭，并通过alertCB回调函数通知对话框已关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def alert(): Unit = js.native
  def alert(message: String): Unit = js.native
  def alert(message: String, alertCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def alert(message: String, alertCB: js.Function1[/* result */ js.Any, Unit], title: String): Unit = js.native
  def alert(
    message: String,
    alertCB: js.Function1[/* result */ js.Any, Unit],
    title: String,
    buttonCapture: String
  ): Unit = js.native
  def alert(
    message: String,
    alertCB: js.Function1[/* result */ js.Any, Unit],
    title: Unit,
    buttonCapture: String
  ): Unit = js.native
  def alert(message: String, alertCB: Unit, title: String): Unit = js.native
  def alert(message: String, alertCB: Unit, title: String, buttonCapture: String): Unit = js.native
  def alert(message: String, alertCB: Unit, title: Unit, buttonCapture: String): Unit = js.native
  def alert(message: Unit, alertCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def alert(message: Unit, alertCB: js.Function1[/* result */ js.Any, Unit], title: String): Unit = js.native
  def alert(
    message: Unit,
    alertCB: js.Function1[/* result */ js.Any, Unit],
    title: String,
    buttonCapture: String
  ): Unit = js.native
  def alert(
    message: Unit,
    alertCB: js.Function1[/* result */ js.Any, Unit],
    title: Unit,
    buttonCapture: String
  ): Unit = js.native
  def alert(message: Unit, alertCB: Unit, title: String): Unit = js.native
  def alert(message: Unit, alertCB: Unit, title: String, buttonCapture: String): Unit = js.native
  def alert(message: Unit, alertCB: Unit, title: Unit, buttonCapture: String): Unit = js.native
  
  /**
    * 关闭自动消失的提示消息
    * 关闭已经显示的所有自动消失的提示框。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def closeToast(): Unit = js.native
  
  /**
    * 关闭系统等待对话框
    * 关闭已经显示的所有系统样式等待对话框，触发Waiting对象的onclose事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def closeWaiting(): Unit = js.native
  
  /**
    * 弹出系统确认对话框
    * 创建并显示系统样式确认对话框，可设置确认对话框的标题、内容、按钮数目及其文字。
    *     弹出的确认对话框为非阻塞模式，用户点击确认对话框上的按钮后关闭，并通过confirmCB回调函数通知用户点击的按钮索引值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def confirm(): Unit = js.native
  def confirm(message: String): Unit = js.native
  def confirm(message: String, confirmCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def confirm(
    message: String,
    confirmCB: js.Function1[/* result */ js.Any, Unit],
    options: Unit,
    buttons: js.Array[js.Any]
  ): Unit = js.native
  def confirm(
    message: String,
    confirmCB: js.Function1[/* result */ js.Any, Unit],
    options: PlusNativeUIConfirmOptions
  ): Unit = js.native
  def confirm(
    message: String,
    confirmCB: js.Function1[/* result */ js.Any, Unit],
    options: PlusNativeUIConfirmOptions,
    buttons: js.Array[js.Any]
  ): Unit = js.native
  def confirm(message: String, confirmCB: Unit, options: Unit, buttons: js.Array[js.Any]): Unit = js.native
  def confirm(message: String, confirmCB: Unit, options: PlusNativeUIConfirmOptions): Unit = js.native
  def confirm(message: String, confirmCB: Unit, options: PlusNativeUIConfirmOptions, buttons: js.Array[js.Any]): Unit = js.native
  def confirm(message: Unit, confirmCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def confirm(
    message: Unit,
    confirmCB: js.Function1[/* result */ js.Any, Unit],
    options: Unit,
    buttons: js.Array[js.Any]
  ): Unit = js.native
  def confirm(
    message: Unit,
    confirmCB: js.Function1[/* result */ js.Any, Unit],
    options: PlusNativeUIConfirmOptions
  ): Unit = js.native
  def confirm(
    message: Unit,
    confirmCB: js.Function1[/* result */ js.Any, Unit],
    options: PlusNativeUIConfirmOptions,
    buttons: js.Array[js.Any]
  ): Unit = js.native
  def confirm(message: Unit, confirmCB: Unit, options: Unit, buttons: js.Array[js.Any]): Unit = js.native
  def confirm(message: Unit, confirmCB: Unit, options: PlusNativeUIConfirmOptions): Unit = js.native
  def confirm(message: Unit, confirmCB: Unit, options: PlusNativeUIConfirmOptions, buttons: js.Array[js.Any]): Unit = js.native
  
  /**
    * 弹出系统日期选择对话框
    * 创建并显示系统样式日期选择对话框，可进行日期的选择。
    *     用户操作确认后通过successCB回调函数返回用户选择的日期，若用户取消选择则通过errorCB回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def pickDate(): Unit = js.native
  def pickDate(successCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def pickDate(
    successCB: js.Function1[/* result */ js.Any, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def pickDate(
    successCB: js.Function1[/* result */ js.Any, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    options: PlusNativeUIPickDateOption
  ): Unit = js.native
  def pickDate(
    successCB: js.Function1[/* result */ js.Any, Unit],
    errorCB: Unit,
    options: PlusNativeUIPickDateOption
  ): Unit = js.native
  def pickDate(successCB: Unit, errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def pickDate(
    successCB: Unit,
    errorCB: js.Function1[/* result */ js.Any, Unit],
    options: PlusNativeUIPickDateOption
  ): Unit = js.native
  def pickDate(successCB: Unit, errorCB: Unit, options: PlusNativeUIPickDateOption): Unit = js.native
  
  /**
    * 弹出系统时间选择对话框
    * 创建并弹出系统样式时间选择对话框，可进行时间的选择。
    *     用户操作确认后通过successCB回调函数返回用户选择的时间，若用户取消选择则通过errorCB回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def pickTime(): Unit = js.native
  def pickTime(successCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def pickTime(
    successCB: js.Function1[/* result */ js.Any, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def pickTime(
    successCB: js.Function1[/* result */ js.Any, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    options: PlusNativeUIPickTimeOption
  ): Unit = js.native
  def pickTime(
    successCB: js.Function1[/* result */ js.Any, Unit],
    errorCB: Unit,
    options: PlusNativeUIPickTimeOption
  ): Unit = js.native
  def pickTime(successCB: Unit, errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def pickTime(
    successCB: Unit,
    errorCB: js.Function1[/* result */ js.Any, Unit],
    options: PlusNativeUIPickTimeOption
  ): Unit = js.native
  def pickTime(successCB: Unit, errorCB: Unit, options: PlusNativeUIPickTimeOption): Unit = js.native
  
  /**
    * 预览图片
    * 创建并显示全屏图片预览界面，用户点击图片或返回键退出预览界面。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def previewImage(): Unit = js.native
  def previewImage(urls: js.Array[js.Any]): Unit = js.native
  def previewImage(urls: js.Array[js.Any], options: PlusNativeUIPreviewImageOptions): Unit = js.native
  def previewImage(urls: Unit, options: PlusNativeUIPreviewImageOptions): Unit = js.native
  
  /**
    * 弹出系统输入对话框
    * 创建并显示系统样式输入对话框，可设置输入对话框的标题、内容、提示输入信息、按钮数目及其文字。
    *     弹出的输入对话框为非阻塞模式，其中包含编辑框供用户输入内容，用户点击输入对话框上的按钮后自动关闭，并通过promptCB回调函数返回用户点击的按钮及输入的内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def prompt(): Unit = js.native
  def prompt(message: String): Unit = js.native
  def prompt(message: String, promptCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def prompt(message: String, promptCB: js.Function1[/* result */ js.Any, Unit], title: String): Unit = js.native
  def prompt(message: String, promptCB: js.Function1[/* result */ js.Any, Unit], title: String, tip: String): Unit = js.native
  def prompt(
    message: String,
    promptCB: js.Function1[/* result */ js.Any, Unit],
    title: String,
    tip: String,
    buttons: js.Array[js.Any]
  ): Unit = js.native
  def prompt(
    message: String,
    promptCB: js.Function1[/* result */ js.Any, Unit],
    title: String,
    tip: Unit,
    buttons: js.Array[js.Any]
  ): Unit = js.native
  def prompt(message: String, promptCB: js.Function1[/* result */ js.Any, Unit], title: Unit, tip: String): Unit = js.native
  def prompt(
    message: String,
    promptCB: js.Function1[/* result */ js.Any, Unit],
    title: Unit,
    tip: String,
    buttons: js.Array[js.Any]
  ): Unit = js.native
  def prompt(
    message: String,
    promptCB: js.Function1[/* result */ js.Any, Unit],
    title: Unit,
    tip: Unit,
    buttons: js.Array[js.Any]
  ): Unit = js.native
  def prompt(message: String, promptCB: Unit, title: String): Unit = js.native
  def prompt(message: String, promptCB: Unit, title: String, tip: String): Unit = js.native
  def prompt(message: String, promptCB: Unit, title: String, tip: String, buttons: js.Array[js.Any]): Unit = js.native
  def prompt(message: String, promptCB: Unit, title: String, tip: Unit, buttons: js.Array[js.Any]): Unit = js.native
  def prompt(message: String, promptCB: Unit, title: Unit, tip: String): Unit = js.native
  def prompt(message: String, promptCB: Unit, title: Unit, tip: String, buttons: js.Array[js.Any]): Unit = js.native
  def prompt(message: String, promptCB: Unit, title: Unit, tip: Unit, buttons: js.Array[js.Any]): Unit = js.native
  def prompt(message: Unit, promptCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def prompt(message: Unit, promptCB: js.Function1[/* result */ js.Any, Unit], title: String): Unit = js.native
  def prompt(message: Unit, promptCB: js.Function1[/* result */ js.Any, Unit], title: String, tip: String): Unit = js.native
  def prompt(
    message: Unit,
    promptCB: js.Function1[/* result */ js.Any, Unit],
    title: String,
    tip: String,
    buttons: js.Array[js.Any]
  ): Unit = js.native
  def prompt(
    message: Unit,
    promptCB: js.Function1[/* result */ js.Any, Unit],
    title: String,
    tip: Unit,
    buttons: js.Array[js.Any]
  ): Unit = js.native
  def prompt(message: Unit, promptCB: js.Function1[/* result */ js.Any, Unit], title: Unit, tip: String): Unit = js.native
  def prompt(
    message: Unit,
    promptCB: js.Function1[/* result */ js.Any, Unit],
    title: Unit,
    tip: String,
    buttons: js.Array[js.Any]
  ): Unit = js.native
  def prompt(
    message: Unit,
    promptCB: js.Function1[/* result */ js.Any, Unit],
    title: Unit,
    tip: Unit,
    buttons: js.Array[js.Any]
  ): Unit = js.native
  def prompt(message: Unit, promptCB: Unit, title: String): Unit = js.native
  def prompt(message: Unit, promptCB: Unit, title: String, tip: String): Unit = js.native
  def prompt(message: Unit, promptCB: Unit, title: String, tip: String, buttons: js.Array[js.Any]): Unit = js.native
  def prompt(message: Unit, promptCB: Unit, title: String, tip: Unit, buttons: js.Array[js.Any]): Unit = js.native
  def prompt(message: Unit, promptCB: Unit, title: Unit, tip: String): Unit = js.native
  def prompt(message: Unit, promptCB: Unit, title: Unit, tip: String, buttons: js.Array[js.Any]): Unit = js.native
  def prompt(message: Unit, promptCB: Unit, title: Unit, tip: Unit, buttons: js.Array[js.Any]): Unit = js.native
  
  /**
    * 显示系统等待对话框
    * 创建并显示系统样式等待对话框，并返回等待对话框对象Waiting，显示后需调用其close方法进行关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def showWaiting(): PlusNativeUIWaitingObj = js.native
  def showWaiting(title: String): PlusNativeUIWaitingObj = js.native
  def showWaiting(title: String, options: PlusNativeUIWaitingOptions): PlusNativeUIWaitingObj = js.native
  def showWaiting(title: Unit, options: PlusNativeUIWaitingOptions): PlusNativeUIWaitingObj = js.native
  
  /**
    * 显示自动消失的提示消息
    * 创建并显示系统样式提示消息，弹出的提示消息为非阻塞模式，显示指定时间后自动消失。
    *     提示消息显示时间可通过options的duration属性控制，长时间提示消息显示时间约为3.5s，短时间提示消息显示时间约为2s。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def toast(): Unit = js.native
  def toast(message: String): Unit = js.native
  def toast(message: String, options: PlusNativeUIToastOptions): Unit = js.native
  def toast(message: Unit, options: PlusNativeUIToastOptions): Unit = js.native
}
