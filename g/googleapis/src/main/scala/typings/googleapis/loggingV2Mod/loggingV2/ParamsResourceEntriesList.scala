package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEntriesList
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaListLogEntriesRequest] = js.undefined
}
object ParamsResourceEntriesList {
  
  inline def apply(): ParamsResourceEntriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEntriesList]
  }
  
  extension [Self <: ParamsResourceEntriesList](x: Self) {
    
    inline def setRequestBody(value: SchemaListLogEntriesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
