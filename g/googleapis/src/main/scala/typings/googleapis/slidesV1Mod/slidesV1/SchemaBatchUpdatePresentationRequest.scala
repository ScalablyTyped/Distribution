package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchUpdatePresentationRequest extends StObject {
  
  /**
    * A list of updates to apply to the presentation.
    */
  var requests: js.UndefOr[js.Array[SchemaRequest]] = js.undefined
  
  /**
    * Provides control over how write requests are executed.
    */
  var writeControl: js.UndefOr[SchemaWriteControl] = js.undefined
}
object SchemaBatchUpdatePresentationRequest {
  
  inline def apply(): SchemaBatchUpdatePresentationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdatePresentationRequest]
  }
  
  extension [Self <: SchemaBatchUpdatePresentationRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaRequest*): Self = StObject.set(x, "requests", js.Array(value*))
    
    inline def setWriteControl(value: SchemaWriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
    
    inline def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
  }
}
