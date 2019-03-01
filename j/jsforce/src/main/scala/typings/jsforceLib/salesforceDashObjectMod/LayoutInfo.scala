package typings
package jsforceLib.salesforceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutInfo extends js.Object {
  var layouts: js.Array[js.Object]
  var recordTypeMappings: js.Array[js.Object]
}

object LayoutInfo {
  @scala.inline
  def apply(layouts: js.Array[js.Object], recordTypeMappings: js.Array[js.Object]): LayoutInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layouts")(layouts)
    __obj.updateDynamic("recordTypeMappings")(recordTypeMappings)
    __obj.asInstanceOf[LayoutInfo]
  }
}

