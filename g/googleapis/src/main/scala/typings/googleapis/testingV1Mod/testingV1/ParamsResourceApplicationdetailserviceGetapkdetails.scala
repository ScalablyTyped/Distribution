package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceApplicationdetailserviceGetapkdetails
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFileReference] = js.undefined
}
object ParamsResourceApplicationdetailserviceGetapkdetails {
  
  inline def apply(): ParamsResourceApplicationdetailserviceGetapkdetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceApplicationdetailserviceGetapkdetails]
  }
  
  extension [Self <: ParamsResourceApplicationdetailserviceGetapkdetails](x: Self) {
    
    inline def setRequestBody(value: SchemaFileReference): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
