package typings.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConvertValue[U] extends js.Object {
  var convert: Boolean
  var value: U
}

object AnonConvertValue {
  @scala.inline
  def apply[U](convert: Boolean, value: U): AnonConvertValue[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConvertValue[U]]
  }
}

