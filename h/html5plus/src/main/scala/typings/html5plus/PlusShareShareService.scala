package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 分享服务对象
  * ShareService对象用于表示分享服务，在JS中为对象，用于向系统请求分享操作。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
@js.native
trait PlusShareShareService extends js.Object {
  /**
    * 授权认证信息
    * 仅在authenticated为true时有效，标识客户认证标识信息，用于发送分享信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * 是否授权认证
    * 用于标识此分享是否已经授权认证过，true表示已完成授权认证；false表示未完成授权认证。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var authenticated: js.UndefOr[Boolean] = js.native
  /**
    * 分享服务描述
    * 用于描述分享服务的信息：
    * 	如“新浪微博”、“腾讯微博”、“微信”、“QQ”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * 分享服务标识
    * 用于表示分享服务标识：
    * 	"sinaweibo" - 表示新浪微博；
    * 	"tencentweibo" - 表示腾讯微博；
    * 	"weixin" - 表示微信；
    * 	"qq" - 表示腾讯QQ。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var id: js.UndefOr[PlusShareShareServerIdentity] = js.native
  /**
    * 是否存在对应的分享客户端
    * 对于某些分享服务，可直接调用本地客户端程序进行授权认证，此属性即可提供此相关信息，若没有安装本地客户端则可能调用其它方式进行分享操作，如WAP方式等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var nativeClient: js.UndefOr[Boolean] = js.native
  /**
    * 授权认证操作
    * 对指定的分享服务进行授权认证操作，在授权前可通过ShareService.authenticated属性判断是否已经授权过，通常只需要对没有进行过授权认证的服务进行授权认证操作。
    * 	授权认证操作成功后通过successCB回调函数通知操作完成，操作失败则通过errorCB回调返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  def authorize(): Unit = js.native
  def authorize(successCallback: js.Function1[/* result */ this.type, Unit]): Unit = js.native
  def authorize(
    successCallback: js.Function1[/* result */ this.type, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def authorize(
    successCallback: js.Function1[/* result */ this.type, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit],
    options: PlusShareAuthOptions
  ): Unit = js.native
  /**
    * 取消授权认证
    * 对指定的分享服务取消授权认证操作，取消授权认证后，再次分享时需重新进行授权操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  def forbid(): Unit = js.native
  /**
    * 调用微信小程序
    * 注意：需在微信开放平台将应用关联小程序才能正常调用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  def launchMiniProgram(): Unit = js.native
  def launchMiniProgram(options: PlusShareWeixinMiniProgramOptions): Unit = js.native
  /**
    * 发送分享
    * 发送分享消息，分享消息的内容通过msg设置。
    * 	发送成功后通过successCB回调函数通知操作完成，发送失败则通过errorCB回调返回。若分享服务没有进行授权认证或授权认证失效则触发失败回调函数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  def send(): Unit = js.native
  def send(msg: PlusShareShareMessage): Unit = js.native
  def send(msg: PlusShareShareMessage, successCB: js.Function0[Unit]): Unit = js.native
  def send(
    msg: PlusShareShareMessage,
    successCB: js.Function0[Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
}

