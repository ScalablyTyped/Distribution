package typings
package jasmineDashNodeLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineNode extends js.Object {
  def executeSpecsInFolder(options: ExecuteSpecsOptions): scala.Unit
  def loadHelpersInFolder(path: java.lang.String, pattern: stdLib.RegExp): scala.Unit
}

