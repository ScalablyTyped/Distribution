package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * navigator用于管理浏览器运行环境信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
  */
@js.native
trait PlusNavigator extends js.Object {
  /**
    * 运行环境权限类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var PermissionNames: js.UndefOr[PlusNavigatorPermissionNames] = js.native
  /**
    * 创建应用快捷方式要设置的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var ShortcutOptions: js.UndefOr[PlusNavigatorShortcutOptions] = js.native
  /**
    * 更新应用启动界面要设置的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var SplashscreenOptions: js.UndefOr[PlusNavigatorSplashscreenOptions] = js.native
  /**
    * 检查运行环境的权限
    * 向系统检查当前程序的权限状态，不触发权限相对应的功能API的调用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def checkPermission(): String = js.native
  def checkPermission(permission: PlusNavigatorPermissionNames): String = js.native
  /**
    * 关闭应用启动界面
    * 很多情况下，应用启动后需要一段时间加载数据，为了避免界面显示空白内容，提高用户体验效果，这时可显示启动界面。
    *     等数据加载完成后再关闭启动界面进入应用，通常可在应用首界面加载数据完成并更新显示内容后调用此方法。
    *     注意：HBuilder7.1版本后启动界面不调用此方法超过6秒后会自动关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def closeSplashscreen(): Unit = js.native
  /**
    * 创建应用快捷方式
    * 在系统桌面创建应用的快捷方式，点击后可直接启动应用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def createShortcut(): Unit = js.native
  def createShortcut(options: js.UndefOr[scala.Nothing], successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def createShortcut(options: PlusNavigatorShortcutOptions): Unit = js.native
  def createShortcut(options: PlusNavigatorShortcutOptions, successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  /**
    * 获取Cookie值
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def getCookie(): String = js.native
  def getCookie(url: String): String = js.native
  /**
    * 获取系统状态栏背景颜色
    * 获取应用在前台运行时系统状态栏的背景颜色。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def getStatusBarBackground(): String = js.native
  /**
    * 获取系统状态栏样式
    * 获取应用运行时系统状态栏的样式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def getStatusBarStyle(): String = js.native
  /**
    * 获取系统状态栏高度
    * 单位为像素（px），值为Webview中的逻辑高度单位，如果要获取真实高度则必须乘以plus.screen.scale。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def getStatusbarHeight(): Double = js.native
  /**
    * 获取userAgent值
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def getUserAgent(): String = js.native
  /**
    * 查询设备是否为刘海屏
    * 刘海屏返回true，否则返回false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def hasNotchInScreen(): Boolean = js.native
  /**
    * 查询是否存在应用快捷方式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def hasShortcut(): Unit = js.native
  def hasShortcut(options: js.UndefOr[scala.Nothing], successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def hasShortcut(options: PlusNavigatorShortcutOptions): Unit = js.native
  def hasShortcut(options: PlusNavigatorShortcutOptions, successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  /**
    * 查询应用启动界面是否已关闭
    * 如果启动界面显示返回true，否则返回false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def hasSplashscreen(): Boolean = js.native
  /**
    * 判断当前应用是否切换到后台
    * 在多应用运行环境（如流应用）中，启动一个新应用时，之前运行的应用将会自动切换到后台运行，此时plus.navigator.isBackground()返回状态只为true。
    *     注意：此状态不是5+应用切换到系统后台的状态，而是在同一apk中同时运行多个应用时被切换到后台的状态。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def isBackground(): Boolean = js.native
  /**
    * 判断应用当前是否全屏模式显示
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def isFullscreen(): Boolean = js.native
  /**
    * 判断当前是否为沉浸式状态栏模式
    * 如果当前应用采用沉浸式状态栏则返回true，否则返回false。
    *     注意：如果当前系统版本不支持沉浸式状态栏也返回false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def isImmersedStatusbar(): Boolean = js.native
  /**
    * 判断应用当前是否输出日志
    * 日志包括应用原生层内部跟踪日志（ADB、LogCat工具可获取的日志）及JS层跟踪日志（console.log输出的日志）。
    *     开启日志在一定程度上会降低程序的性能，通常建议在正式发布时关闭日志输出，在调试时开启日志输出（此时可以通过工具ADB、LogCat获取分析日志）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def isLogs(): Boolean = js.native
  /**
    * 删除应用所有Cookie值
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def removeAllCookie(): Unit = js.native
  /**
    * 删除应用Cookie
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def removeCookie(): Unit = js.native
  def removeCookie(url: String): Unit = js.native
  /**
    * 删除应用所有会话期Cookie值
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def removeSessionCookie(): Unit = js.native
  /**
    * 设置Cookie值
    * 设置应用发起Http请求时提交的cookie值，调用此接口后所有的请求都生效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def setCookie(): Unit = js.native
  def setCookie(url: js.UndefOr[scala.Nothing], value: String): Unit = js.native
  def setCookie(url: String): Unit = js.native
  def setCookie(url: String, value: String): Unit = js.native
  /**
    * 设置应用是否全屏显示
    * 设置应用在全屏模式显示时，将隐藏系统状态栏，通常游戏类应用才会设置为全屏模式显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def setFullscreen(): Unit = js.native
  def setFullscreen(fullscreen: Boolean): Unit = js.native
  /**
    * 设置应用是否输出日志
    * 设置应用是否输出日志信息，默认关闭输出日志功能。
    *     日志包括应用原生层内部跟踪日志（ADB、LogCat工具可获取的日志）及JS层跟踪日志（console.log输出的日志）。
    *     开启日志在一定程度上会降低程序的性能，通常建议在正式发布时关闭日志输出，在调试时开启日志输出（此时可以通过工具ADB、LogCat获取分析日志）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def setLogs(): Unit = js.native
  def setLogs(log: Boolean): Unit = js.native
  /**
    * 设置系统状态栏背景颜色
    * 设置应用在前台运行时系统状态栏的背景颜色，默认使用系统状态栏默认背景色（有系统状态栏样式决定）。
    *     注意：为了有更好的兼容性，避免设置接近白色或黑色的颜色值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def setStatusBarBackground(): Unit = js.native
  def setStatusBarBackground(color: String): Unit = js.native
  /**
    * 设置系统状态栏样式
    * 设置应用在前台运行时系统状态栏的样式，默认值可通过manifest.json文件的plus-&gt;statusbar-&gt;style配置。
    *     注意：此操作是应用全局配置，调用的Webview窗口关闭后仍然生效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def setStatusBarStyle(): Unit = js.native
  def setStatusBarStyle(style: String): Unit = js.native
  /**
    * 设置userAgent值
    * 设置应用通过navigator.userAgent获取的值，及所有发起Http请求时提交的userAgent值。
    *     如果要设置启动页面的userAgent值则需要在manifest.json中进行配置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def setUserAgent(): Unit = js.native
  def setUserAgent(useragent: js.UndefOr[scala.Nothing], checkplus: Boolean): Unit = js.native
  def setUserAgent(useragent: String): Unit = js.native
  def setUserAgent(useragent: String, checkplus: Boolean): Unit = js.native
  /**
    * 更新程序启动界面
    * 可设置启动界面显示的图片（仅支持本地文件路径，如果是网络资源可先通过plus.downloader.*下载到本地），
    *     更新启动界面后程序下次启动时生效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  def updateSplashscreen(): Unit = js.native
  def updateSplashscreen(options: PlusNavigatorSplashscreenOptions): Unit = js.native
}

