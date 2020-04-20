package typings.jqueryAjaxfile.KnockoutComponentTypes

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateElement extends js.Object {
  var element: String | Node
}

object TemplateElement {
  @scala.inline
  def apply(element: String | Node): TemplateElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateElement]
  }
}

