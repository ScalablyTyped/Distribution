package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceThreatlistupdatesFetch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequest] = js.undefined
}
object ParamsResourceThreatlistupdatesFetch {
  
  inline def apply(): ParamsResourceThreatlistupdatesFetch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceThreatlistupdatesFetch]
  }
  
  extension [Self <: ParamsResourceThreatlistupdatesFetch](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
