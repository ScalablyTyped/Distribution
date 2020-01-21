package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTypeProvidersListTypesResponse extends js.Object {
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. A list of resource type info.
    */
  var types: js.UndefOr[js.Array[SchemaTypeInfo]] = js.native
}

object SchemaTypeProvidersListTypesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, types: js.Array[SchemaTypeInfo] = null): SchemaTypeProvidersListTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTypeProvidersListTypesResponse]
  }
}

