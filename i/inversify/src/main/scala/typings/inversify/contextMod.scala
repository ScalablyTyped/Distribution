package typings.inversify

import typings.inversify.interfacesMod.interfaces.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify/dts/planning/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  
  @js.native
  class Context protected ()
    extends typings.inversify.interfacesMod.interfaces.Context {
    def this(container: Container) = this()
  }
}
