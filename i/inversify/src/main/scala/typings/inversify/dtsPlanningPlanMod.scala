package typings.inversify

import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Context
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/plan", JSImport.Namespace)
@js.native
object dtsPlanningPlanMod extends js.Object {
  @js.native
  class Plan protected ()
    extends typings.inversify.dtsInterfacesInterfacesMod.interfaces.Plan {
    def this(parentContext: Context, rootRequest: Request) = this()
    /* CompleteClass */
    override var parentContext: Context = js.native
    /* CompleteClass */
    override var rootRequest: Request = js.native
  }
  
}

