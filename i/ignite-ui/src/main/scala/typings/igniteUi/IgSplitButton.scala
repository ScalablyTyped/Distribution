package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSplitButton
  extends /**
	 * Option for igSplitButton
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
  	 * Button items.
  	 *
  	 */
  var items: js.UndefOr[js.Array[IgSplitButtonItem]] = js.undefined
  /**
  	 * Specifies whether the default button will be switched when another button is selected.
  	 *
  	 */
  var swapDefaultEnabled: js.UndefOr[Boolean] = js.undefined
}

object IgSplitButton {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igSplitButton
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    click: (/* event */ Event_, /* ui */ ClickEventUIParam) => Unit = null,
    collapsed: (/* event */ Event_, /* ui */ CollapsedEventUIParam) => Unit = null,
    collapsing: (/* event */ Event_, /* ui */ CollapsingEventUIParam) => Unit = null,
    defaultItemName: String = null,
    expanded: (/* event */ Event_, /* ui */ ExpandedEventUIParam) => Unit = null,
    expanding: (/* event */ Event_, /* ui */ ExpandingEventUIParam) => Unit = null,
    items: js.Array[IgSplitButtonItem] = null,
    swapDefaultEnabled: js.UndefOr[Boolean] = js.undefined
  ): IgSplitButton = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction2(click))
    if (collapsed != null) __obj.updateDynamic("collapsed")(js.Any.fromFunction2(collapsed))
    if (collapsing != null) __obj.updateDynamic("collapsing")(js.Any.fromFunction2(collapsing))
    if (defaultItemName != null) __obj.updateDynamic("defaultItemName")(defaultItemName.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(js.Any.fromFunction2(expanded))
    if (expanding != null) __obj.updateDynamic("expanding")(js.Any.fromFunction2(expanding))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(swapDefaultEnabled)) __obj.updateDynamic("swapDefaultEnabled")(swapDefaultEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSplitButton]
  }
}

