package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonMenuShareAppMessage extends BaseParams {
  		// 分享类型,music、video或link，不填默认为link
  var dataUrl: js.UndefOr[java.lang.String] = js.undefined
  	// 分享标题
  var desc: java.lang.String
  	// 分享链接
  var imgUrl: java.lang.String
  	// 分享描述
  var link: java.lang.String
  var title: java.lang.String
  	// 分享图标
  var `type`: js.UndefOr[
    jweixinLib.jweixinLibStrings.music | jweixinLib.jweixinLibStrings.videoBACKSLASHu6216link | jweixinLib.jweixinLibStrings.link
  ] = js.undefined
  // 用户取消分享后执行的回调函数
  def cancel(): scala.Unit
   // 如果type是music或video，则要提供数据链接，默认为空
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareAppMessage(): scala.Unit
}

