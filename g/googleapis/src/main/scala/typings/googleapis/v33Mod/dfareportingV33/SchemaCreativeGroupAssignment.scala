package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Group Assignment.
  */
@js.native
trait SchemaCreativeGroupAssignment extends js.Object {
  /**
    * ID of the creative group to be assigned.
    */
  var creativeGroupId: js.UndefOr[String] = js.native
  /**
    * Creative group number of the creative group assignment.
    */
  var creativeGroupNumber: js.UndefOr[String] = js.native
}

object SchemaCreativeGroupAssignment {
  @scala.inline
  def apply(creativeGroupId: String = null, creativeGroupNumber: String = null): SchemaCreativeGroupAssignment = {
    val __obj = js.Dynamic.literal()
    if (creativeGroupId != null) __obj.updateDynamic("creativeGroupId")(creativeGroupId.asInstanceOf[js.Any])
    if (creativeGroupNumber != null) __obj.updateDynamic("creativeGroupNumber")(creativeGroupNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreativeGroupAssignment]
  }
}

