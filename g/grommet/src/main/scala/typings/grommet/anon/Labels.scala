package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Labels extends js.Object {
  var guide: js.UndefOr[Boolean] = js.undefined
  var labels: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[
    js.Function4[
      /* value */ js.Any, 
      /* data */ js.Array[js.Object], 
      /* dataIndex */ Double, 
      /* axisIndex */ Double, 
      Unit
    ]
  ] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object Labels {
  @scala.inline
  def apply(
    guide: js.UndefOr[Boolean] = js.undefined,
    labels: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    render: (/* value */ js.Any, /* data */ js.Array[js.Object], /* dataIndex */ Double, /* axisIndex */ Double) => Unit = null,
    suffix: String = null
  ): Labels = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(guide)) __obj.updateDynamic("guide")(guide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction4(render))
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
}

