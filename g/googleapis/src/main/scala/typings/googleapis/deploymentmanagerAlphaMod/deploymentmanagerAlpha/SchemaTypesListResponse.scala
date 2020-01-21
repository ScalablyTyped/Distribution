package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response that returns all Types supported by Deployment Manager
  */
@js.native
trait SchemaTypesListResponse extends js.Object {
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. A list of resource types supported by Deployment Manager.
    */
  var types: js.UndefOr[js.Array[SchemaType]] = js.native
}

object SchemaTypesListResponse {
  @scala.inline
  def apply(nextPageToken: String = null, types: js.Array[SchemaType] = null): SchemaTypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTypesListResponse]
  }
}

