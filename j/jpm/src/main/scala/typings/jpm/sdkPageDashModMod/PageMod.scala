package typings.jpm.sdkPageDashModMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageMod extends js.Object {
  var include: String | (js.Array[RegExp | String]) | RegExp
  def destroy(): Unit
}

object PageMod {
  @scala.inline
  def apply(destroy: () => Unit, include: String | (js.Array[RegExp | String]) | RegExp): PageMod = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), include = include.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PageMod]
  }
}

