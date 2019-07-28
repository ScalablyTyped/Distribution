package typings.jestDashCli.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callsite extends js.Object {
  var column: Double
  var line: Double
}

object Callsite {
  @scala.inline
  def apply(column: Double, line: Double): Callsite = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[Callsite]
  }
}

