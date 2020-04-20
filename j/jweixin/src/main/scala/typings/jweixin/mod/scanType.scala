package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================界面操作================================*/
/*=============================微信扫一扫================================*/
/* Rewritten from type alias, can be one of: 
  - typings.jweixin.jweixinStrings.qrCode
  - typings.jweixin.jweixinStrings.barCode
*/
trait scanType extends js.Object

object scanType {
  @scala.inline
  def barCode: typings.jweixin.jweixinStrings.barCode = "barCode".asInstanceOf[typings.jweixin.jweixinStrings.barCode]
  @scala.inline
  def qrCode: typings.jweixin.jweixinStrings.qrCode = "qrCode".asInstanceOf[typings.jweixin.jweixinStrings.qrCode]
}

