package typings.knockout

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElement extends js.Object {
  var element: Node
}

object AnonElement {
  @scala.inline
  def apply(element: Node): AnonElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonElement]
  }
}

