package typings.inkSelectInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemOfSelectInput extends js.Object {
  var key: js.UndefOr[String | Double] = js.undefined
  var label: String
  var value: js.Any
}

object ItemOfSelectInput {
  @scala.inline
  def apply(label: String, value: js.Any, key: String | Double = null): ItemOfSelectInput = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOfSelectInput]
  }
}

