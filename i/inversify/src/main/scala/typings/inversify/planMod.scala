package typings.inversify

import typings.inversify.interfacesMod.interfaces.Context
import typings.inversify.interfacesMod.interfaces.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object planMod {
  
  @JSImport("inversify/lib/planning/plan", "Plan")
  @js.native
  open class Plan protected ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.Plan {
    def this(parentContext: Context, rootRequest: Request) = this()
    
    /* CompleteClass */
    var parentContext: Context = js.native
    
    /* CompleteClass */
    var rootRequest: Request = js.native
  }
}
