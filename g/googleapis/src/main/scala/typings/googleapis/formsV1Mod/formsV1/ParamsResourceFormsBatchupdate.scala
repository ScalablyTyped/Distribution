package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFormsBatchupdate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The form ID.
    */
  var formId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchUpdateFormRequest] = js.undefined
}
object ParamsResourceFormsBatchupdate {
  
  inline def apply(): ParamsResourceFormsBatchupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFormsBatchupdate]
  }
  
  extension [Self <: ParamsResourceFormsBatchupdate](x: Self) {
    
    inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
    
    inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchUpdateFormRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
