package typings.knockstrap

import typings.knockstrap.anon.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutStatic extends js.Object {
  var stringTemplateEngine: Instance
}

object KnockoutStatic {
  @scala.inline
  def apply(stringTemplateEngine: Instance): KnockoutStatic = {
    val __obj = js.Dynamic.literal(stringTemplateEngine = stringTemplateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
}

