package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListTopics method.
  */
@js.native
trait SchemaListTopicsResponse extends js.Object {
  /**
    * If not empty, indicates that there are more topics that match the
    * request, and this value should be passed to the next
    * &lt;code&gt;ListTopicsRequest&lt;/code&gt; to continue.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The resulting topics.
    */
  var topic: js.UndefOr[js.Array[SchemaTopic]] = js.native
}

object SchemaListTopicsResponse {
  @scala.inline
  def apply(): SchemaListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTopicsResponse]
  }
  @scala.inline
  implicit class SchemaListTopicsResponseOps[Self <: SchemaListTopicsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTopicVarargs(value: SchemaTopic*): Self = this.set("topic", js.Array(value :_*))
    @scala.inline
    def setTopic(value: js.Array[SchemaTopic]): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
  
}

