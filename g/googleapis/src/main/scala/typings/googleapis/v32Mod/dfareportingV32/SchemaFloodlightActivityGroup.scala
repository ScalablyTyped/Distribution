package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a Floodlight activity group.
  */
@js.native
trait SchemaFloodlightActivityGroup extends StObject {
  
  /**
    * Account ID of this floodlight activity group. This is a read-only field
    * that can be left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Advertiser ID of this floodlight activity group. If this field is left
    * blank, the value will be copied over either from the floodlight
    * configuration&#39;s advertiser or from the existing activity group&#39;s
    * advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Floodlight configuration ID of this floodlight activity group. This is a
    * required field.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the floodlight configuration. This is a
    * read-only, auto-generated field.
    */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * ID of this floodlight activity group. This is a read-only, auto-generated
    * field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of this floodlight activity group. This is a
    * read-only, auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivityGroup&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this floodlight activity group. This is a required field. Must be
    * less than 65 characters long and cannot contain quotes.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Subaccount ID of this floodlight activity group. This is a read-only
    * field that can be left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  
  /**
    * Value of the type= parameter in the floodlight tag, which the ad servers
    * use to identify the activity group that the activity belongs to. This is
    * optional: if empty, a new tag string will be generated for you. This
    * string must be 1 to 8 characters long, with valid characters being
    * [a-z][A-Z][0-9][-][ _ ]. This tag string must also be unique among
    * activity groups of the same floodlight configuration. This field is
    * read-only after insertion.
    */
  var tagString: js.UndefOr[String] = js.native
  
  /**
    * Type of the floodlight activity group. This is a required field that is
    * read-only after insertion.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaFloodlightActivityGroup {
  
  @scala.inline
  def apply(): SchemaFloodlightActivityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivityGroup]
  }
  
  @scala.inline
  implicit class SchemaFloodlightActivityGroupMutableBuilder[Self <: SchemaFloodlightActivityGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
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
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    @scala.inline
    def setTagString(value: String): Self = StObject.set(x, "tagString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagStringUndefined: Self = StObject.set(x, "tagString", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
