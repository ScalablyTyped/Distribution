package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IdownloadImage extends BaseParams {
   // 需要下载的图片的服务器端ID，由uploadImage接口获得
  var isShowProgressTips: scala.Double
  var serverId: java.lang.String
   // 默认为1，显示进度提示
  // 返回图片下载后的本地ID
  @JSName("success")
  def success_MIdownloadImage(res: Resouce): scala.Unit
}

