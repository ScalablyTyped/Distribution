package typings.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConvert[U] extends js.Object {
  var convert: Boolean
  var error: U
}

object AnonConvert {
  @scala.inline
  def apply[U](convert: Boolean, error: U): AnonConvert[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConvert[U]]
  }
}

