package typings.html5plus

import typings.html5plus.html5plusStrings.UIWebview
import typings.html5plus.html5plusStrings.WKWebview
import typings.html5plus.html5plusStrings.absolute
import typings.html5plus.html5plusStrings.adjustPan
import typings.html5plus.html5plusStrings.adjustResize
import typings.html5plus.html5plusStrings.all
import typings.html5plus.html5plusStrings.always
import typings.html5plus.html5plusStrings.bottom
import typings.html5plus.html5plusStrings.cacheElseNetwork
import typings.html5plus.html5plusStrings.cacheOnly
import typings.html5plus.html5plusStrings.close
import typings.html5plus.html5plusStrings.default
import typings.html5plus.html5plusStrings.dock
import typings.html5plus.html5plusStrings.hide
import typings.html5plus.html5plusStrings.horizontal
import typings.html5plus.html5plusStrings.left
import typings.html5plus.html5plusStrings.noCache
import typings.html5plus.html5plusStrings.none
import typings.html5plus.html5plusStrings.onscreen
import typings.html5plus.html5plusStrings.right
import typings.html5plus.html5plusStrings.static
import typings.html5plus.html5plusStrings.top
import typings.html5plus.html5plusStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，Webview窗口对象的样式
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewStyles extends js.Object {
  /**
    * 窗口加载页面时额外添加的HTTP请求头数据
    * 仅在Webview窗口第一次加载页面时使用，如用户点击的触发的链接跳转则不再添加此额外请求头数据。
    * 	如果Webview窗口非第一次加载页面时也需要额外添加HTTP请求头数据，可通过loadURL()方法的参数设置。
    * 	如果HTTP请求头中已经包含需要额外添加的头数据，则添加的请求数据覆盖默认值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var additionalHttpHeaders: js.UndefOr[js.Any] = js.undefined
  /**
    * 窗口动画优化方式
    * 可取值：
    * 		"auto" - 如果窗口中存在titleNView或subNViews，窗口动画时真实Webview控件从动画窗口中移除加速（避免真实Webview渲染影响动画效率）；
    * 		"none" - 窗口动画不使用优化。
    * 	默认值为"auto"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var animationOptimization: js.UndefOr[String] = js.undefined
  /**
    * Webview窗口自动处理返回键逻辑
    * 当Webview窗口在显示栈顶，并且Webview窗口中没有调用JS监听返回键（plus.key.addEventListener('backbutton',...)）时按下返回键响应行为。
    * 	可取值：
    * 		"hide" - 隐藏Webview窗口，隐藏动画与上一次调用显示时设置的动画类型相对应（如“slide-in-right”对应的关闭动画为“slid-out-right”）；
    * 		"close" - 关闭Webview窗口，关闭动画与上一次调用显示时设置的动画类型相对应（如“slide-in-right”对应的关闭动画为“slid-out-right”） ；
    * 		"none" - 不做操作，将返回键传递给下一Webview窗口处理；
    * 		"quit" - 退出应用。
    * - hide: 
    * 	隐藏Webview窗口，隐藏动画与上一次调用显示时设置的动画类型相对应（如“slide-in-right”对应的关闭动画为“slid-out-right”）。
    * 								
    * - close: 
    * 	关闭Webview窗口，关闭动画与上一次调用显示时设置的动画类型相对应（如“slide-in-right”对应的关闭动画为“slid-out-right”）。
    * 								
    * - none: 
    * 	不做操作，将返回键传递给下一Webview窗口处理。
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var backButtonAutoControl: js.UndefOr[hide | close | none] = js.undefined
  /**
    * 窗口的背景颜色
    * 窗口空白区域的背景模式，设置background为颜色值(参考CSS Color Names，可取值/十六进制值/rgb值/rgba值)，窗口为独占模式显示（占整个屏幕区域）；
    * 	设置background为“transparent”，则表示窗口背景透明，为非独占模式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var background: js.UndefOr[String] = js.undefined
  /**
    * 窗口底部背景颜色
    * 窗口内容滚动到底部上拉时可见。
    * 	可取值：
    * 		"#RRGGBB"格式字符串，如"#FF0000"表示红色；
    * 		"rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    * 	默认值为透明。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var backgroundColorBottom: js.UndefOr[String] = js.undefined
  /**
    * 窗口顶部背景颜色值
    * 窗口内容滚动到顶部下拉时可见。
    * 	可取值：
    * 		"#RRGGBB"格式字符串，如"#FF0000"表示红色；
    * 		"rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    * 	默认值为透明。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var backgroundColorTop: js.UndefOr[String] = js.undefined
  /**
    * 是否阻塞网络图片的加载
    * 布尔类型，true表示阻塞，false表示不阻塞，默认值为false。
    * 	阻塞后Webview窗口将不加载页面中使用的所有网络图片，可通过Webview窗口对象的setBlockNetWorkImage()方法动态修改此状态。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var blockNetworkImage: js.UndefOr[Boolean] = js.undefined
  /**
    * 窗口垂直向上的偏移量
    * 支持百分比、像素值，默认值无值（根据top和height属性值来自动计算）。
    * 	当同时设置了top和height值时，忽略此属性值；
    * 	当未设置height值时，可通过top和bottom属性值来确定窗口的高度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var bottom: js.UndefOr[String] = js.undefined
  /**
    * 窗口遇到边框是否有反弹效果
    * 可取值：
    * 		"none" - 表示没有反弹效果；
    * 		"vertical" - 表示垂直方向有反弹效果；
    * 		"horizontal" - 表示水平方向有反弹效果；
    * 		"all" - 表示垂直和水平方向都有反弹效果。
    * 	默认值为"none"。
    * - none: 没有反弹效果
    * - vertical: 垂直方向有反弹效果
    * - horizontal: 水平方向有反弹效果
    * - all: 垂直和水平方向都有反弹效果
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var bounce: js.UndefOr[none | vertical | horizontal | all] = js.undefined
  /**
    * 窗口回弹效果区域的背景
    * 窗口回弹效果区域背景可支持颜色值或图片：
    * 		颜色值格式为"#RRGGBB"，如"#FFFFFF"为设置白色背景；
    * 		背景图为"url(%image path%)"，如"url(./icon.png)"为设置icon.png为背景图，图片采用平铺模式绘制。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var bounceBackground: js.UndefOr[String] = js.undefined
  /**
    * 窗口的缓存模式
    * 可取值：
    * 	"default" - 根据cache-control决定是否使用缓存数据，如果存在缓存并且没有过期则使用本地缓存资源，否则从网络获取；
    * 	"cacheElseNetwork" - 只要存在缓存（即使过期）数据则使用，否则从网络获取；
    * 	"noCache" - 不使用缓存数据，全部从网络获取；
    * 	"cacheOnly" - 仅使用缓存数据，不从网络获取（注：如果没有缓存数据则会导致加载失败）。
    * 	默认使用"default"。
    * - default: 
    * 	根据cache-control决定是否使用缓存数据，如果存在缓存并且没有过期则使用本地缓存资源，否则从网络获取。
    * 								
    * - cacheElseNetwork: 
    * 	只要存在缓存（即使过期）数据则使用，否则从网络获取。
    * 								
    * - noCache: 
    * 	不使用缓存数据，全部从网络获取。
    * 								
    * - cacheOnly: 
    * 	仅使用缓存数据，不从网络获取（注：如果没有缓存数据则会导致加载失败）。
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var cachemode: js.UndefOr[default | cacheElseNetwork | noCache | cacheOnly] = js.undefined
  /**
    * 窗口内容停止滑动的减速度
    * 当Webview加载的内容超过其高度时，可以拖拽滑动内容，decelerationRate属性控制手指松开后页面滑动的速度。
    * 	设置值越大手指松开后的滑动速度越快（滑动距离越长），其值域范围为0.0-1.0，默认值为0.989。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var decelerationRate: js.UndefOr[Double] = js.undefined
  /**
    * 窗口的停靠方式
    * 当Webview窗口添加到另外一个窗口中时，停靠方式才会生效，采用停靠方式添加会导致原Webview窗口自动调整其大小避免其内容被子窗口盖住。
    * 	可取值："top"，控件停靠则页面顶部；"bottom"，控件停靠在页面底部；"right"，控件停靠在页面右侧；"left"，控件停靠在页面左侧。
    * 	默认值为"bottom"。
    * - top: 控件停靠则页面顶部
    * - bottom: 控件停靠在页面底部
    * - right: 控件停靠在页面右侧
    * - left: 控件停靠在页面左侧
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var dock: js.UndefOr[top | bottom | right | left] = js.undefined
  /**
    * 窗口加载错误时跳转的页面地址
    * 当Webview窗口无法加载指定的url地址时（如本地页面不存在，或者无法访问的网络地址），此时会自动跳转到指定的错误页面地址（仅支持本地页面地址）。
    * 	设置为“none”则关闭跳转到错误页面功能，此时页面显示Webview默认的错误页面内容。默认使用5+ Runtime内置的错误页面。
    * - none: 关闭加载页面错误自动跳转功能
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var errorPage: js.UndefOr[none] = js.undefined
  /**
    * 窗口是否开启硬件加速
    * 布尔类型，true表示开启硬件加速，false表示不开启硬件加速，默认情况5+ Runtime会根据设备实际支持情况自动选择是否开启硬件加速，可以通过plus.webview.defaultHardwareAccelerated()方法获取默认Webview是否开启硬件加速。
    * 	由于不同设备对硬件加速的支持情况存在差异，开启硬件加速能加速HTML页面的渲染，但也会消耗更多的系统资源，从而导致在部分设备上可能出现闪屏、发虚、分块渲染等问题，因此在特定设备的特定页面如果出现以上问题需要手动设置关闭硬件加速来避免。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
  /**
    * 窗口的高度
    * 支持百分比、像素值，默认为100%。
    * 	当未设置height属性值时，优先通过top和bottom属性值来计算窗口的高度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * 窗口使用的内核
    * 可取值：
    * 	"WKWebview" - 在iOS8.0及以上系统使用WKWebview内核，低版本下仍然使用UIWebview内核；
    *     "UIWebview" - 在所有版本上都使用UIWebview内核。
    *     默认值为"UIWebview"。
    *     WKWebview内核的优势是：
    * 		1. 滚动时懒加载的图片也可以实时渲染，UIWebview在滚动停止后才能渲染；
    * 		2. WKWebview的video支持AirPlay。
    * 	但WKWebview也有些限制和不足，目前已知的问题有：
    * 		1. 不支持跨域设置cookie，即plus.navigator.setCookie()API无法使用；
    * 		2. 本地的HTML页面中的XHR不支持跨域访问，需使用plus.net.XMLHttpRequest来替换；
    * 		3. 不支持使用WebSQL，需使用indexDB来替换；
    * 		4. 不支持js原生混淆功能，需使用前端js混淆来替换；
    * 		5. 内存不足时会白屏。
    * 	首页的Webview的kernel在manifest中配置（plus-&gt;kernel-&gt;ios）。
    * - WKWebview: 
    * 	使用"WKWebview"内核。
    * 								
    * - UIWebview: 
    * 	使用"UIWebview"内核。
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var kernel: js.UndefOr[WKWebview | UIWebview] = js.undefined
  /**
    * 窗口水平向右的偏移量
    * 支持百分比、像素值，默认值为0px。
    * 	未设置left属性值时，优先通过right和width属性值来计算窗口的left位置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var left: js.UndefOr[String] = js.undefined
  /**
    * 窗口的边距
    * 用于定位窗口的位置，支持auto，auto表示居中。若设置了left、right、top、bottom则对应的边距值失效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var margin: js.UndefOr[String] = js.undefined
  /**
    * 窗口的遮罩
    * 用于设置Webview窗口的遮罩层样式，遮罩层会覆盖Webview中所有内容，包括子webview，并且截获webview的所有触屏事件，此时Webview窗口的点击操作会触发maskClick事件。
    * 	字符串类型，可取值：
    * 	rgba格式字符串，定义纯色遮罩层样式，如"rgba(0,0,0,0.5)"，表示黑色半透明；
    * 	"none"，表示不使用遮罩层；
    * 	默认值为"none"，即无遮罩层。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var mask: js.UndefOr[String] = js.undefined
  /**
    * 窗口的不透明度
    * 0为全透明，1为不透明，默认值为1，即不透明。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * 控制Webview注入5+ API时机
    * 可取值：
    *         "ahead" - 尽量提前，拦截页面中网络js请求实现提前注入，如果没有拦截到js请求则在页面loaded时注入；
    *         "normal" - 页面loaded时注入；
    *         "later" - 较晚在注入，在loaded事件发生后2s再注入，plusready事件同样延迟；
    *         "none" - 不注入，页面无法调用5+ API，不触发plusready事件。
    *         默认值为"normal"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var plusrequire: js.UndefOr[String] = js.undefined
  /**
    * 窗口的侧滑返回功能
    * 可取值：
    * 		"none"-无侧滑返回功能；
    * 		"close"-侧滑返回关闭Webview窗口；
    * 		"hide"-侧滑返回隐藏webview窗口。
    * - none: 无侧滑返回功能
    * - close: 侧滑返回关闭Webview窗口
    * - hide: 侧滑返回隐藏webview窗口
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var popGesture: js.UndefOr[none | close | hide] = js.undefined
  /**
    * Webview窗口的排版位置
    * 当Webview窗口添加到另外一个窗口中时，排版位置才会生效，排版位置决定子窗口在父窗口中的定位方式。
    * 	可取值："static"，控件在页面中正常定位，如果页面存在滚动条则随窗口内容滚动；"absolute"，控件在页面中绝对定位，如果页面存在滚动条不随窗口内容滚动；"dock"，控件在页面中停靠，停靠的位置由dock属性值决定。
    * 	默认值为"absolute"。
    * - static: 控件在页面中正常定位，如果页面存在滚动条则随窗口内容滚动
    * - absolute: 控件在页面中绝对定位，如果页面存在滚动条不随窗口内容滚动
    * - dock: 控件在页面中停靠，停靠的位置由dock属性值决定
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var position: js.UndefOr[static | absolute | dock] = js.undefined
  /**
    * 窗口的进度条样式
    * 设置此属性则在Webview窗口的顶部显示进度条，可配置进度条颜色及高度。
    * 	设置此属性值为undefined或null则隐藏进度条。
    * 	默认不显示进度条。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var progress: js.UndefOr[PlusWebviewWebviewProgressStyles] = js.undefined
  /**
    * 窗口下拉刷新配置
    * 设置窗口是否开启下拉刷新功能及样式。
    * 	开启下拉刷新后可通过监听窗口的"pullToRefresh"事件处理下拉刷新业务逻辑，更新操作完成后调用窗口的endPullToRefresh方法结束下拉刷新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var pullToRefresh: js.UndefOr[PlusWebviewWebviewPullToRefreshStyles] = js.undefined
  /**
    * 窗口渲染模式
    * 支持以下属性值：
    * 		"onscreen" - Webview窗口在屏幕区可见时渲染，不可见时不进行渲染，此时能减少内存使用量；
    * 		"always" - Webview在任何时候都渲染，在内存较大的设备上使用，被遮挡的窗口在此中模式下显示的时候会有更流畅的效果。
    * 	默认值为"onscreen"。
    * 	仅Android平台支持。
    * - onscreen: Webview窗口在屏幕区可见时渲染，不可见时不进行渲染，此时能减少内存使用量
    * - always: Webview在任何时候都渲染，在内存较大的设备上使用，被遮挡的窗口在此中模式下显示的时候会有更流畅的效果
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var render: js.UndefOr[onscreen | always] = js.undefined
  /**
    * 替换H5标准API
    * 用于解决在部分设备上调用H5标准定位接口可能无法获取定位数据的问题。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var replacewebapi: js.UndefOr[PlusWebviewWebviewReplaceWebApiOptions] = js.undefined
  /**
    * 窗口水平向左的偏移量
    * 支持百分比、像素值，默认无值（根据left和width属性值来自动计算）。
    * 	当设置了left和width值时，忽略此属性值；
    * 	当未设置width值时，可通过left和bottom属性值来确定窗口的宽度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var right: js.UndefOr[String] = js.undefined
  /**
    * 窗口是否可缩放
    * 窗口设置为可缩放（scalable:true）时，用户可通过双指操作放大或缩小页面，此时html页面可通过meta节点设置“name="viewport" content="user-scalable=no"”来限制页面不可缩放。
    * 	窗口设置为不可缩放（scalable:false）时，用户不可通过双指操作放大或缩小页面，即使页面中的meta节点也无法开启可缩放功能。
    * 	默认值为false，即不可缩放。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var scalable: js.UndefOr[Boolean] = js.undefined
  /**
    * 窗口是否显示滚动条
    * 用于控制窗口滚动条样式，可取值：
    * 	"all"：垂直和水平滚动条都显示；
    * 	"vertical"：仅显示垂直滚动条；
    * 	"horizontal"：仅显示水平滚动条；
    * 	"none"：垂直和水平滚动条都不显示。
    * 	默认值为"all"，即垂直和水平滚动条都显示。
    * 	注意：显示滚动条的前提条件是窗口中的内容超过窗口显示的宽或高。
    * - all: 垂直和水平滚动条都显示
    * - vertical: 仅显示垂直滚动条
    * - horizontal: 仅显示水平滚动条
    * - none: 垂直和水平滚动条都不显示
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var scrollIndicator: js.UndefOr[all | vertical | horizontal | none] = js.undefined
  /**
    * 点击设备的状态栏时是否滚动返回至顶部
    * true表示点击设备的状态栏可以滚动返回至顶部，false表示点击设备的状态栏不可以，默认值为true。
    * 	此功能仅iOS平台支持，在iPhone上有且只有一个Webview窗口的scrollsToTop属性值为true时才生效，所以在显示和关闭Webview窗口时需动态更新所有Webview的scrollsToTop值，已确保此功能生效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var scrollsToTop: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否可分享窗口加载的链接地址
    * 在流应用环境（流应用/5+浏览器）中可通过分享按钮分享页面链接地址，
    * 	可取值：
    * 		true - 可分享窗口加载页面链接地址；
    * 		false - 不可分享窗口加载的页面链接地址，此时分享的是应用。
    * 	默认值值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var shareable: js.UndefOr[Boolean] = js.undefined
  /**
    * 弹出系统软键盘模式
    * 可选值：“adjustPan”- 弹出软键盘时Webview窗口自动上移，以保证当前输入框可见；“adjustResize”- 自动调整Webview窗口大小（屏幕区域减去软键盘区域），同时自动滚动Webview保证输入框可见。
    * 	默认值为“adjustPan”。
    * - adjustPan: 弹出软键盘时Webview窗口自动上移，以保证当前输入框可见
    * - adjustResize: 自动调整Webview窗口大小（屏幕区域减去软键盘区域），同时自动滚动Webview保证输入框可见
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var softinputMode: js.UndefOr[adjustPan | adjustResize] = js.undefined
  /**
    * 窗口状态栏样式
    * 仅在应用设置为沉浸式状态栏样式下有效，设置此属性后将自动保留系统状态栏区域不被Webview窗口占用（即Webview窗口非沉浸式样式显示）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var statusbar: js.UndefOr[PlusWebviewWebviewStatusbarStyles] = js.undefined
  /**
    * 定义窗口的原生子View控件
    * 数组类型，可通过配置项设置原生子View控件，每个配置项对应添加一个原生子View控件。
    * 	通过Webview窗口的getSubNViews()方法可获取原生子View控件对象数组。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var subNViews: js.UndefOr[js.Array[PlusWebview]] = js.undefined
  /**
    * 定义窗口的标题栏控件样式
    * 设置此属性值则表明创建Webview窗口的标题栏控件，并可通过其属性值设置背景颜色、文本内容、文本颜色等。
    * 	通过Webview窗口的getTitleNView()方法可获取标题栏控件对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var titleNView: js.UndefOr[PlusWebviewWebviewTitleNViewStyles] = js.undefined
  /**
    * 窗口垂直向下的偏移量
    * 支持百分比、像素值，默认值为0px。
    * 	未设置top属性值时，优先通过bottom和height属性值来计算窗口的top位置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var top: js.UndefOr[String] = js.undefined
  /**
    * 窗口定义窗口变形效果
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var transform: js.UndefOr[PlusWebviewWebviewTransform] = js.undefined
  /**
    * 窗口定义窗口变换的动画效果
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var transition: js.UndefOr[PlusWebviewWebviewTransition] = js.undefined
  /**
    * 用户是否可选择内容
    * 可取值：
    * 	true - 表示可选择内容，用户可通过长按来选择页面内容，如文本内容选择后可以弹出系统复制粘贴菜单；
    * 	false - 表示不可选择内容，用户不可通过长按来选择页面内容。
    * 	默认值为true。
    * 	注意：在Web页面中可通过CSS的user-select对单个页面元素进行控制，前提是Webview对象的userSelect设置为true，否则CSS设置的user-select失效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var userSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * 视频全屏播放时的显示方向
    * 可取值：
    * 	"auto": 自动适配，如果当前页面竖屏，则竖屏显示；如果当前页面横盘显示，则横屏；如果当前页面自动感应，则自动感应横竖屏切换。
    * 	"portrait-primary": 竖屏正方向； 
    * 	"portrait-secondary": 竖屏反方向，屏幕正方向按顺时针旋转180°； 
    * 	"landscape-primary": 横屏正方向，屏幕正方向按顺时针旋转90°； 
    * 	"landscape-secondary": 横屏方向，屏幕正方向按顺时针旋转270°； 
    * 	"landscape": 横屏正方向或反方向，根据设备重力感应器自动调整；
    * 	默认值为“auto”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var videoFullscreen: js.UndefOr[String] = js.undefined
  /**
    * 窗口的宽度
    * 支持百分比、像素值，默认为100%。未设置width属性值时，可同时设置left和right属性值改变窗口的默认宽度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var width: js.UndefOr[String] = js.undefined
  /**
    * 窗口的堆叠顺序值
    * 拥有更高堆叠顺序的窗口总是会处于堆叠顺序较低的窗口的前面，拥有相同堆叠顺序的窗口后调用show方法则在前面。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var zindex: js.UndefOr[Double] = js.undefined
}

object PlusWebviewWebviewStyles {
  @scala.inline
  def apply(
    additionalHttpHeaders: js.Any = null,
    animationOptimization: String = null,
    backButtonAutoControl: hide | close | none = null,
    background: String = null,
    backgroundColorBottom: String = null,
    backgroundColorTop: String = null,
    blockNetworkImage: js.UndefOr[Boolean] = js.undefined,
    bottom: String = null,
    bounce: none | vertical | horizontal | all = null,
    bounceBackground: String = null,
    cachemode: default | cacheElseNetwork | noCache | cacheOnly = null,
    decelerationRate: Int | Double = null,
    dock: top | bottom | right | left = null,
    errorPage: none = null,
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    height: String = null,
    kernel: WKWebview | UIWebview = null,
    left: String = null,
    margin: String = null,
    mask: String = null,
    opacity: Int | Double = null,
    plusrequire: String = null,
    popGesture: none | close | hide = null,
    position: static | absolute | dock = null,
    progress: PlusWebviewWebviewProgressStyles = null,
    pullToRefresh: PlusWebviewWebviewPullToRefreshStyles = null,
    render: onscreen | always = null,
    replacewebapi: PlusWebviewWebviewReplaceWebApiOptions = null,
    right: String = null,
    scalable: js.UndefOr[Boolean] = js.undefined,
    scrollIndicator: all | vertical | horizontal | none = null,
    scrollsToTop: js.UndefOr[Boolean] = js.undefined,
    shareable: js.UndefOr[Boolean] = js.undefined,
    softinputMode: adjustPan | adjustResize = null,
    statusbar: PlusWebviewWebviewStatusbarStyles = null,
    subNViews: js.Array[PlusWebview] = null,
    titleNView: PlusWebviewWebviewTitleNViewStyles = null,
    top: String = null,
    transform: PlusWebviewWebviewTransform = null,
    transition: PlusWebviewWebviewTransition = null,
    userSelect: js.UndefOr[Boolean] = js.undefined,
    videoFullscreen: String = null,
    width: String = null,
    zindex: Int | Double = null
  ): PlusWebviewWebviewStyles = {
    val __obj = js.Dynamic.literal()
    if (additionalHttpHeaders != null) __obj.updateDynamic("additionalHttpHeaders")(additionalHttpHeaders)
    if (animationOptimization != null) __obj.updateDynamic("animationOptimization")(animationOptimization)
    if (backButtonAutoControl != null) __obj.updateDynamic("backButtonAutoControl")(backButtonAutoControl.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background)
    if (backgroundColorBottom != null) __obj.updateDynamic("backgroundColorBottom")(backgroundColorBottom)
    if (backgroundColorTop != null) __obj.updateDynamic("backgroundColorTop")(backgroundColorTop)
    if (!js.isUndefined(blockNetworkImage)) __obj.updateDynamic("blockNetworkImage")(blockNetworkImage)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (bounce != null) __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    if (bounceBackground != null) __obj.updateDynamic("bounceBackground")(bounceBackground)
    if (cachemode != null) __obj.updateDynamic("cachemode")(cachemode.asInstanceOf[js.Any])
    if (decelerationRate != null) __obj.updateDynamic("decelerationRate")(decelerationRate.asInstanceOf[js.Any])
    if (dock != null) __obj.updateDynamic("dock")(dock.asInstanceOf[js.Any])
    if (errorPage != null) __obj.updateDynamic("errorPage")(errorPage)
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated)
    if (height != null) __obj.updateDynamic("height")(height)
    if (kernel != null) __obj.updateDynamic("kernel")(kernel.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (plusrequire != null) __obj.updateDynamic("plusrequire")(plusrequire)
    if (popGesture != null) __obj.updateDynamic("popGesture")(popGesture.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (pullToRefresh != null) __obj.updateDynamic("pullToRefresh")(pullToRefresh)
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (replacewebapi != null) __obj.updateDynamic("replacewebapi")(replacewebapi)
    if (right != null) __obj.updateDynamic("right")(right)
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable)
    if (scrollIndicator != null) __obj.updateDynamic("scrollIndicator")(scrollIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollsToTop)) __obj.updateDynamic("scrollsToTop")(scrollsToTop)
    if (!js.isUndefined(shareable)) __obj.updateDynamic("shareable")(shareable)
    if (softinputMode != null) __obj.updateDynamic("softinputMode")(softinputMode.asInstanceOf[js.Any])
    if (statusbar != null) __obj.updateDynamic("statusbar")(statusbar)
    if (subNViews != null) __obj.updateDynamic("subNViews")(subNViews)
    if (titleNView != null) __obj.updateDynamic("titleNView")(titleNView)
    if (top != null) __obj.updateDynamic("top")(top)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (!js.isUndefined(userSelect)) __obj.updateDynamic("userSelect")(userSelect)
    if (videoFullscreen != null) __obj.updateDynamic("videoFullscreen")(videoFullscreen)
    if (width != null) __obj.updateDynamic("width")(width)
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWebviewWebviewStyles]
  }
}

