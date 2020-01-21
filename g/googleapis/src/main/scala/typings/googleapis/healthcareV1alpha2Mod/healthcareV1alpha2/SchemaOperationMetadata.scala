package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OperationMetadata provides information about the operation execution.
  * Returned in the long-running operation&#39;s metadata field.
  */
@js.native
trait SchemaOperationMetadata extends js.Object {
  /**
    * The name of the API method that initiated the operation.
    */
  var apiMethodName: js.UndefOr[String] = js.native
  var counter: js.UndefOr[SchemaProgressCounter] = js.native
  /**
    * The time at which the operation was created by the API.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The time at which execution was completed.
    */
  var endTime: js.UndefOr[String] = js.native
}

object SchemaOperationMetadata {
  @scala.inline
  def apply(
    apiMethodName: String = null,
    counter: SchemaProgressCounter = null,
    createTime: String = null,
    endTime: String = null
  ): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (apiMethodName != null) __obj.updateDynamic("apiMethodName")(apiMethodName.asInstanceOf[js.Any])
    if (counter != null) __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
}

