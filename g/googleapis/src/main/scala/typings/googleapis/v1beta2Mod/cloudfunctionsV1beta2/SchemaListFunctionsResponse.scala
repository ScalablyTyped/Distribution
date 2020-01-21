package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListFunctions` method.
  */
@js.native
trait SchemaListFunctionsResponse extends js.Object {
  /**
    * The functions that match the request.
    */
  var functions: js.UndefOr[js.Array[SchemaCloudFunction]] = js.native
  /**
    * If not empty, indicates that there may be more functions that match the
    * request; this value should be passed in a new
    * google.cloud.functions.v1beta2.ListFunctionsRequest to get more
    * functions.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListFunctionsResponse {
  @scala.inline
  def apply(functions: js.Array[SchemaCloudFunction] = null, nextPageToken: String = null): SchemaListFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListFunctionsResponse]
  }
}

