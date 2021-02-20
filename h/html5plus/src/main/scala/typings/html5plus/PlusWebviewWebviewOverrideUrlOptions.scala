package typings.html5plus

import typings.html5plus.html5plusStrings._empty
import typings.html5plus.html5plusStrings.allow
import typings.html5plus.html5plusStrings.instant
import typings.html5plus.html5plusStrings.none
import typings.html5plus.html5plusStrings.redirect
import typings.html5plus.html5plusStrings.reject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 拦截Webview窗口URL请求的属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewOverrideUrlOptions extends StObject {
  
  /**
    * 拦截URL请求生效时机
    * 可取值：
    *         "instant" - 表示立即生效，即调用overrideUrlLoading方法后立即生效；
    *         "touchstart" - 表示用户操作Webview窗口（触发touchstart事件）后生效，如果用户没有操作Webview窗口则不对URL请求操作进行拦截处理。
    *     默认值为"instant"。
    * - instant: 
    *     立即生效，即调用overrideUrlLoading方法后立即生效。
    *                                 
    * - : 
    *     表示用户操作Webview窗口（触发touchstart事件）后生效。
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var effect: js.UndefOr[instant | _empty] = js.native
  
  /**
    * 排除拦截处理请求类型
    * 不拦截处理指定类型的URL请求，直接使用系统默认处理逻辑。
    *     可取值：
    *     "none"表示不排除任何URL请求（即拦截处理所有URL请求）；
    *     "redirect"表示排除拦截处理301/302跳转的请求（谨慎使用，非a标签的href触发的URL请求可能会误判断为302跳转）。
    *     默认值为"none"。
    * - none: 
    *     不排除任何URL请求（即拦截处理所有URL请求）。
    *                                 
    * - redirect: 
    *     排除拦截处理301/302跳转的请求（谨慎使用，非a标签的href触发的URL请求可能会误判断为302跳转）。
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var exclude: js.UndefOr[none | redirect] = js.native
  
  /**
    * 区配是否需要处理的URL请求
    * 支持正则表达式，默认值为对所有URL地址生效（相当于正则表达式“.*”）。
    *     如果mode值为"allow"则允许区配的URL请求跳转，mode值为"reject"则拦截区配的URL请求。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `match`: js.UndefOr[String] = js.native
  
  /**
    * 拦截模式
    * 可取值：
    *     "allow"表示满足match属性定义的条件时不拦截url继续加载，不满足match属性定义的条件时拦截url跳转并触发callback回调；
    *     "reject"表示满足match属性定义的提交时拦截url跳转并触发callback回调，不满足match属性定义的条件时不拦截url继续加载。
    *     默认值为"reject"。
    * - allow: 
    *     满足match属性定义的条件时不拦截url继续加载，不满足match属性定义的条件时拦截url跳转并触发callback回调。
    *                                 
    * - reject: 
    *     满足match属性定义的提交时拦截url跳转并触发callback回调，不满足match属性定义的条件时不拦截url继续加载。
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var mode: js.UndefOr[allow | reject] = js.native
}
object PlusWebviewWebviewOverrideUrlOptions {
  
  @scala.inline
  def apply(): PlusWebviewWebviewOverrideUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewOverrideUrlOptions]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewOverrideUrlOptionsMutableBuilder[Self <: PlusWebviewWebviewOverrideUrlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: instant | _empty): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    @scala.inline
    def setExclude(value: none | redirect): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setMode(value: allow | reject): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
