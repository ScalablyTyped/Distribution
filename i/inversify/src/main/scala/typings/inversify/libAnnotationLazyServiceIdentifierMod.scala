package typings.inversify

import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnotationLazyServiceIdentifierMod {
  
  @JSImport("inversify/lib/annotation/lazy_service_identifier", "LazyServiceIdentifer")
  @js.native
  open class LazyServiceIdentifer[T] protected () extends StObject {
    def this(cb: js.Function0[ServiceIdentifier[T]]) = this()
    
    /* private */ var _cb: Any = js.native
    
    def unwrap(): ServiceIdentifier[T] = js.native
  }
  
  type ServiceIdentifierOrFunc[T] = ServiceIdentifier[T] | LazyServiceIdentifer[T]
}
