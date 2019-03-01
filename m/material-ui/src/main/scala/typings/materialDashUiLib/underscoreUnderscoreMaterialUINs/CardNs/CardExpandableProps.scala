package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardExpandableProps extends js.Object {
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  var onExpanding: js.UndefOr[js.Function1[/* isExpanded */ scala.Boolean, scala.Unit]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object CardExpandableProps {
  @scala.inline
  def apply(
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    onExpanding: js.Function1[/* isExpanded */ scala.Boolean, scala.Unit] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): CardExpandableProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (onExpanding != null) __obj.updateDynamic("onExpanding")(onExpanding)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CardExpandableProps]
  }
}

