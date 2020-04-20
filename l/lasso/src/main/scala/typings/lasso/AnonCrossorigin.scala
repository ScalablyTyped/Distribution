package typings.lasso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCrossorigin extends js.Object {
  var crossorigin: String
  var integrity: String
}

object AnonCrossorigin {
  @scala.inline
  def apply(crossorigin: String, integrity: String): AnonCrossorigin = {
    val __obj = js.Dynamic.literal(crossorigin = crossorigin.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCrossorigin]
  }
}

