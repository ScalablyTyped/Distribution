package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgColorPickerSplitButton
  extends /**
	 * Option for igColorPickerSplitButton
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event fired when the button is clicked.
  	 *
  	 *             Function takes arguments evt and ui.
  	 * Use ui.item to get a reference the igSplitButton element.
  	 */
  var click: js.UndefOr[ClickEvent] = js.undefined
  /**
  	 * Event fired after the button is collapsed.
  	 *
  	 *             Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference the igSplitButton.
  	 */
  var collapsed: js.UndefOr[CollapsedEvent] = js.undefined
  /**
  	 * Event fired before a button item is collapsed.
  	 *
  	 *             Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference the igSplitButton.
  	 */
  var collapsing: js.UndefOr[CollapsingEvent] = js.undefined
  /**
  	 * Gets/sets the button default color value.
  	 *
  	 */
  var defaultColor: js.UndefOr[String] = js.undefined
  /**
  	 * Default button item name.
  	 *
  	 */
  var defaultItemName: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired after the button is expanded.
  	 *
  	 *             Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference the igSplitButton.
  	 */
  var expanded: js.UndefOr[ExpandedEvent] = js.undefined
  /**
  	 * Event fired before a button item is expanded.
  	 *
  	 *             Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference the igSplitButton.
  	 */
  var expanding: js.UndefOr[ExpandingEvent] = js.undefined
  /**
  	 * If this option is set to true, the igColorPickerSplitButton will be rendered with an icon.
  	 *
  	 */
  var hasDefaultIcon: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Button items.
  	 *
  	 */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Specifies whether the default button will be switched when another button is selected.
  	 *
  	 */
  var swapDefaultEnabled: js.UndefOr[Boolean] = js.undefined
}

object IgColorPickerSplitButton {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igColorPickerSplitButton
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    click: ClickEvent = null,
    collapsed: CollapsedEvent = null,
    collapsing: CollapsingEvent = null,
    defaultColor: String = null,
    defaultItemName: String = null,
    expanded: ExpandedEvent = null,
    expanding: ExpandingEvent = null,
    hasDefaultIcon: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[_] = null,
    swapDefaultEnabled: js.UndefOr[Boolean] = js.undefined
  ): IgColorPickerSplitButton = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (click != null) __obj.updateDynamic("click")(click)
    if (collapsed != null) __obj.updateDynamic("collapsed")(collapsed)
    if (collapsing != null) __obj.updateDynamic("collapsing")(collapsing)
    if (defaultColor != null) __obj.updateDynamic("defaultColor")(defaultColor)
    if (defaultItemName != null) __obj.updateDynamic("defaultItemName")(defaultItemName)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded)
    if (expanding != null) __obj.updateDynamic("expanding")(expanding)
    if (!js.isUndefined(hasDefaultIcon)) __obj.updateDynamic("hasDefaultIcon")(hasDefaultIcon)
    if (items != null) __obj.updateDynamic("items")(items)
    if (!js.isUndefined(swapDefaultEnabled)) __obj.updateDynamic("swapDefaultEnabled")(swapDefaultEnabled)
    __obj.asInstanceOf[IgColorPickerSplitButton]
  }
}

