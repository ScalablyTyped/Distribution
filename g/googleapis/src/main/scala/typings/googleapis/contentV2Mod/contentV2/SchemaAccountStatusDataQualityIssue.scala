package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountStatusDataQualityIssue extends StObject {
  
  var country: js.UndefOr[String] = js.undefined
  
  var destination: js.UndefOr[String] = js.undefined
  
  var detail: js.UndefOr[String] = js.undefined
  
  var displayedValue: js.UndefOr[String] = js.undefined
  
  var exampleItems: js.UndefOr[js.Array[SchemaAccountStatusExampleItem]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var lastChecked: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var numItems: js.UndefOr[Double] = js.undefined
  
  var severity: js.UndefOr[String] = js.undefined
  
  var submittedValue: js.UndefOr[String] = js.undefined
}
object SchemaAccountStatusDataQualityIssue {
  
  @scala.inline
  def apply(): SchemaAccountStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatusDataQualityIssue]
  }
  
  @scala.inline
  implicit class SchemaAccountStatusDataQualityIssueMutableBuilder[Self <: SchemaAccountStatusDataQualityIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setDisplayedValue(value: String): Self = StObject.set(x, "displayedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedValueUndefined: Self = StObject.set(x, "displayedValue", js.undefined)
    
    @scala.inline
    def setExampleItems(value: js.Array[SchemaAccountStatusExampleItem]): Self = StObject.set(x, "exampleItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleItemsUndefined: Self = StObject.set(x, "exampleItems", js.undefined)
    
    @scala.inline
    def setExampleItemsVarargs(value: SchemaAccountStatusExampleItem*): Self = StObject.set(x, "exampleItems", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLastChecked(value: String): Self = StObject.set(x, "lastChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastCheckedUndefined: Self = StObject.set(x, "lastChecked", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setNumItems(value: Double): Self = StObject.set(x, "numItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumItemsUndefined: Self = StObject.set(x, "numItems", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setSubmittedValue(value: String): Self = StObject.set(x, "submittedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedValueUndefined: Self = StObject.set(x, "submittedValue", js.undefined)
  }
}
