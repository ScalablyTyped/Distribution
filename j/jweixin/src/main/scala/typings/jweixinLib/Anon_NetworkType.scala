package typings
package jweixinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NetworkType extends js.Object {
  var networkType: jweixinLib.jweixinMod.wxNs.networkType
}

object Anon_NetworkType {
  @scala.inline
  def apply(networkType: jweixinLib.jweixinMod.wxNs.networkType): Anon_NetworkType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("networkType")(networkType)
    __obj.asInstanceOf[Anon_NetworkType]
  }
}

