package typings.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the GridStack engine that does most no DOM grid manipulation.
  * See GridStack methods and vars for descriptions.
  * 
  * NOTE: values should not be modified - call the GridStack API instead
  */
trait GridStackEngine extends js.Object {
  var column: Double
  var float: Boolean
  var maxRow: Double
  var nodes: js.Array[GridStackNode]
  def getRow(): Double
}

object GridStackEngine {
  @scala.inline
  def apply(
    column: Double,
    float: Boolean,
    getRow: () => Double,
    maxRow: Double,
    nodes: js.Array[GridStackNode]
  ): GridStackEngine = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], getRow = js.Any.fromFunction0(getRow), maxRow = maxRow.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridStackEngine]
  }
}

