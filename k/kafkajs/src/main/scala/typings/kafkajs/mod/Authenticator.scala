package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authenticator extends StObject {
  
  def authenticate(): js.Promise[Unit]
}
object Authenticator {
  
  inline def apply(authenticate: () => js.Promise[Unit]): Authenticator = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction0(authenticate))
    __obj.asInstanceOf[Authenticator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Authenticator] (val x: Self) extends AnyVal {
    
    inline def setAuthenticate(value: () => js.Promise[Unit]): Self = StObject.set(x, "authenticate", js.Any.fromFunction0(value))
  }
}
