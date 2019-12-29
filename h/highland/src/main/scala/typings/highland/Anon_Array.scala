package typings.highland

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array[R] extends js.Object {
  var array: js.Any
  var stream: js.Any
  var value: R
}

object Anon_Array {
  @scala.inline
  def apply[R](array: js.Any, stream: js.Any, value: R): Anon_Array[R] = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Array[R]]
  }
}

