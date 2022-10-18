package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mechanism extends StObject {
  
  def authenticationProvider(args: AuthenticationProviderArgs): Authenticator
  
  var mechanism: String
}
object Mechanism {
  
  inline def apply(authenticationProvider: AuthenticationProviderArgs => Authenticator, mechanism: String): Mechanism = {
    val __obj = js.Dynamic.literal(authenticationProvider = js.Any.fromFunction1(authenticationProvider), mechanism = mechanism.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mechanism]
  }
  
  extension [Self <: Mechanism](x: Self) {
    
    inline def setAuthenticationProvider(value: AuthenticationProviderArgs => Authenticator): Self = StObject.set(x, "authenticationProvider", js.Any.fromFunction1(value))
    
    inline def setMechanism(value: String): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
  }
}
