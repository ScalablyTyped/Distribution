package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionDisksResizeRequest extends StObject {
  
  /** The new size of the regional persistent disk, which is specified in GB. */
  var sizeGb: js.UndefOr[String] = js.undefined
}
object RegionDisksResizeRequest {
  
  @scala.inline
  def apply(): RegionDisksResizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionDisksResizeRequest]
  }
  
  @scala.inline
  implicit class RegionDisksResizeRequestMutableBuilder[Self <: RegionDisksResizeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSizeGb(value: String): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
  }
}
