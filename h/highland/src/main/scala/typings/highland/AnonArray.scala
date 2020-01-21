package typings.highland

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArray[R] extends js.Object {
  var array: js.Any
  var stream: js.Any
  var value: R
}

object AnonArray {
  @scala.inline
  def apply[R](array: js.Any, stream: js.Any, value: R): AnonArray[R] = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArray[R]]
  }
}

