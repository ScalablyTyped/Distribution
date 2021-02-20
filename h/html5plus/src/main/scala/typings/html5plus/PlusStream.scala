package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stream模块操作流应用。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
  */
@js.native
trait PlusStream extends StObject {
  
  /**
    * JSON对象，免流量操作参数
    * 包含电话号码、验证码等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var FreetrafficOptions: js.UndefOr[PlusStreamFreetrafficOptions] = js.native
  
  /**
    * JSON对象，启动流应用的首页窗口属性
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var LaunchWebviewStyles: js.UndefOr[PlusStreamLaunchWebviewStyles] = js.native
  
  /**
    * JSON对象，流应用信息
    * 流应用标识、图标、是否下载完成等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var StreamInfo: js.UndefOr[PlusStreamStreamInfo] = js.native
  
  /**
    * JSON对象，启动流应用参数
    * 指定要启动的流应用标识、名称、图标、参数等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var StreamOptions: js.UndefOr[PlusStreamStreamOptions] = js.native
  
  /**
    * JSON对象，流应用恢复运行的参数
    * 设置流应用恢复运行时的参数、splash、首页等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var StreamRestoreOptions: js.UndefOr[PlusStreamStreamRestoreOptions] = js.native
  
  /**
    * 流应用恢复运行时启动界面配置参数
    * 设置流应用恢复运行时启动界面，如是否自动关闭、延时关闭时间、超时时间等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var StreamRestoreSplashscreenOptions: js.UndefOr[PlusStreamStreamRestoreSplashscreenOptions] = js.native
  
  /**
    * 流应用激活统计
    * 提交统计数据到流应用服务器，表明业务系统激活成功。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  def activate(): Unit = js.native
  
  /**
    * 免流量绑定手机号
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  def freetrafficBind(): Unit = js.native
  def freetrafficBind(
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def freetrafficBind(options: js.UndefOr[scala.Nothing], successCallback: js.Function0[Unit]): Unit = js.native
  def freetrafficBind(
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function0[Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def freetrafficBind(options: PlusStreamFreetrafficOptions): Unit = js.native
  def freetrafficBind(
    options: PlusStreamFreetrafficOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def freetrafficBind(options: PlusStreamFreetrafficOptions, successCallback: js.Function0[Unit]): Unit = js.native
  def freetrafficBind(
    options: PlusStreamFreetrafficOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 获取免流量状态信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  def freetrafficInfo(): Unit = js.native
  def freetrafficInfo(successCallback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def freetrafficInfo(successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def freetrafficInfo(
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 免流量是否生效
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  def freetrafficIsValid(): Boolean = js.native
  
  /**
    * 解除免流量绑定
    * 解除当前设备绑定的手机号，如果设备未绑定则不执行操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  def freetrafficRelease(): Unit = js.native
  
  /**
    * 请求免流量验证码
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  def freetrafficRequest(): Unit = js.native
  def freetrafficRequest(
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def freetrafficRequest(options: js.UndefOr[scala.Nothing], successCallback: js.Function0[Unit]): Unit = js.native
  def freetrafficRequest(
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function0[Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def freetrafficRequest(options: PlusStreamFreetrafficOptions): Unit = js.native
  def freetrafficRequest(
    options: PlusStreamFreetrafficOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def freetrafficRequest(options: PlusStreamFreetrafficOptions, successCallback: js.Function0[Unit]): Unit = js.native
  def freetrafficRequest(
    options: PlusStreamFreetrafficOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 已下载流应用列表
    * 获取当前设备上已安装的所有流应用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  def list(): Unit = js.native
  def list(
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Any
  ): Unit = js.native
  def list(options: js.UndefOr[scala.Nothing], successCallback: js.Any): Unit = js.native
  def list(options: js.UndefOr[scala.Nothing], successCallback: js.Any, errorCallback: js.Any): Unit = js.native
  def list(options: js.Any): Unit = js.native
  def list(options: js.Any, successCallback: js.UndefOr[scala.Nothing], errorCallback: js.Any): Unit = js.native
  def list(options: js.Any, successCallback: js.Any): Unit = js.native
  def list(options: js.Any, successCallback: js.Any, errorCallback: js.Any): Unit = js.native
  
  /**
    * 免流量状态变化事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var onfreetrafficStateChange: js.UndefOr[js.Any] = js.native
  
  /**
    * 启动流应用
    * 打开指定的流应用，在流应用中通过plus.runtime.launcher获取的值为"stream"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  def open(): Unit = js.native
  def open(
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def open(options: js.UndefOr[scala.Nothing], successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def open(
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def open(options: PlusStreamStreamOptions): Unit = js.native
  def open(
    options: PlusStreamStreamOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def open(options: PlusStreamStreamOptions, successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def open(
    options: PlusStreamStreamOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 预加载流应用
    * 预加载指定的流应用资源，下载应用资源等，并不运行流应用。
    *     如果应用资源已经下载，则不做任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  def preload(): Unit = js.native
  def preload(appid: String): Unit = js.native
  
  /**
    * 删除流应用
    * 删除已下载的流应用，清空应用相关运行期保存的资源（如缓存、配置文件等）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  def remove(): Unit = js.native
  def remove(appid: String): Unit = js.native
  
  /**
    * 设置流应用恢复运行的参数
    * 当流应用运行数目超过限制（通常最多运行2个流应用），会自动关闭之前切换到后台运行的应用。
    *     可通过此方法设置应用被自动关闭后再次被唤醒恢复运行时的参数，流应用恢复运行流程与第一次启动一致（差别是会使用StreamRestoreOptions中配置的参数）。
    *     如果没有调用setRestoreState方法，则恢复运行时使用启动时（调用plus.stream.open方法）传入的参数。
    *     注意：如果通过plus.stream.open方法启动应用，则忽略此方法设置的参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  def setRestoreState(): Unit = js.native
  def setRestoreState(options: PlusStreamStreamRestoreOptions): Unit = js.native
}
