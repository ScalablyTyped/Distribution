package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callsite extends js.Object {
  var column: scala.Double
  var line: scala.Double
}

object Callsite {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double): Callsite = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[Callsite]
  }
}

