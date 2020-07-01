package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guide extends js.Object {
  var guide: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[Double] = js.undefined
  var render: js.UndefOr[js.Function2[/* dataIndex */ Double, /* axisIndex */ Double, Unit]] = js.undefined
}

object Guide {
  @scala.inline
  def apply(
    guide: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    labels: js.UndefOr[Double] = js.undefined,
    render: (/* dataIndex */ Double, /* axisIndex */ Double) => Unit = null
  ): Guide = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(guide)) __obj.updateDynamic("guide")(guide.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels.get.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    __obj.asInstanceOf[Guide]
  }
}

