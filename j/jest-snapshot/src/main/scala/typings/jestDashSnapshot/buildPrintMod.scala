package typings.jestDashSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-snapshot/build/print", JSImport.Namespace)
@js.native
object buildPrintMod extends js.Object {
  def printDiffOrStringified(
    expectedSerializedTrimmed: String,
    receivedSerializedTrimmed: String,
    received: js.Any,
    expectedLabel: String,
    receivedLabel: String,
    expand: Boolean
  ): String = js.native
}

