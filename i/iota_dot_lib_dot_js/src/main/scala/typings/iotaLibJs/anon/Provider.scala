package typings.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider extends StObject {
  
  var provider: String
  
  var sandbox: js.UndefOr[Boolean] = js.undefined
  
  var token: js.UndefOr[Boolean] = js.undefined
}
object Provider {
  
  @scala.inline
  def apply(provider: String): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    @scala.inline
    def setToken(value: Boolean): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
