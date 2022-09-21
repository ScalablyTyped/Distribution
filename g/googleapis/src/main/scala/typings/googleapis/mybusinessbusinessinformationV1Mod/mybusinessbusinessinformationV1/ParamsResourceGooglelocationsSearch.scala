package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGooglelocationsSearch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSearchGoogleLocationsRequest] = js.undefined
}
object ParamsResourceGooglelocationsSearch {
  
  inline def apply(): ParamsResourceGooglelocationsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGooglelocationsSearch]
  }
  
  extension [Self <: ParamsResourceGooglelocationsSearch](x: Self) {
    
    inline def setRequestBody(value: SchemaSearchGoogleLocationsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
