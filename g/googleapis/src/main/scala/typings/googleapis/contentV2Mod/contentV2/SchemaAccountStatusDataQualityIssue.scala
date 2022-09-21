package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountStatusDataQualityIssue extends StObject {
  
  var country: js.UndefOr[String | Null] = js.undefined
  
  var destination: js.UndefOr[String | Null] = js.undefined
  
  var detail: js.UndefOr[String | Null] = js.undefined
  
  var displayedValue: js.UndefOr[String | Null] = js.undefined
  
  var exampleItems: js.UndefOr[js.Array[SchemaAccountStatusExampleItem]] = js.undefined
  
  var id: js.UndefOr[String | Null] = js.undefined
  
  var lastChecked: js.UndefOr[String | Null] = js.undefined
  
  var location: js.UndefOr[String | Null] = js.undefined
  
  var numItems: js.UndefOr[Double | Null] = js.undefined
  
  /**
    *  Acceptable values are: - "`critical`" - "`error`" - "`suggestion`"
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  var submittedValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountStatusDataQualityIssue {
  
  inline def apply(): SchemaAccountStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatusDataQualityIssue]
  }
  
  extension [Self <: SchemaAccountStatusDataQualityIssue](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDisplayedValue(value: String): Self = StObject.set(x, "displayedValue", value.asInstanceOf[js.Any])
    
    inline def setDisplayedValueNull: Self = StObject.set(x, "displayedValue", null)
    
    inline def setDisplayedValueUndefined: Self = StObject.set(x, "displayedValue", js.undefined)
    
    inline def setExampleItems(value: js.Array[SchemaAccountStatusExampleItem]): Self = StObject.set(x, "exampleItems", value.asInstanceOf[js.Any])
    
    inline def setExampleItemsUndefined: Self = StObject.set(x, "exampleItems", js.undefined)
    
    inline def setExampleItemsVarargs(value: SchemaAccountStatusExampleItem*): Self = StObject.set(x, "exampleItems", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastChecked(value: String): Self = StObject.set(x, "lastChecked", value.asInstanceOf[js.Any])
    
    inline def setLastCheckedNull: Self = StObject.set(x, "lastChecked", null)
    
    inline def setLastCheckedUndefined: Self = StObject.set(x, "lastChecked", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNumItems(value: Double): Self = StObject.set(x, "numItems", value.asInstanceOf[js.Any])
    
    inline def setNumItemsNull: Self = StObject.set(x, "numItems", null)
    
    inline def setNumItemsUndefined: Self = StObject.set(x, "numItems", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSubmittedValue(value: String): Self = StObject.set(x, "submittedValue", value.asInstanceOf[js.Any])
    
    inline def setSubmittedValueNull: Self = StObject.set(x, "submittedValue", null)
    
    inline def setSubmittedValueUndefined: Self = StObject.set(x, "submittedValue", js.undefined)
  }
}
