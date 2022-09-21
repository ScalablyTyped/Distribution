package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFormsWatchesRenew
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the Form.
    */
  var formId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRenewWatchRequest] = js.undefined
  
  /**
    * Required. The ID of the Watch to renew.
    */
  var watchId: js.UndefOr[String] = js.undefined
}
object ParamsResourceFormsWatchesRenew {
  
  inline def apply(): ParamsResourceFormsWatchesRenew = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFormsWatchesRenew]
  }
  
  extension [Self <: ParamsResourceFormsWatchesRenew](x: Self) {
    
    inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
    
    inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
    
    inline def setRequestBody(value: SchemaRenewWatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWatchId(value: String): Self = StObject.set(x, "watchId", value.asInstanceOf[js.Any])
    
    inline def setWatchIdUndefined: Self = StObject.set(x, "watchId", js.undefined)
  }
}
