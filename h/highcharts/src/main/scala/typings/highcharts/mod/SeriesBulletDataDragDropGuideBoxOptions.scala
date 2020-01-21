package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesBulletDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesBulletDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesBulletDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesBulletDataDragDropGuideBoxDefaultOptions = null): SeriesBulletDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesBulletDataDragDropGuideBoxOptions]
  }
}

