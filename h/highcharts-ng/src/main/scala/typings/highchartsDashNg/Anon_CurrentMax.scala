package typings.highchartsDashNg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentMax extends js.Object {
  var currentMax: js.UndefOr[Double] = js.undefined
  var currentMin: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[Anon_Text] = js.undefined
}

object Anon_CurrentMax {
  @scala.inline
  def apply(currentMax: Int | Double = null, currentMin: Int | Double = null, title: Anon_Text = null): Anon_CurrentMax = {
    val __obj = js.Dynamic.literal()
    if (currentMax != null) __obj.updateDynamic("currentMax")(currentMax.asInstanceOf[js.Any])
    if (currentMin != null) __obj.updateDynamic("currentMin")(currentMin.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_CurrentMax]
  }
}

