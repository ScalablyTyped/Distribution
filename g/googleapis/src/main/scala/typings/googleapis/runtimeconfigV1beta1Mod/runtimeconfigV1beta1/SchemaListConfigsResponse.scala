package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `ListConfigs()` returns the following response. The order of returned
  * objects is arbitrary; that is, it is not ordered in any particular way.
  */
@js.native
trait SchemaListConfigsResponse extends js.Object {
  /**
    * A list of the configurations in the project. The order of returned
    * objects is arbitrary; that is, it is not ordered in any particular way.
    */
  var configs: js.UndefOr[js.Array[SchemaRuntimeConfig]] = js.native
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListConfigsResponse {
  @scala.inline
  def apply(configs: js.Array[SchemaRuntimeConfig] = null, nextPageToken: String = null): SchemaListConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (configs != null) __obj.updateDynamic("configs")(configs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListConfigsResponse]
  }
}

