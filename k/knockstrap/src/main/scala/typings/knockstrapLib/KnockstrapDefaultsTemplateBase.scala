package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapDefaultsTemplateBase extends js.Object {
  var name: java.lang.String
  var templateEngine: KnockstrapStringTemplateEngine
}

object KnockstrapDefaultsTemplateBase {
  @scala.inline
  def apply(name: java.lang.String, templateEngine: KnockstrapStringTemplateEngine): KnockstrapDefaultsTemplateBase = {
    val __obj = js.Dynamic.literal(name = name, templateEngine = templateEngine)
  
    __obj.asInstanceOf[KnockstrapDefaultsTemplateBase]
  }
}

