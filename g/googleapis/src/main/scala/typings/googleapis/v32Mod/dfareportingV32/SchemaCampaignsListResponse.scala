package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Campaign List Response
  */
@js.native
trait SchemaCampaignsListResponse extends js.Object {
  /**
    * Campaign collection.
    */
  var campaigns: js.UndefOr[js.Array[SchemaCampaign]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#campaignsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaCampaignsListResponse {
  @scala.inline
  def apply(): SchemaCampaignsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaignsListResponse]
  }
  @scala.inline
  implicit class SchemaCampaignsListResponseOps[Self <: SchemaCampaignsListResponse] (val x: Self) extends AnyVal {
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
    def setCampaignsVarargs(value: SchemaCampaign*): Self = this.set("campaigns", js.Array(value :_*))
    @scala.inline
    def setCampaigns(value: js.Array[SchemaCampaign]): Self = this.set("campaigns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaigns: Self = this.set("campaigns", js.undefined)
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

