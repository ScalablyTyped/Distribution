package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlMapsValidateRequest extends StObject {
  
  /** Content of the UrlMap to be validated. */
  var resource: js.UndefOr[UrlMap] = js.undefined
}
object UrlMapsValidateRequest {
  
  inline def apply(): UrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapsValidateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlMapsValidateRequest] (val x: Self) extends AnyVal {
    
    inline def setResource(value: UrlMap): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
