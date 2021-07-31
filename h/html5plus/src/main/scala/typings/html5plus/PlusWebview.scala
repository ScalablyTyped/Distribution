package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Webview模块管理应用窗口界面，实现多窗口的逻辑控制管理操作。通过plus.webview可获取应用界面管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebview extends StObject {
  
  /**
    * 一组用于定义页面或控件关闭的动画效果
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var AnimationTypeClose: js.UndefOr[PlusWebviewAnimationTypeClose] = js.native
  
  /**
    * 一组用于定义页面或控件显示动画效果
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var AnimationTypeShow: js.UndefOr[PlusWebviewAnimationTypeShow] = js.native
  
  /**
    * Webview窗口动画参数
    * 用于指定动画目标窗口，起始位置、目标位置等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewAnimationOptions: js.UndefOr[PlusWebviewWebviewAnimationOptions] = js.native
  
  /**
    * Webview窗口动画样式
    * 用于指定动画窗口的起始位置、目标位置等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewAnimationStyles: js.UndefOr[PlusWebviewWebviewAnimationStyles] = js.native
  
  /**
    * Webview窗口回弹样式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewBounceStyle: js.UndefOr[PlusWebviewWebviewBounceStyle] = js.native
  
  /**
    * Webview窗口内容动画参数
    * 指定动画的类型、持续时间等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewContentAnimationOptions: js.UndefOr[PlusWebviewWebviewContentAnimationOptions] = js.native
  
  /**
    * 原生控件在窗口中停靠的方式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewDock: js.UndefOr[PlusWebviewWebviewDock] = js.native
  
  /**
    * Webview窗口滑动事件数据
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewDragEvent: js.UndefOr[PlusWebviewWebviewDragEvent] = js.native
  
  /**
    * 窗口手势操作参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewDragOptions: js.UndefOr[PlusWebviewWebviewDragOptions] = js.native
  
  /**
    * 手势操作关联对象参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewDragOtherViewOptions: js.UndefOr[PlusWebviewWebviewDragOtherViewOptions] = js.native
  
  /**
    * 截屏绘制操作参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewDrawOptions: js.UndefOr[PlusWebviewWebviewDrawOptions] = js.native
  
  /**
    * Webview窗口事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewEvent: js.UndefOr[PlusWebviewWebviewEvent] = js.native
  
  /**
    * JSON对象，原生窗口扩展参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewExtraOptions: js.UndefOr[PlusWebviewWebviewExtraOptions] = js.native
  
  /**
    * 窗口收藏参数
    * 在流应用环境中调用收藏功能时使用的参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewFavoriteOptions: js.UndefOr[PlusWebviewWebviewFavoriteOptions] = js.native
  
  /**
    * 监听Webview窗口资源加载的属性
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewListenResourceOptions: js.UndefOr[PlusWebviewWebviewListenResourceOptions] = js.native
  
  /**
    * 创建加载HTML数据参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewLoadDataOptions: js.UndefOr[PlusWebviewWebviewLoadDataOptions] = js.native
  
  /**
    * Webview窗口对象，用于操作加载HTML页面的窗口
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewObject: js.UndefOr[PlusWebviewWebviewObject] = js.native
  
  /**
    * 拦截Webview窗口资源请求的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewOverrideResourceOptions: js.UndefOr[PlusWebviewWebviewOverrideResourceOptions] = js.native
  
  /**
    * 拦截Webview窗口URL请求的属性
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewOverrideUrlOptions: js.UndefOr[PlusWebviewWebviewOverrideUrlOptions] = js.native
  
  /**
    * 原生控件在窗口中显示的位置
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewPosition: js.UndefOr[PlusWebviewWebviewPosition] = js.native
  
  /**
    * 标题栏控件的进度条样式
    * 显示在标题栏控件底部。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewProgressStyles: js.UndefOr[PlusWebviewWebviewProgressStyles] = js.native
  
  /**
    * Webview窗口下拉刷新样式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewPullToRefreshStyles: js.UndefOr[PlusWebviewWebviewPullToRefreshStyles] = js.native
  
  /**
    * Webview窗口rendered事件参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewRenderedEventOptions: js.UndefOr[PlusWebviewWebviewRenderedEventOptions] = js.native
  
  /**
    * 替换H5标准API配置信息
    * 目前仅支持替换H5标准定位接口
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewReplaceWebApiOptions: js.UndefOr[PlusWebviewWebviewReplaceWebApiOptions] = js.native
  
  /**
    * 窗口的分享参数
    * 在流应用环境中调用分享功能时使用的参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewShareOptions: js.UndefOr[PlusWebviewWebviewShareOptions] = js.native
  
  /**
    * 窗口标题栏控件的分割线样式
    * 显示在标题栏控件底部。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewSplitLineStyles: js.UndefOr[PlusWebviewWebviewSplitLineStyles] = js.native
  
  /**
    * JSON对象，Webview窗口的系统状态栏区域样式
    * 仅在应用设置为沉浸式状态栏样式下有效，非沉浸式状态栏样式下忽略此属性。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewStatusbarStyles: js.UndefOr[PlusWebviewWebviewStatusbarStyles] = js.native
  
  /**
    * JSON对象，Webview窗口对象的样式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewStyles: js.UndefOr[PlusWebviewWebviewStyles] = js.native
  
  /**
    * 窗口原生子View控件样式
    * 可设置原生控件的标识、大小、位置以及绘制的内容等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewSubNViewStyles: js.UndefOr[PlusWebviewWebviewSubNViewStyles] = js.native
  
  /**
    * 窗口标题栏自定义按钮样式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewTitleNViewButtonStyles: js.UndefOr[PlusWebviewWebviewTitleNViewButtonStyles] = js.native
  
  /**
    * 窗口标题栏控件样式
    * 标题栏控件固定高度为44px,可通过Webview窗口对象的getTitleNView方法获取标题栏原生控件对象动态绘制内容。
    *     可以通过WebviewObject对象的getTitleNView()获取标题栏的NView对象，然后调用其setStyle方法更新样式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewTitleNViewStyles: js.UndefOr[PlusWebviewWebviewTitleNViewStyles] = js.native
  
  /**
    * 一组用于定义页面或控件变形的属性
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewTransform: js.UndefOr[PlusWebviewWebviewTransform] = js.native
  
  /**
    * 一组用于定义页面或控件转换效果的属性
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var WebviewTransition: js.UndefOr[PlusWebviewWebviewTransition] = js.native
  
  /**
    * 获取所有Webview窗口
    * 获取应用中已创建的所有Webview窗口，包括所有未显示的Webview窗口。
    *     返回WebviewObject对象在数组中按创建的先后顺序排列，即数组中第一个WebviewObject对象用是加载应用的入口页面。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def all(): js.Array[PlusWebview] = js.native
  
  /**
    * 关闭Webview窗口
    * 关闭已经打开的Webview窗口，需先获取窗口对象或窗口id，并可指定关闭窗口的动画及动画持续时间。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def close(): Unit = js.native
  def close(id_wvobj: String): Unit = js.native
  def close(id_wvobj: String, aniClose: String): Unit = js.native
  def close(id_wvobj: String, aniClose: String, duration: Double): Unit = js.native
  def close(id_wvobj: String, aniClose: String, duration: Double, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def close(id_wvobj: String, aniClose: String, duration: Unit, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def close(id_wvobj: String, aniClose: Unit, duration: Double): Unit = js.native
  def close(id_wvobj: String, aniClose: Unit, duration: Double, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def close(id_wvobj: String, aniClose: Unit, duration: Unit, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def close(id_wvobj: Unit, aniClose: String): Unit = js.native
  def close(id_wvobj: Unit, aniClose: String, duration: Double): Unit = js.native
  def close(id_wvobj: Unit, aniClose: String, duration: Double, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def close(id_wvobj: Unit, aniClose: String, duration: Unit, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def close(id_wvobj: Unit, aniClose: Unit, duration: Double): Unit = js.native
  def close(id_wvobj: Unit, aniClose: Unit, duration: Double, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def close(id_wvobj: Unit, aniClose: Unit, duration: Unit, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  
  /**
    * 创建新的Webview窗口
    * 创建Webview窗口，用于加载新的HTML页面，可通过styles设置Webview窗口的样式，创建完成后需要调用show方法才能将Webview窗口显示出来。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def create(): PlusWebviewWebviewObject = js.native
  def create(url: String): PlusWebviewWebviewObject = js.native
  def create(url: String, id: String): PlusWebviewWebviewObject = js.native
  def create(url: String, id: String, styles: Unit, extras: js.Any): PlusWebviewWebviewObject = js.native
  def create(url: String, id: String, styles: PlusWebviewWebviewStyles): PlusWebviewWebviewObject = js.native
  def create(url: String, id: String, styles: PlusWebviewWebviewStyles, extras: js.Any): PlusWebviewWebviewObject = js.native
  def create(url: String, id: Unit, styles: Unit, extras: js.Any): PlusWebviewWebviewObject = js.native
  def create(url: String, id: Unit, styles: PlusWebviewWebviewStyles): PlusWebviewWebviewObject = js.native
  def create(url: String, id: Unit, styles: PlusWebviewWebviewStyles, extras: js.Any): PlusWebviewWebviewObject = js.native
  def create(url: Unit, id: String): PlusWebviewWebviewObject = js.native
  def create(url: Unit, id: String, styles: Unit, extras: js.Any): PlusWebviewWebviewObject = js.native
  def create(url: Unit, id: String, styles: PlusWebviewWebviewStyles): PlusWebviewWebviewObject = js.native
  def create(url: Unit, id: String, styles: PlusWebviewWebviewStyles, extras: js.Any): PlusWebviewWebviewObject = js.native
  def create(url: Unit, id: Unit, styles: Unit, extras: js.Any): PlusWebviewWebviewObject = js.native
  def create(url: Unit, id: Unit, styles: PlusWebviewWebviewStyles): PlusWebviewWebviewObject = js.native
  def create(url: Unit, id: Unit, styles: PlusWebviewWebviewStyles, extras: js.Any): PlusWebviewWebviewObject = js.native
  
  /**
    * 获取当前窗口的WebviewObject对象
    * 获取当前页面所属的Webview窗口对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def currentWebview(): PlusWebviewWebviewObject = js.native
  
  /**
    * 获取Webview默认是否开启硬件加速
    * 由于不同设备对硬件加速的支持情况存在差异，开启硬件加速能加速HTML页面的渲染，但也会消耗更多的系统资源，从而导致在部分设备上可能出现闪屏、发虚、分块渲染等问题，    因此5+ Runtime会根据设备实际支持情况自动选择是否开启硬件加速。
    *     关闭硬件加速则可能会导致Webview页面无法支持Video标签播放视频等问题，如果在特定情况下需要调整修改默认开启硬件加速的行为，则可通过plus.webview.defaultHardwareAccelerated()方法获取当前设备默认是否开启硬件加速状态，从而决定是否需要显式开启或关闭指定Webview的硬件加速功能（通过WebviewStyles的hardwareAccelerated属性设置）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def defaultHardwareAccelerated(): Boolean = js.native
  
  /**
    * 获取屏幕所有可视的Webview窗口
    * 仅在屏幕区域显示的Webview窗口，如果Webview窗口显示了但被其它Webview窗口盖住则认为不可视。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def getDisplayWebview(): js.Array[PlusWebview] = js.native
  
  /**
    * 获取应用首页WebviewObject窗口对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def getLaunchWebview(): PlusWebviewWebviewObject = js.native
  
  /**
    * 获取应用第二个首页WebviewObject窗口对象
    * 在双首页模式下（在manifest.json的plus-&gt;secondwebview节点下配置），应用会自动创建两个首页Webview，通过getLaunchWebview()可获取第一个首页窗口对象，通过getSecondWebview()可获取第二个首页窗口对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def getSecondWebview(): PlusWebviewWebviewObject = js.native
  
  /**
    * 获取应用显示栈顶的WebviewObject窗口对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def getTopWebview(): PlusWebviewWebviewObject = js.native
  
  /**
    * 查找指定标识的WebviewObject窗口
    * 在已创建的窗口列表中查找指定标识的Webview窗口并返回。
    *     若没有查找到指定标识的窗口则返回null，若存在多个相同标识的Webview窗口，则返回第一个创建的Webview窗口。
    *     如果要获取应用入口页面所属的Webview窗口，其标识为应用的%APPID%，可通过plus.runtime.appid获取。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def getWebviewById(): PlusWebviewWebviewObject = js.native
  def getWebviewById(id: String): PlusWebviewWebviewObject = js.native
  
  /**
    * 隐藏Webview窗口
    * 根据指定的WebviewObject对象或id隐藏Webview窗口，使得窗口不可见。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def hide(): Unit = js.native
  def hide(id_wvobj: String): Unit = js.native
  def hide(id_wvobj: String, aniHide: String): Unit = js.native
  def hide(id_wvobj: String, aniHide: String, duration: Double): Unit = js.native
  def hide(id_wvobj: String, aniHide: String, duration: Double, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def hide(id_wvobj: String, aniHide: String, duration: Unit, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def hide(id_wvobj: String, aniHide: Unit, duration: Double): Unit = js.native
  def hide(id_wvobj: String, aniHide: Unit, duration: Double, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def hide(id_wvobj: String, aniHide: Unit, duration: Unit, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def hide(id_wvobj: Unit, aniHide: String): Unit = js.native
  def hide(id_wvobj: Unit, aniHide: String, duration: Double): Unit = js.native
  def hide(id_wvobj: Unit, aniHide: String, duration: Double, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def hide(id_wvobj: Unit, aniHide: String, duration: Unit, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def hide(id_wvobj: Unit, aniHide: Unit, duration: Double): Unit = js.native
  def hide(id_wvobj: Unit, aniHide: Unit, duration: Double, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  def hide(id_wvobj: Unit, aniHide: Unit, duration: Unit, extras: PlusWebviewWebviewExtraOptions): Unit = js.native
  
  /**
    * 创建并打开Webview窗口
    * 创建并显示Webview窗口，用于加载新的HTML页面，可通过styles设置Webview窗口的样式，创建完成后自动将Webview窗口显示出来。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def open(
    url: js.UndefOr[String],
    id: js.UndefOr[String],
    styles: js.UndefOr[PlusWebviewWebviewStyles],
    aniShow: js.UndefOr[String],
    duration: js.UndefOr[Double],
    showedCB: js.UndefOr[js.Function0[Unit]]
  ): PlusWebviewWebviewObject = js.native
  
  /**
    * 预载网络页面
    * 预载网络页面会向服务器发起http/https请求获取html页面内容，
    *     待Webview窗口加载此url页面时会则根据缓存机制优先使用预载的页面内容(加快页面显示速度)。
    *     注意：预载网络页面仅在运行期生效，为了节省内存仅保留最后5个预载页面数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def prefetchURL(): Unit = js.native
  def prefetchURL(url: String): Unit = js.native
  
  /**
    * 预载网络页面（多个地址）
    * 预载网络页面会向服务器发起http/https请求获取html页面内容，
    *     待Webview窗口加载此url页面时会则根据缓存机制优先使用预载的页面内容(加快页面显示速度)。
    *     注意：预载网络页面仅在运行期生效，为了节省内存仅保留最后5个预载页面数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def prefetchURLs(): Unit = js.native
  def prefetchURLs(urls: js.Array[js.Any]): Unit = js.native
  
  /**
    * 显示Webview窗口
    * 显示已创建或隐藏的Webview窗口，需先获取窗口对象或窗口id，并可指定显示窗口的动画及动画持续时间。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def show(): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: String): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: String, aniShow: String): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: String, aniShow: String, duration: Double): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: String, aniShow: String, duration: Double, showedCB: js.Function0[Unit]): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: String,
    aniShow: String,
    duration: Double,
    showedCB: js.Function0[Unit],
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: String,
    aniShow: String,
    duration: Double,
    showedCB: Unit,
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: String, aniShow: String, duration: Unit, showedCB: js.Function0[Unit]): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: String,
    aniShow: String,
    duration: Unit,
    showedCB: js.Function0[Unit],
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: String,
    aniShow: String,
    duration: Unit,
    showedCB: Unit,
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: String, aniShow: Unit, duration: Double): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: String, aniShow: Unit, duration: Double, showedCB: js.Function0[Unit]): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: String,
    aniShow: Unit,
    duration: Double,
    showedCB: js.Function0[Unit],
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: String,
    aniShow: Unit,
    duration: Double,
    showedCB: Unit,
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: String, aniShow: Unit, duration: Unit, showedCB: js.Function0[Unit]): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: String,
    aniShow: Unit,
    duration: Unit,
    showedCB: js.Function0[Unit],
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: String,
    aniShow: Unit,
    duration: Unit,
    showedCB: Unit,
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: Unit, aniShow: String): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: Unit, aniShow: String, duration: Double): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: Unit, aniShow: String, duration: Double, showedCB: js.Function0[Unit]): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: Unit,
    aniShow: String,
    duration: Double,
    showedCB: js.Function0[Unit],
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: Unit,
    aniShow: String,
    duration: Double,
    showedCB: Unit,
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: Unit, aniShow: String, duration: Unit, showedCB: js.Function0[Unit]): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: Unit,
    aniShow: String,
    duration: Unit,
    showedCB: js.Function0[Unit],
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: Unit,
    aniShow: String,
    duration: Unit,
    showedCB: Unit,
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: Unit, aniShow: Unit, duration: Double): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: Unit, aniShow: Unit, duration: Double, showedCB: js.Function0[Unit]): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: Unit,
    aniShow: Unit,
    duration: Double,
    showedCB: js.Function0[Unit],
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: Unit,
    aniShow: Unit,
    duration: Double,
    showedCB: Unit,
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(id_wvobj: Unit, aniShow: Unit, duration: Unit, showedCB: js.Function0[Unit]): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: Unit,
    aniShow: Unit,
    duration: Unit,
    showedCB: js.Function0[Unit],
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  def show(
    id_wvobj: Unit,
    aniShow: Unit,
    duration: Unit,
    showedCB: Unit,
    extras: PlusWebviewWebviewExtraOptions
  ): PlusWebviewWebviewObject = js.native
  
  /**
    * Webview窗口组合动画
    * 同步组合两个Webview窗口动画，动画完成后窗口的位置会发生变化，一次需要在动画属性参数中设置动画起始位置、结束位置等。
    *     注意：此动画操作会改变窗口位置（如left值等），再次调用show方法时需要确保其位置是否在可视区域，如果不在可视区域则需要调用窗口的setStyle方法设置其位置到可视区域内，如setStyle({left:'0px'});。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  def startAnimation(): Unit = js.native
  def startAnimation(options: Unit, otherOptions: Unit, callback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def startAnimation(options: Unit, otherOptions: PlusWebviewWebviewAnimationOptions): Unit = js.native
  def startAnimation(
    options: Unit,
    otherOptions: PlusWebviewWebviewAnimationOptions,
    callback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def startAnimation(options: PlusWebviewWebviewAnimationOptions): Unit = js.native
  def startAnimation(
    options: PlusWebviewWebviewAnimationOptions,
    otherOptions: Unit,
    callback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def startAnimation(options: PlusWebviewWebviewAnimationOptions, otherOptions: PlusWebviewWebviewAnimationOptions): Unit = js.native
  def startAnimation(
    options: PlusWebviewWebviewAnimationOptions,
    otherOptions: PlusWebviewWebviewAnimationOptions,
    callback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
}
