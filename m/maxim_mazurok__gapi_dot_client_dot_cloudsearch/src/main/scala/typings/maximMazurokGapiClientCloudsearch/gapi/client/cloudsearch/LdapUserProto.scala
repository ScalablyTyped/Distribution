package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LdapUserProto extends StObject {
  
  var userName: js.UndefOr[String] = js.undefined
}
object LdapUserProto {
  
  inline def apply(): LdapUserProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LdapUserProto]
  }
  
  extension [Self <: LdapUserProto](x: Self) {
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
