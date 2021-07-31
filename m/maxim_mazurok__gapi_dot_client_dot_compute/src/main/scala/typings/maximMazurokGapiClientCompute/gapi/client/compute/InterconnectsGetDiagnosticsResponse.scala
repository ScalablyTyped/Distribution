package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterconnectsGetDiagnosticsResponse extends StObject {
  
  var result: js.UndefOr[InterconnectDiagnostics] = js.undefined
}
object InterconnectsGetDiagnosticsResponse {
  
  @scala.inline
  def apply(): InterconnectsGetDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectsGetDiagnosticsResponse]
  }
  
  @scala.inline
  implicit class InterconnectsGetDiagnosticsResponseMutableBuilder[Self <: InterconnectsGetDiagnosticsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: InterconnectDiagnostics): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
