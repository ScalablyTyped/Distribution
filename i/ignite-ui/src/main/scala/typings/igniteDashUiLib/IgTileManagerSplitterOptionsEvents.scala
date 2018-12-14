package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgTileManagerSplitterOptionsEvents
  extends /**
	 * Option for IgTileManagerSplitterOptionsEvents
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Event fired after collapsing is performed. Not cancellable.
  	 *
  	 *                     Function takes arguments evt and ui.
  	 *                     Use ui.owner to get a reference to the splitter instance.
  	 *                     Use ui.index to get an index of collased panel.
  	 */
  var collapsed: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Event fired after expanding is performed. Not cancellable.
  	 *
  	 *                     Function takes arguments evt and ui.
  	 *                     Use ui.owner to get a reference to the splitter instance.
  	 *                     Use ui.index to get an index of expanded panel.
  	 */
  var expanded: js.UndefOr[js.Any] = js.undefined
}

