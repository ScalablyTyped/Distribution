package typings
package hedronLib.hedronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HiddenProps extends js.Object {
  /**
    * Draws all child columns with "bounding boxes" for easy
    * visualization of the grid. This enables debug mode for all the
    * children of this component
    * @default false
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Width during lg breakpoint.
    */
  var lg: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Width during md breakpoint.
    */
  var md: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Width during sm breakpoint.
    */
  var sm: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Width during xs breakpoint.
    */
  var xs: js.UndefOr[scala.Boolean] = js.undefined
}

object HiddenProps {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    lg: js.UndefOr[scala.Boolean] = js.undefined,
    md: js.UndefOr[scala.Boolean] = js.undefined,
    sm: js.UndefOr[scala.Boolean] = js.undefined,
    xs: js.UndefOr[scala.Boolean] = js.undefined
  ): HiddenProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(lg)) __obj.updateDynamic("lg")(lg)
    if (!js.isUndefined(md)) __obj.updateDynamic("md")(md)
    if (!js.isUndefined(sm)) __obj.updateDynamic("sm")(sm)
    if (!js.isUndefined(xs)) __obj.updateDynamic("xs")(xs)
    __obj.asInstanceOf[HiddenProps]
  }
}

