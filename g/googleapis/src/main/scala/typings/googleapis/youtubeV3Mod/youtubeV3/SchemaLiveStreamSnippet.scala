package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveStreamSnippet extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the channel that is
    * transmitting the stream.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The stream&#39;s description. The value cannot be longer than 10000
    * characters.
    */
  var description: js.UndefOr[String] = js.native
  var isDefaultStream: js.UndefOr[Boolean] = js.native
  /**
    * The date and time that the stream was created. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * The stream&#39;s title. The value must be between 1 and 128 characters
    * long.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaLiveStreamSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    description: String = null,
    isDefaultStream: js.UndefOr[Boolean] = js.undefined,
    publishedAt: String = null,
    title: String = null
  ): SchemaLiveStreamSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultStream)) __obj.updateDynamic("isDefaultStream")(isDefaultStream.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveStreamSnippet]
  }
}

