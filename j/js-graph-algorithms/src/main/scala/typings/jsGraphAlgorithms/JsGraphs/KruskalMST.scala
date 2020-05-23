package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KruskalMST extends js.Object {
  var mst: js.Array[Edge]
}

object KruskalMST {
  @scala.inline
  def apply(mst: js.Array[Edge]): KruskalMST = {
    val __obj = js.Dynamic.literal(mst = mst.asInstanceOf[js.Any])
    __obj.asInstanceOf[KruskalMST]
  }
}

