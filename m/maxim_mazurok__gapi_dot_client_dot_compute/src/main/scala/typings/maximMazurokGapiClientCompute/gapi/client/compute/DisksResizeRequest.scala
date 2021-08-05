package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisksResizeRequest extends StObject {
  
  /** The new size of the persistent disk, which is specified in GB. */
  var sizeGb: js.UndefOr[String] = js.undefined
}
object DisksResizeRequest {
  
  inline def apply(): DisksResizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisksResizeRequest]
  }
  
  extension [Self <: DisksResizeRequest](x: Self) {
    
    inline def setSizeGb(value: String): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    inline def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
  }
}
