package typings.jupyterlabServices.anon

import typings.jupyterlabServices.libSessionSessionMod.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/session/session.ISessionConnection.IOptions, 'connectToKernel' | 'serverSettings'> */
trait OmitIOptionsconnectToKern extends StObject {
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var kernelConnectionOptions: js.UndefOr[OmitIOptionsmodelusername] = js.undefined
  
  var model: IModel
  
  var username: js.UndefOr[String] = js.undefined
}
object OmitIOptionsconnectToKern {
  
  inline def apply(model: IModel): OmitIOptionsconnectToKern = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitIOptionsconnectToKern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitIOptionsconnectToKern] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setKernelConnectionOptions(value: OmitIOptionsmodelusername): Self = StObject.set(x, "kernelConnectionOptions", value.asInstanceOf[js.Any])
    
    inline def setKernelConnectionOptionsUndefined: Self = StObject.set(x, "kernelConnectionOptions", js.undefined)
    
    inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
