package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAndArray extends js.Object {
  @JSName("$and")
  var $and: js.Array[_]
}

object AnonAndArray {
  @scala.inline
  def apply($and: js.Array[_]): AnonAndArray = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAndArray]
  }
}

