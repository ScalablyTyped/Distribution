package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFormsResponsesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The form ID.
    */
  var formId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The response ID within the form.
    */
  var responseId: js.UndefOr[String] = js.undefined
}
object ParamsResourceFormsResponsesGet {
  
  inline def apply(): ParamsResourceFormsResponsesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFormsResponsesGet]
  }
  
  extension [Self <: ParamsResourceFormsResponsesGet](x: Self) {
    
    inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
    
    inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
    
    inline def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    inline def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
  }
}
