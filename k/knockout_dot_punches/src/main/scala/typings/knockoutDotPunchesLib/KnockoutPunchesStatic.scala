package typings
package knockoutDotPunchesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutPunchesStatic extends js.Object {
  def enableAll(): scala.Unit
}

object KnockoutPunchesStatic {
  @scala.inline
  def apply(enableAll: js.Function0[scala.Unit]): KnockoutPunchesStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enableAll")(enableAll)
    __obj.asInstanceOf[KnockoutPunchesStatic]
  }
}

