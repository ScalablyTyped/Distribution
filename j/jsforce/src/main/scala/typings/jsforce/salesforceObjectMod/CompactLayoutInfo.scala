package typings.jsforce.salesforceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactLayoutInfo extends js.Object {
  var compactLayouts: js.Array[js.Object]
  var defaultCompactLayoutId: String
  var recordTypeCompactLayoutMappings: js.Array[js.Object]
}

object CompactLayoutInfo {
  @scala.inline
  def apply(
    compactLayouts: js.Array[js.Object],
    defaultCompactLayoutId: String,
    recordTypeCompactLayoutMappings: js.Array[js.Object]
  ): CompactLayoutInfo = {
    val __obj = js.Dynamic.literal(compactLayouts = compactLayouts.asInstanceOf[js.Any], defaultCompactLayoutId = defaultCompactLayoutId.asInstanceOf[js.Any], recordTypeCompactLayoutMappings = recordTypeCompactLayoutMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactLayoutInfo]
  }
}

