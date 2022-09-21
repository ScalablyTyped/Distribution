package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetableRemarketingList extends StObject {
  
  /**
    * Account ID of this remarketing list. This is a read-only, auto-generated field that is only returned in GET requests.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this targetable remarketing list is active.
    */
  var active: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Dimension value for the advertiser ID that owns this targetable remarketing list.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the advertiser.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Targetable remarketing list description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Targetable remarketing list ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#targetableRemarketingList".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of days that a user should remain in the targetable remarketing list without an impression.
    */
  var lifeSpan: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of users currently in the list. This is a read-only field.
    */
  var listSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Product from which this targetable remarketing list was originated.
    */
  var listSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the targetable remarketing list. Is no greater than 128 characters long.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subaccount ID of this remarketing list. This is a read-only, auto-generated field that is only returned in GET requests.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetableRemarketingList {
  
  inline def apply(): SchemaTargetableRemarketingList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetableRemarketingList]
  }
  
  extension [Self <: SchemaTargetableRemarketingList](x: Self) {
    
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
