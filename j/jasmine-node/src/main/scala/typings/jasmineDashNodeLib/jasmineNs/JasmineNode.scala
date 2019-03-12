package typings
package jasmineDashNodeLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineNode extends js.Object {
  def executeSpecsInFolder(options: ExecuteSpecsOptions): scala.Unit
  def loadHelpersInFolder(path: java.lang.String, pattern: stdLib.RegExp): scala.Unit
}

object JasmineNode {
  @scala.inline
  def apply(
    executeSpecsInFolder: ExecuteSpecsOptions => scala.Unit,
    loadHelpersInFolder: (java.lang.String, stdLib.RegExp) => scala.Unit
  ): JasmineNode = {
    val __obj = js.Dynamic.literal(executeSpecsInFolder = js.Any.fromFunction1(executeSpecsInFolder), loadHelpersInFolder = js.Any.fromFunction2(loadHelpersInFolder))
  
    __obj.asInstanceOf[JasmineNode]
  }
}

