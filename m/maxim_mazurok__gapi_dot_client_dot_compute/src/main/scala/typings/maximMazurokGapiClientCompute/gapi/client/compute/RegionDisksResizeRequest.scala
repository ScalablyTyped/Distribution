package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionDisksResizeRequest extends StObject {
  
  /** The new size of the regional persistent disk, which is specified in GB. */
  var sizeGb: js.UndefOr[String] = js.undefined
}
object RegionDisksResizeRequest {
  
  inline def apply(): RegionDisksResizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionDisksResizeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegionDisksResizeRequest] (val x: Self) extends AnyVal {
    
    inline def setSizeGb(value: String): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    inline def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
  }
}
