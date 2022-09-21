package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFullhashesFind
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4FindFullHashesRequest] = js.undefined
}
object ParamsResourceFullhashesFind {
  
  inline def apply(): ParamsResourceFullhashesFind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFullhashesFind]
  }
  
  extension [Self <: ParamsResourceFullhashesFind](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleSecuritySafebrowsingV4FindFullHashesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
