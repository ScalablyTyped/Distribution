package typings.handsontable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAny extends js.Object {
  var value: js.Any
}

object ValueAny {
  @scala.inline
  def apply(value: js.Any): ValueAny = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAny]
  }
}

