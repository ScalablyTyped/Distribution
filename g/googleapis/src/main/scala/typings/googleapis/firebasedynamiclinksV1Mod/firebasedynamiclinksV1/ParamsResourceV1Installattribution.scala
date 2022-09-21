package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1Installattribution
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGetIosPostInstallAttributionRequest] = js.undefined
}
object ParamsResourceV1Installattribution {
  
  inline def apply(): ParamsResourceV1Installattribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1Installattribution]
  }
  
  extension [Self <: ParamsResourceV1Installattribution](x: Self) {
    
    inline def setRequestBody(value: SchemaGetIosPostInstallAttributionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
