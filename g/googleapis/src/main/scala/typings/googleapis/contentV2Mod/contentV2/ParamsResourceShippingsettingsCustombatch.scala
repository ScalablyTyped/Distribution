package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceShippingsettingsCustombatch
  extends StObject
     with StandardParameters {
  
  /**
    * Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaShippingsettingsCustomBatchRequest] = js.undefined
}
object ParamsResourceShippingsettingsCustombatch {
  
  inline def apply(): ParamsResourceShippingsettingsCustombatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceShippingsettingsCustombatch]
  }
  
  extension [Self <: ParamsResourceShippingsettingsCustombatch](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setRequestBody(value: SchemaShippingsettingsCustomBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
