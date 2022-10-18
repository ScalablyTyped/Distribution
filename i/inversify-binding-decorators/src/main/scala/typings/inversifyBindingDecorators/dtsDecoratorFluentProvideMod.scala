package typings.inversifyBindingDecorators

import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideInWhenOnSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsDecoratorFluentProvideMod {
  
  @JSImport("inversify-binding-decorators/dts/decorator/fluent_provide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(serviceIdentifier: ServiceIdentifier[Any]): ProvideInWhenOnSyntax[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[ProvideInWhenOnSyntax[Any]]
}
