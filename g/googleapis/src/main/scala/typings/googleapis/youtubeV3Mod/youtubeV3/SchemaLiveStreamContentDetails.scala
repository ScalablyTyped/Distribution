package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed settings of a stream.
  */
@js.native
trait SchemaLiveStreamContentDetails extends js.Object {
  /**
    * The ingestion URL where the closed captions of this stream are sent.
    */
  var closedCaptionsIngestionUrl: js.UndefOr[String] = js.native
  /**
    * Indicates whether the stream is reusable, which means that it can be
    * bound to multiple broadcasts. It is common for broadcasters to reuse the
    * same stream for many different broadcasts if those broadcasts occur at
    * different times.  If you set this value to false, then the stream will
    * not be reusable, which means that it can only be bound to one broadcast.
    * Non-reusable streams differ from reusable streams in the following ways:
    * - A non-reusable stream can only be bound to one broadcast.  - A
    * non-reusable stream might be deleted by an automated process after the
    * broadcast ends.  - The  liveStreams.list method does not list
    * non-reusable streams if you call the method and set the mine parameter to
    * true. The only way to use that method to retrieve the resource for a
    * non-reusable stream is to use the id parameter to identify the stream.
    */
  var isReusable: js.UndefOr[Boolean] = js.native
}

object SchemaLiveStreamContentDetails {
  @scala.inline
  def apply(closedCaptionsIngestionUrl: String = null, isReusable: js.UndefOr[Boolean] = js.undefined): SchemaLiveStreamContentDetails = {
    val __obj = js.Dynamic.literal()
    if (closedCaptionsIngestionUrl != null) __obj.updateDynamic("closedCaptionsIngestionUrl")(closedCaptionsIngestionUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isReusable)) __obj.updateDynamic("isReusable")(isReusable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveStreamContentDetails]
  }
}

