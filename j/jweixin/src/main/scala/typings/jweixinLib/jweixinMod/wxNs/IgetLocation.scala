package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgetLocation extends BaseParams {
  var `type`: jweixinLib.jweixinLibStrings.wgs84 | jweixinLib.jweixinLibStrings.gcj02
   // 默认为wgs84的gps坐标，如果要返回直接给openLocation用的火星坐标，可传入'gcj02'
  @JSName("success")
  def success_MIgetLocation(res: jweixinLib.Anon_Latitude): scala.Unit
}

