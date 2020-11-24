package typings.gremlin.mod.process

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.Bytecode")
@js.native
class Bytecode () extends js.Object {
  def this(toClone: Bytecode) = this()
  
  def addSource(name: String): Bytecode = js.native
  def addSource(name: String, values: js.Array[_]): Bytecode = js.native
  
  def addStep(name: String): Bytecode = js.native
  def addStep(name: String, values: js.Array[_]): Bytecode = js.native
}
