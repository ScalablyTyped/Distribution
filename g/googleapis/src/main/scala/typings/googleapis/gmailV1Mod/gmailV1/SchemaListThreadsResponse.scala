package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListThreadsResponse extends js.Object {
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Estimated total number of results.
    */
  var resultSizeEstimate: js.UndefOr[Double] = js.native
  /**
    * List of threads. Note that each thread resource does not contain a list
    * of messages. The list of messages for a given thread can be fetched using
    * the threads.get method.
    */
  var threads: js.UndefOr[js.Array[SchemaThread]] = js.native
}

object SchemaListThreadsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    resultSizeEstimate: js.UndefOr[Double] = js.undefined,
    threads: js.Array[SchemaThread] = null
  ): SchemaListThreadsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(resultSizeEstimate)) __obj.updateDynamic("resultSizeEstimate")(resultSizeEstimate.get.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListThreadsResponse]
  }
}

