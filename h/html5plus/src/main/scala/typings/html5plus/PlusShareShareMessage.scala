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
@js.native
trait PlusShareShareMessage extends js.Object {
  /**
    * 分享消息的文字内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var content: js.UndefOr[String] = js.native
  /**
    * 分享消息扩展参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var extra: js.UndefOr[PlusShareShareMessageExtra] = js.native
  /**
    * 分享消息中包含的用户地理信息数据
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var geo: js.UndefOr[PlusShareGeoPosition] = js.native
  /**
    * 分享独立的链接
    * 分享资源地址，仅支持网络地址（以http://或https://开头）。
    *     如果未指定type类型，优先级顺序为：href&gt;pictures&gt;content（即设置了href则认为分享网页类型）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var href: js.UndefOr[String] = js.native
  /**
    * 分享消息的模式
    * 可取值：
    *     "auto" - 自动选择，如果已经安装微博客户端则采用编辑界面进行分享，否则采用无界面分享；
    *     "slient" - 静默分享，采用无界面模式进行分享；
    *     "editable" - 进入编辑界面，用户确认分享内容后发送，如果当前未安装微博客户端则触发错误回调。
    *     默认值为"auto"。
    *     （仅新浪微博分享时生效）
    * - auto: 
    *     自动选择，如果已经安装微博客户端则采用编辑界面进行分享，否则采用无界面分享
    *                                 
    * - slient: 
    *     静默分享，采用无界面模式进行分享
    *                                 
    * - editable: 
    *     进入编辑界面，用户确认分享内容后发送，如果当前未安装微博客户端则触发错误回调
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var interface: js.UndefOr[auto | slient | editable] = js.native
  /**
    * 分享的多媒体资源
    * 分享的多媒体资源地址，当type值为"music"、"video"时有效。
    *     注意：
    *         微信分享平台支持音乐、视频类型，仅支持网络地址（以http://或https://开头）；
    *         QQ分享平台支持音乐类型，仅支持网络路径（以http://或https://开头）；
    *         新浪微博分享平台支持视频类型，仅支持本地文件路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var media: js.UndefOr[String] = js.native
  /**
    * 分享微信小程序参数
    * 仅微信分享小程序类型时支持。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var miniProgram: js.UndefOr[PlusShareWeixinMiniProgramOptions] = js.native
  /**
    * 分享消息的图片
    * 分享消息中包含的图片路径，仅支持本地路径。
    *     若分享平台仅支持提交一张图片，传入多张图片则仅提交第一张图片。
    *     如果未指定type类型，优先级顺序为：pictures&gt;content（即设置了pictures则认为分享图片类型）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var pictures: js.UndefOr[js.Array[_]] = js.native
  /**
    * 分享消息的缩略图
    * 分享消息中包含的缩略图路径，支持本地路径及网络路径。
    *     若分享平台仅支持提交一张图片，传入多张图片则仅提交第一张图片。
    *     如果分享平台的信息不支持缩略图，若没有设置消息的图片（pictures）则使用缩略图，否则忽略其属性值。
    *     注意：图片有大小限制，推荐图片小于20Kb。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var thumbs: js.UndefOr[js.Array[_]] = js.native
  /**
    * 分享消息的标题
    * 仅微信分享网页、音频、视频、小程序类型时支持。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * 分享消息的类型
    * 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var `type`: js.UndefOr[String] = js.native
}

object PlusShareShareMessage {
  @scala.inline
  def apply(): PlusShareShareMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusShareShareMessage]
  }
  @scala.inline
  implicit class PlusShareShareMessageOps[Self <: PlusShareShareMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setExtra(value: PlusShareShareMessageExtra): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setGeo(value: PlusShareGeoPosition): Self = this.set("geo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeo: Self = this.set("geo", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setInterface(value: auto | slient | editable): Self = this.set("interface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterface: Self = this.set("interface", js.undefined)
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setMiniProgram(value: PlusShareWeixinMiniProgramOptions): Self = this.set("miniProgram", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiniProgram: Self = this.set("miniProgram", js.undefined)
    @scala.inline
    def setPicturesVarargs(value: js.Any*): Self = this.set("pictures", js.Array(value :_*))
    @scala.inline
    def setPictures(value: js.Array[_]): Self = this.set("pictures", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePictures: Self = this.set("pictures", js.undefined)
    @scala.inline
    def setThumbsVarargs(value: js.Any*): Self = this.set("thumbs", js.Array(value :_*))
    @scala.inline
    def setThumbs(value: js.Array[_]): Self = this.set("thumbs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbs: Self = this.set("thumbs", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

