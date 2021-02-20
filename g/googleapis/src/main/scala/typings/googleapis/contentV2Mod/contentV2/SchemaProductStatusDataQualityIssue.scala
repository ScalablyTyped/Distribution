package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProductStatusDataQualityIssue extends StObject {
  
  var destination: js.UndefOr[String] = js.native
  
  var detail: js.UndefOr[String] = js.native
  
  var fetchStatus: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var severity: js.UndefOr[String] = js.native
  
  var timestamp: js.UndefOr[String] = js.native
  
  var valueOnLandingPage: js.UndefOr[String] = js.native
  
  var valueProvided: js.UndefOr[String] = js.native
}
object SchemaProductStatusDataQualityIssue {
  
  @scala.inline
  def apply(): SchemaProductStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductStatusDataQualityIssue]
  }
  
  @scala.inline
  implicit class SchemaProductStatusDataQualityIssueMutableBuilder[Self <: SchemaProductStatusDataQualityIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setFetchStatus(value: String): Self = StObject.set(x, "fetchStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchStatusUndefined: Self = StObject.set(x, "fetchStatus", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setValueOnLandingPage(value: String): Self = StObject.set(x, "valueOnLandingPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueOnLandingPageUndefined: Self = StObject.set(x, "valueOnLandingPage", js.undefined)
    
    @scala.inline
    def setValueProvided(value: String): Self = StObject.set(x, "valueProvided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueProvidedUndefined: Self = StObject.set(x, "valueProvided", js.undefined)
  }
}
