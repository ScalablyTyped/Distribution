package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFormsWatchesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. ID of the Form to watch.
    */
  var formId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCreateWatchRequest] = js.undefined
}
object ParamsResourceFormsWatchesCreate {
  
  inline def apply(): ParamsResourceFormsWatchesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFormsWatchesCreate]
  }
  
  extension [Self <: ParamsResourceFormsWatchesCreate](x: Self) {
    
    inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
    
    inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
    
    inline def setRequestBody(value: SchemaCreateWatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
