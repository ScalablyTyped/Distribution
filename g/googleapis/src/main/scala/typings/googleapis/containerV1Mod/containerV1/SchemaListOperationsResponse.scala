package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListOperationsResponse is the result of ListOperationsRequest.
  */
@js.native
trait SchemaListOperationsResponse extends js.Object {
  /**
    * If any zones are listed here, the list of operations returned may be
    * missing the operations from those zones.
    */
  var missingZones: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of operations in the project in the specified zone.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.native
}

object SchemaListOperationsResponse {
  @scala.inline
  def apply(missingZones: js.Array[String] = null, operations: js.Array[SchemaOperation] = null): SchemaListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (missingZones != null) __obj.updateDynamic("missingZones")(missingZones.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListOperationsResponse]
  }
}

