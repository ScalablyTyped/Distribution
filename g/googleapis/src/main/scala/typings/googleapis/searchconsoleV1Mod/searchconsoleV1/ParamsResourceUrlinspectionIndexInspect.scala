package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUrlinspectionIndexInspect
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInspectUrlIndexRequest] = js.undefined
}
object ParamsResourceUrlinspectionIndexInspect {
  
  inline def apply(): ParamsResourceUrlinspectionIndexInspect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUrlinspectionIndexInspect]
  }
  
  extension [Self <: ParamsResourceUrlinspectionIndexInspect](x: Self) {
    
    inline def setRequestBody(value: SchemaInspectUrlIndexRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
