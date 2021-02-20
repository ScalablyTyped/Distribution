package typings.jupyterlabServices.anon

import typings.jupyterlabServices.sessionSessionMod.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/session/session.ISessionConnection.IOptions, 'connectToKernel' | 'serverSettings'> */
@js.native
trait OmitIOptionsconnectToKern extends StObject {
  
  var clientId: js.UndefOr[String] = js.native
  
  var kernelConnectionOptions: js.UndefOr[OmitIOptionsmodelusername] = js.native
  
  var model: IModel = js.native
  
  var username: js.UndefOr[String] = js.native
}
object OmitIOptionsconnectToKern {
  
  @scala.inline
  def apply(model: IModel): OmitIOptionsconnectToKern = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitIOptionsconnectToKern]
  }
  
  @scala.inline
  implicit class OmitIOptionsconnectToKernMutableBuilder[Self <: OmitIOptionsconnectToKern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setKernelConnectionOptions(value: OmitIOptionsmodelusername): Self = StObject.set(x, "kernelConnectionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelConnectionOptionsUndefined: Self = StObject.set(x, "kernelConnectionOptions", js.undefined)
    
    @scala.inline
    def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
