package typings.isotopeLayout.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsotopeOptions extends js.Object {
  
  /**
    * A horizontal grid layout where items are centered inside each cell. The grid is defined by columnWidth and rowHeight options.
    */
  var cellsByColumn: js.UndefOr[CellsByColumn] = js.native
  
  /**
    * A vertical grid layout where items are centered inside each cell. The grid is defined by columnWidth and rowHeight options.
    */
  var cellsByRow: js.UndefOr[CellsByRow] = js.native
  
  /**
    * CSS styles that are applied to the container element.
    */
  var containerStyle: js.UndefOr[Style] = js.native
  
  /**
    * Shows items that match the filter and hides items that do not match.
    * If set to a string, that value is used as a selector.
    * If filter is set to a function, that function checks each item and returns true or false if the item should be shown or hidden.
    */
  var filter: js.UndefOr[String | (js.Function1[/* itemElement */ HTMLElement, Boolean])] = js.native
  
  /**
    * Items are arranged into rows. Rows progress vertically. Similar to what you would expect from a layout that uses CSS floats. fitRows works well for items that have the same height.
    */
  var fitRows: js.UndefOr[FitRows] = js.native
  
  /**
    * Isotope reads data from HTML with the getSortData option.
    * getSortData is set with an object. The object’s keys are keywords used to sort by. Object values are either a shortcut string or function to retrieve the data.
    */
  var getSortData: js.UndefOr[Sorter] = js.native
  
  /**
    * The styles applied to hide items when filtering.
    */
  var hiddenStyle: js.UndefOr[Style] = js.native
  
  /**
    * Items are arranged horizontally.
    */
  var horiz: js.UndefOr[Horizontal] = js.native
  
  /**
    * Enables layout on initialization. Enabled by default initLayout: true.
    * Set initLayout: false to disable layout on initialization, so you can use methods or add events before the initial layout.
    * initLayout was previously isInitLayout in Isotope v2. isInitLayout will still work in Isotope v3
    */
  var initLayout: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies which child elements will be used as item elements in the layout.
    * We recommend always setting itemSelector. itemSelector is useful to exclude sizing elements or other elements that are not part of the layout.
    */
  var itemSelector: js.UndefOr[String] = js.native
  
  /**
    * Layout modes can have their own separate options. These are set in a corresponding object within the options.
    * masonry, fitRows, and vertical are included in Isotope by default. All other layout modes need to installed separately.
    */
  var layoutMode: js.UndefOr[LayoutModes] = js.native
  
  /**
    * The default layout mode. Items are arranged in a vertically cascading grid.
    */
  var masonry: js.UndefOr[Masonry] = js.native
  
  /**
    * Horizontal version of masonry. Items are arranged in a horizontally cascading grid.
    */
  var masontryHorizontal: js.UndefOr[MasonryHorizontal] = js.native
  
  /**
    * Controls the horizontal flow of the layout. By default, item elements start positioning at the left, with originLeft: true. Set originLeft: false for right-to-left layouts.
    */
  var originLeft: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls the vertical flow of the layout. By default, item elements start positioning at the top. Set to false for bottom-up layouts. It’s like Tetris!
    */
  var originTop: js.UndefOr[Boolean] = js.native
  
  /**
    * The packery layout mode uses a bin-packing algorithm. This is a fancy way of saying “it fills empty gaps.” It works similarly to masonry, except gaps will be filled.
    */
  var packery: js.UndefOr[Packery] = js.native
  
  /**
    * Sets item positions in percent values, rather than pixel values. percentPosition: true works well with percent-width items, as items will not transition their position on resize.
    */
  var percentPosition: js.UndefOr[Boolean] = js.native
  
  /**
    * Adjusts sizes and positions when window is resized. Enabled by default resize: true.
    */
  var resize: js.UndefOr[Boolean] = js.native
  
  /**
    * Sorts items ascendingly if sortAscending: true “A, B, C…”, “1, 2, 3…”, or descendingly if sortAscending: false, “Z, Y, X…”, “9, 8, 7…”.
    * You can set ascending order for each sortBy value by setting sortAscending to an object.
    */
  var sortAscending: js.UndefOr[Boolean | SortOrder] = js.native
  
  /**
    * Sorts items according to which property of getSortData. The value of sortBy needs to match a key name in getSortData.
    */
  var sortBy: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Staggers item transitions, so items transition incrementally after one another. Set as a CSS time format, '0.03s', or as a number in milliseconds, 30.
    */
  var stagger: js.UndefOr[Double | String] = js.native
  
  /**
    * Specifies which elements are stamped within the layout. Isotope will layout items around stamped elements.
    * The masonry, packery, and masonryHorizontal layout modes support stamping.
    * The stamp option stamps elements only when the Isotope instance is first initialized. You can stamp additional elements afterwards with the stamp method.
    */
  var stamp: js.UndefOr[String] = js.native
  
  /**
    * Duration of the transition when items change position or appearance, set in a CSS time format, or as a number in milliseconds. Default: transitionDuration: '0.4s'
    */
  var transitionDuration: js.UndefOr[Double | String] = js.native
  
  /**
    * Items are stacked vertically.
    */
  var vertical: js.UndefOr[Vertical] = js.native
  
  /**
    * The styles applied to reveal items when filtering.
    */
  var visibleStyle: js.UndefOr[Style] = js.native
}
object IsotopeOptions {
  
  @scala.inline
  def apply(): IsotopeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsotopeOptions]
  }
  
  @scala.inline
  implicit class IsotopeOptionsOps[Self <: IsotopeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellsByColumn(value: CellsByColumn): Self = this.set("cellsByColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellsByColumn: Self = this.set("cellsByColumn", js.undefined)
    
    @scala.inline
    def setCellsByRow(value: CellsByRow): Self = this.set("cellsByRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellsByRow: Self = this.set("cellsByRow", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: Style): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setFilterFunction1(value: /* itemElement */ HTMLElement => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilter(value: String | (js.Function1[/* itemElement */ HTMLElement, Boolean])): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFitRows(value: FitRows): Self = this.set("fitRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitRows: Self = this.set("fitRows", js.undefined)
    
    @scala.inline
    def setGetSortData(value: Sorter): Self = this.set("getSortData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetSortData: Self = this.set("getSortData", js.undefined)
    
    @scala.inline
    def setHiddenStyle(value: Style): Self = this.set("hiddenStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenStyle: Self = this.set("hiddenStyle", js.undefined)
    
    @scala.inline
    def setHoriz(value: Horizontal): Self = this.set("horiz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoriz: Self = this.set("horiz", js.undefined)
    
    @scala.inline
    def setInitLayout(value: Boolean): Self = this.set("initLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitLayout: Self = this.set("initLayout", js.undefined)
    
    @scala.inline
    def setItemSelector(value: String): Self = this.set("itemSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemSelector: Self = this.set("itemSelector", js.undefined)
    
    @scala.inline
    def setLayoutMode(value: LayoutModes): Self = this.set("layoutMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutMode: Self = this.set("layoutMode", js.undefined)
    
    @scala.inline
    def setMasonry(value: Masonry): Self = this.set("masonry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasonry: Self = this.set("masonry", js.undefined)
    
    @scala.inline
    def setMasontryHorizontal(value: MasonryHorizontal): Self = this.set("masontryHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasontryHorizontal: Self = this.set("masontryHorizontal", js.undefined)
    
    @scala.inline
    def setOriginLeft(value: Boolean): Self = this.set("originLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginLeft: Self = this.set("originLeft", js.undefined)
    
    @scala.inline
    def setOriginTop(value: Boolean): Self = this.set("originTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginTop: Self = this.set("originTop", js.undefined)
    
    @scala.inline
    def setPackery(value: Packery): Self = this.set("packery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackery: Self = this.set("packery", js.undefined)
    
    @scala.inline
    def setPercentPosition(value: Boolean): Self = this.set("percentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentPosition: Self = this.set("percentPosition", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setSortAscending(value: Boolean | SortOrder): Self = this.set("sortAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortAscending: Self = this.set("sortAscending", js.undefined)
    
    @scala.inline
    def setSortByVarargs(value: String*): Self = this.set("sortBy", js.Array(value :_*))
    
    @scala.inline
    def setSortBy(value: String | js.Array[String]): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    
    @scala.inline
    def setStagger(value: Double | String): Self = this.set("stagger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStagger: Self = this.set("stagger", js.undefined)
    
    @scala.inline
    def setStamp(value: String): Self = this.set("stamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStamp: Self = this.set("stamp", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double | String): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setVertical(value: Vertical): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    
    @scala.inline
    def setVisibleStyle(value: Style): Self = this.set("visibleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleStyle: Self = this.set("visibleStyle", js.undefined)
  }
}
