package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingTemplate extends StObject {
  
  /**
    * Account ID of this targeting template. This field, if left unset, will be auto-generated on insert and is read-only after insert.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Advertiser ID of this targeting template. This is a required field on insert and is read-only after insert.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Time and day targeting criteria.
    */
  var dayPartTargeting: js.UndefOr[SchemaDayPartTargeting] = js.undefined
  
  /**
    * Geographical targeting criteria.
    */
  var geoTargeting: js.UndefOr[SchemaGeoTargeting] = js.undefined
  
  /**
    * ID of this targeting template. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Key-value targeting criteria.
    */
  var keyValueTargetingExpression: js.UndefOr[SchemaKeyValueTargetingExpression] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#targetingTemplate".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Language targeting criteria.
    */
  var languageTargeting: js.UndefOr[SchemaLanguageTargeting] = js.undefined
  
  /**
    * Remarketing list targeting criteria.
    */
  var listTargetingExpression: js.UndefOr[SchemaListTargetingExpression] = js.undefined
  
  /**
    * Name of this targeting template. This field is required. It must be less than 256 characters long and unique within an advertiser.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subaccount ID of this targeting template. This field, if left unset, will be auto-generated on insert and is read-only after insert.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Technology platform targeting criteria.
    */
  var technologyTargeting: js.UndefOr[SchemaTechnologyTargeting] = js.undefined
}
object SchemaTargetingTemplate {
  
  inline def apply(): SchemaTargetingTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingTemplate]
  }
  
  extension [Self <: SchemaTargetingTemplate](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setDayPartTargeting(value: SchemaDayPartTargeting): Self = StObject.set(x, "dayPartTargeting", value.asInstanceOf[js.Any])
    
    inline def setDayPartTargetingUndefined: Self = StObject.set(x, "dayPartTargeting", js.undefined)
    
    inline def setGeoTargeting(value: SchemaGeoTargeting): Self = StObject.set(x, "geoTargeting", value.asInstanceOf[js.Any])
    
    inline def setGeoTargetingUndefined: Self = StObject.set(x, "geoTargeting", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKeyValueTargetingExpression(value: SchemaKeyValueTargetingExpression): Self = StObject.set(x, "keyValueTargetingExpression", value.asInstanceOf[js.Any])
    
    inline def setKeyValueTargetingExpressionUndefined: Self = StObject.set(x, "keyValueTargetingExpression", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguageTargeting(value: SchemaLanguageTargeting): Self = StObject.set(x, "languageTargeting", value.asInstanceOf[js.Any])
    
    inline def setLanguageTargetingUndefined: Self = StObject.set(x, "languageTargeting", js.undefined)
    
    inline def setListTargetingExpression(value: SchemaListTargetingExpression): Self = StObject.set(x, "listTargetingExpression", value.asInstanceOf[js.Any])
    
    inline def setListTargetingExpressionUndefined: Self = StObject.set(x, "listTargetingExpression", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdNull: Self = StObject.set(x, "subaccountId", null)
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setTechnologyTargeting(value: SchemaTechnologyTargeting): Self = StObject.set(x, "technologyTargeting", value.asInstanceOf[js.Any])
    
    inline def setTechnologyTargetingUndefined: Self = StObject.set(x, "technologyTargeting", js.undefined)
  }
}
