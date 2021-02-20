package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a Campaign Manager advertiser.
  */
@js.native
trait SchemaAdvertiser extends StObject {
  
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
  implicit class SchemaAdvertiserMutableBuilder[Self <: SchemaAdvertiser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdvertiserGroupId(value: String): Self = StObject.set(x, "advertiserGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserGroupIdUndefined: Self = StObject.set(x, "advertiserGroupId", js.undefined)
    
    @scala.inline
    def setClickThroughUrlSuffix(value: String): Self = StObject.set(x, "clickThroughUrlSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrlSuffixUndefined: Self = StObject.set(x, "clickThroughUrlSuffix", js.undefined)
    
    @scala.inline
    def setDefaultClickThroughEventTagId(value: String): Self = StObject.set(x, "defaultClickThroughEventTagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultClickThroughEventTagIdUndefined: Self = StObject.set(x, "defaultClickThroughEventTagId", js.undefined)
    
    @scala.inline
    def setDefaultEmail(value: String): Self = StObject.set(x, "defaultEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEmailUndefined: Self = StObject.set(x, "defaultEmail", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationId(value: String): Self = StObject.set(x, "floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightConfigurationIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "floodlightConfigurationIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightConfigurationIdDimensionValueUndefined: Self = StObject.set(x, "floodlightConfigurationIdDimensionValue", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationIdUndefined: Self = StObject.set(x, "floodlightConfigurationId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginalFloodlightConfigurationId(value: String): Self = StObject.set(x, "originalFloodlightConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalFloodlightConfigurationIdUndefined: Self = StObject.set(x, "originalFloodlightConfigurationId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    @scala.inline
    def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
  }
}
