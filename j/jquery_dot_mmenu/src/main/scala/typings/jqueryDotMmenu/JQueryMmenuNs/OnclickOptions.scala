package typings.jqueryDotMmenu.JQueryMmenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnclickOptions extends js.Object {
  /**
    * Whether or not the menu should close after clicking a link inside it.
    * The default value varies per link: true if the default behavior for
    * the clicked link is prevented, false otherwise.
    * Default: null
    */
  var close: js.UndefOr[Boolean | js.Any] = js.undefined
  /**
    * Whether or not to prevent the default behavior for the clicked link.
    * The default value varies per link: true if its href is equal to
    * or starts with a hash (#), false otherwise.
    * Default: null
    */
  var preventDefault: js.UndefOr[Boolean | js.Any] = js.undefined
  /**
    * Whether or not the clicked link should be visibly "selected".
    * Default: true
    */
  var setSelected: js.UndefOr[Boolean | js.Any] = js.undefined
}

object OnclickOptions {
  @scala.inline
  def apply(
    close: Boolean | js.Any = null,
    preventDefault: Boolean | js.Any = null,
    setSelected: Boolean | js.Any = null
  ): OnclickOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    if (setSelected != null) __obj.updateDynamic("setSelected")(setSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnclickOptions]
  }
}

