package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFormsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The form ID.
    */
  var formId: js.UndefOr[String] = js.undefined
}
object ParamsResourceFormsGet {
  
  inline def apply(): ParamsResourceFormsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFormsGet]
  }
  
  extension [Self <: ParamsResourceFormsGet](x: Self) {
    
    inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
    
    inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
  }
}
