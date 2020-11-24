package typings.knockout.mod.utils

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "utils.domNodeDisposal")
@js.native
object domNodeDisposal extends js.Object {
  
  def addDisposeCallback(node: Node, callback: js.Function1[/* node */ Node, Unit]): Unit = js.native
  
  def cleanExternalData(node: Node): Unit = js.native
  
  def removeDisposeCallback(node: Node, callback: js.Function1[/* node */ Node, Unit]): Unit = js.native
}
