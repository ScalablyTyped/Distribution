package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationProviderArgs extends StObject {
  
  var host: String
  
  var logger: Logger
  
  var port: Double
  
  def saslAuthenticate[ParseResult](args: SaslAuthenticateArgs[ParseResult]): js.Promise[ParseResult | Unit]
}
object AuthenticationProviderArgs {
  
  inline def apply(
    host: String,
    logger: Logger,
    port: Double,
    saslAuthenticate: SaslAuthenticateArgs[Any] => js.Promise[Any | Unit]
  ): AuthenticationProviderArgs = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], saslAuthenticate = js.Any.fromFunction1(saslAuthenticate))
    __obj.asInstanceOf[AuthenticationProviderArgs]
  }
  
  extension [Self <: AuthenticationProviderArgs](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setSaslAuthenticate(value: SaslAuthenticateArgs[Any] => js.Promise[Any | Unit]): Self = StObject.set(x, "saslAuthenticate", js.Any.fromFunction1(value))
  }
}
