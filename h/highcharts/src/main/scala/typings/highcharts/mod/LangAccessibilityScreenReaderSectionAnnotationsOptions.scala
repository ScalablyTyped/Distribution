package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangAccessibilityScreenReaderSectionAnnotationsOptions extends js.Object {
  var descriptionMultiplePoints: js.UndefOr[String] = js.undefined
  var descriptionNoPoints: js.UndefOr[String] = js.undefined
  var descriptionSinglePoint: js.UndefOr[String] = js.undefined
  var heading: js.UndefOr[String] = js.undefined
}

object LangAccessibilityScreenReaderSectionAnnotationsOptions {
  @scala.inline
  def apply(
    descriptionMultiplePoints: String = null,
    descriptionNoPoints: String = null,
    descriptionSinglePoint: String = null,
    heading: String = null
  ): LangAccessibilityScreenReaderSectionAnnotationsOptions = {
    val __obj = js.Dynamic.literal()
    if (descriptionMultiplePoints != null) __obj.updateDynamic("descriptionMultiplePoints")(descriptionMultiplePoints.asInstanceOf[js.Any])
    if (descriptionNoPoints != null) __obj.updateDynamic("descriptionNoPoints")(descriptionNoPoints.asInstanceOf[js.Any])
    if (descriptionSinglePoint != null) __obj.updateDynamic("descriptionSinglePoint")(descriptionSinglePoint.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangAccessibilityScreenReaderSectionAnnotationsOptions]
  }
}

