package typings
package intlDashMessageformatDashParserLib.libParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilePosition extends js.Object {
  var column: scala.Double
  var line: scala.Double
  var offset: scala.Double
}

object IFilePosition {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, offset: scala.Double): IFilePosition = {
    val __obj = js.Dynamic.literal(column = column, line = line, offset = offset)
  
    __obj.asInstanceOf[IFilePosition]
  }
}

