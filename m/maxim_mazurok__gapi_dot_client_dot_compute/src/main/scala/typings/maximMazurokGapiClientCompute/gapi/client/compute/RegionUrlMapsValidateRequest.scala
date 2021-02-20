package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionUrlMapsValidateRequest extends StObject {
  
  /** Content of the UrlMap to be validated. */
  var resource: js.UndefOr[UrlMap] = js.native
}
object RegionUrlMapsValidateRequest {
  
  @scala.inline
  def apply(): RegionUrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionUrlMapsValidateRequest]
  }
  
  @scala.inline
  implicit class RegionUrlMapsValidateRequestMutableBuilder[Self <: RegionUrlMapsValidateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: UrlMap): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
