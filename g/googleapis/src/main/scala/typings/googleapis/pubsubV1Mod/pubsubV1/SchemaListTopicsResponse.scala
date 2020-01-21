package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListTopics` method.
  */
@js.native
trait SchemaListTopicsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more topics that match the
    * request; this value should be passed in a new `ListTopicsRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The resulting topics.
    */
  var topics: js.UndefOr[js.Array[SchemaTopic]] = js.native
}

object SchemaListTopicsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, topics: js.Array[SchemaTopic] = null): SchemaListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTopicsResponse]
  }
}

