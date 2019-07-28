package typings.isotopeDashLayout.isotopeDashLayoutMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsotopeOptions extends js.Object {
  /**
    * A horizontal grid layout where items are centered inside each cell. The grid is defined by columnWidth and rowHeight options.
    */
  var cellsByColumn: js.UndefOr[CellsByColumn] = js.undefined
  /**
    * A vertical grid layout where items are centered inside each cell. The grid is defined by columnWidth and rowHeight options.
    */
  var cellsByRow: js.UndefOr[CellsByRow] = js.undefined
  /**
    * CSS styles that are applied to the container element.
    */
  var containerStyle: js.UndefOr[Style] = js.undefined
  /**
    * Shows items that match the filter and hides items that do not match.
    * If set to a string, that value is used as a selector.
    * If filter is set to a function, that function checks each item and returns true or false if the item should be shown or hidden.
    */
  var filter: js.UndefOr[String | (js.Function1[/* itemElement */ HTMLElement, Boolean])] = js.undefined
  /**
    * Items are arranged into rows. Rows progress vertically. Similar to what you would expect from a layout that uses CSS floats. fitRows works well for items that have the same height.
    */
  var fitRows: js.UndefOr[FitRows] = js.undefined
  /**
    * Isotope reads data from HTML with the getSortData option.
    * getSortData is set with an object. The object’s keys are keywords used to sort by. Object values are either a shortcut string or function to retrieve the data.
    */
  var getSortData: js.UndefOr[Sorter] = js.undefined
  /**
    * The styles applied to hide items when filtering.
    */
  var hiddenStyle: js.UndefOr[Style] = js.undefined
  /**
    * Items are arranged horizontally.
    */
  var horiz: js.UndefOr[Horizontal] = js.undefined
  /**
    * Enables layout on initialization. Enabled by default initLayout: true.
    * Set initLayout: false to disable layout on initialization, so you can use methods or add events before the initial layout.
    * initLayout was previously isInitLayout in Isotope v2. isInitLayout will still work in Isotope v3
    */
  var initLayout: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies which child elements will be used as item elements in the layout.
    * We recommend always setting itemSelector. itemSelector is useful to exclude sizing elements or other elements that are not part of the layout.
    */
  var itemSelector: js.UndefOr[String] = js.undefined
  /**
    * Layout modes can have their own separate options. These are set in a corresponding object within the options.
    * masonry, fitRows, and vertical are included in Isotope by default. All other layout modes need to installed separately.
    */
  var layoutMode: js.UndefOr[LayoutModes] = js.undefined
  /**
    * The default layout mode. Items are arranged in a vertically cascading grid.
    */
  var masonry: js.UndefOr[Masonry] = js.undefined
  /**
    * Horizontal version of masonry. Items are arranged in a horizontally cascading grid.
    */
  var masontryHorizontal: js.UndefOr[MasonryHorizontal] = js.undefined
  /**
    * Controls the horizontal flow of the layout. By default, item elements start positioning at the left, with originLeft: true. Set originLeft: false for right-to-left layouts.
    */
  var originLeft: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls the vertical flow of the layout. By default, item elements start positioning at the top. Set to false for bottom-up layouts. It’s like Tetris!
    */
  var originTop: js.UndefOr[Boolean] = js.undefined
  /**
    * The packery layout mode uses a bin-packing algorithm. This is a fancy way of saying “it fills empty gaps.” It works similarly to masonry, except gaps will be filled.
    */
  var packery: js.UndefOr[Packery] = js.undefined
  /**
    * Sets item positions in percent values, rather than pixel values. percentPosition: true works well with percent-width items, as items will not transition their position on resize.
    */
  var percentPosition: js.UndefOr[Boolean] = js.undefined
  /**
    * Adjusts sizes and positions when window is resized. Enabled by default resize: true.
    */
  var resize: js.UndefOr[Boolean] = js.undefined
  /**
    * Sorts items ascendingly if sortAscending: true “A, B, C…”, “1, 2, 3…”, or descendingly if sortAscending: false, “Z, Y, X…”, “9, 8, 7…”.
    * You can set ascending order for each sortBy value by setting sortAscending to an object.
    */
  var sortAscending: js.UndefOr[Boolean | SortOrder] = js.undefined
  /**
    * Sorts items according to which property of getSortData. The value of sortBy needs to match a key name in getSortData.
    */
  var sortBy: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Staggers item transitions, so items transition incrementally after one another. Set as a CSS time format, '0.03s', or as a number in milliseconds, 30.
    */
  var stagger: js.UndefOr[Double | String] = js.undefined
  /**
    * Specifies which elements are stamped within the layout. Isotope will layout items around stamped elements.
    * The masonry, packery, and masonryHorizontal layout modes support stamping.
    * The stamp option stamps elements only when the Isotope instance is first initialized. You can stamp additional elements afterwards with the stamp method.
    */
  var stamp: js.UndefOr[String] = js.undefined
  /**
    * Duration of the transition when items change position or appearance, set in a CSS time format, or as a number in milliseconds. Default: transitionDuration: '0.4s'
    */
  var transitionDuration: js.UndefOr[Double | String] = js.undefined
  /**
    * Items are stacked vertically.
    */
  var vertical: js.UndefOr[Vertical] = js.undefined
  /**
    * The styles applied to reveal items when filtering.
    */
  var visibleStyle: js.UndefOr[Style] = js.undefined
}

object IsotopeOptions {
  @scala.inline
  def apply(
    cellsByColumn: CellsByColumn = null,
    cellsByRow: CellsByRow = null,
    containerStyle: Style = null,
    filter: String | (js.Function1[/* itemElement */ HTMLElement, Boolean]) = null,
    fitRows: FitRows = null,
    getSortData: Sorter = null,
    hiddenStyle: Style = null,
    horiz: Horizontal = null,
    initLayout: js.UndefOr[Boolean] = js.undefined,
    itemSelector: String = null,
    layoutMode: LayoutModes = null,
    masonry: Masonry = null,
    masontryHorizontal: MasonryHorizontal = null,
    originLeft: js.UndefOr[Boolean] = js.undefined,
    originTop: js.UndefOr[Boolean] = js.undefined,
    packery: Packery = null,
    percentPosition: js.UndefOr[Boolean] = js.undefined,
    resize: js.UndefOr[Boolean] = js.undefined,
    sortAscending: Boolean | SortOrder = null,
    sortBy: String | js.Array[String] = null,
    stagger: Double | String = null,
    stamp: String = null,
    transitionDuration: Double | String = null,
    vertical: Vertical = null,
    visibleStyle: Style = null
  ): IsotopeOptions = {
    val __obj = js.Dynamic.literal()
    if (cellsByColumn != null) __obj.updateDynamic("cellsByColumn")(cellsByColumn)
    if (cellsByRow != null) __obj.updateDynamic("cellsByRow")(cellsByRow)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (fitRows != null) __obj.updateDynamic("fitRows")(fitRows)
    if (getSortData != null) __obj.updateDynamic("getSortData")(getSortData)
    if (hiddenStyle != null) __obj.updateDynamic("hiddenStyle")(hiddenStyle)
    if (horiz != null) __obj.updateDynamic("horiz")(horiz)
    if (!js.isUndefined(initLayout)) __obj.updateDynamic("initLayout")(initLayout)
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector)
    if (layoutMode != null) __obj.updateDynamic("layoutMode")(layoutMode)
    if (masonry != null) __obj.updateDynamic("masonry")(masonry)
    if (masontryHorizontal != null) __obj.updateDynamic("masontryHorizontal")(masontryHorizontal)
    if (!js.isUndefined(originLeft)) __obj.updateDynamic("originLeft")(originLeft)
    if (!js.isUndefined(originTop)) __obj.updateDynamic("originTop")(originTop)
    if (packery != null) __obj.updateDynamic("packery")(packery)
    if (!js.isUndefined(percentPosition)) __obj.updateDynamic("percentPosition")(percentPosition)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (sortAscending != null) __obj.updateDynamic("sortAscending")(sortAscending.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (stagger != null) __obj.updateDynamic("stagger")(stagger.asInstanceOf[js.Any])
    if (stamp != null) __obj.updateDynamic("stamp")(stamp)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    if (visibleStyle != null) __obj.updateDynamic("visibleStyle")(visibleStyle)
    __obj.asInstanceOf[IsotopeOptions]
  }
}

