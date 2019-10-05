package typings.jasmineDashNode.jasmine

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineNode extends js.Object {
  def executeSpecsInFolder(options: ExecuteSpecsOptions): Unit
  def loadHelpersInFolder(path: String, pattern: RegExp): Unit
}

object JasmineNode {
  @scala.inline
  def apply(executeSpecsInFolder: ExecuteSpecsOptions => Unit, loadHelpersInFolder: (String, RegExp) => Unit): JasmineNode = {
    val __obj = js.Dynamic.literal(executeSpecsInFolder = js.Any.fromFunction1(executeSpecsInFolder), loadHelpersInFolder = js.Any.fromFunction2(loadHelpersInFolder))
  
    __obj.asInstanceOf[JasmineNode]
  }
}

