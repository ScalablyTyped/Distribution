package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVulnerableHeaders extends StObject {
  
  /**
    * List of vulnerable headers.
    */
  var headers: js.UndefOr[js.Array[SchemaHeader]] = js.undefined
  
  /**
    * List of missing headers.
    */
  var missingHeaders: js.UndefOr[js.Array[SchemaHeader]] = js.undefined
}
object SchemaVulnerableHeaders {
  
  inline def apply(): SchemaVulnerableHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVulnerableHeaders]
  }
  
  extension [Self <: SchemaVulnerableHeaders](x: Self) {
    
    inline def setHeaders(value: js.Array[SchemaHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: SchemaHeader*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setMissingHeaders(value: js.Array[SchemaHeader]): Self = StObject.set(x, "missingHeaders", value.asInstanceOf[js.Any])
    
    inline def setMissingHeadersUndefined: Self = StObject.set(x, "missingHeaders", js.undefined)
    
    inline def setMissingHeadersVarargs(value: SchemaHeader*): Self = StObject.set(x, "missingHeaders", js.Array(value*))
  }
}
