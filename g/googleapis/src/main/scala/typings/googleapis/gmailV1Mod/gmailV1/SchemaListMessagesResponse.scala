package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListMessagesResponse extends js.Object {
  /**
    * List of messages. Note that each message resource contains only an id and
    * a threadId. Additional message details can be fetched using the
    * messages.get method.
    */
  var messages: js.UndefOr[js.Array[SchemaMessage]] = js.native
  /**
    * Token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Estimated total number of results.
    */
  var resultSizeEstimate: js.UndefOr[Double] = js.native
}

object SchemaListMessagesResponse {
  @scala.inline
  def apply(
    messages: js.Array[SchemaMessage] = null,
    nextPageToken: String = null,
    resultSizeEstimate: js.UndefOr[Double] = js.undefined
  ): SchemaListMessagesResponse = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(resultSizeEstimate)) __obj.updateDynamic("resultSizeEstimate")(resultSizeEstimate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListMessagesResponse]
  }
}

