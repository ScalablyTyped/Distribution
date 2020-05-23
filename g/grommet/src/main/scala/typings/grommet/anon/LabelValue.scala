package typings.grommet.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelValue extends js.Object {
  var label: js.UndefOr[ReactNode] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object LabelValue {
  @scala.inline
  def apply(label: ReactNode = null, value: js.Any = null): LabelValue = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelValue]
  }
}

