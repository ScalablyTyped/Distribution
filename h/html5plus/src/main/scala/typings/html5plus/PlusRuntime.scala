package typings.html5plus

import typings.html5plus.html5plusStrings.barcode
import typings.html5plus.html5plusStrings.default
import typings.html5plus.html5plusStrings.push
import typings.html5plus.html5plusStrings.scheme
import typings.html5plus.html5plusStrings.shortcut
import typings.html5plus.html5plusStrings.silent
import typings.html5plus.html5plusStrings.stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Runtime模块管理运行环境，可用于获取当前运行环境信息、与其它程序进行通讯等。通过plus.runtime可获取运行环境管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
  */
@js.native
trait PlusRuntime extends StObject {
  
  /**
    * JSON对象，打开第三方程序参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var ApplicationInf: js.UndefOr[PlusRuntimeApplicationInf] = js.native
  
  /**
    * JSON对象，应用角标显示需要的通知栏消息的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var BadgeOptions: js.UndefOr[PlusRuntimeBadgeOptions] = js.native
  
  /**
    * JSON对象，打开文件参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var OpenFileOptions: js.UndefOr[PlusRuntimeOpenFileOptions] = js.native
  
  /**
    * JSON对象，应用信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var WidgetInfo: js.UndefOr[PlusRuntimeWidgetInfo] = js.native
  
  /**
    * JSON对象，应用安装参数
    * 可通过对象设置安装的应用是否进行appid校验、版本号校验等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var WidgetOptions: js.UndefOr[PlusRuntimeWidgetOptions] = js.native
  
  /**
    * 当前应用的APPID
    * 当前应用的APPID，字符串类型。注意，如果是在HBuilder真机运行获取的是固定值"HBuilder"，需要提交App云端打包后运行才能获取真实的APPID值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var appid: js.UndefOr[String] = js.native
  
  /**
    * 第三方程序调用时传递给程序的参数
    * 第三方程序传递过来的参数，字符串格式类型数据。
    *     不是由第三方程序调用启动，则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var arguments: js.UndefOr[String] = js.native
  
  /**
    * 应用的市场推广渠道标识
    * "qihoo:browser"标识360浏览器流应用，"qihoo:appstore "表示360手机助手流应用，"dcloud:streamapps"表示DCloud流应用基座。
    *     注意：仅流应用环境中可用（如果没有特殊配置默认返回运行环境的包名），非流应用环境中返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var channel: js.UndefOr[String] = js.native
  
  /**
    * 获取指定APPID对应的应用信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  def getProperty(): Unit = js.native
  def getProperty(appid: String): Unit = js.native
  def getProperty(appid: String, getPropertyCB: js.Function1[/* result */ PlusRuntimeWidgetInfo, Unit]): Unit = js.native
  def getProperty(appid: Unit, getPropertyCB: js.Function1[/* result */ PlusRuntimeWidgetInfo, Unit]): Unit = js.native
  
  /**
    * 客户端5+运行环境的版本号
    * 5+运行环境版本号，格式为：[主版本号].[次版本号].[修订版本号].[编译代号]。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var innerVersion: js.UndefOr[String] = js.native
  
  /**
    * 安装应用
    * 支持以下类型安装包：
    *     1. 应用资源安装包（wgt），扩展名为'.wgt'；
    *     2. 应用资源差量升级包（wgtu），扩展名为'.wgtu'；
    *     3. 系统程序安装包（apk），要求使用当前平台支持的安装包格式。
    *     注意：仅支持本地地址，调用此方法前需把安装包从网络地址或其他位置放置到运行时环境可以访问的本地目录。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  def install(): Unit = js.native
  def install(filePath: String): Unit = js.native
  def install(
    filePath: String,
    options: Unit,
    installSuccessCB: js.Function1[/* result */ PlusRuntimeWidgetInfo, Unit]
  ): Unit = js.native
  def install(
    filePath: String,
    options: Unit,
    installSuccessCB: js.Function1[/* result */ PlusRuntimeWidgetInfo, Unit],
    installErrorCB: js.Function1[/* result */ Any, Unit]
  ): Unit = js.native
  def install(
    filePath: String,
    options: Unit,
    installSuccessCB: Unit,
    installErrorCB: js.Function1[/* result */ Any, Unit]
  ): Unit = js.native
  def install(filePath: String, options: PlusRuntimeWidgetOptions): Unit = js.native
  def install(
    filePath: String,
    options: PlusRuntimeWidgetOptions,
    installSuccessCB: js.Function1[/* result */ PlusRuntimeWidgetInfo, Unit]
  ): Unit = js.native
  def install(
    filePath: String,
    options: PlusRuntimeWidgetOptions,
    installSuccessCB: js.Function1[/* result */ PlusRuntimeWidgetInfo, Unit],
    installErrorCB: js.Function1[/* result */ Any, Unit]
  ): Unit = js.native
  def install(
    filePath: String,
    options: PlusRuntimeWidgetOptions,
    installSuccessCB: Unit,
    installErrorCB: js.Function1[/* result */ Any, Unit]
  ): Unit = js.native
  def install(
    filePath: Unit,
    options: Unit,
    installSuccessCB: js.Function1[/* result */ PlusRuntimeWidgetInfo, Unit]
  ): Unit = js.native
  def install(
    filePath: Unit,
    options: Unit,
    installSuccessCB: js.Function1[/* result */ PlusRuntimeWidgetInfo, Unit],
    installErrorCB: js.Function1[/* result */ Any, Unit]
  ): Unit = js.native
  def install(
    filePath: Unit,
    options: Unit,
    installSuccessCB: Unit,
    installErrorCB: js.Function1[/* result */ Any, Unit]
  ): Unit = js.native
  def install(filePath: Unit, options: PlusRuntimeWidgetOptions): Unit = js.native
  def install(
    filePath: Unit,
    options: PlusRuntimeWidgetOptions,
    installSuccessCB: js.Function1[/* result */ PlusRuntimeWidgetInfo, Unit]
  ): Unit = js.native
  def install(
    filePath: Unit,
    options: PlusRuntimeWidgetOptions,
    installSuccessCB: js.Function1[/* result */ PlusRuntimeWidgetInfo, Unit],
    installErrorCB: js.Function1[/* result */ Any, Unit]
  ): Unit = js.native
  def install(
    filePath: Unit,
    options: PlusRuntimeWidgetOptions,
    installSuccessCB: Unit,
    installErrorCB: js.Function1[/* result */ Any, Unit]
  ): Unit = js.native
  
  /**
    * 判断第三方程序是否已存在
    * 如果第三方程序已安装则返回true，未安装则返回false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  def isApplicationExist(): Boolean = js.native
  def isApplicationExist(appInf: PlusRuntimeApplicationInf): Boolean = js.native
  
  /**
    * 判断是否自定义应用启动页面加载地址
    * 通过URL Scheme启动时，可以在?后面添加__launch_path参数自定义应用启动首页加载的页面地址，
    *     如“streamapp://m3w.cn/s/HelloH5?__launch_path=http%3a%2f%2fm.weibo.cn%2fu%2f3196963860”；
    *     在流SDK集成时也可以通过launch_path参数（原生调用Intent）设置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  def isCustomLaunchPath(): Boolean = js.native
  
  /**
    * 调用第三方程序
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  def launchApplication(): Unit = js.native
  def launchApplication(appInf: Unit, errorCB: js.Function1[/* result */ Any, Unit]): Unit = js.native
  def launchApplication(appInf: PlusRuntimeApplicationInf): Unit = js.native
  def launchApplication(appInf: PlusRuntimeApplicationInf, errorCB: js.Function1[/* result */ Any, Unit]): Unit = js.native
  
  /**
    * 获取当前应用首页加载的时间
    * 应用加载首页面的总时间，从开始加载首页面到首页面加载完成，单位为ms。
    *     注意，应用首页为网络地址则包括网络传输时间。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var launchLoadedTime: js.UndefOr[Double] = js.native
  
  /**
    * 应用启动来源
    * 5+ APP启动类型，可取以下值：
    *     "default"：默认启动方式，通常表示应用列表启动（360手助中搜索启动）；
    *     "scheme"：通过urlscheme方式触发启动；
    *     "push"：通过点击系统通知方式触发启动；
    *     "stream"：通过流应用api（plus.stream.open）启动；
    *     "shortcut"：通过快捷方式启动，iOS平台表示通过3D Touch快捷方式，Android平台表示通过桌面快捷方式启动；
    *     "barcode"：通过二维码扫描启动；
    *     "myapp"：通过流应用"我的"应用列表或历史列表中触发启动；
    *     "favorite"：通过流应用的"收藏"应用列表启动；
    *     "browser"：通过流应用的内置浏览器导流启动的流应用（地址栏输入url启动应用、点击wap页面链接启动应用）；
    *     "engines"：通过流应用的浏览器界面作为搜索引擎启动；
    *     "search"：通过流应用的应用搜索启动应用（如iOS平台的T9键盘搜索）；
    *     "speech"：通过流应用的语音识别启动应用；
    *     "miniProgram"：通过微信小程序启动应用。
    * - default: 
    *     默认启动方式，通常表示从系统桌面图标启动
    *                         
    * - scheme: 
    *     通过urlscheme方式触发启动
    *                         
    * - push: 
    *     通过点击系统通知方式触发启动
    *                         
    * - stream: 
    *     通过流应用api（plus.stream.open）启动
    *                         
    * - shortcut: 
    *     iOS平台表示通过3D Touch快捷方式，Android平台表示通过桌面快捷方式启动
    *                         
    * - barcode: 
    *     通过二维码扫描启动
    *                         
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var launcher: js.UndefOr[default | scheme | push | stream | shortcut | barcode] = js.native
  
  /**
    * 调用第三方程序打开指定的文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  def openFile(): Unit = js.native
  def openFile(filepath: String): Unit = js.native
  def openFile(filepath: String, options: Unit, errorCB: js.Function1[/* result */ Any, Unit]): Unit = js.native
  def openFile(filepath: String, options: PlusRuntimeOpenFileOptions): Unit = js.native
  def openFile(
    filepath: String,
    options: PlusRuntimeOpenFileOptions,
    errorCB: js.Function1[/* result */ Any, Unit]
  ): Unit = js.native
  def openFile(filepath: Unit, options: Unit, errorCB: js.Function1[/* result */ Any, Unit]): Unit = js.native
  def openFile(filepath: Unit, options: PlusRuntimeOpenFileOptions): Unit = js.native
  def openFile(filepath: Unit, options: PlusRuntimeOpenFileOptions, errorCB: js.Function1[/* result */ Any, Unit]): Unit = js.native
  
  /**
    * 调用第三方程序打开指定的URL
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  def openURL(): Unit = js.native
  def openURL(url: String): Unit = js.native
  def openURL(url: String, errorCB: js.Function1[/* result */ Any, Unit]): Unit = js.native
  def openURL(url: String, errorCB: js.Function1[/* result */ Any, Unit], identity: String): Unit = js.native
  def openURL(url: String, errorCB: Unit, identity: String): Unit = js.native
  def openURL(url: Unit, errorCB: js.Function1[/* result */ Any, Unit]): Unit = js.native
  def openURL(url: Unit, errorCB: js.Function1[/* result */ Any, Unit], identity: String): Unit = js.native
  def openURL(url: Unit, errorCB: Unit, identity: String): Unit = js.native
  
  /**
    * 使用内置Webview窗口打开URL
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  def openWeb(): Unit = js.native
  def openWeb(url: String): Unit = js.native
  
  /**
    * 应用安装来源
    * 5+应用安装来源，可取以下值：
    *     "default"：默认安装来源，apk/ipa安装包内置安装；
    *     "stream"：通过流应用api（plus.stream.open）安装，仅流应用环境下支持；
    *     "push"：通过点击系统通知方式触发安装，仅流应用环境下支持；
    *     "scheme"：通过urlscheme方式触发安装，仅流应用环境下支持；
    *     "barcode"：通过二维码扫描触发安装，仅流应用环境下支持；
    *     "silent"：通过后台静默方式安装，仅流应用环境下支持；
    *     "speech"：通过语音识别方式触发安装，仅流应用环境下支持；
    *     "favorite"：通过收藏界面启动触发安装，仅流应用环境下支持。
    * - default: 
    *     默认安装来源，apk/ipa安装包内置安装
    *                         
    * - stream: 
    *     通过流应用api（plus.stream.open）安装
    *                         
    * - push: 
    *     通过点击系统通知方式触发安装
    *                         
    * - scheme: 
    *     通过urlscheme方式触发安装
    *                         
    * - barcode: 
    *     通过二维码扫描触发安装
    *                         
    * - silent: 
    *     通过后台静默方式安装
    *                         
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var origin: js.UndefOr[default | stream | push | scheme | barcode | silent] = js.native
  
  /**
    * 处理直达页面链接参数
    * 通过URL Scheme启动时，可以在?后面添加__direct_page参数自定义直达页面地址，
    *     如“streamapp://m3w.cn/s/HelloH5?__direct_page=http%3a%2f%2fm.weibo.cn%2fu%2f3196963860”；
    *     在流应用SDK集成时也可以通过direct_page参数（原生调用Intent）设置。
    *     注意：仅第一次调用此API时返回直达页面链接地址，再次调用将返回空字符串；如果应用重新被带直达页面链接参数的URL Scheme启动/激活时，可再次调用此方法获取。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  def processDirectPage(): String = js.native
  
  /**
    * 获取当前应用的进程标识
    * 当前应用所属系统进程标识。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var processId: js.UndefOr[String] = js.native
  
  /**
    * 退出客户端程序
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  def quit(): Unit = js.native
  
  /**
    * 重启当前的应用
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  def restart(): Unit = js.native
  
  /**
    * 设置程序快捷方式图标上显示的角标数字
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  def setBadgeNumber(): Unit = js.native
  def setBadgeNumber(number: Double): Unit = js.native
  def setBadgeNumber(number: Double, options: PlusRuntimeBadgeOptions): Unit = js.native
  def setBadgeNumber(number: Unit, options: PlusRuntimeBadgeOptions): Unit = js.native
  
  /**
    * 获取当前应用的启动时间
    * 应用启动时间戳，距1970年1月1日之间的毫秒数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var startupTime: js.UndefOr[Double] = js.native
  
  /**
    * 客户端的版本号
    * 字符串类型，在编译环境中设置的apk/ipa版本号。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var version: js.UndefOr[String] = js.native
}
