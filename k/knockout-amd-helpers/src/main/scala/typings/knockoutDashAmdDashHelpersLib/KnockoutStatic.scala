package typings
package knockoutDashAmdDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutStatic extends js.Object {
  var amdTemplateEngine: KnockoutAMDTemplate
}

object KnockoutStatic {
  @scala.inline
  def apply(amdTemplateEngine: KnockoutAMDTemplate): KnockoutStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amdTemplateEngine")(amdTemplateEngine)
    __obj.asInstanceOf[KnockoutStatic]
  }
}

