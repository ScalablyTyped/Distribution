package typings.jsforce.salesforceDashObjectMod

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
    val __obj = js.Dynamic.literal(layouts = layouts.asInstanceOf[js.Any], recordTypeMappings = recordTypeMappings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LayoutInfo]
  }
}

