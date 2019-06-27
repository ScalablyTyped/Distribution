package typings
package atIonicCoreLib.distTypesStencilDotCoreMod.JSXBaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotAttributes extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var slot: js.UndefOr[java.lang.String] = js.undefined
}

object SlotAttributes {
  @scala.inline
  def apply(name: java.lang.String = null, slot: java.lang.String = null): SlotAttributes = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    __obj.asInstanceOf[SlotAttributes]
  }
}

