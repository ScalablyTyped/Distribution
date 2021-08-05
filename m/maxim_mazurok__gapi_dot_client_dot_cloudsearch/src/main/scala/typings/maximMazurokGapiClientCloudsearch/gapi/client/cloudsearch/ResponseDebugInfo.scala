package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseDebugInfo extends StObject {
  
  /** General debug info formatted for display. */
  var formattedDebugInfo: js.UndefOr[String] = js.undefined
}
object ResponseDebugInfo {
  
  inline def apply(): ResponseDebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseDebugInfo]
  }
  
  extension [Self <: ResponseDebugInfo](x: Self) {
    
    inline def setFormattedDebugInfo(value: String): Self = StObject.set(x, "formattedDebugInfo", value.asInstanceOf[js.Any])
    
    inline def setFormattedDebugInfoUndefined: Self = StObject.set(x, "formattedDebugInfo", js.undefined)
  }
}
