package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFormsWatchesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the Form.
    */
  var formId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the Watch to delete.
    */
  var watchId: js.UndefOr[String] = js.undefined
}
object ParamsResourceFormsWatchesDelete {
  
  inline def apply(): ParamsResourceFormsWatchesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFormsWatchesDelete]
  }
  
  extension [Self <: ParamsResourceFormsWatchesDelete](x: Self) {
    
    inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
    
    inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
    
    inline def setWatchId(value: String): Self = StObject.set(x, "watchId", value.asInstanceOf[js.Any])
    
    inline def setWatchIdUndefined: Self = StObject.set(x, "watchId", js.undefined)
  }
}
