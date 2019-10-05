package typings.jqueryDotAjaxfile.KnockoutComponentTypes

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentInfo extends js.Object {
  var element: Node
  var templateNodes: js.Array[Node]
}

object ComponentInfo {
  @scala.inline
  def apply(element: Node, templateNodes: js.Array[Node]): ComponentInfo = {
    val __obj = js.Dynamic.literal(element = element, templateNodes = templateNodes)
  
    __obj.asInstanceOf[ComponentInfo]
  }
}

