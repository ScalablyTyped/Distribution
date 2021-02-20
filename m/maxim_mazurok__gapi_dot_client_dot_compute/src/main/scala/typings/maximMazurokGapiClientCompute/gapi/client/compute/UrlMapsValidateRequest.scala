package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlMapsValidateRequest extends StObject {
  
  /** Content of the UrlMap to be validated. */
  var resource: js.UndefOr[UrlMap] = js.native
}
object UrlMapsValidateRequest {
  
  @scala.inline
  def apply(): UrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapsValidateRequest]
  }
  
  @scala.inline
  implicit class UrlMapsValidateRequestMutableBuilder[Self <: UrlMapsValidateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: UrlMap): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
