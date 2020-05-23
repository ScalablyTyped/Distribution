package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait And extends js.Object {
  @JSName("$and")
  var $and: js.Any
  @JSName("$or")
  var $or: js.Any
}

object And {
  @scala.inline
  def apply($and: js.Any, $or: js.Any): And = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any], $or = $or.asInstanceOf[js.Any])
    __obj.asInstanceOf[And]
  }
}

