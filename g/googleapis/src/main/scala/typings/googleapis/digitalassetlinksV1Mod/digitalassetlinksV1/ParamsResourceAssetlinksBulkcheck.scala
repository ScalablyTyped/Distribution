package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAssetlinksBulkcheck
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBulkCheckRequest] = js.undefined
}
object ParamsResourceAssetlinksBulkcheck {
  
  inline def apply(): ParamsResourceAssetlinksBulkcheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAssetlinksBulkcheck]
  }
  
  extension [Self <: ParamsResourceAssetlinksBulkcheck](x: Self) {
    
    inline def setRequestBody(value: SchemaBulkCheckRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
