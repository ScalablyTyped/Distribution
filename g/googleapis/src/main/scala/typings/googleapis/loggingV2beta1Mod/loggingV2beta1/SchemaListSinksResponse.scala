package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result returned from ListSinks.
  */
@js.native
trait SchemaListSinksResponse extends js.Object {
  /**
    * If there might be more results than appear in this response, then
    * nextPageToken is included. To get the next set of results, call the same
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of sinks.
    */
  var sinks: js.UndefOr[js.Array[SchemaLogSink]] = js.native
}

object SchemaListSinksResponse {
  @scala.inline
  def apply(nextPageToken: String = null, sinks: js.Array[SchemaLogSink] = null): SchemaListSinksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sinks != null) __obj.updateDynamic("sinks")(sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListSinksResponse]
  }
}

