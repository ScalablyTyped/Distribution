package typings
package inkDashSelectDashInputLib.inkDashSelectDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemOfSelectInput extends js.Object {
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var label: java.lang.String
  var value: js.Any
}

object ItemOfSelectInput {
  @scala.inline
  def apply(label: java.lang.String, value: js.Any, key: java.lang.String | scala.Double = null): ItemOfSelectInput = {
    val __obj = js.Dynamic.literal(label = label, value = value)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOfSelectInput]
  }
}

