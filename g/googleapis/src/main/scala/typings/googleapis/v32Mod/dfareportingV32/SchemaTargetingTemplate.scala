package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a targeting template. A targeting template
  * encapsulates targeting information which can be reused across multiple ads.
  */
trait SchemaTargetingTemplate extends StObject {
  
  /**
    * Account ID of this targeting template. This field, if left unset, will be
    * auto-generated on insert and is read-only after insert.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Advertiser ID of this targeting template. This is a required field on
    * insert and is read-only after insert.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
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
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Key-value targeting criteria.
    */
  var keyValueTargetingExpression: js.UndefOr[SchemaKeyValueTargetingExpression] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#targetingTemplate&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Language targeting criteria.
    */
  var languageTargeting: js.UndefOr[SchemaLanguageTargeting] = js.undefined
  
  /**
    * Remarketing list targeting criteria.
    */
  var listTargetingExpression: js.UndefOr[SchemaListTargetingExpression] = js.undefined
  
  /**
    * Name of this targeting template. This field is required. It must be less
    * than 256 characters long and unique within an advertiser.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Subaccount ID of this targeting template. This field, if left unset, will
    * be auto-generated on insert and is read-only after insert.
    */
  var subaccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Technology platform targeting criteria.
    */
  var technologyTargeting: js.UndefOr[SchemaTechnologyTargeting] = js.undefined
}
object SchemaTargetingTemplate {
  
  @scala.inline
  def apply(): SchemaTargetingTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingTemplate]
  }
  
  @scala.inline
  implicit class SchemaTargetingTemplateMutableBuilder[Self <: SchemaTargetingTemplate] (val x: Self) extends AnyVal {
    
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
    def setDayPartTargeting(value: SchemaDayPartTargeting): Self = StObject.set(x, "dayPartTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayPartTargetingUndefined: Self = StObject.set(x, "dayPartTargeting", js.undefined)
    
    @scala.inline
    def setGeoTargeting(value: SchemaGeoTargeting): Self = StObject.set(x, "geoTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoTargetingUndefined: Self = StObject.set(x, "geoTargeting", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKeyValueTargetingExpression(value: SchemaKeyValueTargetingExpression): Self = StObject.set(x, "keyValueTargetingExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValueTargetingExpressionUndefined: Self = StObject.set(x, "keyValueTargetingExpression", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLanguageTargeting(value: SchemaLanguageTargeting): Self = StObject.set(x, "languageTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageTargetingUndefined: Self = StObject.set(x, "languageTargeting", js.undefined)
    
    @scala.inline
    def setListTargetingExpression(value: SchemaListTargetingExpression): Self = StObject.set(x, "listTargetingExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTargetingExpressionUndefined: Self = StObject.set(x, "listTargetingExpression", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    @scala.inline
    def setTechnologyTargeting(value: SchemaTechnologyTargeting): Self = StObject.set(x, "technologyTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechnologyTargetingUndefined: Self = StObject.set(x, "technologyTargeting", js.undefined)
  }
}
