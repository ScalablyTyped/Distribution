package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutersPreviewResponse extends StObject {
  
  /** Preview of given router. */
  var resource: js.UndefOr[Router] = js.undefined
}
object RoutersPreviewResponse {
  
  @scala.inline
  def apply(): RoutersPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutersPreviewResponse]
  }
  
  @scala.inline
  implicit class RoutersPreviewResponseMutableBuilder[Self <: RoutersPreviewResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: Router): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
