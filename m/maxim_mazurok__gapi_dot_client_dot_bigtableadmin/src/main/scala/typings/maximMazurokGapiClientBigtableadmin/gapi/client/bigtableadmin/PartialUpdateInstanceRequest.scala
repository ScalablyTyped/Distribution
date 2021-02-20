package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialUpdateInstanceRequest extends StObject {
  
  /** Required. The Instance which will (partially) replace the current value. */
  var instance: js.UndefOr[Instance] = js.native
  
  /** Required. The subset of Instance fields which should be replaced. Must be explicitly set. */
  var updateMask: js.UndefOr[String] = js.native
}
object PartialUpdateInstanceRequest {
  
  @scala.inline
  def apply(): PartialUpdateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUpdateInstanceRequest]
  }
  
  @scala.inline
  implicit class PartialUpdateInstanceRequestMutableBuilder[Self <: PartialUpdateInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
