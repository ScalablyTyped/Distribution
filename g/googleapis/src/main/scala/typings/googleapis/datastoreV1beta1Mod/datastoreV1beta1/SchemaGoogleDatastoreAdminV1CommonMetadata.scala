package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata common to all Datastore Admin operations.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1CommonMetadata extends js.Object {
  /**
    * The time the operation ended, either successfully or otherwise.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The client-assigned labels which were provided when the operation was
    * created. May also include additional labels.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The type of the operation. Can be used as a filter in
    * ListOperationsRequest.
    */
  var operationType: js.UndefOr[String] = js.native
  /**
    * The time that work began on the operation.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The current state of the Operation.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleDatastoreAdminV1CommonMetadata {
  @scala.inline
  def apply(
    endTime: String = null,
    labels: StringDictionary[String] = null,
    operationType: String = null,
    startTime: String = null,
    state: String = null
  ): SchemaGoogleDatastoreAdminV1CommonMetadata = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1CommonMetadata]
  }
}

