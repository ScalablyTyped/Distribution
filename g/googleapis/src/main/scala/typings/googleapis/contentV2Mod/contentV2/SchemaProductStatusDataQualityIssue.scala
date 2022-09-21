package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductStatusDataQualityIssue extends StObject {
  
  var destination: js.UndefOr[String | Null] = js.undefined
  
  var detail: js.UndefOr[String | Null] = js.undefined
  
  var fetchStatus: js.UndefOr[String | Null] = js.undefined
  
  var id: js.UndefOr[String | Null] = js.undefined
  
  var location: js.UndefOr[String | Null] = js.undefined
  
  var severity: js.UndefOr[String | Null] = js.undefined
  
  var timestamp: js.UndefOr[String | Null] = js.undefined
  
  var valueOnLandingPage: js.UndefOr[String | Null] = js.undefined
  
  var valueProvided: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductStatusDataQualityIssue {
  
  inline def apply(): SchemaProductStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductStatusDataQualityIssue]
  }
  
  extension [Self <: SchemaProductStatusDataQualityIssue](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setFetchStatus(value: String): Self = StObject.set(x, "fetchStatus", value.asInstanceOf[js.Any])
    
    inline def setFetchStatusNull: Self = StObject.set(x, "fetchStatus", null)
    
    inline def setFetchStatusUndefined: Self = StObject.set(x, "fetchStatus", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setValueOnLandingPage(value: String): Self = StObject.set(x, "valueOnLandingPage", value.asInstanceOf[js.Any])
    
    inline def setValueOnLandingPageNull: Self = StObject.set(x, "valueOnLandingPage", null)
    
    inline def setValueOnLandingPageUndefined: Self = StObject.set(x, "valueOnLandingPage", js.undefined)
    
    inline def setValueProvided(value: String): Self = StObject.set(x, "valueProvided", value.asInstanceOf[js.Any])
    
    inline def setValueProvidedNull: Self = StObject.set(x, "valueProvided", null)
    
    inline def setValueProvidedUndefined: Self = StObject.set(x, "valueProvided", js.undefined)
  }
}
