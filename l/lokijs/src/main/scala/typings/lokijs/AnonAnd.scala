package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnd extends js.Object {
  @JSName("$and")
  var $and: js.Any
  @JSName("$or")
  var $or: js.Any
}

object AnonAnd {
  @scala.inline
  def apply($and: js.Any, $or: js.Any): AnonAnd = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any], $or = $or.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnd]
  }
}

