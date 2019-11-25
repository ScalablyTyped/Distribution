package typings.knockoutDashAmdDashHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutStatic extends js.Object {
  var amdTemplateEngine: KnockoutAMDTemplate
}

object KnockoutStatic {
  @scala.inline
  def apply(amdTemplateEngine: KnockoutAMDTemplate): KnockoutStatic = {
    val __obj = js.Dynamic.literal(amdTemplateEngine = amdTemplateEngine.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockoutStatic]
  }
}

