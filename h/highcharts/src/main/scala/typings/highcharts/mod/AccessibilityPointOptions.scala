package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Format to use for describing the
    * values of data points to assistive technology - including screen readers.
    * The point context is available as `{point}`.
    *
    * Additionally, the series name, annotation info, and description added in
    * `point.accessibility.description` is added by default if relevant. To
    * override this, use the accessibility.point.descriptionFormatter option.
    */
  var valueDescriptionFormat: js.UndefOr[String] = js.undefined
}

object AccessibilityPointOptions {
  @scala.inline
  def apply(valueDescriptionFormat: String = null): AccessibilityPointOptions = {
    val __obj = js.Dynamic.literal()
    if (valueDescriptionFormat != null) __obj.updateDynamic("valueDescriptionFormat")(valueDescriptionFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityPointOptions]
  }
}

