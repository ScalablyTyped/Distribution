package typings.hedron.hedronMod

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
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * The amount of horizontal columns this row creates.
    * @default 12
    */
  var divisions: js.UndefOr[Double] = js.undefined
  /**
    * If true, disable padding.
    */
  var fluid: js.UndefOr[Boolean] = js.undefined
  /**
    * Width during lg breakpoint.
    */
  var lg: js.UndefOr[Double] = js.undefined
  /**
    * Width of left margin during lg breakpoint.
    */
  var lgShift: js.UndefOr[Double] = js.undefined
  /**
    * Width during md breakpoint.
    */
  var md: js.UndefOr[Double] = js.undefined
  /**
    * Width of left margin during md breakpoint.
    */
  var mdShift: js.UndefOr[Double] = js.undefined
  /**
    * Width during sm breakpoint.
    */
  var sm: js.UndefOr[Double] = js.undefined
  /**
    * Width of left margin during sm breakpoint.
    */
  var smShift: js.UndefOr[Double] = js.undefined
  /**
    * You can specify component to use specific tag
    * @default 'div'
    */
  var tagName: js.UndefOr[String] = js.undefined
  /**
    * Width during xs breakpoint.
    */
  var xs: js.UndefOr[Double] = js.undefined
  /**
    * Width of left margin during xs breakpoint.
    */
  var xsShift: js.UndefOr[Double] = js.undefined
}

object ColumnProps {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    divisions: Int | Double = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    lg: Int | Double = null,
    lgShift: Int | Double = null,
    md: Int | Double = null,
    mdShift: Int | Double = null,
    sm: Int | Double = null,
    smShift: Int | Double = null,
    tagName: String = null,
    xs: Int | Double = null,
    xsShift: Int | Double = null
  ): ColumnProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (divisions != null) __obj.updateDynamic("divisions")(divisions.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (lgShift != null) __obj.updateDynamic("lgShift")(lgShift.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (mdShift != null) __obj.updateDynamic("mdShift")(mdShift.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (smShift != null) __obj.updateDynamic("smShift")(smShift.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (xsShift != null) __obj.updateDynamic("xsShift")(xsShift.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
}

