package typings.ineum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentStack extends js.Object {
  var componentStack: String
}

object AnonComponentStack {
  @scala.inline
  def apply(componentStack: String): AnonComponentStack = {
    val __obj = js.Dynamic.literal(componentStack = componentStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentStack]
  }
}

