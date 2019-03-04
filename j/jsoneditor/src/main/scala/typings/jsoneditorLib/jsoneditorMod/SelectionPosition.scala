package typings
package jsoneditorLib.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionPosition extends js.Object {
  var column: scala.Double
  var row: scala.Double
}

object SelectionPosition {
  @scala.inline
  def apply(column: scala.Double, row: scala.Double): SelectionPosition = {
    val __obj = js.Dynamic.literal(column = column, row = row)
  
    __obj.asInstanceOf[SelectionPosition]
  }
}

