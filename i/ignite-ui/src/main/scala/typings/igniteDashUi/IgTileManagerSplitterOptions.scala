package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTileManagerSplitterOptions
  extends /**
	 * Option for IgTileManagerSplitterOptions
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets whether the splitter should be initially collapsed.
  	 *
  	 */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets whether the splitter can be collapsible.
  	 *
  	 */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the splitter should be enabled.
  	 *
  	 */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets splitter events.
  	 *
  	 */
  var events: js.UndefOr[IgTileManagerSplitterOptionsEvents] = js.undefined
}

object IgTileManagerSplitterOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgTileManagerSplitterOptions
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    events: IgTileManagerSplitterOptionsEvents = null
  ): IgTileManagerSplitterOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[IgTileManagerSplitterOptions]
  }
}

