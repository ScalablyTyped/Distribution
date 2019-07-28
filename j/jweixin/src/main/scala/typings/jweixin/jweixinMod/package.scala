package typings.jweixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jweixinMod {
  // 所有JS接口列表
  type jsApiList = js.Array[ApiMethod]
  type menuList = js.Array[menuBase | menuProtected | menuShare]
}
