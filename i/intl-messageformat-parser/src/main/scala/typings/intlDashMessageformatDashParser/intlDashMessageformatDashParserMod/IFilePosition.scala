package typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilePosition extends js.Object {
  var column: Double
  var line: Double
  var offset: Double
}

object IFilePosition {
  @scala.inline
  def apply(column: Double, line: Double, offset: Double): IFilePosition = {
    val __obj = js.Dynamic.literal(column = column, line = line, offset = offset)
  
    __obj.asInstanceOf[IFilePosition]
  }
}

