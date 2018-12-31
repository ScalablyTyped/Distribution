package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonMenuShareWeibo extends BaseParams {
   // 分享标题
  var desc: java.lang.String
   // 分享链接
  var imgUrl: java.lang.String
   // 分享描述
  var link: java.lang.String
  var title: java.lang.String
  // 用户取消分享后执行的回调函数
  def cancel(): scala.Unit
   // 分享图标
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareWeibo(): scala.Unit
}

