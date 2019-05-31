package typings
package jsonDashToDashAstLib.jsonDashToDashAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: scala.Double
  var line: scala.Double
  var offset: scala.Double
}

object Position {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, offset: scala.Double): Position = {
    val __obj = js.Dynamic.literal(column = column, line = line, offset = offset)
  
    __obj.asInstanceOf[Position]
  }
}

