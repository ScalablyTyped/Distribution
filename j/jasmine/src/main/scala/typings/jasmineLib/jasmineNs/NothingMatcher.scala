package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NothingMatcher extends js.Object {
  def nothing(): scala.Unit
}

object NothingMatcher {
  @scala.inline
  def apply(nothing: js.Function0[scala.Unit]): NothingMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nothing")(nothing)
    __obj.asInstanceOf[NothingMatcher]
  }
}

