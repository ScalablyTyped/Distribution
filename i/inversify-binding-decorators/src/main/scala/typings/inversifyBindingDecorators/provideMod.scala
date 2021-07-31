package typings.inversifyBindingDecorators

import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provideMod {
  
  @JSImport("inversify-binding-decorators/dts/decorator/provide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(serviceIdentifier: ServiceIdentifier[js.Any]): js.Function1[/* target */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Any, js.Any]]
  @scala.inline
  def default(serviceIdentifier: ServiceIdentifier[js.Any], force: Boolean): js.Function1[/* target */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(serviceIdentifier.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ js.Any, js.Any]]
}
