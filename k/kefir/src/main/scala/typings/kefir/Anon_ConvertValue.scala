package typings.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConvertValue[U] extends js.Object {
  var convert: Boolean
  var value: U
}

object Anon_ConvertValue {
  @scala.inline
  def apply[U](convert: Boolean, value: U): Anon_ConvertValue[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ConvertValue[U]]
  }
}

