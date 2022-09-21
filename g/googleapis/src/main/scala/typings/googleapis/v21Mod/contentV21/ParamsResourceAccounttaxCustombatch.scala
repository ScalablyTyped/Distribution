package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccounttaxCustombatch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAccounttaxCustomBatchRequest] = js.undefined
}
object ParamsResourceAccounttaxCustombatch {
  
  inline def apply(): ParamsResourceAccounttaxCustombatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccounttaxCustombatch]
  }
  
  extension [Self <: ParamsResourceAccounttaxCustombatch](x: Self) {
    
    inline def setRequestBody(value: SchemaAccounttaxCustomBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
