package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Advertiser List Response
  */
@js.native
trait SchemaAdvertisersListResponse extends js.Object {
  /**
    * Advertiser collection.
    */
  var advertisers: js.UndefOr[js.Array[SchemaAdvertiser]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertisersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaAdvertisersListResponse {
  @scala.inline
  def apply(): SchemaAdvertisersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertisersListResponse]
  }
  @scala.inline
  implicit class SchemaAdvertisersListResponseOps[Self <: SchemaAdvertisersListResponse] (val x: Self) extends AnyVal {
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
    def setAdvertisersVarargs(value: SchemaAdvertiser*): Self = this.set("advertisers", js.Array(value :_*))
    @scala.inline
    def setAdvertisers(value: js.Array[SchemaAdvertiser]): Self = this.set("advertisers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertisers: Self = this.set("advertisers", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

