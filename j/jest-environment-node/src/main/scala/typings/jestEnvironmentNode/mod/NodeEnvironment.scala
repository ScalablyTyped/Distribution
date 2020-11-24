package typings.jestEnvironmentNode.mod

import typings.jestEnvironment.mod.JestEnvironment
import typings.node.vmMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeEnvironment extends JestEnvironment {
  
  var context: Context | Null = js.native
  
  @JSName("getVmContext")
  def getVmContext_MNodeEnvironment(): Context | Null = js.native
}
