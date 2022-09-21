package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInspectUrlIndexResponse extends StObject {
  
  /**
    * URL inspection results.
    */
  var inspectionResult: js.UndefOr[SchemaUrlInspectionResult] = js.undefined
}
object SchemaInspectUrlIndexResponse {
  
  inline def apply(): SchemaInspectUrlIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInspectUrlIndexResponse]
  }
  
  extension [Self <: SchemaInspectUrlIndexResponse](x: Self) {
    
    inline def setInspectionResult(value: SchemaUrlInspectionResult): Self = StObject.set(x, "inspectionResult", value.asInstanceOf[js.Any])
    
    inline def setInspectionResultUndefined: Self = StObject.set(x, "inspectionResult", js.undefined)
  }
}
