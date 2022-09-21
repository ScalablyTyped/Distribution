package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceThreatmatchesFind
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesRequest] = js.undefined
}
object ParamsResourceThreatmatchesFind {
  
  inline def apply(): ParamsResourceThreatmatchesFind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceThreatmatchesFind]
  }
  
  extension [Self <: ParamsResourceThreatmatchesFind](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
