package typings.ineum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentStack extends js.Object {
  var componentStack: String
}

object ComponentStack {
  @scala.inline
  def apply(componentStack: String): ComponentStack = {
    val __obj = js.Dynamic.literal(componentStack = componentStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentStack]
  }
}

