package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudWebriskV1SearchUrisResponse extends StObject {
  
  /**
    * The threat list matches. This may be empty if the URI is on no list.
    */
  var threat: js.UndefOr[SchemaGoogleCloudWebriskV1SearchUrisResponseThreatUri] = js.undefined
}
object SchemaGoogleCloudWebriskV1SearchUrisResponse {
  
  inline def apply(): SchemaGoogleCloudWebriskV1SearchUrisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudWebriskV1SearchUrisResponse]
  }
  
  extension [Self <: SchemaGoogleCloudWebriskV1SearchUrisResponse](x: Self) {
    
    inline def setThreat(value: SchemaGoogleCloudWebriskV1SearchUrisResponseThreatUri): Self = StObject.set(x, "threat", value.asInstanceOf[js.Any])
    
    inline def setThreatUndefined: Self = StObject.set(x, "threat", js.undefined)
  }
}
