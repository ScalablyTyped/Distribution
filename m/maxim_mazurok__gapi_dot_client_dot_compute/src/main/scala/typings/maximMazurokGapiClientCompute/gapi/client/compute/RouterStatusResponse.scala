package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterStatusResponse extends StObject {
  
  /** Type of resource. */
  var kind: js.UndefOr[String] = js.undefined
  
  var result: js.UndefOr[RouterStatus] = js.undefined
}
object RouterStatusResponse {
  
  @scala.inline
  def apply(): RouterStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterStatusResponse]
  }
  
  @scala.inline
  implicit class RouterStatusResponseMutableBuilder[Self <: RouterStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResult(value: RouterStatus): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
