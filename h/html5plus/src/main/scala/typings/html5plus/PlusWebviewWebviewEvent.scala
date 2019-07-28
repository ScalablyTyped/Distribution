package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webview窗口事件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewEvent extends js.Object {
  /**
    * Webview窗口关闭事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口关闭时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var close: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口回弹事件
    * 通过WebviewObject对象的setBounce方法开启回弹效果设置顶部下拉回弹changeoffset属性后，当用户向下拖拽窗口时触发发此事件，回调函数类型为BounceEventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var dragBounce: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口加载错误事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口加载错误时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var error: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口隐藏事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口隐藏（窗口动画完成后）时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var hide: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口页面加载完成事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口页面加载完成时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var loaded: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口页面开始加载事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口开始加载新页面时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var loading: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口显示遮罩层时点击事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口通过mask属性设置显示遮罩层并且点击时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var maskClick: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口侧滑返回事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口侧滑返回时触发此事件，回调函数类型为PopGestureCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var popGesture: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口加载进度变化事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口加载页面进度变化时触发此事件。
    * 	回调函数原型为void PorgressCandedCallback(Event e),可通过e.progress获取窗口加载进度，取值范围为0-100。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var progressChanged: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口下拉刷新事件
    * Webview窗口打开下拉刷新功能后，用户操作下拉刷新时或调用beginPullToRefresh方法时触发，用于通知业务逻辑可以开始执行刷新操作。
    * 	更新操作完成后调用窗口的endPullToRefresh方法结束下拉刷新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var pullToRefresh: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口渲染完成事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口渲染完成时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var rendered: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口开始渲染事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口开始渲染内容时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var rendering: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口显示事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口显示（窗口动画完成后）时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var show: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口回弹事件
    * 通过WebviewObject对象的setBounce方法开启回弹效果设置左右侧侧滑slideoffset属性后，当用户向左右侧拖拽窗口侧滑时触发发此事件，回调函数类型为BounceEventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var slideBounce: js.UndefOr[String] = js.undefined
  /**
    * Webview加载页面标题更新事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口加载新页面更新标题时触发此事件，回调函数类型为SuccessCallback。
    * 	注意：此事件会先于loaded事件触发，通常在加载网络页面时通过此事件可更快获取到页面的标题。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var titleUpdate: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口接收到触屏事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当用户操作按下到Webview窗口时触发此事件，回调函数类型为SuccessCallback。
    * 	注意：每按下屏幕触发一次此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var touchstart: js.UndefOr[String] = js.undefined
}

object PlusWebviewWebviewEvent {
  @scala.inline
  def apply(
    close: String = null,
    dragBounce: String = null,
    error: String = null,
    hide: String = null,
    loaded: String = null,
    loading: String = null,
    maskClick: String = null,
    popGesture: String = null,
    progressChanged: String = null,
    pullToRefresh: String = null,
    rendered: String = null,
    rendering: String = null,
    show: String = null,
    slideBounce: String = null,
    titleUpdate: String = null,
    touchstart: String = null
  ): PlusWebviewWebviewEvent = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (dragBounce != null) __obj.updateDynamic("dragBounce")(dragBounce)
    if (error != null) __obj.updateDynamic("error")(error)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (loaded != null) __obj.updateDynamic("loaded")(loaded)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (maskClick != null) __obj.updateDynamic("maskClick")(maskClick)
    if (popGesture != null) __obj.updateDynamic("popGesture")(popGesture)
    if (progressChanged != null) __obj.updateDynamic("progressChanged")(progressChanged)
    if (pullToRefresh != null) __obj.updateDynamic("pullToRefresh")(pullToRefresh)
    if (rendered != null) __obj.updateDynamic("rendered")(rendered)
    if (rendering != null) __obj.updateDynamic("rendering")(rendering)
    if (show != null) __obj.updateDynamic("show")(show)
    if (slideBounce != null) __obj.updateDynamic("slideBounce")(slideBounce)
    if (titleUpdate != null) __obj.updateDynamic("titleUpdate")(titleUpdate)
    if (touchstart != null) __obj.updateDynamic("touchstart")(touchstart)
    __obj.asInstanceOf[PlusWebviewWebviewEvent]
  }
}

