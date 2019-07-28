package typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionMapping extends js.Object {
  var decl: Range
  var line: Double
  var loc: Range
  var name: String
}

object FunctionMapping {
  @scala.inline
  def apply(decl: Range, line: Double, loc: Range, name: String): FunctionMapping = {
    val __obj = js.Dynamic.literal(decl = decl, line = line, loc = loc, name = name)
  
    __obj.asInstanceOf[FunctionMapping]
  }
}

