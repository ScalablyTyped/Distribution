package typings.grommet.checkBoxGroupMod

import typings.grommet.checkBoxMod.CheckBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChangeEvent extends js.Object {
  var option: String | CheckBoxProps
  var value: String
}

object OnChangeEvent {
  @scala.inline
  def apply(option: String | CheckBoxProps, value: String): OnChangeEvent = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeEvent]
  }
}

