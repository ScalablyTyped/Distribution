package typings.grommet

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String | ReactNode] = js.undefined
  var value: String
}

object Anon_Disabled {
  @scala.inline
  def apply(
    value: String,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    label: String | ReactNode = null
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Disabled]
  }
}

