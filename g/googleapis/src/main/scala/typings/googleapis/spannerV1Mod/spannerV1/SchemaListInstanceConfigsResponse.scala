package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for ListInstanceConfigs.
  */
@js.native
trait SchemaListInstanceConfigsResponse extends js.Object {
  /**
    * The list of requested instance configurations.
    */
  var instanceConfigs: js.UndefOr[js.Array[SchemaInstanceConfig]] = js.native
  /**
    * `next_page_token` can be sent in a subsequent ListInstanceConfigs call to
    * fetch more of the matching instance configurations.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListInstanceConfigsResponse {
  @scala.inline
  def apply(instanceConfigs: js.Array[SchemaInstanceConfig] = null, nextPageToken: String = null): SchemaListInstanceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (instanceConfigs != null) __obj.updateDynamic("instanceConfigs")(instanceConfigs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListInstanceConfigsResponse]
  }
}

