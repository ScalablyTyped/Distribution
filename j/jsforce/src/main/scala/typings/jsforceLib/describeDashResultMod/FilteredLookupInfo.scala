package typings
package jsforceLib.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteredLookupInfo extends js.Object {
  var controllingFields: js.Array[java.lang.String]
  var dependent: scala.Boolean
  var optionalFilter: scala.Boolean
}

object FilteredLookupInfo {
  @scala.inline
  def apply(
    controllingFields: js.Array[java.lang.String],
    dependent: scala.Boolean,
    optionalFilter: scala.Boolean
  ): FilteredLookupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("controllingFields")(controllingFields)
    __obj.updateDynamic("dependent")(dependent)
    __obj.updateDynamic("optionalFilter")(optionalFilter)
    __obj.asInstanceOf[FilteredLookupInfo]
  }
}

