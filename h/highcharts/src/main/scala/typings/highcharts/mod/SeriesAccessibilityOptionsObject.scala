package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesAccessibilityOptionsObject extends js.Object {
  /**
    * (Highstock) Provide a description of the series, announced to screen
    * readers.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Highstock) Enable/disable accessibility functionality for a specific
    * series.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Expose only the series element to screen readers, not its
    * points.
    */
  var exposeAsGroupOnly: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Keyboard navigation for a series
    */
  var keyboardNavigation: js.UndefOr[SeriesAccessibilityKeyboardNavigationOptionsObject] = js.native
  /**
    * (Highstock) Formatter function to use instead of the default for point
    * descriptions. Same as `accessibility.point.descriptionFormatter`, but for
    * a single series.
    */
  var pointDescriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.native
}

object SeriesAccessibilityOptionsObject {
  @scala.inline
  def apply(): SeriesAccessibilityOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesAccessibilityOptionsObject]
  }
  @scala.inline
  implicit class SeriesAccessibilityOptionsObjectOps[Self <: SeriesAccessibilityOptionsObject] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setExposeAsGroupOnly(value: Boolean): Self = this.set("exposeAsGroupOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposeAsGroupOnly: Self = this.set("exposeAsGroupOnly", js.undefined)
    @scala.inline
    def setKeyboardNavigation(value: SeriesAccessibilityKeyboardNavigationOptionsObject): Self = this.set("keyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardNavigation: Self = this.set("keyboardNavigation", js.undefined)
    @scala.inline
    def setPointDescriptionFormatter(value: Point => String): Self = this.set("pointDescriptionFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deletePointDescriptionFormatter: Self = this.set("pointDescriptionFormatter", js.undefined)
  }
  
}

