package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Campaign Creative Association List Response
  */
@js.native
trait SchemaCampaignCreativeAssociationsListResponse extends js.Object {
  /**
    * Campaign creative association collection
    */
  var campaignCreativeAssociations: js.UndefOr[js.Array[SchemaCampaignCreativeAssociation]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#campaignCreativeAssociationsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaCampaignCreativeAssociationsListResponse {
  @scala.inline
  def apply(): SchemaCampaignCreativeAssociationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaignCreativeAssociationsListResponse]
  }
  @scala.inline
  implicit class SchemaCampaignCreativeAssociationsListResponseOps[Self <: SchemaCampaignCreativeAssociationsListResponse] (val x: Self) extends AnyVal {
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
    def setCampaignCreativeAssociationsVarargs(value: SchemaCampaignCreativeAssociation*): Self = this.set("campaignCreativeAssociations", js.Array(value :_*))
    @scala.inline
    def setCampaignCreativeAssociations(value: js.Array[SchemaCampaignCreativeAssociation]): Self = this.set("campaignCreativeAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignCreativeAssociations: Self = this.set("campaignCreativeAssociations", js.undefined)
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

