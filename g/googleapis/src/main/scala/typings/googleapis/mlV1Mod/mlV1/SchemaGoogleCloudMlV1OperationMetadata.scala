package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the metadata of the long-running operation.
  */
@js.native
trait SchemaGoogleCloudMlV1OperationMetadata extends js.Object {
  /**
    * The time the operation was submitted.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The time operation processing completed.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Indicates whether a request to cancel this operation has been made.
    */
  var isCancellationRequested: js.UndefOr[Boolean] = js.native
  /**
    * The user labels, inherited from the model or the model version being
    * operated on.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Contains the name of the model associated with the operation.
    */
  var modelName: js.UndefOr[String] = js.native
  /**
    * The operation type.
    */
  var operationType: js.UndefOr[String] = js.native
  /**
    * Contains the project number associated with the operation.
    */
  var projectNumber: js.UndefOr[String] = js.native
  /**
    * The time operation processing started.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Contains the version associated with the operation.
    */
  var version: js.UndefOr[SchemaGoogleCloudMlV1Version] = js.native
}

object SchemaGoogleCloudMlV1OperationMetadata {
  @scala.inline
  def apply(
    createTime: String = null,
    endTime: String = null,
    isCancellationRequested: js.UndefOr[Boolean] = js.undefined,
    labels: StringDictionary[String] = null,
    modelName: String = null,
    operationType: String = null,
    projectNumber: String = null,
    startTime: String = null,
    version: SchemaGoogleCloudMlV1Version = null
  ): SchemaGoogleCloudMlV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (!js.isUndefined(isCancellationRequested)) __obj.updateDynamic("isCancellationRequested")(isCancellationRequested.get.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (modelName != null) __obj.updateDynamic("modelName")(modelName.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (projectNumber != null) __obj.updateDynamic("projectNumber")(projectNumber.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1OperationMetadata]
  }
}

