package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LdapGroupProto extends StObject {
  
  var groupName: js.UndefOr[String] = js.undefined
}
object LdapGroupProto {
  
  inline def apply(): LdapGroupProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LdapGroupProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LdapGroupProto] (val x: Self) extends AnyVal {
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
  }
}
