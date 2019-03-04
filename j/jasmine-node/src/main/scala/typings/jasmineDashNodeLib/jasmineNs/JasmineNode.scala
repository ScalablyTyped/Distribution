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
    executeSpecsInFolder: js.Function1[ExecuteSpecsOptions, scala.Unit],
    loadHelpersInFolder: js.Function2[java.lang.String, stdLib.RegExp, scala.Unit]
  ): JasmineNode = {
    val __obj = js.Dynamic.literal(executeSpecsInFolder = executeSpecsInFolder, loadHelpersInFolder = loadHelpersInFolder)
  
    __obj.asInstanceOf[JasmineNode]
  }
}

