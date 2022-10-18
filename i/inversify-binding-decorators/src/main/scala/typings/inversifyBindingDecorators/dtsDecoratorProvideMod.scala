package typings.inversifyBindingDecorators

import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsDecoratorProvideMod {
  
  @JSImport("inversify-binding-decorators/dts/decorator/provide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(serviceIdentifier: ServiceIdentifier[Any]): js.Function1[/* target */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ Any, Any]]
  inline def default(serviceIdentifier: ServiceIdentifier[Any], force: Boolean): js.Function1[/* target */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(serviceIdentifier.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ Any, Any]]
}
