package typings.jsonapiSerializer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  var parameter: js.UndefOr[String] = js.undefined
  var pointer: js.UndefOr[String] = js.undefined
}

object Parameter {
  @scala.inline
  def apply(parameter: String = null, pointer: String = null): Parameter = {
    val __obj = js.Dynamic.literal()
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
}

