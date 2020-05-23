package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewPivotGridOptionsGridOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Enables/disables rendering of alternating row styles (odd and even rows receive different styling). Note that if a custom jQuery template is set, this has no effect and CSS for the row should be adjusted manually in the template contents.
    */
  var alternateRowStyles: js.UndefOr[Boolean] = js.undefined
  /**
    * Caption text that will be shown above the pivot grid header.
    */
  var caption: js.UndefOr[String] = js.undefined
  /**
    * Default column width that will be set for all columns.
    *
    * Valid values:
    * "string" The default column width can be set in pixels (px).
    * "number" The default column width can be set as a number.
    */
  var defaultColumnWidth: js.UndefOr[String | Double] = js.undefined
  /**
    * Enables/disables rendering of ui-state-hover classes when the mouse is over a record. This can be useful in templating scenarios, for example, where we don't want to apply hover styling to templated content.
    */
  var enableHoverStyles: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of grid features definitions. The supported features are Resizing and Tooltips. Each feature goes with its separate options that are documented for the feature accordingly.
    */
  var features: js.UndefOr[IgPivotViewPivotGridOptionsGridOptionsFeatures] = js.undefined
  /**
    * Headers will be fixed if this option is set to true, and only the grid data will be scrollable.
    */
  var fixedHeaders: js.UndefOr[Boolean] = js.undefined
  /**
    * Initial tabIndex attribute that will be set on the container element.
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
}

object IgPivotViewPivotGridOptionsGridOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    alternateRowStyles: js.UndefOr[Boolean] = js.undefined,
    caption: String = null,
    defaultColumnWidth: String | Double = null,
    enableHoverStyles: js.UndefOr[Boolean] = js.undefined,
    features: IgPivotViewPivotGridOptionsGridOptionsFeatures = null,
    fixedHeaders: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined
  ): IgPivotViewPivotGridOptionsGridOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(alternateRowStyles)) __obj.updateDynamic("alternateRowStyles")(alternateRowStyles.get.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (defaultColumnWidth != null) __obj.updateDynamic("defaultColumnWidth")(defaultColumnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHoverStyles)) __obj.updateDynamic("enableHoverStyles")(enableHoverStyles.get.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeaders)) __obj.updateDynamic("fixedHeaders")(fixedHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotViewPivotGridOptionsGridOptions]
  }
}

