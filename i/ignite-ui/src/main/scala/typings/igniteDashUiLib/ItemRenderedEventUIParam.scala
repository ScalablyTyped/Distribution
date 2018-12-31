package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemRenderedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference of the item's index, if the layout is flow or vertical
  	 */
  var index: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get a reference to the rendered item
  	 */
  var item: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get a reference of item's settings, such as colspan ,rowspan, etc.
  	 */
  var itemData: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to the igLayoutManager.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

