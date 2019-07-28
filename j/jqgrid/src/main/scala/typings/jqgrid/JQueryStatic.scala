package typings.jqgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var jqGrid: js.UndefOr[JQueryJqGridStatic] = js.undefined
}

object JQueryStatic {
  @scala.inline
  def apply(jqGrid: JQueryJqGridStatic = null): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    if (jqGrid != null) __obj.updateDynamic("jqGrid")(jqGrid)
    __obj.asInstanceOf[JQueryStatic]
  }
}

