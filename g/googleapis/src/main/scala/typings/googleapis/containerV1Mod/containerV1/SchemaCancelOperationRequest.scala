package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CancelOperationRequest cancels a single operation.
  */
@js.native
trait SchemaCancelOperationRequest extends js.Object {
  /**
    * The name (project, location, operation id) of the operation to cancel.
    * Specified in the format &#39;projects/x/locations/x/operations/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. The server-assigned `name` of the operation. This field has
    * been deprecated and replaced by the name field.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840). This field has
    * been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the operation resides.
    * This field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaCancelOperationRequest {
  @scala.inline
  def apply(name: String = null, operationId: String = null, projectId: String = null, zone: String = null): SchemaCancelOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCancelOperationRequest]
  }
}

