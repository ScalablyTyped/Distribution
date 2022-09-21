package typings.jitsiMeet.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalAPIOptions extends StObject {
  
  var configOverwrite: js.UndefOr[Config] = js.undefined
  
  var devices: js.UndefOr[Any] = js.undefined
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var interfaceConfigOverwrite: js.UndefOr[InterfaceConfig] = js.undefined
  
  var invitees: js.UndefOr[js.Array[Invitee]] = js.undefined
  
  var jwt: js.UndefOr[String] = js.undefined
  
  var noSSL: js.UndefOr[Boolean] = js.undefined
  
  var onload: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var parentNode: js.UndefOr[Element] = js.undefined
  
  var roomName: js.UndefOr[String] = js.undefined
  
  var userInfo: js.UndefOr[UserInfo] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object ExternalAPIOptions {
  
  inline def apply(): ExternalAPIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalAPIOptions]
  }
  
  extension [Self <: ExternalAPIOptions](x: Self) {
    
    inline def setConfigOverwrite(value: Config): Self = StObject.set(x, "configOverwrite", value.asInstanceOf[js.Any])
    
    inline def setConfigOverwriteUndefined: Self = StObject.set(x, "configOverwrite", js.undefined)
    
    inline def setDevices(value: Any): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInterfaceConfigOverwrite(value: InterfaceConfig): Self = StObject.set(x, "interfaceConfigOverwrite", value.asInstanceOf[js.Any])
    
    inline def setInterfaceConfigOverwriteUndefined: Self = StObject.set(x, "interfaceConfigOverwrite", js.undefined)
    
    inline def setInvitees(value: js.Array[Invitee]): Self = StObject.set(x, "invitees", value.asInstanceOf[js.Any])
    
    inline def setInviteesUndefined: Self = StObject.set(x, "invitees", js.undefined)
    
    inline def setInviteesVarargs(value: Invitee*): Self = StObject.set(x, "invitees", js.Array(value*))
    
    inline def setJwt(value: String): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
    
    inline def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
    
    inline def setNoSSL(value: Boolean): Self = StObject.set(x, "noSSL", value.asInstanceOf[js.Any])
    
    inline def setNoSSLUndefined: Self = StObject.set(x, "noSSL", js.undefined)
    
    inline def setOnload(value: () => Any): Self = StObject.set(x, "onload", js.Any.fromFunction0(value))
    
    inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    inline def setParentNode(value: Element): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    inline def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
    
    inline def setRoomNameUndefined: Self = StObject.set(x, "roomName", js.undefined)
    
    inline def setUserInfo(value: UserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
