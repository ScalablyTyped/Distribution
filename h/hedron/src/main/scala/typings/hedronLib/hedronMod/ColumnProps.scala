package typings
package hedronLib.hedronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps extends js.Object {
  /**
    * Draws all child columns with "bounding boxes" for easy
    * visualization of the grid. This enables debug mode for all the
    * children of this component
    * @default false
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The amount of horizontal columns this row creates.
    * @default 12
    */
  var divisions: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true, disable padding.
    */
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Width during lg breakpoint.
    */
  var lg: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width of left margin during lg breakpoint.
    */
  var lgShift: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width during md breakpoint.
    */
  var md: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width of left margin during md breakpoint.
    */
  var mdShift: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width during sm breakpoint.
    */
  var sm: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width of left margin during sm breakpoint.
    */
  var smShift: js.UndefOr[scala.Double] = js.undefined
  /**
    * You can specify component to use specific tag
    * @default 'div'
    */
  var tagName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Width during xs breakpoint.
    */
  var xs: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width of left margin during xs breakpoint.
    */
  var xsShift: js.UndefOr[scala.Double] = js.undefined
}

object ColumnProps {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    divisions: scala.Int | scala.Double = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    lg: scala.Int | scala.Double = null,
    lgShift: scala.Int | scala.Double = null,
    md: scala.Int | scala.Double = null,
    mdShift: scala.Int | scala.Double = null,
    sm: scala.Int | scala.Double = null,
    smShift: scala.Int | scala.Double = null,
    tagName: java.lang.String = null,
    xs: scala.Int | scala.Double = null,
    xsShift: scala.Int | scala.Double = null
  ): ColumnProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (divisions != null) __obj.updateDynamic("divisions")(divisions.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (lgShift != null) __obj.updateDynamic("lgShift")(lgShift.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (mdShift != null) __obj.updateDynamic("mdShift")(mdShift.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (smShift != null) __obj.updateDynamic("smShift")(smShift.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (xsShift != null) __obj.updateDynamic("xsShift")(xsShift.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
}

