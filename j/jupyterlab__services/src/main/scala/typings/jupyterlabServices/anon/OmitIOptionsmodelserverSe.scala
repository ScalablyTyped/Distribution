package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/kernel/kernel.IKernelConnection.IOptions, 'model' | 'serverSettings'> */
@js.native
trait OmitIOptionsmodelserverSe extends StObject {
  
  var clientId: js.UndefOr[String] = js.native
  
  var handleComms: js.UndefOr[Boolean] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object OmitIOptionsmodelserverSe {
  
  @scala.inline
  def apply(): OmitIOptionsmodelserverSe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitIOptionsmodelserverSe]
  }
  
  @scala.inline
  implicit class OmitIOptionsmodelserverSeMutableBuilder[Self <: OmitIOptionsmodelserverSe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setHandleComms(value: Boolean): Self = StObject.set(x, "handleComms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleCommsUndefined: Self = StObject.set(x, "handleComms", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
