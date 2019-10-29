package typings.jsDashGraphDashAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var label: js.UndefOr[String] = js.undefined
}

object Node {
  @scala.inline
  def apply(label: String = null): Node = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Node]
  }
}

