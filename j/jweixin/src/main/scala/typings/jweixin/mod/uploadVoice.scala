package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jweixin", "uploadVoice")
@js.native
object uploadVoice extends js.Object {
  /**
  	 * 上传语音接口
  	 * 备注：上传语音有效期3天，可用微信多媒体接口下载语音到自己的服务器
  	 * ，此处获得的 serverId 即 media_id，参考文档
  	 * ../12 / 58bfcfabbd501c7cd77c19bd9cfa8354.html
  	 * 目前多媒体文件下载接口的频率限制为10000次/ 天，
  	 * 如需要调高频率，请邮件weixin - open@qq.com,
  	 * 邮件主题为【申请多媒体接口调用量】，请对你的项目进行简单描述，
  	 * 附上产品体验链接，并对用户量和使用量进行说明。
  	 */
  def apply(params: IupdownloadVoice): Unit = js.native
}

