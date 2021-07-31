package typings.inversifyBindingDecorators

import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideInWhenOnSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fluentProvideMod {
  
  @JSImport("inversify-binding-decorators/dts/decorator/fluent_provide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(serviceIdentifier: ServiceIdentifier[js.Any]): ProvideInWhenOnSyntax[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[ProvideInWhenOnSyntax[js.Any]]
}
