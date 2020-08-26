package typings.googleapis.containerV1beta1Mod.containerV1beta1

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
  def apply(): SchemaCancelOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCancelOperationRequest]
  }
  @scala.inline
  implicit class SchemaCancelOperationRequestOps[Self <: SchemaCancelOperationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

