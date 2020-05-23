package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Share模块管理客户端的社交分享功能，提供调用终端社交软件的分享能力。通过plus.share可获取社交分享管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
@js.native
trait PlusShare extends js.Object {
  /**
    * JSON对象，分享授权认证参数选项
    * 此对象支持的属性值由分享服务的授权认证模块定义。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var AuthOptions: js.UndefOr[PlusShareAuthOptions] = js.native
  /**
    * 分享授权控件对象
    * Authorize对象表示分享控件对象，用于在窗口中显示分享控件，使用此对象可自定义分享授权界面。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var Authorize: js.UndefOr[PlusShareAuthorize] = js.native
  /**
    * JSON对象，用户位置信息
    * GeoPosition对象用于表示用户分享消息时的位置信息。用于标识分享操作时用户的位置信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var GeoPosition: js.UndefOr[PlusShareGeoPosition] = js.native
  /**
    * JSON对象，分享消息对象
    * ShareMessage对象用于表示分享消息内容，在JS中为JSON对象，用于向系统发送分享信息操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var ShareMessage: js.UndefOr[PlusShareShareMessage] = js.native
  /**
    * JSON对象，保存分享消息扩展信息
    * ShareMessageExtra对象用于保存各分享平台扩展的参数，用于自定义分享功能。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var ShareMessageExtra: js.UndefOr[PlusShareShareMessageExtra] = js.native
  /**
    * 分享服务标识
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var ShareServerIdentity: js.UndefOr[PlusShareShareServerIdentity] = js.native
  /**
    * 分享服务对象
    * ShareService对象用于表示分享服务，在JS中为对象，用于向系统请求分享操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var ShareService: js.UndefOr[PlusShareShareService] = js.native
  /**
    * JSON对象，微信小程序信息
    * 用于配置分享小程序的参数，如小程序标识、页面路径等。
    *     注意：分享的小程序需要在微信开放平台关联的开发者账号下，否则会分享失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var WeixinMiniProgramOptions: js.UndefOr[PlusShareWeixinMiniProgramOptions] = js.native
  /**
    * 获取分享服务
    * 获取终端支持的分享通道列表，可用于提示用户进行分享服务器的选择。获取分享服务成功后通过successCB回调返回支持的所有服务列表，获取服务失败则通过errorCB回调返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  def getServices(): Unit = js.native
  def getServices(successCB: js.Function1[/* result */ js.Array[this.type], Unit]): Unit = js.native
  def getServices(
    successCB: js.Function1[/* result */ js.Array[this.type], Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 使用系统组件发送分享
    * 调用系统分享组件分享消息，通过msg参数设置分享内容。
    *     发送成功后通过successCB回调函数通知操作完成，发送失败则通过errorCB回调返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  def sendWithSystem(): Unit = js.native
  def sendWithSystem(msg: PlusShareShareMessage): Unit = js.native
  def sendWithSystem(msg: PlusShareShareMessage, successCB: js.Function0[Unit]): Unit = js.native
  def sendWithSystem(
    msg: PlusShareShareMessage,
    successCB: js.Function0[Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
}

