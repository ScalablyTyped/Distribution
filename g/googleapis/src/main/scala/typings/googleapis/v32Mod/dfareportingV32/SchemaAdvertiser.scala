package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a Campaign Manager advertiser.
  */
@js.native
trait SchemaAdvertiser extends js.Object {
  
  /**
    * Account ID of this advertiser.This is a read-only field that can be left
    * blank.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * ID of the advertiser group this advertiser belongs to. You can group
    * advertisers for reporting purposes, allowing you to see aggregated
    * information for all advertisers in each group.
    */
  var advertiserGroupId: js.UndefOr[String] = js.native
  
  /**
    * Suffix added to click-through URL of ad creative associations under this
    * advertiser. Must be less than 129 characters long.
    */
  var clickThroughUrlSuffix: js.UndefOr[String] = js.native
  
  /**
    * ID of the click-through event tag to apply by default to the landing
    * pages of this advertiser&#39;s campaigns.
    */
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.native
  
  /**
    * Default email address used in sender field for tag emails.
    */
  var defaultEmail: js.UndefOr[String] = js.native
  
  /**
    * Floodlight configuration ID of this advertiser. The floodlight
    * configuration ID will be created automatically, so on insert this field
    * should be left blank. This field can be set to another advertiser&#39;s
    * floodlight configuration ID in order to share that advertiser&#39;s
    * floodlight configuration with this advertiser, so long as:  - This
    * advertiser&#39;s original floodlight configuration is not already
    * associated with floodlight activities or floodlight activity groups.  -
    * This advertiser&#39;s original floodlight configuration is not already
    * shared with another advertiser.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the floodlight configuration. This is a
    * read-only, auto-generated field.
    */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * ID of this advertiser. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of this advertiser. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertiser&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this advertiser. This is a required field and must be less than
    * 256 characters long and unique among advertisers of the same account.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Original floodlight configuration before any sharing occurred. Set the
    * floodlightConfigurationId of this advertiser to
    * originalFloodlightConfigurationId to unshare the advertiser&#39;s current
    * floodlight configuration. You cannot unshare an advertiser&#39;s
    * floodlight configuration if the shared configuration has activities
    * associated with any campaign or placement.
    */
  var originalFloodlightConfigurationId: js.UndefOr[String] = js.native
  
  /**
    * Status of this advertiser.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Subaccount ID of this advertiser.This is a read-only field that can be
    * left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  
  /**
    * Suspension status of this advertiser.
    */
  var suspended: js.UndefOr[Boolean] = js.native
}
object SchemaAdvertiser {
  
  @scala.inline
  def apply(): SchemaAdvertiser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiser]
  }
  
  @scala.inline
  implicit class SchemaAdvertiserOps[Self <: SchemaAdvertiser] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAdvertiserGroupId(value: String): Self = this.set("advertiserGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserGroupId: Self = this.set("advertiserGroupId", js.undefined)
    
    @scala.inline
    def setClickThroughUrlSuffix(value: String): Self = this.set("clickThroughUrlSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughUrlSuffix: Self = this.set("clickThroughUrlSuffix", js.undefined)
    
    @scala.inline
    def setDefaultClickThroughEventTagId(value: String): Self = this.set("defaultClickThroughEventTagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultClickThroughEventTagId: Self = this.set("defaultClickThroughEventTagId", js.undefined)
    
    @scala.inline
    def setDefaultEmail(value: String): Self = this.set("defaultEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEmail: Self = this.set("defaultEmail", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationId(value: String): Self = this.set("floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightConfigurationId: Self = this.set("floodlightConfigurationId", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationIdDimensionValue(value: SchemaDimensionValue): Self = this.set("floodlightConfigurationIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightConfigurationIdDimensionValue: Self = this.set("floodlightConfigurationIdDimensionValue", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdDimensionValue(value: SchemaDimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOriginalFloodlightConfigurationId(value: String): Self = this.set("originalFloodlightConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalFloodlightConfigurationId: Self = this.set("originalFloodlightConfigurationId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setSuspended(value: Boolean): Self = this.set("suspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspended: Self = this.set("suspended", js.undefined)
  }
}
