package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEntriesWrite
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWriteLogEntriesRequest] = js.undefined
}
object ParamsResourceEntriesWrite {
  
  inline def apply(): ParamsResourceEntriesWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEntriesWrite]
  }
  
  extension [Self <: ParamsResourceEntriesWrite](x: Self) {
    
    inline def setRequestBody(value: SchemaWriteLogEntriesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
