package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A live stream describes a live ingestion point.
  */
@js.native
trait SchemaLiveStream extends js.Object {
  /**
    * The cdn object defines the live stream&#39;s content delivery network
    * (CDN) settings. These settings provide details about the manner in which
    * you stream your content to YouTube.
    */
  var cdn: js.UndefOr[SchemaCdnSettings] = js.native
  /**
    * The content_details object contains information about the stream,
    * including the closed captions ingestion URL.
    */
  var contentDetails: js.UndefOr[SchemaLiveStreamContentDetails] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube assigns to uniquely identify the stream.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#liveStream&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the stream, including its
    * channel, title, and description.
    */
  var snippet: js.UndefOr[SchemaLiveStreamSnippet] = js.native
  /**
    * The status object contains information about live stream&#39;s status.
    */
  var status: js.UndefOr[SchemaLiveStreamStatus] = js.native
}

object SchemaLiveStream {
  @scala.inline
  def apply(
    cdn: SchemaCdnSettings = null,
    contentDetails: SchemaLiveStreamContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: SchemaLiveStreamSnippet = null,
    status: SchemaLiveStreamStatus = null
  ): SchemaLiveStream = {
    val __obj = js.Dynamic.literal()
    if (cdn != null) __obj.updateDynamic("cdn")(cdn.asInstanceOf[js.Any])
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveStream]
  }
}

