package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 分享授权控件对象
  * Authorize对象表示分享控件对象，用于在窗口中显示分享控件，使用此对象可自定义分享授权界面。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
@js.native
trait PlusShareAuthorize extends js.Object {
  
  /**
    * 加载分享授权页面
    * 创建分享授权页面后，需要调用此方法指定分享服务标识来加载授权页面数据，此标识可使用ShareService对象的id属性。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  def load(): Unit = js.native
  def load(id: String): Unit = js.native
  
  /**
    * 分享授权认证成功事件
    * 用户在分享授权控件上输入操作授权成功时触发，事件方法格式参考ShareSuccessCallback回调函数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var onauthenticated: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 分享授权认证失败事件
    * 用户在分享授权控件上输入操作授权认证错误时触发，事件方法格式参考ShareErrorCallback回调函数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var onerror: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.native
  
  /**
    * 分享控件加载完成事件
    * 分享授权控件内容加载完成事件，通过调用load方法加载分享授权控件内容，当内容加载完成时触发。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var onloaded: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.native
  
  /**
    * 设置分享授权控件是否可见
    * 创建分享授权页面后，调用此方法设置分享授权控件在页面中是否可见。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  def setVisible(): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
}
