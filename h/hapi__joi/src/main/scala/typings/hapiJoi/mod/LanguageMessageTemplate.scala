package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageMessageTemplate extends js.Object {
  var rendered: String
  var source: String
}

object LanguageMessageTemplate {
  @scala.inline
  def apply(rendered: String, source: String): LanguageMessageTemplate = {
    val __obj = js.Dynamic.literal(rendered = rendered.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LanguageMessageTemplate]
  }
}

