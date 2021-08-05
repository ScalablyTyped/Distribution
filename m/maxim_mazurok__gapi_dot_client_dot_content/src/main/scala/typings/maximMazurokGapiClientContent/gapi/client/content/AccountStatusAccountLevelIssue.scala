package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountStatusAccountLevelIssue extends StObject {
  
  /** Country for which this issue is reported. */
  var country: js.UndefOr[String] = js.undefined
  
  /** The destination the issue applies to. If this field is empty then the issue applies to all available destinations. */
  var destination: js.UndefOr[String] = js.undefined
  
  /** Additional details about the issue. */
  var detail: js.UndefOr[String] = js.undefined
  
  /** The URL of a web page to help resolving this issue. */
  var documentation: js.UndefOr[String] = js.undefined
  
  /** Issue identifier. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Severity of the issue. Acceptable values are: - "`critical`" - "`error`" - "`suggestion`" */
  var severity: js.UndefOr[String] = js.undefined
  
  /** Short description of the issue. */
  var title: js.UndefOr[String] = js.undefined
}
object AccountStatusAccountLevelIssue {
  
  inline def apply(): AccountStatusAccountLevelIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatusAccountLevelIssue]
  }
  
  extension [Self <: AccountStatusAccountLevelIssue](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
