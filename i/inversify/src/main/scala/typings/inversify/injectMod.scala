package typings.inversify

import typings.inversify.interfacesMod.interfaces.Abstract
import typings.inversify.interfacesMod.interfaces.Newable
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectMod {
  
  @JSImport("inversify/dts/annotation/inject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("inversify/dts/annotation/inject", "LazyServiceIdentifer")
  @js.native
  class LazyServiceIdentifer[T] protected () extends StObject {
    def this(cb: js.Function0[ServiceIdentifier[T]]) = this()
    
    var _cb: js.Any = js.native
    
    def unwrap(): String | js.Symbol | Newable[T] | Abstract[T] = js.native
  }
  
  @scala.inline
  def inject(serviceIdentifier: ServiceIdentifierOrFunc): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  
  type ServiceIdentifierOrFunc = ServiceIdentifier[js.Any] | LazyServiceIdentifer[js.Any]
}
