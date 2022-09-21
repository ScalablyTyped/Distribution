package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsFetchverificationoptions
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The location to verify.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFetchVerificationOptionsRequest] = js.undefined
}
object ParamsResourceLocationsFetchverificationoptions {
  
  inline def apply(): ParamsResourceLocationsFetchverificationoptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsFetchverificationoptions]
  }
  
  extension [Self <: ParamsResourceLocationsFetchverificationoptions](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRequestBody(value: SchemaFetchVerificationOptionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
