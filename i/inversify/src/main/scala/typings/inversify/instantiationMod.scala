package typings.inversify

import typings.inversify.interfacesMod.interfaces.Newable
import typings.inversify.interfacesMod.interfaces.Request
import typings.inversify.interfacesMod.interfaces.ResolveRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instantiationMod {
  
  @JSImport("inversify/dts/resolution/instantiation", "resolveInstance")
  @js.native
  def resolveInstance(constr: Newable[_], childRequests: js.Array[Request], resolveRequest: ResolveRequestHandler): js.Any = js.native
}
