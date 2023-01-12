package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAuthenticationAppLinkConfig extends StObject {
  
  /** An authentication url. */
  var uri: js.UndefOr[String] = js.undefined
}
object EnterpriseAuthenticationAppLinkConfig {
  
  inline def apply(): EnterpriseAuthenticationAppLinkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseAuthenticationAppLinkConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseAuthenticationAppLinkConfig] (val x: Self) extends AnyVal {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
