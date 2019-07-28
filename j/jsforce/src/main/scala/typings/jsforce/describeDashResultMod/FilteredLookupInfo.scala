package typings.jsforce.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteredLookupInfo extends js.Object {
  var controllingFields: js.Array[String]
  var dependent: Boolean
  var optionalFilter: Boolean
}

object FilteredLookupInfo {
  @scala.inline
  def apply(controllingFields: js.Array[String], dependent: Boolean, optionalFilter: Boolean): FilteredLookupInfo = {
    val __obj = js.Dynamic.literal(controllingFields = controllingFields, dependent = dependent, optionalFilter = optionalFilter)
  
    __obj.asInstanceOf[FilteredLookupInfo]
  }
}

