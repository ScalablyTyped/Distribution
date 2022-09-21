package typings.gridstack

import org.scalablytyped.runtime.Instantiable1
import typings.gridstack.gridstackBooleans.`false`
import typings.gridstack.gridstackBooleans.`true`
import typings.gridstack.gridstackEngineMod.GridStackEngine
import typings.gridstack.gridstackEngineMod.GridStackEngineOptions
import typings.gridstack.gridstackMod.GridStack
import typings.gridstack.gridstackStrings.auto
import typings.gridstack.gridstackStrings.mobile
import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.gridstack.gridstackStrings.moveScale
    - typings.gridstack.gridstackStrings.move
    - typings.gridstack.gridstackStrings.scale
    - typings.gridstack.gridstackStrings.none
    - js.Function4[
  / * column * / scala.Double, 
  / * oldColumn * / scala.Double, 
  / * nodes * / js.Array[typings.gridstack.typesMod.GridStackNode], 
  / * oldNodes * / js.Array[typings.gridstack.typesMod.GridStackNode], 
  scala.Unit]
  */
  type ColumnOptions = _ColumnOptions | (js.Function4[
    /* column */ Double, 
    /* oldColumn */ Double, 
    /* nodes */ js.Array[GridStackNode], 
    /* oldNodes */ js.Array[GridStackNode], 
    Unit
  ])
  
  trait DDDragInOpt
    extends StObject
       with DDDragOpt {
    
    /** used when dragging item from the outside, and canceling (ex: 'invalid' or your own method)*/
    /** helper function when dropping (ex: 'clone' or your own method) */
    var helper: js.UndefOr[String | (js.Function1[/* event */ Event, HTMLElement])] = js.undefined
  }
  object DDDragInOpt {
    
    inline def apply(): DDDragInOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDDragInOpt]
    }
    
    extension [Self <: DDDragInOpt](x: Self) {
      
      inline def setHelper(value: String | (js.Function1[/* event */ Event, HTMLElement])): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      inline def setHelperFunction1(value: /* event */ Event => HTMLElement): Self = StObject.set(x, "helper", js.Any.fromFunction1(value))
      
      inline def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    }
  }
  
  trait DDDragOpt extends StObject {
    
    /** default to 'body' */
    var appendTo: js.UndefOr[String] = js.undefined
    
    /** class selector of items that can be dragged. default to '.grid-stack-item-content' */
    var handle: js.UndefOr[String] = js.undefined
  }
  object DDDragOpt {
    
    inline def apply(): DDDragOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDDragOpt]
    }
    
    extension [Self <: DDDragOpt](x: Self) {
      
      inline def setAppendTo(value: String): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    }
  }
  
  trait DDRemoveOpt extends StObject {
    
    /** class that can be removed (default?: '.' + opts.itemClass) */
    var accept: js.UndefOr[String] = js.undefined
  }
  object DDRemoveOpt {
    
    inline def apply(): DDRemoveOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDRemoveOpt]
    }
    
    extension [Self <: DDRemoveOpt](x: Self) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    }
  }
  
  trait DDResizeOpt extends StObject {
    
    /** do resize handle hide by default until mouse over ? - default: true on desktop, false on mobile*/
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * sides where you can resize from (ex: 'e, se, s, sw, w') - default 'se' (south-east)
      * Note: it is not recommended to resize from the top sides as weird side effect may occur.
      */
    var handles: js.UndefOr[String] = js.undefined
  }
  object DDResizeOpt {
    
    inline def apply(): DDResizeOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDResizeOpt]
    }
    
    extension [Self <: DDResizeOpt](x: Self) {
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setHandles(value: String): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
      
      inline def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
    }
  }
  
  trait DDUIData extends StObject {
    
    var position: js.UndefOr[Position] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object DDUIData {
    
    inline def apply(): DDUIData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDUIData]
    }
    
    extension [Self <: DDUIData](x: Self) {
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait GridItemHTMLElement
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /** pointer to grid node instance */
    var gridstackNode: js.UndefOr[GridStackNode] = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  type GridStackElement = String | HTMLElement | GridItemHTMLElement
  
  type GridStackEventHandlerCallback = js.Function3[
    /* event */ Event, 
    /* arg2 */ js.UndefOr[GridItemHTMLElement | GridStackNode | js.Array[GridStackNode]], 
    /* newNode */ js.UndefOr[GridStackNode], 
    Unit
  ]
  
  trait GridStackMoveOpts
    extends StObject
       with GridStackPosition {
    
    var cellHeight: js.UndefOr[Double] = js.undefined
    
    /** vars to calculate other cells coordinates */
    var cellWidth: js.UndefOr[Double] = js.undefined
    
    var marginBottom: js.UndefOr[Double] = js.undefined
    
    var marginLeft: js.UndefOr[Double] = js.undefined
    
    var marginRight: js.UndefOr[Double] = js.undefined
    
    var marginTop: js.UndefOr[Double] = js.undefined
    
    /** true if we are calling this recursively to prevent simple swap or coverage collision - default false*/
    var nested: js.UndefOr[Boolean] = js.undefined
    
    /** do we pack (default true) */
    var pack: js.UndefOr[Boolean] = js.undefined
    
    /** position in pixels of the currently dragged items (for overlap check) */
    var rect: js.UndefOr[GridStackPosition] = js.undefined
    
    /** true if we're live resizing */
    var resizing: js.UndefOr[Boolean] = js.undefined
    
    /** node to skip collision */
    var skip: js.UndefOr[GridStackNode] = js.undefined
  }
  object GridStackMoveOpts {
    
    inline def apply(): GridStackMoveOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridStackMoveOpts]
    }
    
    extension [Self <: GridStackMoveOpts](x: Self) {
      
      inline def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
      
      inline def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      inline def setCellWidthUndefined: Self = StObject.set(x, "cellWidth", js.undefined)
      
      inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
      
      inline def setPack(value: Boolean): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      inline def setPackUndefined: Self = StObject.set(x, "pack", js.undefined)
      
      inline def setRect(value: GridStackPosition): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
      
      inline def setResizing(value: Boolean): Self = StObject.set(x, "resizing", value.asInstanceOf[js.Any])
      
      inline def setResizingUndefined: Self = StObject.set(x, "resizing", js.undefined)
      
      inline def setSkip(value: GridStackNode): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
  
  trait GridStackNode
    extends StObject
       with GridStackWidget {
    
    /** pointer back to HTML element */
    var el: js.UndefOr[GridItemHTMLElement] = js.undefined
    
    /** pointer back to Grid instance */
    var grid: js.UndefOr[GridStack] = js.undefined
  }
  object GridStackNode {
    
    inline def apply(): GridStackNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridStackNode]
    }
    
    extension [Self <: GridStackNode](x: Self) {
      
      inline def setEl(value: GridItemHTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setGrid(value: GridStack): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    }
  }
  
  trait GridStackOptions extends StObject {
    
    /**
      * accept widgets dragged from other grids or from outside (default: `false`). Can be:
      * `true` (uses `'.grid-stack-item'` class filter) or `false`,
      * string for explicit class name,
      * function returning a boolean. See [example](http://gridstack.github.io/gridstack.js/demo/two.html)
      */
    var acceptWidgets: js.UndefOr[Boolean | String | (js.Function1[/* element */ Element, Boolean])] = js.undefined
    
    /** possible values (default: `mobile`) - does not apply to non-resizable widgets
      * `false` the resizing handles are only shown while hovering over a widget
      * `true` the resizing handles are always shown
      * 'mobile' if running on a mobile device, default to `true` (since there is no hovering per say), else `false`.
      * this uses this condition on browser agent check:
      `alwaysShowResizeHandle: /Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test( navigator.userAgent )`
      See [example](http://gridstack.github.io/gridstack.js/demo/mobile.html) */
    var alwaysShowResizeHandle: js.UndefOr[`true` | `false` | mobile] = js.undefined
    
    /** turns animation on (default?: true) */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /** if false gridstack will not initialize existing items (default?: true) */
    var auto: js.UndefOr[Boolean] = js.undefined
    
    /**
      * one cell height (default?: 'auto'). Can be:
      *  an integer (px)
      *  a string (ex: '100px', '10em', '10rem'). Note: % doesn't right - see demo/cell-height.html
      *  0, in which case the library will not generate styles for rows. Everything must be defined in your own CSS files.
      *  'auto' - height will be calculated for square cells (width / column) and updated live as you resize the window - also see `cellHeightThrottle`
      *  'initial' - similar to 'auto' (start at square cells) but stay that size during window resizing.
      */
    var cellHeight: js.UndefOr[numberOrString] = js.undefined
    
    /** throttle time delay (in ms) used when cellHeight='auto' to improve performance vs usability (default?: 100).
      * A value of 0 will make it instant at a cost of re-creating the CSS file at ever window resize event!
      * */
    var cellHeightThrottle: js.UndefOr[Double] = js.undefined
    
    /** (internal) unit for cellHeight (default? 'px') which is set when a string cellHeight with a unit is passed (ex: '10rem') */
    var cellHeightUnit: js.UndefOr[String] = js.undefined
    
    /** list of children item to create when calling load() or addGrid() */
    var children: js.UndefOr[js.Array[GridStackWidget]] = js.undefined
    
    /** additional class on top of '.grid-stack' (which is required for our CSS) to differentiate this instance.
      Note: only used by addGrid(), else your element should have the needed class */
    var `class`: js.UndefOr[String] = js.undefined
    
    /** number of columns (default?: 12). Note: IF you change this, CSS also have to change. See https://github.com/gridstack/gridstack.js#change-grid-columns.
      * Note: for nested grids, it is recommended to use 'auto' which will always match the container grid-item current width (in column) to keep inside and outside
      * items always to same. flag is not supported for regular non-nested grids.
      */
    var column: js.UndefOr[Double | auto] = js.undefined
    
    /** disallows dragging of widgets (default?: false) */
    var disableDrag: js.UndefOr[Boolean] = js.undefined
    
    /** disables the onColumnMode when the grid width is less than oneColumnSize (default?: false) */
    var disableOneColumnMode: js.UndefOr[Boolean] = js.undefined
    
    /** disallows resizing of widgets (default?: false). */
    var disableResize: js.UndefOr[Boolean] = js.undefined
    
    /** allows to drag external items using this selector - see dragInOptions. (default: undefined) */
    var dragIn: js.UndefOr[String] = js.undefined
    
    /** allows to drag external items using these options. See `GridStack.setupDragIn()` instead (not per grid really).
      * (default?: { handle: '.grid-stack-item-content', appendTo: 'body' })
      * helper can be 'clone' or your own function (set what the drag/dropped item will be instead)
      */
    var dragInOptions: js.UndefOr[DDDragInOpt] = js.undefined
    
    /** allows to override UI draggable options. (default?: { handle?: '.grid-stack-item-content', appendTo?: 'body' }) */
    var draggable: js.UndefOr[DDDragOpt] = js.undefined
    
    /** let user drag nested grid items out of a parent or not (default true - not supported yet) */
    /** the type of engine to create (so you can subclass) default to GridStackEngine */
    var engineClass: js.UndefOr[Instantiable1[/* opts */ js.UndefOr[GridStackEngineOptions], GridStackEngine]] = js.undefined
    
    /** enable floating widgets (default?: false) See example (http://gridstack.github.io/gridstack.js/demo/float.html) */
    var float: js.UndefOr[Boolean] = js.undefined
    
    /** draggable handle selector (default?: '.grid-stack-item-content') */
    var handle: js.UndefOr[String] = js.undefined
    
    /** draggable handle class (e.g. 'grid-stack-item-content'). If set 'handle' is ignored (default?: null) */
    var handleClass: js.UndefOr[String] = js.undefined
    
    /** id used to debug grid instance, not currently stored in DOM attributes */
    var id: js.UndefOr[numberOrString] = js.undefined
    
    /** additional widget class (default?: 'grid-stack-item') */
    var itemClass: js.UndefOr[String] = js.undefined
    
    /**
      * gap between grid item and content (default?: 10). This will set all 4 sides and support the CSS formats below
      *  an integer (px)
      *  a string with possible units (ex: '2em', '20px', '2rem')
      *  string with space separated values (ex: '5px 10px 0 20px' for all 4 sides, or '5em 10em' for top/bottom and left/right pairs like CSS).
      * Note: all sides must have same units (last one wins, default px)
      */
    var margin: js.UndefOr[numberOrString] = js.undefined
    
    var marginBottom: js.UndefOr[numberOrString] = js.undefined
    
    var marginLeft: js.UndefOr[numberOrString] = js.undefined
    
    var marginRight: js.UndefOr[numberOrString] = js.undefined
    
    /** OLD way to optionally set each side - use margin: '5px 10px 0 20px' instead. Used internally to store each side. */
    var marginTop: js.UndefOr[numberOrString] = js.undefined
    
    /** (internal) unit for margin (default? 'px') set when `margin` is set as string with unit (ex: 2rem') */
    var marginUnit: js.UndefOr[String] = js.undefined
    
    /** maximum rows amount. Default? is 0 which means no maximum rows */
    var maxRow: js.UndefOr[Double] = js.undefined
    
    /** minimum rows amount. Default is `0`. You can also do this with `min-height` CSS attribute
      * on the grid div in pixels, which will round to the closest row.
      */
    var minRow: js.UndefOr[Double] = js.undefined
    
    /**
      * set to true if you want oneColumnMode to use the DOM order and ignore x,y from normal multi column
      * layouts during sorting. This enables you to have custom 1 column layout that differ from the rest. (default?: false)
      */
    var oneColumnModeDomSort: js.UndefOr[Boolean] = js.undefined
    
    /** minimal width before grid will be shown in one column mode (default?: 768) */
    var oneColumnSize: js.UndefOr[Double] = js.undefined
    
    /** class for placeholder (default?: 'grid-stack-placeholder') */
    var placeholderClass: js.UndefOr[String] = js.undefined
    
    /** placeholder default content (default?: '') */
    var placeholderText: js.UndefOr[String] = js.undefined
    
    /**
      * if true widgets could be removed by dragging outside of the grid. It could also be a selector string (ex: ".trash"),
      * in this case widgets will be removed by dropping them there (default?: false)
      * See example (http://gridstack.github.io/gridstack.js/demo/two.html)
      */
    var removable: js.UndefOr[Boolean | String] = js.undefined
    
    /** allows to override UI removable options. (default?: { accept: '.grid-stack-item' }) */
    var removableOptions: js.UndefOr[DDRemoveOpt] = js.undefined
    
    /** allows to override UI resizable options. (default?: { handles: 'se' }) */
    var resizable: js.UndefOr[DDResizeOpt] = js.undefined
    
    /** fix grid number of rows. This is a shortcut of writing `minRow:N, maxRow:N`. (default `0` no constrain) */
    var row: js.UndefOr[Double] = js.undefined
    
    /**
      * if true turns grid to RTL. Possible values are true, false, 'auto' (default?: 'auto')
      * See [example](http://gridstack.github.io/gridstack.js/demo/rtl.html)
      */
    var rtl: js.UndefOr[Boolean | auto] = js.undefined
    
    /**
      * makes grid static (default?: false). If `true` widgets are not movable/resizable.
      * You don't even need draggable/resizable. A CSS class
      * 'grid-stack-static' is also added to the element.
      */
    var staticGrid: js.UndefOr[Boolean] = js.undefined
    
    /** if `true` will add style element to `<head>` otherwise will add it to element's parent node (default `false`). */
    var styleInHead: js.UndefOr[Boolean] = js.undefined
  }
  object GridStackOptions {
    
    inline def apply(): GridStackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridStackOptions]
    }
    
    extension [Self <: GridStackOptions](x: Self) {
      
      inline def setAcceptWidgets(value: Boolean | String | (js.Function1[/* element */ Element, Boolean])): Self = StObject.set(x, "acceptWidgets", value.asInstanceOf[js.Any])
      
      inline def setAcceptWidgetsFunction1(value: /* element */ Element => Boolean): Self = StObject.set(x, "acceptWidgets", js.Any.fromFunction1(value))
      
      inline def setAcceptWidgetsUndefined: Self = StObject.set(x, "acceptWidgets", js.undefined)
      
      inline def setAlwaysShowResizeHandle(value: `true` | `false` | mobile): Self = StObject.set(x, "alwaysShowResizeHandle", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowResizeHandleUndefined: Self = StObject.set(x, "alwaysShowResizeHandle", js.undefined)
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setCellHeight(value: numberOrString): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      inline def setCellHeightThrottle(value: Double): Self = StObject.set(x, "cellHeightThrottle", value.asInstanceOf[js.Any])
      
      inline def setCellHeightThrottleUndefined: Self = StObject.set(x, "cellHeightThrottle", js.undefined)
      
      inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
      
      inline def setCellHeightUnit(value: String): Self = StObject.set(x, "cellHeightUnit", value.asInstanceOf[js.Any])
      
      inline def setCellHeightUnitUndefined: Self = StObject.set(x, "cellHeightUnit", js.undefined)
      
      inline def setChildren(value: js.Array[GridStackWidget]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: GridStackWidget*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setColumn(value: Double | auto): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setDisableDrag(value: Boolean): Self = StObject.set(x, "disableDrag", value.asInstanceOf[js.Any])
      
      inline def setDisableDragUndefined: Self = StObject.set(x, "disableDrag", js.undefined)
      
      inline def setDisableOneColumnMode(value: Boolean): Self = StObject.set(x, "disableOneColumnMode", value.asInstanceOf[js.Any])
      
      inline def setDisableOneColumnModeUndefined: Self = StObject.set(x, "disableOneColumnMode", js.undefined)
      
      inline def setDisableResize(value: Boolean): Self = StObject.set(x, "disableResize", value.asInstanceOf[js.Any])
      
      inline def setDisableResizeUndefined: Self = StObject.set(x, "disableResize", js.undefined)
      
      inline def setDragIn(value: String): Self = StObject.set(x, "dragIn", value.asInstanceOf[js.Any])
      
      inline def setDragInOptions(value: DDDragInOpt): Self = StObject.set(x, "dragInOptions", value.asInstanceOf[js.Any])
      
      inline def setDragInOptionsUndefined: Self = StObject.set(x, "dragInOptions", js.undefined)
      
      inline def setDragInUndefined: Self = StObject.set(x, "dragIn", js.undefined)
      
      inline def setDraggable(value: DDDragOpt): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEngineClass(value: Instantiable1[/* opts */ js.UndefOr[GridStackEngineOptions], GridStackEngine]): Self = StObject.set(x, "engineClass", value.asInstanceOf[js.Any])
      
      inline def setEngineClassUndefined: Self = StObject.set(x, "engineClass", js.undefined)
      
      inline def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleClass(value: String): Self = StObject.set(x, "handleClass", value.asInstanceOf[js.Any])
      
      inline def setHandleClassUndefined: Self = StObject.set(x, "handleClass", js.undefined)
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setId(value: numberOrString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItemClass(value: String): Self = StObject.set(x, "itemClass", value.asInstanceOf[js.Any])
      
      inline def setItemClassUndefined: Self = StObject.set(x, "itemClass", js.undefined)
      
      inline def setMargin(value: numberOrString): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: numberOrString): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(value: numberOrString): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: numberOrString): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(value: numberOrString): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginUnit(value: String): Self = StObject.set(x, "marginUnit", value.asInstanceOf[js.Any])
      
      inline def setMarginUnitUndefined: Self = StObject.set(x, "marginUnit", js.undefined)
      
      inline def setMaxRow(value: Double): Self = StObject.set(x, "maxRow", value.asInstanceOf[js.Any])
      
      inline def setMaxRowUndefined: Self = StObject.set(x, "maxRow", js.undefined)
      
      inline def setMinRow(value: Double): Self = StObject.set(x, "minRow", value.asInstanceOf[js.Any])
      
      inline def setMinRowUndefined: Self = StObject.set(x, "minRow", js.undefined)
      
      inline def setOneColumnModeDomSort(value: Boolean): Self = StObject.set(x, "oneColumnModeDomSort", value.asInstanceOf[js.Any])
      
      inline def setOneColumnModeDomSortUndefined: Self = StObject.set(x, "oneColumnModeDomSort", js.undefined)
      
      inline def setOneColumnSize(value: Double): Self = StObject.set(x, "oneColumnSize", value.asInstanceOf[js.Any])
      
      inline def setOneColumnSizeUndefined: Self = StObject.set(x, "oneColumnSize", js.undefined)
      
      inline def setPlaceholderClass(value: String): Self = StObject.set(x, "placeholderClass", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderClassUndefined: Self = StObject.set(x, "placeholderClass", js.undefined)
      
      inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
      
      inline def setRemovable(value: Boolean | String): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      inline def setRemovableOptions(value: DDRemoveOpt): Self = StObject.set(x, "removableOptions", value.asInstanceOf[js.Any])
      
      inline def setRemovableOptionsUndefined: Self = StObject.set(x, "removableOptions", js.undefined)
      
      inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
      
      inline def setResizable(value: DDResizeOpt): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setRtl(value: Boolean | auto): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setStaticGrid(value: Boolean): Self = StObject.set(x, "staticGrid", value.asInstanceOf[js.Any])
      
      inline def setStaticGridUndefined: Self = StObject.set(x, "staticGrid", js.undefined)
      
      inline def setStyleInHead(value: Boolean): Self = StObject.set(x, "styleInHead", value.asInstanceOf[js.Any])
      
      inline def setStyleInHeadUndefined: Self = StObject.set(x, "styleInHead", js.undefined)
    }
  }
  
  trait GridStackPosition extends StObject {
    
    /** widget dimension height (default?: 1) */
    var h: js.UndefOr[Double] = js.undefined
    
    /** widget dimension width (default?: 1) */
    var w: js.UndefOr[Double] = js.undefined
    
    /** widget position x (default?: 0) */
    var x: js.UndefOr[Double] = js.undefined
    
    /** widget position y (default?: 0) */
    var y: js.UndefOr[Double] = js.undefined
  }
  object GridStackPosition {
    
    inline def apply(): GridStackPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridStackPosition]
    }
    
    extension [Self <: GridStackPosition](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait GridStackWidget
    extends StObject
       with GridStackPosition {
    
    /** if true then x, y parameters will be ignored and widget will be places on the first available position (default?: false) */
    var autoPosition: js.UndefOr[Boolean] = js.undefined
    
    /** html to append inside as content */
    var content: js.UndefOr[String] = js.undefined
    
    /** value for `gs-id` stored on the widget (default?: undefined) */
    var id: js.UndefOr[numberOrString] = js.undefined
    
    /** prevents being moved by others during their (default?: undefined = un-constrained) */
    var locked: js.UndefOr[Boolean] = js.undefined
    
    /** maximum height allowed during resize/creation (default?: undefined = un-constrained) */
    var maxH: js.UndefOr[Double] = js.undefined
    
    /** maximum width allowed during resize/creation (default?: undefined = un-constrained) */
    var maxW: js.UndefOr[Double] = js.undefined
    
    /** minimum height allowed during resize/creation (default?: undefined = un-constrained) */
    var minH: js.UndefOr[Double] = js.undefined
    
    /** minimum width allowed during resize/creation (default?: undefined = un-constrained) */
    var minW: js.UndefOr[Double] = js.undefined
    
    /** prevents moving (default?: undefined = un-constrained) */
    var noMove: js.UndefOr[Boolean] = js.undefined
    
    /** prevent resizing (default?: undefined = un-constrained) */
    var noResize: js.UndefOr[Boolean] = js.undefined
    
    /** widgets can have their own custom resize handles. For example 'e,w' will make that particular widget only resize east and west. See `resizable: {handles: string}` option */
    var resizeHandles: js.UndefOr[String] = js.undefined
    
    /** optional nested grid options and list of children, which then turns into actual instance at runtime */
    var subGrid: js.UndefOr[GridStackOptions | GridStack] = js.undefined
  }
  object GridStackWidget {
    
    inline def apply(): GridStackWidget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridStackWidget]
    }
    
    extension [Self <: GridStackWidget](x: Self) {
      
      inline def setAutoPosition(value: Boolean): Self = StObject.set(x, "autoPosition", value.asInstanceOf[js.Any])
      
      inline def setAutoPositionUndefined: Self = StObject.set(x, "autoPosition", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setId(value: numberOrString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
      
      inline def setMaxH(value: Double): Self = StObject.set(x, "maxH", value.asInstanceOf[js.Any])
      
      inline def setMaxHUndefined: Self = StObject.set(x, "maxH", js.undefined)
      
      inline def setMaxW(value: Double): Self = StObject.set(x, "maxW", value.asInstanceOf[js.Any])
      
      inline def setMaxWUndefined: Self = StObject.set(x, "maxW", js.undefined)
      
      inline def setMinH(value: Double): Self = StObject.set(x, "minH", value.asInstanceOf[js.Any])
      
      inline def setMinHUndefined: Self = StObject.set(x, "minH", js.undefined)
      
      inline def setMinW(value: Double): Self = StObject.set(x, "minW", value.asInstanceOf[js.Any])
      
      inline def setMinWUndefined: Self = StObject.set(x, "minW", js.undefined)
      
      inline def setNoMove(value: Boolean): Self = StObject.set(x, "noMove", value.asInstanceOf[js.Any])
      
      inline def setNoMoveUndefined: Self = StObject.set(x, "noMove", js.undefined)
      
      inline def setNoResize(value: Boolean): Self = StObject.set(x, "noResize", value.asInstanceOf[js.Any])
      
      inline def setNoResizeUndefined: Self = StObject.set(x, "noResize", js.undefined)
      
      inline def setResizeHandles(value: String): Self = StObject.set(x, "resizeHandles", value.asInstanceOf[js.Any])
      
      inline def setResizeHandlesUndefined: Self = StObject.set(x, "resizeHandles", js.undefined)
      
      inline def setSubGrid(value: GridStackOptions | GridStack): Self = StObject.set(x, "subGrid", value.asInstanceOf[js.Any])
      
      inline def setSubGridUndefined: Self = StObject.set(x, "subGrid", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Position {
    
    inline def apply(left: Double, top: Double): Position = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect
    extends StObject
       with Size
       with Position
  object Rect {
    
    inline def apply(height: Double, left: Double, top: Double, width: Double): Rect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
  }
  
  trait Size extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Size {
    
    inline def apply(height: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ColumnOptions extends StObject
  
  type numberOrString = Double | String
}
