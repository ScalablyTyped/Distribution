package typings
package istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionMapping extends js.Object {
  var decl: Range
  var line: scala.Double
  var loc: Range
  var name: java.lang.String
}

object FunctionMapping {
  @scala.inline
  def apply(decl: Range, line: scala.Double, loc: Range, name: java.lang.String): FunctionMapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decl")(decl)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[FunctionMapping]
  }
}

