package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Field Assignment.
  */
@js.native
trait SchemaCreativeFieldAssignment extends js.Object {
  /**
    * ID of the creative field.
    */
  var creativeFieldId: js.UndefOr[String] = js.native
  /**
    * ID of the creative field value.
    */
  var creativeFieldValueId: js.UndefOr[String] = js.native
}

object SchemaCreativeFieldAssignment {
  @scala.inline
  def apply(creativeFieldId: String = null, creativeFieldValueId: String = null): SchemaCreativeFieldAssignment = {
    val __obj = js.Dynamic.literal()
    if (creativeFieldId != null) __obj.updateDynamic("creativeFieldId")(creativeFieldId.asInstanceOf[js.Any])
    if (creativeFieldValueId != null) __obj.updateDynamic("creativeFieldValueId")(creativeFieldValueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreativeFieldAssignment]
  }
}

