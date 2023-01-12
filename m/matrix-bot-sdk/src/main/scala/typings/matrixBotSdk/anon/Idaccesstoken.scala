package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Idaccesstoken extends StObject {
  
  /**
    * The invitee’s third party identifier.
    */
  var address: String
  
  /**
    * An access token previously registered with the identity server.
    * Servers can treat this as optional to distinguish between r0.5-compatible clients and this specification version.
    */
  var id_access_token: String
  
  /**
    * The hostname+port of the identity server which should be used for third party identifier lookups.
    */
  var id_server: String
  
  /**
    * The kind of address being passed in the address field, for example `email`.
    */
  var medium: String
}
object Idaccesstoken {
  
  inline def apply(address: String, id_access_token: String, id_server: String, medium: String): Idaccesstoken = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id_access_token = id_access_token.asInstanceOf[js.Any], id_server = id_server.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idaccesstoken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Idaccesstoken] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setId_access_token(value: String): Self = StObject.set(x, "id_access_token", value.asInstanceOf[js.Any])
    
    inline def setId_server(value: String): Self = StObject.set(x, "id_server", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
  }
}
