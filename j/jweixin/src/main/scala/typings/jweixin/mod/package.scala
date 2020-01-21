package typings.jweixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // 所有JS接口列表
  type jsApiList = js.Array[typings.jweixin.mod.ApiMethod]
  type menuList = js.Array[
    typings.jweixin.mod.menuBase | typings.jweixin.mod.menuProtected | typings.jweixin.mod.menuShare
  ]
}
