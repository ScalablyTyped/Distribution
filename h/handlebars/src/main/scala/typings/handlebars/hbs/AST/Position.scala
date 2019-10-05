package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: Double
  var line: Double
}

object Position {
  @scala.inline
  def apply(column: Double, line: Double): Position = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[Position]
  }
}

