package typings.linkifyjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VArray extends js.Object {
  var v: js.Array[V]
}

object VArray {
  @scala.inline
  def apply(v: js.Array[V]): VArray = {
    val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[VArray]
  }
}

