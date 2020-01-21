package typings.hedron.mod

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
import typings.hedron.hedronStrings.collapse
import typings.hedron.hedronStrings.contents
import typings.hedron.hedronStrings.flex
import typings.hedron.hedronStrings.grid
import typings.hedron.hedronStrings.hidden
import typings.hedron.hedronStrings.inherit
import typings.hedron.hedronStrings.initial
import typings.hedron.hedronStrings.none
import typings.hedron.hedronStrings.table
import typings.hedron.hedronStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styleable extends js.Object {
  /**
    * Background Property
    */
  var background: js.UndefOr[String] = js.undefined
  /**
    * Border property
    */
  var border: js.UndefOr[String] = js.undefined
  /**
    * Display Property
    */
  var display: js.UndefOr[
    `inline` | block | contents | flex | grid | `inline-block` | none | initial | inherit | `inline-flex` | `inline-grid` | `inline-table` | `list-item` | `run-in` | table | `table-caption` | `table-column-group` | `table-header-group` | `table-footer-group` | `table-row-group` | `table-cell` | `table-column` | `table-row`
  ] = js.undefined
  /**
    * Height Property
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * Controls hidden
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * The amount of padding added
    */
  var margin: js.UndefOr[String] = js.undefined
  /**
    * Opacity Property
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * The amount of padding added
    */
  var padding: js.UndefOr[String] = js.undefined
  /**
    * Visibilty Property
    */
  var visibility: js.UndefOr[visible | hidden | collapse | initial | inherit] = js.undefined
  /**
    * Width Property
    */
  var width: js.UndefOr[String] = js.undefined
}

object Styleable {
  @scala.inline
  def apply(
    background: String = null,
    border: String = null,
    display: `inline` | block | contents | flex | grid | `inline-block` | none | initial | inherit | `inline-flex` | `inline-grid` | `inline-table` | `list-item` | `run-in` | table | `table-caption` | `table-column-group` | `table-header-group` | `table-footer-group` | `table-row-group` | `table-cell` | `table-column` | `table-row` = null,
    height: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    margin: String = null,
    opacity: Int | Double = null,
    padding: String = null,
    visibility: visible | hidden | collapse | initial | inherit = null,
    width: String = null
  ): Styleable = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styleable]
  }
}

