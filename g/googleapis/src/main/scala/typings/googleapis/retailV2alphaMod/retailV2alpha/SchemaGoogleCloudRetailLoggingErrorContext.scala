package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailLoggingErrorContext extends StObject {
  
  /**
    * The HTTP request which was processed when the error was triggered.
    */
  var httpRequest: js.UndefOr[SchemaGoogleCloudRetailLoggingHttpRequestContext] = js.undefined
  
  /**
    * The location in the source code where the decision was made to report the error, usually the place where it was logged.
    */
  var reportLocation: js.UndefOr[SchemaGoogleCloudRetailLoggingSourceLocation] = js.undefined
}
object SchemaGoogleCloudRetailLoggingErrorContext {
  
  inline def apply(): SchemaGoogleCloudRetailLoggingErrorContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailLoggingErrorContext]
  }
  
  extension [Self <: SchemaGoogleCloudRetailLoggingErrorContext](x: Self) {
    
    inline def setHttpRequest(value: SchemaGoogleCloudRetailLoggingHttpRequestContext): Self = StObject.set(x, "httpRequest", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestUndefined: Self = StObject.set(x, "httpRequest", js.undefined)
    
    inline def setReportLocation(value: SchemaGoogleCloudRetailLoggingSourceLocation): Self = StObject.set(x, "reportLocation", value.asInstanceOf[js.Any])
    
    inline def setReportLocationUndefined: Self = StObject.set(x, "reportLocation", js.undefined)
  }
}
