package typings.googleapis.v31Mod.dfareportingV31

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
  def apply(
    campaignCreativeAssociations: js.Array[SchemaCampaignCreativeAssociation] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaCampaignCreativeAssociationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (campaignCreativeAssociations != null) __obj.updateDynamic("campaignCreativeAssociations")(campaignCreativeAssociations.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCampaignCreativeAssociationsListResponse]
  }
}

