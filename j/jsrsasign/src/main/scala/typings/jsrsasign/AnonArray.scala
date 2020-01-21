package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArray extends js.Object {
  var array: js.Array[String]
  var hashalg: String
}

object AnonArray {
  @scala.inline
  def apply(array: js.Array[String], hashalg: String): AnonArray = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], hashalg = hashalg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArray]
  }
}

