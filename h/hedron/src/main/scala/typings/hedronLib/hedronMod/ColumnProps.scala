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

