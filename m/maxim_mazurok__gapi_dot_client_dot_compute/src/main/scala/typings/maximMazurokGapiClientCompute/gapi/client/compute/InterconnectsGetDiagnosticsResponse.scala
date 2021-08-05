package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterconnectsGetDiagnosticsResponse extends StObject {
  
  var result: js.UndefOr[InterconnectDiagnostics] = js.undefined
}
object InterconnectsGetDiagnosticsResponse {
  
  inline def apply(): InterconnectsGetDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectsGetDiagnosticsResponse]
  }
  
  extension [Self <: InterconnectsGetDiagnosticsResponse](x: Self) {
    
    inline def setResult(value: InterconnectDiagnostics): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
