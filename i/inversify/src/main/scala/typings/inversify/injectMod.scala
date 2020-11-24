package typings.inversify

import typings.inversify.interfacesMod.interfaces.Abstract
import typings.inversify.interfacesMod.interfaces.Newable
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify/dts/annotation/inject", JSImport.Namespace)
@js.native
object injectMod extends js.Object {
  
  def inject(serviceIdentifier: ServiceIdentifierOrFunc): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  
  @js.native
  class LazyServiceIdentifer[T] protected () extends js.Object {
    def this(cb: js.Function0[ServiceIdentifier[T]]) = this()
    
    var _cb: js.Any = js.native
    
    def unwrap(): String | js.Symbol | Newable[T] | Abstract[T] = js.native
  }
  
  type ServiceIdentifierOrFunc = ServiceIdentifier[js.Any] | LazyServiceIdentifer[js.Any]
}
