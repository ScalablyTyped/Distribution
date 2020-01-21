package typings.hedron.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hedron.hedronStrings.`inline-block`
import typings.hedron.hedronStrings.`inline-flex`
import typings.hedron.hedronStrings.`inline-grid`
import typings.hedron.hedronStrings.`inline-table`
import typings.hedron.hedronStrings.`inline`
import typings.hedron.hedronStrings.`list-item`
import typings.hedron.hedronStrings.`run-in`
import typings.hedron.hedronStrings.`table-caption`
import typings.hedron.hedronStrings.`table-cell`
import typings.hedron.hedronStrings.`table-column-group`
import typings.hedron.hedronStrings.`table-column`
import typings.hedron.hedronStrings.`table-footer-group`
import typings.hedron.hedronStrings.`table-header-group`
import typings.hedron.hedronStrings.`table-row-group`
import typings.hedron.hedronStrings.`table-row`
import typings.hedron.hedronStrings.block
import typings.hedron.hedronStrings.bottom
import typings.hedron.hedronStrings.center
import typings.hedron.hedronStrings.collapse
import typings.hedron.hedronStrings.contents
import typings.hedron.hedronStrings.flex
import typings.hedron.hedronStrings.grid
import typings.hedron.hedronStrings.hidden
import typings.hedron.hedronStrings.horizontal
import typings.hedron.hedronStrings.inherit
import typings.hedron.hedronStrings.initial
import typings.hedron.hedronStrings.left
import typings.hedron.hedronStrings.none
import typings.hedron.hedronStrings.right
import typings.hedron.hedronStrings.table
import typings.hedron.hedronStrings.top
import typings.hedron.hedronStrings.vertical
import typings.hedron.hedronStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundsProps
  extends Styleable
     with /**
  * Allow for customer props due to ability to add
  * custom breakpoints
  */
/* x */ StringDictionary[js.Any] {
  /**
    * Draws all child columns with 'bounding boxes' for easy
    * visualization of the grid. This enables debug mode for all the
    * children of this component
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Direction of content
    */
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  /**
    * Controls the CSS flex property
    */
  var flex: js.UndefOr[String] = js.undefined
  /**
    * Alignment of children along the horizontal axis
    */
  var halign: js.UndefOr[left | center | right] = js.undefined
  /**
    * Alignment of children along the vertical axis
    */
  var valign: js.UndefOr[top | center | bottom] = js.undefined
  /**
    * Sets whether the children should wrap when there's no more room on the primary axis
    */
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object BoundsProps {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Allow for customer props due to ability to add
    * custom breakpoints
    */
  /* x */ StringDictionary[js.Any] = null,
    background: String = null,
    border: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    direction: horizontal | vertical = null,
    display: `inline` | block | contents | flex | grid | `inline-block` | none | initial | inherit | `inline-flex` | `inline-grid` | `inline-table` | `list-item` | `run-in` | table | `table-caption` | `table-column-group` | `table-header-group` | `table-footer-group` | `table-row-group` | `table-cell` | `table-column` | `table-row` = null,
    flex: String = null,
    halign: left | center | right = null,
    height: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    margin: String = null,
    opacity: Int | Double = null,
    padding: String = null,
    valign: top | center | bottom = null,
    visibility: visible | hidden | collapse | initial | inherit = null,
    width: String = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): BoundsProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (halign != null) __obj.updateDynamic("halign")(halign.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundsProps]
  }
}

