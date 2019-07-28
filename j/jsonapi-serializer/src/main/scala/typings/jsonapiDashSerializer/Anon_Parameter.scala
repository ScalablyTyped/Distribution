package typings.jsonapiDashSerializer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Parameter extends js.Object {
  var parameter: js.UndefOr[String] = js.undefined
  var pointer: js.UndefOr[String] = js.undefined
}

object Anon_Parameter {
  @scala.inline
  def apply(parameter: String = null, pointer: String = null): Anon_Parameter = {
    val __obj = js.Dynamic.literal()
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    if (pointer != null) __obj.updateDynamic("pointer")(pointer)
    __obj.asInstanceOf[Anon_Parameter]
  }
}

