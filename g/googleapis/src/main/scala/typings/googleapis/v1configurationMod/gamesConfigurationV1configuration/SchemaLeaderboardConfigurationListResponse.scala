package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a ListConfigurations response.
  */
@js.native
trait SchemaLeaderboardConfigurationListResponse extends js.Object {
  /**
    * The leaderboard configurations.
    */
  var items: js.UndefOr[js.Array[SchemaLeaderboardConfiguration]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#leaderboardConfigurationListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaLeaderboardConfigurationListResponse {
  @scala.inline
  def apply(
    items: js.Array[SchemaLeaderboardConfiguration] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaLeaderboardConfigurationListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLeaderboardConfigurationListResponse]
  }
}

