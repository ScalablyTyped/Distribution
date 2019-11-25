package typings.html5plus

import typings.html5plus.html5plusStrings.auto
import typings.html5plus.html5plusStrings.editable
import typings.html5plus.html5plusStrings.slient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，分享消息对象
  * ShareMessage对象用于表示分享消息内容，在JS中为JSON对象，用于向系统发送分享信息操作。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
trait PlusShareShareMessage extends js.Object {
  /**
    * 分享消息的文字内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * 分享消息扩展参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var extra: js.UndefOr[PlusShareShareMessageExtra] = js.undefined
  /**
    * 分享消息中包含的用户地理信息数据
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var geo: js.UndefOr[PlusShareGeoPosition] = js.undefined
  /**
    * 分享独立的链接
    * 分享资源地址，仅支持网络地址（以http://或https://开头）。
    * 	如果未指定type类型，优先级顺序为：href&gt;pictures&gt;content（即设置了href则认为分享网页类型）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * 分享消息的模式
    * 可取值：
    *     "auto" - 自动选择，如果已经安装微博客户端则采用编辑界面进行分享，否则采用无界面分享；
    *     "slient" - 静默分享，采用无界面模式进行分享；
    *     "editable" - 进入编辑界面，用户确认分享内容后发送，如果当前未安装微博客户端则触发错误回调。
    *     默认值为"auto"。
    *     （仅新浪微博分享时生效）
    * - auto: 
    * 	自动选择，如果已经安装微博客户端则采用编辑界面进行分享，否则采用无界面分享
    * 								
    * - slient: 
    * 	静默分享，采用无界面模式进行分享
    * 								
    * - editable: 
    * 	进入编辑界面，用户确认分享内容后发送，如果当前未安装微博客户端则触发错误回调
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var interface: js.UndefOr[auto | slient | editable] = js.undefined
  /**
    * 分享的多媒体资源
    * 分享的多媒体资源地址，当type值为"music"、"video"时有效。
    * 	注意：
    * 		微信分享平台支持音乐、视频类型，仅支持网络地址（以http://或https://开头）；
    * 		QQ分享平台支持音乐类型，仅支持网络路径（以http://或https://开头）；
    * 		新浪微博分享平台支持视频类型，仅支持本地文件路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var media: js.UndefOr[String] = js.undefined
  /**
    * 分享微信小程序参数
    * 仅微信分享小程序类型时支持。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var miniProgram: js.UndefOr[PlusShareWeixinMiniProgramOptions] = js.undefined
  /**
    * 分享消息的图片
    * 分享消息中包含的图片路径，仅支持本地路径。
    * 	若分享平台仅支持提交一张图片，传入多张图片则仅提交第一张图片。
    * 	如果未指定type类型，优先级顺序为：pictures&gt;content（即设置了pictures则认为分享图片类型）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var pictures: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 分享消息的缩略图
    * 分享消息中包含的缩略图路径，支持本地路径及网络路径。
    * 	若分享平台仅支持提交一张图片，传入多张图片则仅提交第一张图片。
    * 	如果分享平台的信息不支持缩略图，若没有设置消息的图片（pictures）则使用缩略图，否则忽略其属性值。
    * 	注意：图片有大小限制，推荐图片小于20Kb。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var thumbs: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 分享消息的标题
    * 仅微信分享网页、音频、视频、小程序类型时支持。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * 分享消息的类型
    * 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object PlusShareShareMessage {
  @scala.inline
  def apply(
    content: String = null,
    extra: PlusShareShareMessageExtra = null,
    geo: PlusShareGeoPosition = null,
    href: String = null,
    interface: auto | slient | editable = null,
    media: String = null,
    miniProgram: PlusShareWeixinMiniProgramOptions = null,
    pictures: js.Array[_] = null,
    thumbs: js.Array[_] = null,
    title: String = null,
    `type`: String = null
  ): PlusShareShareMessage = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (geo != null) __obj.updateDynamic("geo")(geo.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (interface != null) __obj.updateDynamic("interface")(interface.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (miniProgram != null) __obj.updateDynamic("miniProgram")(miniProgram.asInstanceOf[js.Any])
    if (pictures != null) __obj.updateDynamic("pictures")(pictures.asInstanceOf[js.Any])
    if (thumbs != null) __obj.updateDynamic("thumbs")(thumbs.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusShareShareMessage]
  }
}

