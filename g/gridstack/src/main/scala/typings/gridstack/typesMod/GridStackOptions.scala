package typings.gridstack.typesMod

import typings.gridstack.anon.TypeofGridStackDD
import typings.gridstack.gridstackBooleans.`false`
import typings.gridstack.gridstackStrings.auto
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridStackOptions extends js.Object {
  
  /**
    * accept widgets dragged from other grids or from outside (default: `false`). Can be:
    * `true` (uses `'.grid-stack-item'` class filter) or `false`,
    * string for explicit class name,
    * function returning a boolean. See [example](http://gridstack.github.io/gridstack.js/demo/two.html)
    */
  var acceptWidgets: js.UndefOr[Boolean | String | (js.Function1[/* element */ Element, Boolean])] = js.native
  
  /** if true the resizing handles are shown even if the user is not hovering over the widget (default?: false) */
  var alwaysShowResizeHandle: js.UndefOr[Boolean] = js.native
  
  /** turns animation on (default?: true) */
  var animate: js.UndefOr[Boolean] = js.native
  
  /** if false gridstack will not initialize existing items (default?: true) */
  var auto: js.UndefOr[Boolean] = js.native
  
  /**
    * one cell height (default?: 60). Can be:
    *  an integer (px)
    *  a string (ex: '100px', '10em', '10rem', '10%')
    *  0 or null, in which case the library will not generate styles for rows. Everything must be defined in CSS files.
    *  'auto' - height will be calculated to match cell width (initial square grid).
    */
  var cellHeight: js.UndefOr[numberOrString] = js.native
  
  /** (internal) unit for cellHeight (default? 'px') which is set when a string cellHeight with a unit is passed (ex: '10rem') */
  var cellHeightUnit: js.UndefOr[String] = js.native
  
  /** number of columns (default?: 12). Note: IF you change this, CSS also have to change. See https://github.com/gridstack/gridstack.js#change-grid-columns */
  var column: js.UndefOr[Double] = js.native
  
  /** class that implement drag'n'drop functionality for gridstack. If false grid will be static.
    * (default?: undefined - first available plugin will be used)
    */
  var ddPlugin: js.UndefOr[`false` | TypeofGridStackDD] = js.native
  
  /** disallows dragging of widgets (default?: false) */
  var disableDrag: js.UndefOr[Boolean] = js.native
  
  /** disables the onColumnMode when the grid width is less than minWidth (default?: false) */
  var disableOneColumnMode: js.UndefOr[Boolean] = js.native
  
  /** disallows resizing of widgets (default?: false). */
  var disableResize: js.UndefOr[Boolean] = js.native
  
  /** allows to drag external items using this selector - see dragInOptions. (default: undefined) */
  var dragIn: js.UndefOr[String] = js.native
  
  /** allows to drag external items using these options. (default?: { handle: '.grid-stack-item-content', revert: 'invalid', scroll: false, appendTo: 'body', helper: 'clone' }) */
  var dragInOptions: js.UndefOr[DDDragInOpt] = js.native
  
  /** let user drag nested grid items out of a parent or not (default false) */
  var dragOut: js.UndefOr[Boolean] = js.native
  
  /** allows to override UI draggable options. (default?: { handle?: '.grid-stack-item-content', scroll?: true, appendTo?: 'body', containment: null }) */
  var draggable: js.UndefOr[DDDragOpt] = js.native
  
  /** enable floating widgets (default?: false) See example (http://gridstack.github.io/gridstack.js/demo/float.html) */
  var float: js.UndefOr[Boolean] = js.native
  
  /** draggable handle selector (default?: '.grid-stack-item-content') */
  var handle: js.UndefOr[String] = js.native
  
  /** draggable handle class (e.g. 'grid-stack-item-content'). If set 'handle' is ignored (default?: null) */
  var handleClass: js.UndefOr[String] = js.native
  
  /** widget class (default?: 'grid-stack-item') */
  var itemClass: js.UndefOr[String] = js.native
  
  /**
    * gap between grid item and content (default?: 10). This will set all 4 sides and support the CSS formats below
    *  an integer (px)
    *  a string with possible units (ex: '2em', '20px', '2rem')
    *  string with space separated values (ex: '5px 10px 0 20px' for all 4 sides, or '5em 10em' for top/bottom and left/right pairs like CSS).
    * Note: all sides must have same units (last one wins, default px)
    */
  var margin: js.UndefOr[numberOrString] = js.native
  
  var marginBottom: js.UndefOr[numberOrString] = js.native
  
  var marginLeft: js.UndefOr[numberOrString] = js.native
  
  var marginRight: js.UndefOr[numberOrString] = js.native
  
  /** OLD way to optionally set each side - use margin: '5px 10px 0 20px' instead. Used internally to store each side. */
  var marginTop: js.UndefOr[numberOrString] = js.native
  
  /** (internal) unit for margin (default? 'px') set when `margin` is set as string with unit (ex: 2rem') */
  var marginUnit: js.UndefOr[String] = js.native
  
  /** maximum rows amount. Default? is 0 which means no maximum rows */
  var maxRow: js.UndefOr[Double] = js.native
  
  /** minimum rows amount. Default is `0`. You can also do this with `min-height` CSS attribute
    * on the grid div in pixels, which will round to the closest row.
    */
  var minRow: js.UndefOr[Double] = js.native
  
  /** minimal width. If grid width is less, grid will be shown in one column mode (default?: 768) */
  var minWidth: js.UndefOr[Double] = js.native
  
  /**
    * set to true if you want oneColumnMode to use the DOM order and ignore x,y from normal multi column
    * layouts during sorting. This enables you to have custom 1 column layout that differ from the rest. (default?: false)
    */
  var oneColumnModeDomSort: js.UndefOr[Boolean] = js.native
  
  /** class for placeholder (default?: 'grid-stack-placeholder') */
  var placeholderClass: js.UndefOr[String] = js.native
  
  /** placeholder default content (default?: '') */
  var placeholderText: js.UndefOr[String] = js.native
  
  /**
    * if true widgets could be removed by dragging outside of the grid. It could also be a selector string (ex: ".trash"),
    * in this case widgets will be removed by dropping them there (default?: false)
    * See example (http://gridstack.github.io/gridstack.js/demo/two.html)
    */
  var removable: js.UndefOr[Boolean | String] = js.native
  
  /** allows to override UI removable options. (default?: { accept: '.' + opts.itemClass }) */
  var removableOptions: js.UndefOr[DDRemoveOpt] = js.native
  
  /** time in milliseconds before widget is being removed while dragging outside of the grid. (default?: 2000) */
  var removeTimeout: js.UndefOr[Double] = js.native
  
  /** allows to override UI resizable options. (default?: { autoHide: true, handles: 'se' }) */
  var resizable: js.UndefOr[DDResizeOpt] = js.native
  
  /** fix grid number of rows. This is a shortcut of writing `minRow:N, maxRow:N`. (default `0` no constrain) */
  var row: js.UndefOr[Double] = js.native
  
  /**
    * if true turns grid to RTL. Possible values are true, false, 'auto' (default?: 'auto')
    * See [example](http://gridstack.github.io/gridstack.js/demo/rtl.html)
    */
  var rtl: js.UndefOr[Boolean | auto] = js.native
  
  /**
    * makes grid static (default?: false). If `true` widgets are not movable/resizable.
    * You don't even need draggable/resizable. A CSS class
    * 'grid-stack-static' is also added to the element.
    */
  var staticGrid: js.UndefOr[Boolean] = js.native
  
  /** if `true` will add style element to `<head>` otherwise will add it to element's parent node (default `false`). */
  var styleInHead: js.UndefOr[Boolean] = js.native
}
object GridStackOptions {
  
  @scala.inline
  def apply(): GridStackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridStackOptions]
  }
  
  @scala.inline
  implicit class GridStackOptionsOps[Self <: GridStackOptions] (val x: Self) extends AnyVal {
    
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
    def setAcceptWidgetsFunction1(value: /* element */ Element => Boolean): Self = this.set("acceptWidgets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAcceptWidgets(value: Boolean | String | (js.Function1[/* element */ Element, Boolean])): Self = this.set("acceptWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptWidgets: Self = this.set("acceptWidgets", js.undefined)
    
    @scala.inline
    def setAlwaysShowResizeHandle(value: Boolean): Self = this.set("alwaysShowResizeHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysShowResizeHandle: Self = this.set("alwaysShowResizeHandle", js.undefined)
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    
    @scala.inline
    def setCellHeight(value: numberOrString): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellHeight: Self = this.set("cellHeight", js.undefined)
    
    @scala.inline
    def setCellHeightUnit(value: String): Self = this.set("cellHeightUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellHeightUnit: Self = this.set("cellHeightUnit", js.undefined)
    
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setDdPlugin(value: `false` | TypeofGridStackDD): Self = this.set("ddPlugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdPlugin: Self = this.set("ddPlugin", js.undefined)
    
    @scala.inline
    def setDisableDrag(value: Boolean): Self = this.set("disableDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDrag: Self = this.set("disableDrag", js.undefined)
    
    @scala.inline
    def setDisableOneColumnMode(value: Boolean): Self = this.set("disableOneColumnMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableOneColumnMode: Self = this.set("disableOneColumnMode", js.undefined)
    
    @scala.inline
    def setDisableResize(value: Boolean): Self = this.set("disableResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableResize: Self = this.set("disableResize", js.undefined)
    
    @scala.inline
    def setDragIn(value: String): Self = this.set("dragIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragIn: Self = this.set("dragIn", js.undefined)
    
    @scala.inline
    def setDragInOptions(value: DDDragInOpt): Self = this.set("dragInOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragInOptions: Self = this.set("dragInOptions", js.undefined)
    
    @scala.inline
    def setDragOut(value: Boolean): Self = this.set("dragOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragOut: Self = this.set("dragOut", js.undefined)
    
    @scala.inline
    def setDraggable(value: DDDragOpt): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setFloat(value: Boolean): Self = this.set("float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    
    @scala.inline
    def setHandleClass(value: String): Self = this.set("handleClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleClass: Self = this.set("handleClass", js.undefined)
    
    @scala.inline
    def setItemClass(value: String): Self = this.set("itemClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemClass: Self = this.set("itemClass", js.undefined)
    
    @scala.inline
    def setMargin(value: numberOrString): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: numberOrString): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: numberOrString): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: numberOrString): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: numberOrString): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setMarginUnit(value: String): Self = this.set("marginUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginUnit: Self = this.set("marginUnit", js.undefined)
    
    @scala.inline
    def setMaxRow(value: Double): Self = this.set("maxRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRow: Self = this.set("maxRow", js.undefined)
    
    @scala.inline
    def setMinRow(value: Double): Self = this.set("minRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRow: Self = this.set("minRow", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setOneColumnModeDomSort(value: Boolean): Self = this.set("oneColumnModeDomSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneColumnModeDomSort: Self = this.set("oneColumnModeDomSort", js.undefined)
    
    @scala.inline
    def setPlaceholderClass(value: String): Self = this.set("placeholderClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderClass: Self = this.set("placeholderClass", js.undefined)
    
    @scala.inline
    def setPlaceholderText(value: String): Self = this.set("placeholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderText: Self = this.set("placeholderText", js.undefined)
    
    @scala.inline
    def setRemovable(value: Boolean | String): Self = this.set("removable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovable: Self = this.set("removable", js.undefined)
    
    @scala.inline
    def setRemovableOptions(value: DDRemoveOpt): Self = this.set("removableOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovableOptions: Self = this.set("removableOptions", js.undefined)
    
    @scala.inline
    def setRemoveTimeout(value: Double): Self = this.set("removeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveTimeout: Self = this.set("removeTimeout", js.undefined)
    
    @scala.inline
    def setResizable(value: DDResizeOpt): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean | auto): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    
    @scala.inline
    def setStaticGrid(value: Boolean): Self = this.set("staticGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticGrid: Self = this.set("staticGrid", js.undefined)
    
    @scala.inline
    def setStyleInHead(value: Boolean): Self = this.set("styleInHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleInHead: Self = this.set("styleInHead", js.undefined)
  }
}
