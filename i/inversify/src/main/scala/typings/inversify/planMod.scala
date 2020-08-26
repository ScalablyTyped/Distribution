package typings.inversify

import typings.inversify.interfacesMod.interfaces.Context
import typings.inversify.interfacesMod.interfaces.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/plan", JSImport.Namespace)
@js.native
object planMod extends js.Object {
  @js.native
  class Plan protected ()
    extends typings.inversify.interfacesMod.interfaces.Plan {
    def this(parentContext: Context, rootRequest: Request) = this()
  }
  
}

