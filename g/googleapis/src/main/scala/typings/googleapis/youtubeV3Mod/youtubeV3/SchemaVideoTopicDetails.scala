package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Freebase topic information related to the video.
  */
@js.native
trait SchemaVideoTopicDetails extends js.Object {
  /**
    * Similar to topic_id, except that these topics are merely relevant to the
    * video. These are topics that may be mentioned in, or appear in the video.
    * You can retrieve information about each topic using Freebase Topic API.
    */
  var relevantTopicIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of Wikipedia URLs that provide a high-level description of the
    * video&#39;s content.
    */
  var topicCategories: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of Freebase topic IDs that are centrally associated with the
    * video. These are topics that are centrally featured in the video, and it
    * can be said that the video is mainly about each of these. You can
    * retrieve information about each topic using the Freebase Topic API.
    */
  var topicIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaVideoTopicDetails {
  @scala.inline
  def apply(
    relevantTopicIds: js.Array[String] = null,
    topicCategories: js.Array[String] = null,
    topicIds: js.Array[String] = null
  ): SchemaVideoTopicDetails = {
    val __obj = js.Dynamic.literal()
    if (relevantTopicIds != null) __obj.updateDynamic("relevantTopicIds")(relevantTopicIds.asInstanceOf[js.Any])
    if (topicCategories != null) __obj.updateDynamic("topicCategories")(topicCategories.asInstanceOf[js.Any])
    if (topicIds != null) __obj.updateDynamic("topicIds")(topicIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoTopicDetails]
  }
}

