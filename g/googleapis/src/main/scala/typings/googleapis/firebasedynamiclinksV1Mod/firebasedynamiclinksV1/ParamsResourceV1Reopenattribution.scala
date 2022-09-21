package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1Reopenattribution
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGetIosReopenAttributionRequest] = js.undefined
}
object ParamsResourceV1Reopenattribution {
  
  inline def apply(): ParamsResourceV1Reopenattribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1Reopenattribution]
  }
  
  extension [Self <: ParamsResourceV1Reopenattribution](x: Self) {
    
    inline def setRequestBody(value: SchemaGetIosReopenAttributionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
