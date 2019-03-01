package typings
package knockoutDashAmdDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingHandlers extends js.Object {
  var module: KnockoutAMDModule
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(module: KnockoutAMDModule): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("module")(module)
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

