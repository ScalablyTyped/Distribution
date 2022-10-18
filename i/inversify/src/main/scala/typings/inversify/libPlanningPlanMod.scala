package typings.inversify

import typings.inversify.libInterfacesInterfacesMod.interfaces.Context
import typings.inversify.libInterfacesInterfacesMod.interfaces.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlanningPlanMod {
  
  @JSImport("inversify/lib/planning/plan", "Plan")
  @js.native
  open class Plan protected ()
    extends StObject
       with typings.inversify.libInterfacesInterfacesMod.interfaces.Plan {
    def this(parentContext: Context, rootRequest: Request) = this()
    
    /* CompleteClass */
    var parentContext: Context = js.native
    
    /* CompleteClass */
    var rootRequest: Request = js.native
  }
}
