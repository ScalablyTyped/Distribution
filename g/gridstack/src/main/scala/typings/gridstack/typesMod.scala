package typings.gridstack

import typings.gridstack.anon.TypeofGridStackDD
import typings.gridstack.gridstackBooleans.`false`
import typings.gridstack.gridstackStrings.auto
import typings.gridstack.mod.GridStack
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait DDDragInOpt extends DDDragOpt {
    
    /** helper function when dropping (ex: 'clone' or your own method) */
    var helper: js.UndefOr[String | (js.Function1[/* event */ Event, HTMLElement])] = js.native
    
    /** used when dragging item from the outside, and canceling (ex: 'invalid' or your own method)*/
    var revert: js.UndefOr[String | (js.Function1[/* event */ Event, HTMLElement])] = js.native
  }
  object DDDragInOpt {
    
    @scala.inline
    def apply(): DDDragInOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDDragInOpt]
    }
    
    @scala.inline
    implicit class DDDragInOptMutableBuilder[Self <: DDDragInOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHelper(value: String | (js.Function1[/* event */ Event, HTMLElement])): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperFunction1(value: /* event */ Event => HTMLElement): Self = StObject.set(x, "helper", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
      
      @scala.inline
      def setRevert(value: String | (js.Function1[/* event */ Event, HTMLElement])): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevertFunction1(value: /* event */ Event => HTMLElement): Self = StObject.set(x, "revert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
    }
  }
  
  @js.native
  trait DDDragOpt extends StObject {
    
    /** default to 'body' */
    var appendTo: js.UndefOr[String] = js.native
    
    /** parent constraining where item can be dragged out from (default: null = no constrain) */
    var containment: js.UndefOr[String] = js.native
    
    /** class selector of items that can be dragged. default to '.grid-stack-item-content' */
    var handle: js.UndefOr[String] = js.native
    
    /** default to `true` */
    var scroll: js.UndefOr[Boolean] = js.native
  }
  object DDDragOpt {
    
    @scala.inline
    def apply(): DDDragOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDDragOpt]
    }
    
    @scala.inline
    implicit class DDDragOptMutableBuilder[Self <: DDDragOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(value: String): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setContainment(value: String): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
  
  @js.native
  trait DDRemoveOpt extends StObject {
    
    /** class that can be removed (default?: '.' + opts.itemClass) */
    var accept: js.UndefOr[String] = js.native
  }
  object DDRemoveOpt {
    
    @scala.inline
    def apply(): DDRemoveOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDRemoveOpt]
    }
    
    @scala.inline
    implicit class DDRemoveOptMutableBuilder[Self <: DDRemoveOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    }
  }
  
  @js.native
  trait DDResizeOpt extends StObject {
    
    /** do resize handle hide by default until mouse over ? - default: true */
    var autoHide: js.UndefOr[Boolean] = js.native
    
    /**
      * sides where you can resize from (ex: 'e, se, s, sw, w') - default 'se' (south-east)
      * Note: it is not recommended to resize from the top sides as weird side effect may occur.
      */
    var handles: js.UndefOr[String] = js.native
  }
  object DDResizeOpt {
    
    @scala.inline
    def apply(): DDResizeOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDResizeOpt]
    }
    
    @scala.inline
    implicit class DDResizeOptMutableBuilder[Self <: DDResizeOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      @scala.inline
      def setHandles(value: String): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
    }
  }
  
  @js.native
  trait GridItemHTMLElement extends HTMLElement {
    
    /** pointer to grid node instance */
    var gridstackNode: js.UndefOr[GridStackNode] = js.native
  }
  
  @js.native
  trait GridStackNode extends GridStackWidget {
    
    /** pointer back to HTML element */
    var el: js.UndefOr[GridItemHTMLElement] = js.native
    
    /** pointer back to Grid instance */
    var grid: js.UndefOr[GridStack] = js.native
  }
  object GridStackNode {
    
    @scala.inline
    def apply(): GridStackNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridStackNode]
    }
    
    @scala.inline
    implicit class GridStackNodeMutableBuilder[Self <: GridStackNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEl(value: GridItemHTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      @scala.inline
      def setGrid(value: GridStack): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    }
  }
  
  @js.native
  trait GridStackOptions extends StObject {
    
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
    implicit class GridStackOptionsMutableBuilder[Self <: GridStackOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptWidgets(value: Boolean | String | (js.Function1[/* element */ Element, Boolean])): Self = StObject.set(x, "acceptWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptWidgetsFunction1(value: /* element */ Element => Boolean): Self = StObject.set(x, "acceptWidgets", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAcceptWidgetsUndefined: Self = StObject.set(x, "acceptWidgets", js.undefined)
      
      @scala.inline
      def setAlwaysShowResizeHandle(value: Boolean): Self = StObject.set(x, "alwaysShowResizeHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowResizeHandleUndefined: Self = StObject.set(x, "alwaysShowResizeHandle", js.undefined)
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      @scala.inline
      def setCellHeight(value: numberOrString): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
      
      @scala.inline
      def setCellHeightUnit(value: String): Self = StObject.set(x, "cellHeightUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellHeightUnitUndefined: Self = StObject.set(x, "cellHeightUnit", js.undefined)
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setDdPlugin(value: `false` | TypeofGridStackDD): Self = StObject.set(x, "ddPlugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDdPluginUndefined: Self = StObject.set(x, "ddPlugin", js.undefined)
      
      @scala.inline
      def setDisableDrag(value: Boolean): Self = StObject.set(x, "disableDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDragUndefined: Self = StObject.set(x, "disableDrag", js.undefined)
      
      @scala.inline
      def setDisableOneColumnMode(value: Boolean): Self = StObject.set(x, "disableOneColumnMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableOneColumnModeUndefined: Self = StObject.set(x, "disableOneColumnMode", js.undefined)
      
      @scala.inline
      def setDisableResize(value: Boolean): Self = StObject.set(x, "disableResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableResizeUndefined: Self = StObject.set(x, "disableResize", js.undefined)
      
      @scala.inline
      def setDragIn(value: String): Self = StObject.set(x, "dragIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragInOptions(value: DDDragInOpt): Self = StObject.set(x, "dragInOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragInOptionsUndefined: Self = StObject.set(x, "dragInOptions", js.undefined)
      
      @scala.inline
      def setDragInUndefined: Self = StObject.set(x, "dragIn", js.undefined)
      
      @scala.inline
      def setDragOut(value: Boolean): Self = StObject.set(x, "dragOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOutUndefined: Self = StObject.set(x, "dragOut", js.undefined)
      
      @scala.inline
      def setDraggable(value: DDDragOpt): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleClass(value: String): Self = StObject.set(x, "handleClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleClassUndefined: Self = StObject.set(x, "handleClass", js.undefined)
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setItemClass(value: String): Self = StObject.set(x, "itemClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemClassUndefined: Self = StObject.set(x, "itemClass", js.undefined)
      
      @scala.inline
      def setMargin(value: numberOrString): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottom(value: numberOrString): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginLeft(value: numberOrString): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginRight(value: numberOrString): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginTop(value: numberOrString): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarginUnit(value: String): Self = StObject.set(x, "marginUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUnitUndefined: Self = StObject.set(x, "marginUnit", js.undefined)
      
      @scala.inline
      def setMaxRow(value: Double): Self = StObject.set(x, "maxRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRowUndefined: Self = StObject.set(x, "maxRow", js.undefined)
      
      @scala.inline
      def setMinRow(value: Double): Self = StObject.set(x, "minRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinRowUndefined: Self = StObject.set(x, "minRow", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOneColumnModeDomSort(value: Boolean): Self = StObject.set(x, "oneColumnModeDomSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneColumnModeDomSortUndefined: Self = StObject.set(x, "oneColumnModeDomSort", js.undefined)
      
      @scala.inline
      def setPlaceholderClass(value: String): Self = StObject.set(x, "placeholderClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderClassUndefined: Self = StObject.set(x, "placeholderClass", js.undefined)
      
      @scala.inline
      def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
      
      @scala.inline
      def setRemovable(value: Boolean | String): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovableOptions(value: DDRemoveOpt): Self = StObject.set(x, "removableOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovableOptionsUndefined: Self = StObject.set(x, "removableOptions", js.undefined)
      
      @scala.inline
      def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
      
      @scala.inline
      def setRemoveTimeout(value: Double): Self = StObject.set(x, "removeTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveTimeoutUndefined: Self = StObject.set(x, "removeTimeout", js.undefined)
      
      @scala.inline
      def setResizable(value: DDResizeOpt): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean | auto): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setStaticGrid(value: Boolean): Self = StObject.set(x, "staticGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticGridUndefined: Self = StObject.set(x, "staticGrid", js.undefined)
      
      @scala.inline
      def setStyleInHead(value: Boolean): Self = StObject.set(x, "styleInHead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleInHeadUndefined: Self = StObject.set(x, "styleInHead", js.undefined)
    }
  }
  
  @js.native
  trait GridStackWidget extends StObject {
    
    /** if true then x, y parameters will be ignored and widget will be places on the first available position (default?: false) */
    var autoPosition: js.UndefOr[Boolean] = js.native
    
    /** html to append inside as content */
    var content: js.UndefOr[String] = js.native
    
    /** widget dimension height (default?: 1) */
    var height: js.UndefOr[Double] = js.native
    
    /** value for `data-gs-id` stored on the widget (default?: undefined) */
    var id: js.UndefOr[numberOrString] = js.native
    
    /** prevents moving and resizing (default?: undefined = un-constrained) */
    var locked: js.UndefOr[Boolean] = js.native
    
    /** maximum height allowed during resize/creation (default?: undefined = un-constrained) */
    var maxHeight: js.UndefOr[Double] = js.native
    
    /** maximum width allowed during resize/creation (default?: undefined = un-constrained) */
    var maxWidth: js.UndefOr[Double] = js.native
    
    /** minimum height allowed during resize/creation (default?: undefined = un-constrained) */
    var minHeight: js.UndefOr[Double] = js.native
    
    /** minimum width allowed during resize/creation (default?: undefined = un-constrained) */
    var minWidth: js.UndefOr[Double] = js.native
    
    /** prevents moving (default?: undefined = un-constrained) */
    var noMove: js.UndefOr[Boolean] = js.native
    
    /** prevent resizing (default?: undefined = un-constrained) */
    var noResize: js.UndefOr[Boolean] = js.native
    
    /** widgets can have their own resize handles. For example 'e,w' will make the particular widget only resize east and west. */
    var resizeHandles: js.UndefOr[String] = js.native
    
    /** widget dimension width (default?: 1) */
    var width: js.UndefOr[Double] = js.native
    
    /** widget position x (default?: 0) */
    var x: js.UndefOr[Double] = js.native
    
    /** widget position y (default?: 0) */
    var y: js.UndefOr[Double] = js.native
  }
  object GridStackWidget {
    
    @scala.inline
    def apply(): GridStackWidget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridStackWidget]
    }
    
    @scala.inline
    implicit class GridStackWidgetMutableBuilder[Self <: GridStackWidget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoPosition(value: Boolean): Self = StObject.set(x, "autoPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPositionUndefined: Self = StObject.set(x, "autoPosition", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: numberOrString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setNoMove(value: Boolean): Self = StObject.set(x, "noMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoMoveUndefined: Self = StObject.set(x, "noMove", js.undefined)
      
      @scala.inline
      def setNoResize(value: Boolean): Self = StObject.set(x, "noResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResizeUndefined: Self = StObject.set(x, "noResize", js.undefined)
      
      @scala.inline
      def setResizeHandles(value: String): Self = StObject.set(x, "resizeHandles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHandlesUndefined: Self = StObject.set(x, "resizeHandles", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait _ColumnOptions extends StObject
  
  type numberOrString = Double | String
}
