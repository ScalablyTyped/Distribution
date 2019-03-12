package typings
package jpmLib.sdkPageDashModMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageMod extends js.Object {
  var include: java.lang.String | js.Array[java.lang.String] | stdLib.RegExp | js.Array[stdLib.RegExp]
  def destroy(): scala.Unit
}

object PageMod {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    include: java.lang.String | js.Array[java.lang.String] | stdLib.RegExp | js.Array[stdLib.RegExp]
  ): PageMod = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), include = include.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PageMod]
  }
}

