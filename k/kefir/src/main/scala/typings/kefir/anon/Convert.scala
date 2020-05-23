package typings.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Convert[U] extends js.Object {
  var convert: Boolean
  var error: U
}

object Convert {
  @scala.inline
  def apply[U](convert: Boolean, error: U): Convert[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Convert[U]]
  }
}

