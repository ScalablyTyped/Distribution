package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemarketingList extends StObject {
  
  /**
    * Account ID of this remarketing list. This is a read-only, auto-generated field that is only returned in GET requests.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this remarketing list is active.
    */
  var active: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Dimension value for the advertiser ID that owns this remarketing list. This is a required field.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Remarketing list description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Remarketing list ID. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#remarketingList".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of days that a user should remain in the remarketing list without an impression. Acceptable values are 1 to 540, inclusive.
    */
  var lifeSpan: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rule used to populate the remarketing list with users.
    */
  var listPopulationRule: js.UndefOr[SchemaListPopulationRule] = js.undefined
  
  /**
    * Number of users currently in the list. This is a read-only field.
    */
  var listSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Product from which this remarketing list was originated.
    */
  var listSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the remarketing list. This is a required field. Must be no greater than 128 characters long.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subaccount ID of this remarketing list. This is a read-only, auto-generated field that is only returned in GET requests.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRemarketingList {
  
  inline def apply(): SchemaRemarketingList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemarketingList]
  }
  
  extension [Self <: SchemaRemarketingList](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveNull: Self = StObject.set(x, "active", null)
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLifeSpan(value: String): Self = StObject.set(x, "lifeSpan", value.asInstanceOf[js.Any])
    
    inline def setLifeSpanNull: Self = StObject.set(x, "lifeSpan", null)
    
    inline def setLifeSpanUndefined: Self = StObject.set(x, "lifeSpan", js.undefined)
    
    inline def setListPopulationRule(value: SchemaListPopulationRule): Self = StObject.set(x, "listPopulationRule", value.asInstanceOf[js.Any])
    
    inline def setListPopulationRuleUndefined: Self = StObject.set(x, "listPopulationRule", js.undefined)
    
    inline def setListSize(value: String): Self = StObject.set(x, "listSize", value.asInstanceOf[js.Any])
    
    inline def setListSizeNull: Self = StObject.set(x, "listSize", null)
    
    inline def setListSizeUndefined: Self = StObject.set(x, "listSize", js.undefined)
    
    inline def setListSource(value: String): Self = StObject.set(x, "listSource", value.asInstanceOf[js.Any])
    
    inline def setListSourceNull: Self = StObject.set(x, "listSource", null)
    
    inline def setListSourceUndefined: Self = StObject.set(x, "listSource", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdNull: Self = StObject.set(x, "subaccountId", null)
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
  }
}
