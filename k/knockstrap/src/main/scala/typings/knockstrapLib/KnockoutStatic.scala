package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutStatic extends js.Object {
  var stringTemplateEngine: Anon_Instance
}

object KnockoutStatic {
  @scala.inline
  def apply(stringTemplateEngine: Anon_Instance): KnockoutStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stringTemplateEngine")(stringTemplateEngine)
    __obj.asInstanceOf[KnockoutStatic]
  }
}

