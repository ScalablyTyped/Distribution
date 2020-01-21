package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutStatic extends js.Object {
  var stringTemplateEngine: AnonInstance
}

object KnockoutStatic {
  @scala.inline
  def apply(stringTemplateEngine: AnonInstance): KnockoutStatic = {
    val __obj = js.Dynamic.literal(stringTemplateEngine = stringTemplateEngine.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockoutStatic]
  }
}

