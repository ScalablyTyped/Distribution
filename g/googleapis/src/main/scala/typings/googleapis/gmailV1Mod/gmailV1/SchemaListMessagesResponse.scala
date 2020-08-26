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
  def apply(): SchemaListMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMessagesResponse]
  }
  @scala.inline
  implicit class SchemaListMessagesResponseOps[Self <: SchemaListMessagesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessagesVarargs(value: SchemaMessage*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[SchemaMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setResultSizeEstimate(value: Double): Self = this.set("resultSizeEstimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultSizeEstimate: Self = this.set("resultSizeEstimate", js.undefined)
  }
  
}

