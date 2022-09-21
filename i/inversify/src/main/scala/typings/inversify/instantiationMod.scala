package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.Newable
import typings.inversify.interfacesMod.interfaces.Request
import typings.inversify.interfacesMod.interfaces.ResolveRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instantiationMod {
  
  @JSImport("inversify/lib/resolution/instantiation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveInstance[T](
    binding: Binding[T],
    constr: Newable[T],
    childRequests: js.Array[Request],
    resolveRequest: ResolveRequestHandler
  ): T | js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveInstance")(binding.asInstanceOf[js.Any], constr.asInstanceOf[js.Any], childRequests.asInstanceOf[js.Any], resolveRequest.asInstanceOf[js.Any])).asInstanceOf[T | js.Promise[T]]
}
