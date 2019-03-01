package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionRenderedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the caption container.
  	 */
  var captionContainer: js.UndefOr[stdLib.Element] = js.undefined
  /**
  	 * Gets a reference to the grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object CaptionRenderedEventUIParam {
  @scala.inline
  def apply(captionContainer: stdLib.Element = null, owner: js.Any = null): CaptionRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (captionContainer != null) __obj.updateDynamic("captionContainer")(captionContainer)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[CaptionRenderedEventUIParam]
  }
}

