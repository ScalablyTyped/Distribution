package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response that returns all Composite Types supported by Deployment Manager
  */
@js.native
trait SchemaCompositeTypesListResponse extends js.Object {
  /**
    * Output only. A list of resource composite types supported by Deployment
    * Manager.
    */
  var compositeTypes: js.UndefOr[js.Array[SchemaCompositeType]] = js.native
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaCompositeTypesListResponse {
  @scala.inline
  def apply(compositeTypes: js.Array[SchemaCompositeType] = null, nextPageToken: String = null): SchemaCompositeTypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (compositeTypes != null) __obj.updateDynamic("compositeTypes")(compositeTypes.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompositeTypesListResponse]
  }
}

