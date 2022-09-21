package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEntriesTail
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTailLogEntriesRequest] = js.undefined
}
object ParamsResourceEntriesTail {
  
  inline def apply(): ParamsResourceEntriesTail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEntriesTail]
  }
  
  extension [Self <: ParamsResourceEntriesTail](x: Self) {
    
    inline def setRequestBody(value: SchemaTailLogEntriesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
