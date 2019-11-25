package typings.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Convert[U] extends js.Object {
  var convert: Boolean
  var error: U
}

object Anon_Convert {
  @scala.inline
  def apply[U](convert: Boolean, error: U): Anon_Convert[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Convert[U]]
  }
}

