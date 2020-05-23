package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndArray extends js.Object {
  @JSName("$and")
  var $and: js.Array[_]
}

object AndArray {
  @scala.inline
  def apply($and: js.Array[_]): AndArray = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndArray]
  }
}

