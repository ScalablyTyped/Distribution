package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This operation resource represents operations that may have happened or are
  * happening on the cluster. All fields are output only.
  */
@js.native
trait SchemaOperation extends js.Object {
  /**
    * Which conditions caused the current cluster state.
    */
  var clusterConditions: js.UndefOr[js.Array[SchemaStatusCondition]] = js.native
  /**
    * Detailed operation progress, if available.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * [Output only] The time the operation completed, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The name of the Google Compute Engine
    * [zone](/compute/docs/regions-zones/regions-zones#available) or
    * [region](/compute/docs/regions-zones/regions-zones#available) in which
    * the cluster resides.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The server-assigned ID for the operation.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Which conditions caused the current node pool state.
    */
  var nodepoolConditions: js.UndefOr[js.Array[SchemaStatusCondition]] = js.native
  /**
    * The operation type.
    */
  var operationType: js.UndefOr[String] = js.native
  /**
    * Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output only] The time the operation started, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The current status of the operation.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * If an error has occurred, a textual description of the error.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * Server-defined URL for the target of the operation.
    */
  var targetLink: js.UndefOr[String] = js.native
  /**
    * The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the operation is taking
    * place. This field is deprecated, use location instead.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaOperation {
  @scala.inline
  def apply(
    clusterConditions: js.Array[SchemaStatusCondition] = null,
    detail: String = null,
    endTime: String = null,
    location: String = null,
    name: String = null,
    nodepoolConditions: js.Array[SchemaStatusCondition] = null,
    operationType: String = null,
    selfLink: String = null,
    startTime: String = null,
    status: String = null,
    statusMessage: String = null,
    targetLink: String = null,
    zone: String = null
  ): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    if (clusterConditions != null) __obj.updateDynamic("clusterConditions")(clusterConditions.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodepoolConditions != null) __obj.updateDynamic("nodepoolConditions")(nodepoolConditions.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (targetLink != null) __obj.updateDynamic("targetLink")(targetLink.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperation]
  }
}

