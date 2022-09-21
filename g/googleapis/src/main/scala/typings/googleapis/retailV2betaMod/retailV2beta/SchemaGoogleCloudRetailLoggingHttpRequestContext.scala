package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailLoggingHttpRequestContext extends StObject {
  
  /**
    * The HTTP response status code for the request.
    */
  var responseStatusCode: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudRetailLoggingHttpRequestContext {
  
  inline def apply(): SchemaGoogleCloudRetailLoggingHttpRequestContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailLoggingHttpRequestContext]
  }
  
  extension [Self <: SchemaGoogleCloudRetailLoggingHttpRequestContext](x: Self) {
    
    inline def setResponseStatusCode(value: Double): Self = StObject.set(x, "responseStatusCode", value.asInstanceOf[js.Any])
    
    inline def setResponseStatusCodeNull: Self = StObject.set(x, "responseStatusCode", null)
    
    inline def setResponseStatusCodeUndefined: Self = StObject.set(x, "responseStatusCode", js.undefined)
  }
}
