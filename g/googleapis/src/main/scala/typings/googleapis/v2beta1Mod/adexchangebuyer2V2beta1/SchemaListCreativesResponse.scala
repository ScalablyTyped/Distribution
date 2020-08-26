package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response for listing creatives.
  */
@js.native
trait SchemaListCreativesResponse extends js.Object {
  /**
    * The list of creatives.
    */
  var creatives: js.UndefOr[js.Array[SchemaCreative]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListCreativesRequest.page_token field in the subsequent call to
    * `ListCreatives` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCreativesResponse {
  @scala.inline
  def apply(): SchemaListCreativesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCreativesResponse]
  }
  @scala.inline
  implicit class SchemaListCreativesResponseOps[Self <: SchemaListCreativesResponse] (val x: Self) extends AnyVal {
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
    def setCreativesVarargs(value: SchemaCreative*): Self = this.set("creatives", js.Array(value :_*))
    @scala.inline
    def setCreatives(value: js.Array[SchemaCreative]): Self = this.set("creatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatives: Self = this.set("creatives", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

