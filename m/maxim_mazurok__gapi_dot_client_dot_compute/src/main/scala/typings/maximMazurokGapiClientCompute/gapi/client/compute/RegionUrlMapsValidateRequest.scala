package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionUrlMapsValidateRequest extends StObject {
  
  /** Content of the UrlMap to be validated. */
  var resource: js.UndefOr[UrlMap] = js.undefined
}
object RegionUrlMapsValidateRequest {
  
  inline def apply(): RegionUrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionUrlMapsValidateRequest]
  }
  
  extension [Self <: RegionUrlMapsValidateRequest](x: Self) {
    
    inline def setResource(value: UrlMap): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
