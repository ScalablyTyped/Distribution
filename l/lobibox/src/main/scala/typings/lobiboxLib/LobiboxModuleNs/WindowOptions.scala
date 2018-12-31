package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowOptions extends MessageBoxesOptions {
    // Override default option
  var autoload: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[js.Any] = js.undefined
  @JSName("height")
  var height_WindowOptions: js.UndefOr[js.Any] = js.undefined
    // Auto load from given url when window is created
  var loadMethod: js.UndefOr[java.lang.String] = js.undefined
    // Show window after content is loaded or show and then load content
  var params: js.UndefOr[js.Object] = js.undefined
    // Ajax method to load content
  var showAfterLoad: js.UndefOr[scala.Boolean] = js.undefined
    // HTML Content of window
  var url: js.UndefOr[java.lang.String] = js.undefined
}

