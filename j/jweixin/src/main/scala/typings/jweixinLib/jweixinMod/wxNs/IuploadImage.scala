package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IuploadImage extends BaseParams {
   // 需要上传的图片的本地ID，由chooseImage接口获得
  var isShowProgressTips: scala.Double
  var localId: java.lang.String
   // 默认为1，显示进度提示
  // 返回图片的服务器端ID
  @JSName("success")
  def success_MIuploadImage(res: jweixinLib.Anon_ServerId): scala.Unit
}

