package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFormsWatchesList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. ID of the Form whose watches to list.
    */
  var formId: js.UndefOr[String] = js.undefined
}
object ParamsResourceFormsWatchesList {
  
  inline def apply(): ParamsResourceFormsWatchesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFormsWatchesList]
  }
  
  extension [Self <: ParamsResourceFormsWatchesList](x: Self) {
    
    inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
    
    inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
  }
}
