package typings.jsonapiSerializer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParameter extends js.Object {
  var parameter: js.UndefOr[String] = js.undefined
  var pointer: js.UndefOr[String] = js.undefined
}

object AnonParameter {
  @scala.inline
  def apply(parameter: String = null, pointer: String = null): AnonParameter = {
    val __obj = js.Dynamic.literal()
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParameter]
  }
}

