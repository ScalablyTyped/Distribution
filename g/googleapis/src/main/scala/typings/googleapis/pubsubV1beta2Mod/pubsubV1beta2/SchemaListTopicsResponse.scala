package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

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
    def setTopicsVarargs(value: SchemaTopic*): Self = this.set("topics", js.Array(value :_*))
    @scala.inline
    def setTopics(value: js.Array[SchemaTopic]): Self = this.set("topics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopics: Self = this.set("topics", js.undefined)
  }
  
}

