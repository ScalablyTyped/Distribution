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
@js.native
trait GridStackEngine extends js.Object {
  var column: Double = js.native
  var float: Boolean = js.native
  var maxRow: Double = js.native
  var nodes: js.Array[GridStackNode] = js.native
  def getRow(): Double = js.native
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
  @scala.inline
  implicit class GridStackEngineOps[Self <: GridStackEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloat(value: Boolean): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRow(value: () => Double): Self = this.set("getRow", js.Any.fromFunction0(value))
    @scala.inline
    def setMaxRow(value: Double): Self = this.set("maxRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: GridStackNode*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[GridStackNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
  
}

