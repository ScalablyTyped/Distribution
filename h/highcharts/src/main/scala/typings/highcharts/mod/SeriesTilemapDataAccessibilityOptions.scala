package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTilemapDataAccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Provide a description of the data point, announced
    * to screen readers.
    */
  var description: js.UndefOr[String] = js.undefined
}

object SeriesTilemapDataAccessibilityOptions {
  @scala.inline
  def apply(description: String = null): SeriesTilemapDataAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTilemapDataAccessibilityOptions]
  }
}

