package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies a creative which has been associated with a given campaign.
  */
@js.native
trait SchemaCampaignCreativeAssociation extends js.Object {
  /**
    * ID of the creative associated with the campaign. This is a required
    * field.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#campaignCreativeAssociation&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaCampaignCreativeAssociation {
  @scala.inline
  def apply(): SchemaCampaignCreativeAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaignCreativeAssociation]
  }
  @scala.inline
  implicit class SchemaCampaignCreativeAssociationOps[Self <: SchemaCampaignCreativeAssociation] (val x: Self) extends AnyVal {
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
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

