package typings
package jsforceLib.salesforceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactLayoutInfo extends js.Object {
  var compactLayouts: js.Array[js.Object]
  var defaultCompactLayoutId: java.lang.String
  var recordTypeCompactLayoutMappings: js.Array[js.Object]
}

object CompactLayoutInfo {
  @scala.inline
  def apply(
    compactLayouts: js.Array[js.Object],
    defaultCompactLayoutId: java.lang.String,
    recordTypeCompactLayoutMappings: js.Array[js.Object]
  ): CompactLayoutInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compactLayouts")(compactLayouts)
    __obj.updateDynamic("defaultCompactLayoutId")(defaultCompactLayoutId)
    __obj.updateDynamic("recordTypeCompactLayoutMappings")(recordTypeCompactLayoutMappings)
    __obj.asInstanceOf[CompactLayoutInfo]
  }
}

