package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a GetTemplate request.
  */
@js.native
trait SchemaGetTemplateResponse extends js.Object {
  /**
    * The template metadata describing the template name, available parameters,
    * etc.
    */
  var metadata: js.UndefOr[SchemaTemplateMetadata] = js.native
  /**
    * The status of the get template request. Any problems with the request
    * will be indicated in the error_details.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object SchemaGetTemplateResponse {
  @scala.inline
  def apply(metadata: SchemaTemplateMetadata = null, status: SchemaStatus = null): SchemaGetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetTemplateResponse]
  }
}

