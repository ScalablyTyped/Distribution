package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: Double
  var value: js.Any
}

object AnonIndex {
  @scala.inline
  def apply(index: Double, value: js.Any): AnonIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex]
  }
}

