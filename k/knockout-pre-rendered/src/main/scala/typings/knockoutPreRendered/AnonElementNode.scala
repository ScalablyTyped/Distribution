package typings.knockoutPreRendered

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementNode extends js.Object {
  var element: Node
}

object AnonElementNode {
  @scala.inline
  def apply(element: Node): AnonElementNode = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonElementNode]
  }
}

