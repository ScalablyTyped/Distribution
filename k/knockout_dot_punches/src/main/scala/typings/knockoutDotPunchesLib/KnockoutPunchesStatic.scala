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
  def apply(enableAll: () => scala.Unit): KnockoutPunchesStatic = {
    val __obj = js.Dynamic.literal(enableAll = js.Any.fromFunction0(enableAll))
  
    __obj.asInstanceOf[KnockoutPunchesStatic]
  }
}

