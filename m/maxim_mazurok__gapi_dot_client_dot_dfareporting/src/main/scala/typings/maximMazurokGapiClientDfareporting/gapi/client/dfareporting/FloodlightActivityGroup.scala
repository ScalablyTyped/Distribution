package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloodlightActivityGroup extends StObject {
  
  /** Account ID of this floodlight activity group. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Advertiser ID of this floodlight activity group. If this field is left blank, the value will be copied over either from the floodlight configuration's advertiser or from the
    * existing activity group's advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Floodlight configuration ID of this floodlight activity group. This is a required field. */
  var floodlightConfigurationId: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated field. */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** ID of this floodlight activity group. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of this floodlight activity group. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivityGroup". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of this floodlight activity group. This is a required field. Must be less than 65 characters long and cannot contain quotes. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Subaccount ID of this floodlight activity group. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the type= parameter in the floodlight tag, which the ad servers use to identify the activity group that the activity belongs to. This is optional: if empty, a new tag
    * string will be generated for you. This string must be 1 to 8 characters long, with valid characters being a-z0-9[ _ ]. This tag string must also be unique among activity groups of
    * the same floodlight configuration. This field is read-only after insertion.
    */
  var tagString: js.UndefOr[String] = js.undefined
  
  /** Type of the floodlight activity group. This is a required field that is read-only after insertion. */
  var `type`: js.UndefOr[String] = js.undefined
}
object FloodlightActivityGroup {
  
  inline def apply(): FloodlightActivityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivityGroup]
  }
  
  extension [Self <: FloodlightActivityGroup](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setFloodlightConfigurationId(value: String): Self = StObject.set(x, "floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigurationIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "floodlightConfigurationIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigurationIdDimensionValueUndefined: Self = StObject.set(x, "floodlightConfigurationIdDimensionValue", js.undefined)
    
    inline def setFloodlightConfigurationIdUndefined: Self = StObject.set(x, "floodlightConfigurationId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setTagString(value: String): Self = StObject.set(x, "tagString", value.asInstanceOf[js.Any])
    
    inline def setTagStringUndefined: Self = StObject.set(x, "tagString", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
