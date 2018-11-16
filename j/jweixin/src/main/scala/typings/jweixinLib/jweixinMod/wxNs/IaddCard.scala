package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IaddCard extends BaseParams {
  var cardList: js.Array[jweixinLib.Anon_CardExt]
   // 需要添加的卡券列表
  @JSName("success")
  def success_MIaddCard(res: jweixinLib.Anon_CardList): scala.Unit
}

