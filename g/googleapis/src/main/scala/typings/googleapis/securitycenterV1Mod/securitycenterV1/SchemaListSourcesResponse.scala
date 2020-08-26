package typings.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing sources.
  */
@js.native
trait SchemaListSourcesResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Sources belonging to the requested parent.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
}

object SchemaListSourcesResponse {
  @scala.inline
  def apply(): SchemaListSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSourcesResponse]
  }
  @scala.inline
  implicit class SchemaListSourcesResponseOps[Self <: SchemaListSourcesResponse] (val x: Self) extends AnyVal {
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
    def setSourcesVarargs(value: SchemaSource*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[SchemaSource]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
  }
  
}

