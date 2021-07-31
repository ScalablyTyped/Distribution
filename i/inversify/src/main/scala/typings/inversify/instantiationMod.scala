package typings.inversify

import typings.inversify.interfacesMod.interfaces.Newable
import typings.inversify.interfacesMod.interfaces.Request
import typings.inversify.interfacesMod.interfaces.ResolveRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instantiationMod {
  
  @JSImport("inversify/dts/resolution/instantiation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def resolveInstance(constr: Newable[js.Any], childRequests: js.Array[Request], resolveRequest: ResolveRequestHandler): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveInstance")(constr.asInstanceOf[js.Any], childRequests.asInstanceOf[js.Any], resolveRequest.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
