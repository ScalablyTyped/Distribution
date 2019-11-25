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
    val __obj = js.Dynamic.literal(decl = decl.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FunctionMapping]
  }
}

