package typings.inversify

import typings.inversify.interfacesMod.interfaces.Container
import typings.inversify.interfacesMod.interfaces.Plan
import typings.inversify.interfacesMod.interfaces.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("inversify/dts/planning/context", "Context")
  @js.native
  class Context protected ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.Context {
    def this(container: Container) = this()
    
    /* CompleteClass */
    override def addPlan(plan: Plan): Unit = js.native
    
    /* CompleteClass */
    var container: Container = js.native
    
    /* CompleteClass */
    var currentRequest: Request = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var plan: Plan = js.native
    
    /* CompleteClass */
    override def setCurrentRequest(request: Request): Unit = js.native
  }
}
