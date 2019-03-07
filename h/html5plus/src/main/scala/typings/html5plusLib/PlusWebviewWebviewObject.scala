package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webview窗口对象，用于操作加载HTML页面的窗口
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewObject extends js.Object {
  /**
    * Webview窗口的标识
    * 在打开或创建Webview窗口时设置，如果没有设置窗口标识，此属性值为undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * Webview窗口关闭事件
    * 当Webview窗口关闭时触发此事件，类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var onclose: js.UndefOr[js.Function1[/* result */ js.Any, scala.Unit]] = js.native
  /**
    * Webview窗口错误事件
    * 当Webview窗口加载错误时触发此事件，类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var onerror: js.UndefOr[PlusWebviewWebviewEvent] = js.native
  /**
    * Webview窗口页面加载完成事件
    * 当Webview窗口页面加载完成时触发此事件，类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var onloaded: js.UndefOr[PlusWebviewWebviewEvent] = js.native
  /**
    * Webview窗口页面开始加载事件
    * 当Webview窗口开始加载新页面时触发此事件，类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var onloading: js.UndefOr[PlusWebviewWebviewEvent] = js.native
  /**
    * 添加事件监听器
    * 向Webview窗口添加事件监听器，当指定的事件发生时，将触发listener函数的执行。
    * 		可多次调用此方法向Webview添加多个监听器，当监听的事件发生时，将按照添加的先后顺序执行。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def addEventListener(): scala.Unit = js.native
  def addEventListener(event: PlusWebviewWebviewEvent): scala.Unit = js.native
  def addEventListener(event: PlusWebviewWebviewEvent, listener: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit = js.native
  def addEventListener(
    event: PlusWebviewWebviewEvent,
    listener: js.Function1[/* result */ js.Any, scala.Unit],
    capture: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Webview窗口内容动画
    * 动画后可能会导致Webview窗口显示内容改变，可通过调用restore方法恢复。
    * 	当Webview窗口内容动画引起内容不可见（透明），将显示此窗口后面的内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def animate(): scala.Unit = js.native
  def animate(options: PlusWebviewWebviewContentAnimationOptions): scala.Unit = js.native
  def animate(options: PlusWebviewWebviewContentAnimationOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 在Webview窗口中添加子窗口
    * 将另一个Webview窗口作为子窗口添加到当前Webview窗口中，添加后其所有权归父Webview窗口，当父窗口关闭时子窗口自动关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def append(): scala.Unit = js.native
  def append(webview: PlusNativeObjView): scala.Unit = js.native
  /**
    * 添加Webview窗口预加载js文件
    * 对于一些网络HTML页面，在无法修改HTML页面时可通过此方法自动加载本地js文件。
    * 	当Webview窗口跳转到新页面时也会自动加载指定的js执行，添加多个js文件将按照添加的先后顺序执行。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def appendJsFile(): scala.Unit = js.native
  def appendJsFile(file: java.lang.String): scala.Unit = js.native
  /**
    * 后退到上次加载的页面
    * Webview窗口历史记录操作，后退到窗口上次加载的HTML页面。
    * 	如果窗口历史记录中没有可后退的页面则不触发任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def back(): scala.Unit = js.native
  /**
    * 开始Webview窗口的下拉刷新
    * 开始触发下拉刷新效果，与用户操作下拉刷新行为一致（有动画效果）。
    * 	触发setPullTorefresh方法设置的下拉刷新事件回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def beginPullToRefresh(): scala.Unit = js.native
  /**
    * 查询Webview窗口是否可后退
    * Webview窗口历史记录查询操作，获取Webview是否可后退到历史加载的页面，结果通过queryCallback回调方法返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def canBack(): scala.Unit = js.native
  def canBack(queryCallback: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * 查询Webview窗口是否可前进
    * Webview窗口历史记录查询操作，获取Webview是否可前进到历史加载的页面，结果通过queryCallback回调方法返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def canForward(): scala.Unit = js.native
  def canForward(queryCallback: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * 检测Webview窗口是否渲染完成
    * 检测方式为判断的Webview窗口内容是否为白屏，如果非白屏则认为渲染完成，否则认为渲染未完成。
    * 	通过successCallback回调函数返回结果，如果检测过程中发生错误则触发errorCallback回调函数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def checkRenderedContent(): scala.Unit = js.native
  def checkRenderedContent(options: PlusWebviewWebviewRenderedEventOptions): scala.Unit = js.native
  def checkRenderedContent(options: PlusWebviewWebviewRenderedEventOptions, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def checkRenderedContent(
    options: PlusWebviewWebviewRenderedEventOptions,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function1[/* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * 获取Webview窗口的所有子Webview窗口
    * 获取添加到Webview窗口中的所有子Webview窗口，如果没有子Webview窗口则返回空数组。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def children(): js.Array[PlusWebview] = js.native
  /**
    * 清空原生Webview窗口加载的内容
    * 清除原生窗口的内容，用于重置原生窗口加载的内容，清除其加载的历史记录等内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def clear(): scala.Unit = js.native
  /**
    * 关闭Webview窗口
    * 关闭并销毁Webview窗口，可设置关闭动画和动画持续时间。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def close(): scala.Unit = js.native
  def close(aniClose: PlusWebviewAnimationTypeClose): scala.Unit = js.native
  def close(aniClose: PlusWebviewAnimationTypeClose, duration: scala.Double): scala.Unit = js.native
  def close(
    aniClose: PlusWebviewAnimationTypeClose,
    duration: scala.Double,
    extras: PlusWebviewWebviewExtraOptions
  ): scala.Unit = js.native
  /**
    * 设置Webview窗口的滑屏操作手势
    * 将Webview窗口的左右滑动手势关联到其它Webview窗口，可实现滑动切换显示Webview的动画效果（如Tab页面切换效果）。
    * 	注意：滑屏操作会改变窗口位置（如left值等），如果不在可视区域则需要调用窗口的setStyle方法设置其位置到可视区域内，如setStyle({left:'0px'});。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def drag(): scala.Unit = js.native
  def drag(options: PlusWebviewWebviewDragOptions): scala.Unit = js.native
  def drag(options: PlusWebviewWebviewDragOptions, otherView: PlusWebviewWebviewDragOtherViewOptions): scala.Unit = js.native
  def drag(
    options: PlusWebviewWebviewDragOptions,
    otherView: PlusWebviewWebviewDragOtherViewOptions,
    callback: js.Function1[/* result */ PlusWebviewWebviewDragEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
    * 截屏绘制
    * 将Webview窗口的可视区域截屏并绘制到Bitmap图片对象中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def draw(): scala.Unit = js.native
  def draw(bitmap: PlusNativeObjBitmap): scala.Unit = js.native
  def draw(bitmap: PlusNativeObjBitmap, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def draw(
    bitmap: PlusNativeObjBitmap,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function1[/* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def draw(
    bitmap: PlusNativeObjBitmap,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function1[/* result */ js.Any, scala.Unit],
    options: PlusWebviewWebviewDrawOptions
  ): scala.Unit = js.native
  /**
    * 结束Webview窗口的下拉刷新
    * 关闭下拉刷新效果，恢复到开始下拉刷新之前的效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def endPullToRefresh(): scala.Unit = js.native
  /**
    * 在Webview窗口中执行JS脚本
    * 将JS脚本发送到Webview窗口中运行，可用于实现Webview窗口间的数据通讯。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def evalJS(): scala.Unit = js.native
  def evalJS(js_ : java.lang.String): scala.Unit = js.native
  /**
    * 前进到上次加载的页面
    * Webview窗口历史记录操作，前进到窗口上次加载的HTML页面。
    * 	如果窗口历史记录中没有可前进的页面则不触发任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def forward(): scala.Unit = js.native
  /**
    * 获取Webview窗口的收藏参数
    * 获取Webview窗口的收藏参数，如收藏页面的标题、图标、地址等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def getFavoriteOptions(): PlusWebviewWebviewFavoriteOptions = js.native
  /**
    * 获取Webview窗口的分享参数
    * 获取Webview窗口的分享参数，如分享的标题、图标、链接地址等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def getShareOptions(): PlusWebviewWebviewShareOptions = js.native
  /**
    * 获取Webview窗口的样式
    * 获取Webview窗口的样式属性，如窗口位置、大小等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def getStyle(): PlusWebviewWebviewStyles = js.native
  /**
    * 获取Webview窗口的原生子View控件对象
    * 创建Webview窗口的所有原生子View控件。
    * 	可以在创建窗口时设置其subNViews属性自动创建（应用首页可通过manfest.json中的plus-&gt;launchwebview-&gt;subNNViews节点配置创建）；
    * 	也可以通过Webview窗口的append方法将已经创建的原生View控件添加为其子。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def getSubNViews(): js.Array[_] = js.native
  /**
    * 获取Webview窗口加载HTML页面的标题
    * 标题为HTML页面head节点下title节点中的文本内容，当窗口内容发生页面内跳转时可通过窗口触发的“loaded”事件中调用此方法来获取跳转后页面的标题。
    * 	如果HTML页面没有使用title节点来设置标题，则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def getTitle(): java.lang.String = js.native
  /**
    * 获取Webview窗口的标题栏控件对象
    * 创建Webview窗口时设置其titleNView属性时则自动创建标题栏控件，应用首页可通过manfest.json中的plus-&gt;launchwebview-&gt;titleNView节点配置创建标题栏控件。
    * 	可通过此方法获取Webview窗口创建的标题栏控件，对象类型为plus.nativeObj.View，可通过调用其drawBitmap/drawRect/drawText方法绘制更新内容来实现自定义样式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def getTitleNView(): PlusNativeObjView = js.native
  /**
    * 获取Webview窗口加载HTML页面的地址
    * 当窗口内容发生页面内跳转时可通过窗口触发的“loaded”事件中调用此方法来获取跳转后页面的地址。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def getURL(): java.lang.String = js.native
  /**
    * 隐藏Webview窗口
    * 隐藏Webview窗口可保存已加载HTML页面的上下文数据，能降低应用使用的系统资源，通过show方法可将隐藏的Webview窗口显示出来。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def hide(): scala.Unit = js.native
  def hide(aniHide: PlusWebviewAnimationTypeClose): scala.Unit = js.native
  def hide(aniHide: PlusWebviewAnimationTypeClose, duration: scala.Double): scala.Unit = js.native
  def hide(
    aniHide: PlusWebviewAnimationTypeClose,
    duration: scala.Double,
    extras: PlusWebviewWebviewExtraOptions
  ): scala.Unit = js.native
  /**
    * 隐藏标题栏上按钮的红点
    * 仅在窗口使用原生标题栏（titleNView）时生效，未显示原生标题栏时操作此接口无任何效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def hideTitleNViewButtonRedDot(): scala.Unit = js.native
  def hideTitleNViewButtonRedDot(index: scala.Double): scala.Unit = js.native
  /**
    * 是否拦截Webview窗口的触屏事件
    * 拦截后触屏事件不再传递，否则传递给View控件下的其它窗口处理。
    * 	Webview窗口默认拦截所有触屏事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def interceptTouchEvent(): scala.Unit = js.native
  def interceptTouchEvent(intercept: scala.Boolean): scala.Unit = js.native
  /**
    * 查询Webview窗口是否开启硬件加速
    * 若Webview窗口已经开启硬件加速则返回true，否则返回false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def isHardwareAccelerated(): scala.Boolean = js.native
  /**
    * 查询Webview窗口是否可见
    * 若Webview窗口已经显示（调用过show方法，即使被其它窗口挡住了也认为已显示）则返回true，若Webview窗口被隐藏则返回false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def isVisible(): scala.Boolean = js.native
  /**
    * 监听页面开始加载资源
    * Webview加载资源时，如果满足options参数中定义的条件，则触发callback回调。
    * 	此方法仅触发回调事件，不会阻止资源的加载。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def listenResourceLoading(): scala.Unit = js.native
  def listenResourceLoading(options: PlusWebviewWebviewListenResourceOptions): scala.Unit = js.native
  def listenResourceLoading(
    options: PlusWebviewWebviewListenResourceOptions,
    callback: js.Function1[/* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * 加载新HTML数据
    * 触发Webview窗口加载HTML页面数据，如果HTML数据无效将导致页面加载失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def loadData(): scala.Unit = js.native
  def loadData(data: java.lang.String): scala.Unit = js.native
  def loadData(data: java.lang.String, options: PlusWebviewWebviewLoadDataOptions): scala.Unit = js.native
  /**
    * 加载新URL页面
    * 触发Webview窗口从新的URL地址加载页面，如果url地址无效将导致页面显示失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def loadURL(): scala.Unit = js.native
  def loadURL(url: java.lang.String): scala.Unit = js.native
  def loadURL(url: java.lang.String, additionalHttpHeaders: js.Any): scala.Unit = js.native
  /**
    * 获取Webview窗口对象的原生（Native.JS）实例对象
    * Android平台返回Webview窗口对象的android.webkit.Webview实例对象，
    * 	iOS平台返回Webview窗口对象的UIWebview实例对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def nativeInstanceObject(): PlusAndroidInstanceObject | PlusIosInstanceObject = js.native
  /**
    * 获取在当前Webview窗口中创建的所有窗口
    * 返回从当前Webview中调用plus.webview.open或plus.webview.create创建的所有Webview窗口数组。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def opened(): js.Array[PlusWebview] = js.native
  /**
    * 获取当前Webview窗口的创建者
    * 创建者为调用plus.webview.open或plus.webview.create方法创建当前窗口的Webview窗口。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def opener(): PlusWebviewWebviewObject = js.native
  /**
    * 拦截Webview窗口的资源加载
    * 根据区配规则拦截Webview窗口加载资源的URL地址，重定向到其它资源地址（暂仅支持本地地址）。
    * 	注意：多次调用overrideResourceRequest时仅以最后一次调用设置的参数值生效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def overrideResourceRequest(): scala.Unit = js.native
  def overrideResourceRequest(options: js.Array[PlusWebview]): scala.Unit = js.native
  /**
    * 拦截Webview窗口的URL请求
    * 拦截URL请求后，Webview窗口将不会跳转到新的URL地址，此时将通过callback回调方法返回拦截的URL地址（可新开Webview窗口加载URL页面等）。
    * 	此方法只能拦截窗口的网络超链接跳转（包括调用loadURL方法触发的跳转），不可拦截页面请求资源请求（如加载css/js/png等资源的请求）。
    * 	注意：多次调用overrideUrlLoading时仅以最后一次调用设置的参数值生效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def overrideUrlLoading(): scala.Unit = js.native
  def overrideUrlLoading(options: PlusWebviewWebviewOverrideUrlOptions): scala.Unit = js.native
  def overrideUrlLoading(
    options: PlusWebviewWebviewOverrideUrlOptions,
    callback: js.Function1[/* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * 获取当前Webview窗口的父窗口
    * Webview窗口作为子窗口添加（Webview.append）到其它Webview窗口中时有效，这时其它Webview窗口为父窗口。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def parent(): PlusWebviewWebviewObject = js.native
  /**
    * 重新加载Webview窗口显示的HTML页面
    * 触发Webview窗口重新加载当前显示的页面内容。
    * 	如果当前HTML页面未加载完则停止并重新加载，如果当前Webview窗口没有加载任何页面则无响应。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def reload(): scala.Unit = js.native
  def reload(force: scala.Boolean): scala.Unit = js.native
  /**
    * 移除子Webview窗口
    * 从当前Webview窗口移除指定的子Webview窗口，若指定的webview对象不是当前窗口的子窗口则无任何作用。
    * 	移除后子Webview窗口不会关闭，需要调用其close方法才能真正关闭并销毁。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def remove(): scala.Unit = js.native
  def remove(webview: PlusNativeObjView): scala.Unit = js.native
  /**
    * 移除Webview窗口事件监听器
    * 从Webview窗口移除通过addEventListener方法添加的事件监听器，若没有查找到对应的事件监听器，则无任何作用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def removeEventListener(): scala.Unit = js.native
  def removeEventListener(event: PlusWebviewWebviewEvent): scala.Unit = js.native
  def removeEventListener(event: PlusWebviewWebviewEvent, listener: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * 从父窗口中移除
    * 从所属的父Webview窗口移除，如果没有父窗口，则无任何作用。
    * 	从父窗口中移除后子Webview窗口不会关闭，需要调用其close方法才能真正关闭并销毁。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def removeFromParent(): scala.Unit = js.native
  /**
    * 移除标题栏上按钮的角标
    * 仅在窗口使用原生标题栏（titleNView）时生效，未显示原生标题栏时操作此接口无任何效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def removeTitleNViewButtonBadge(): scala.Unit = js.native
  def removeTitleNViewButtonBadge(index: scala.Double): scala.Unit = js.native
  /**
    * 重置Webview窗口的回弹位置
    * 开启窗口回弹效果后，当窗口中展现的内容滚动到头（顶部或底部）时，再拖拽时窗口整体内容将跟随移动，松开后自动回弹到停靠位置。
    * 	这时需要调用此方法来重置窗口的回弹位置，窗口将采用动画方式回弹到其初始显示的位置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def resetBounce(): scala.Unit = js.native
  /**
    * 恢复Webview控件显示内容
    * 恢复调用animate方法改变Webview控件的内容，更新至动画前显示的内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def restore(): scala.Unit = js.native
  /**
    * 设置Webview窗口是否阻塞加载页面中使用的网络图片
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setBlockNetworkImage(): scala.Unit = js.native
  def setBlockNetworkImage(block: scala.Boolean): scala.Unit = js.native
  /**
    * 设置Webview窗口的回弹效果
    * 开启窗口回弹效果后，当窗口中展现的内容滚动到头（顶部或底部）时，再拖拽时窗口整体内容将跟随移动，松开后自动回弹到停靠位置（可通过style设置）。
    * 	拖拽窗口内容时页面显示Webview窗口的背景色，默认为透明，此时显示Webview下面的内容，利用这个特点可以实现自定下拉刷新特效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setBounce(): scala.Unit = js.native
  def setBounce(style: PlusWebviewWebviewBounceStyle): scala.Unit = js.native
  /**
    * 设置HTML内容是否可见
    * 设置HTML内容不可见后，将显示Webview窗口的背景色。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setContentVisible(): scala.Unit = js.native
  def setContentVisible(visible: scala.Boolean): scala.Unit = js.native
  /**
    * 设置预加载的CSS文件
    * 预加载CSS文件不需要在HTML页面中显式引用，在Webview窗口加载HTML页面时自动加载，在页面跳转时也会自动加载。
    * 	设置新的CSS文件后将清空之前设置的值（包括调用setCssText设置的值）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setCssFile(): scala.Unit = js.native
  def setCssFile(file: java.lang.String): scala.Unit = js.native
  /**
    * 设置预加载的CSS内容
    * 预加载CSS内容不需要在HTML页面中显式引用，在Webview窗口加载HTML页面时自动加载，在页面跳转时也会自动加载。
    * 	设置新的CSS内容后将清空之前设置的值（包括调用setCssFile设置的值）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setCssText(): scala.Unit = js.native
  def setCssText(text: java.lang.String): scala.Unit = js.native
  /**
    * 设置Webview窗口的收藏参数
    * 仅在流应用环境（流应用/5+浏览器）中有效：用户点击流应用环境的收藏按钮时使用的参数，如设置收藏页面标题，图标、页面地址等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setFavoriteOptions(): scala.Unit = js.native
  def setFavoriteOptions(options: PlusWebviewWebviewFavoriteOptions): scala.Unit = js.native
  /**
    * 设置Webview窗口底部修复区域高度
    * 如果Webview加载页面中存在底部停靠区域（如“蘑菇街”WAP页面的底部Tab栏），在页面滚动时动态改变Webview高度可能会出现底部停靠区域抖动的现象（如360浏览器中向上滑顶部标题栏自动消失引起Webview变高）。
    * 	此时可以调用此方法来指定底部停靠区域（通常是底部Tab栏）进行优化修复抖动效果，高度值为底部停靠区域的高度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setFixBottom(): scala.Unit = js.native
  def setFixBottom(height: scala.Double): scala.Unit = js.native
  /**
    * 设置预加载的JS文件
    * 预加载JS文件不需要在HTML页面中显式引用，在Webview窗口加载HTML页面时自动加载，在页面跳转时也会自动加载。
    * 	设置新的JS文件后将清空之前设置的值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setJsFile(): scala.Unit = js.native
  def setJsFile(file: java.lang.String): scala.Unit = js.native
  /**
    * 设置Webview窗口的下拉刷新效果
    * 开启Webview窗口的下拉刷新功能，显示窗口内置的下拉刷新控件样式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setPullToRefresh(): scala.Unit = js.native
  def setPullToRefresh(style: PlusWebviewWebviewPullToRefreshStyles): scala.Unit = js.native
  def setPullToRefresh(style: PlusWebviewWebviewPullToRefreshStyles, refreshCB: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 设置Webview窗口rendered事件参数
    * 可设置页面渲染完成的判断标准，如判断页面顶部区域、中间区域、或底部区域。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setRenderedEventOptions(): scala.Unit = js.native
  def setRenderedEventOptions(options: PlusWebviewWebviewRenderedEventOptions): scala.Unit = js.native
  /**
    * 设置Webview窗口的分享参数
    * 仅在流应用环境（流应用/5+浏览器）中有效：用户点击流应用环境的分享按钮时使用的参数，如设置分享的标题、链接地址等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setShareOptions(): scala.Unit = js.native
  def setShareOptions(options: PlusWebviewWebviewShareOptions): scala.Unit = js.native
  /**
    * 设置Webview窗口的样式
    * 更新Webview窗口的样式，如窗口位置、大小、背景色等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setStyle(): scala.Unit = js.native
  def setStyle(styles: PlusWebviewWebviewStyles): scala.Unit = js.native
  /**
    * 设置标题栏上按钮的角标
    * 仅在窗口使用原生标题栏（titleNView）时生效，未显示原生标题栏时操作此接口无任何效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setTitleNViewButtonBadge(): scala.Unit = js.native
  def setTitleNViewButtonBadge(index: scala.Double): scala.Unit = js.native
  def setTitleNViewButtonBadge(index: scala.Double, text: java.lang.String): scala.Unit = js.native
  /**
    * 设置Webview窗口是否可见
    * 修改窗口是否可见并不影响窗口的显示栈顺序，窗口显示与隐藏也不会有动画效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def setVisible(): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  /**
    * 显示Webview窗口
    * 当调用plus.webview.create方法创建Webview窗口后，需要调用其show方法才能显示，并可设置窗口显示动画及动画时间。
    * 	Webview窗口被隐藏后也可调用此方法来重新显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def show(): scala.Unit = js.native
  def show(aniShow: PlusWebviewAnimationTypeShow): scala.Unit = js.native
  def show(aniShow: PlusWebviewAnimationTypeShow, duration: scala.Double): scala.Unit = js.native
  def show(aniShow: PlusWebviewAnimationTypeShow, duration: scala.Double, showedCB: js.Function0[scala.Unit]): scala.Unit = js.native
  def show(
    aniShow: PlusWebviewAnimationTypeShow,
    duration: scala.Double,
    showedCB: js.Function0[scala.Unit],
    extras: PlusWebviewWebviewExtraOptions
  ): scala.Unit = js.native
  /**
    * 在指定Webview窗口后显示
    * 当调用plus.webview.create方法创建Webview窗口后，可调用其showBehind方法显示在指定Webview窗口之后。
    * 	这种显示方式不会出现动画效果，当指定的Webview窗口关闭后，则自身窗口自动显示出来。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def showBehind(): scala.Unit = js.native
  def showBehind(webview: PlusWebviewWebviewObject): scala.Unit = js.native
  /**
    * 设置标题栏上按钮的红点
    * 仅在窗口使用原生标题栏（titleNView）时生效，未显示原生标题栏时操作此接口无任何效果。
    * 	注意：设置显示按钮的角标后红点不显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def showTitleNViewButtonRedDot(): scala.Unit = js.native
  def showTitleNViewButtonRedDot(index: scala.Double): scala.Unit = js.native
  /**
    * 停止加载HTML页面内容
    * 触发Webview窗口停止加载页面内容，如果已经加载部分内容则显示部分内容，如果加载完成则显示全部内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def stop(): scala.Unit = js.native
  /**
    * 更新Webview窗口的原生子View控件对象
    * 通过WebviewSubNViewStyles中的id属性值匹配子View控件更新绘制内容，如果没有查找到对应id的子View控件则忽略。
    * 	此操作仅更新子View控件上绘制的内容，不会添加或删除原生子View控件对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def updateSubNViews(): scala.Unit = js.native
  def updateSubNViews(styles: js.Array[PlusWebview]): scala.Unit = js.native
}

