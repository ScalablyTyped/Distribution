package typings.jasmineNode.jasmine

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JasmineNode extends js.Object {
  
  def executeSpecsInFolder(options: ExecuteSpecsOptions): Unit = js.native
  
  def loadHelpersInFolder(path: String, pattern: RegExp): Unit = js.native
}
object JasmineNode {
  
  @scala.inline
  def apply(executeSpecsInFolder: ExecuteSpecsOptions => Unit, loadHelpersInFolder: (String, RegExp) => Unit): JasmineNode = {
    val __obj = js.Dynamic.literal(executeSpecsInFolder = js.Any.fromFunction1(executeSpecsInFolder), loadHelpersInFolder = js.Any.fromFunction2(loadHelpersInFolder))
    __obj.asInstanceOf[JasmineNode]
  }
  
  @scala.inline
  implicit class JasmineNodeOps[Self <: JasmineNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExecuteSpecsInFolder(value: ExecuteSpecsOptions => Unit): Self = this.set("executeSpecsInFolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadHelpersInFolder(value: (String, RegExp) => Unit): Self = this.set("loadHelpersInFolder", js.Any.fromFunction2(value))
  }
}
