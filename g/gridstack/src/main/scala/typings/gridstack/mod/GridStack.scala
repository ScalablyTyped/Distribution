package typings.gridstack.mod

import org.scalablytyped.runtime.Instantiable5
import typings.gridstack.anon.TypeofUtils
import typings.gridstack.gridstackEngineMod.onChangeCB
import typings.gridstack.typesMod.ColumnOptions
import typings.gridstack.typesMod.GridItemHTMLElement
import typings.gridstack.typesMod.GridStackNode
import typings.gridstack.typesMod.GridStackOptions
import typings.gridstack.typesMod.GridStackWidget
import typings.gridstack.typesMod.numberOrString
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gridstack", "GridStack")
@js.native
class GridStack protected () extends js.Object {
  /**
    * Construct a grid item from the given element and options
    * @param el
    * @param opts
    */
  def this(el: GridHTMLElement) = this()
  def this(el: GridHTMLElement, opts: GridStackOptions) = this()
  
  /** called to resize children nested grids when we/item resizes */
  var _resizeNestedGrids: js.Any = js.native
  
  /** add or remove the window size event handler */
  var _updateWindowResizeEvent: js.Any = js.native
  
  /**
    * add a new widget and returns it.
    *
    * Widget will be always placed even if result height is more than actual grid height.
    * You need to use willItFit method before calling addWidget for additional check.
    * See also `makeWidget()`.
    *
    * @example
    * let grid = GridStack.init();
    * grid.addWidget({width: 3, content: 'hello'});
    * grid.addWidget('<div class="grid-stack-item"><div class="grid-stack-item-content">hello</div></div>', {width: 3});
    *
    * @param el html element, or string definition, or GridStackWidget (which can have content string as well) to add
    * @param options widget position/size options (optional, and ignore if first param is already option) - see GridStackWidget
    */
  def addWidget(): GridItemHTMLElement = js.native
  def addWidget(els: js.UndefOr[GridStackElement], options: GridStackWidget): GridItemHTMLElement = js.native
  def addWidget(els: GridStackElement): GridItemHTMLElement = js.native
  def addWidget(els: GridStackWidget): GridItemHTMLElement = js.native
  def addWidget(els: GridStackWidget, options: GridStackWidget): GridItemHTMLElement = js.native
  
  /**
    * Initializes batch updates. You will see no changes until `commit()` method is called.
    */
  def batchUpdate(): GridStack = js.native
  
  /**
    * Update current cell height - see `GridStackOptions.cellHeight` for format.
    * This method rebuilds an internal CSS style sheet.
    * Note: You can expect performance issues if call this method too often.
    *
    * @param val the cell height
    * @param update (Optional) if false, styles will not be updated
    *
    * @example
    * grid.cellHeight(grid.cellWidth() * 1.2);
    */
  def cellHeight(`val`: numberOrString): GridStack = js.native
  def cellHeight(`val`: numberOrString, update: Boolean): GridStack = js.native
  
  /**
    * Gets current cell width.
    */
  def cellWidth(): Double = js.native
  
  /**
    * set the number of columns in the grid. Will update existing widgets to conform to new number of columns,
    * as well as cache the original layout so you can revert back to previous positions without loss.
    * Requires `gridstack-extra.css` or `gridstack-extra.min.css` for [2-11],
    * else you will need to generate correct CSS (see https://github.com/gridstack/gridstack.js#change-grid-columns)
    * @param column - Integer > 0 (default 12).
    * @param layout specify the type of re-layout that will happen (position, size, etc...).
    * Note: items will never be outside of the current column boundaries. default (moveScale). Ignored for 1 column
    */
  def column(column: Double): GridStack = js.native
  def column(column: Double, layout: ColumnOptions): GridStack = js.native
  
  /**
    * Finishes batch updates. Updates DOM nodes. You must call it after batchUpdate.
    */
  def commit(): GridStack = js.native
  
  /** re-layout grid items to reclaim any empty space */
  def compact(): GridStack = js.native
  
  /** current drag&drop plugin being used */
  var dd: typings.gridstack.gridstackDdMod.GridStackDD = js.native
  
  /**
    * Destroys a grid instance.
    * @param removeDOM if `false` grid and items elements will not be removed from the DOM (Optional. Default `true`).
    */
  def destroy(): GridStack = js.native
  def destroy(removeDOM: Boolean): GridStack = js.native
  
  /**
    * Disables widgets moving/resizing. This is a shortcut for:
    * @example
    *  grid.enableMove(false);
    *  grid.enableResize(false);
    */
  def disable(): GridStack = js.native
  
  /** the HTML element tied to this grid after it's been initialized */
  var el: GridHTMLElement = js.native
  
  /**
    * Enables widgets moving/resizing. This is a shortcut for:
    * @example
    *  grid.enableMove(true);
    *  grid.enableResize(true);
    */
  def enable(): GridStack = js.native
  
  /**
    * Enables/disables widget moving.
    *
    * @param doEnable
    * @param includeNewWidgets will force new widgets to be draggable as per
    * doEnable`s value by changing the disableDrag grid option (default: true).
    */
  def enableMove(doEnable: Boolean): GridStack = js.native
  def enableMove(doEnable: Boolean, includeNewWidgets: Boolean): GridStack = js.native
  
  /**
    * Enables/disables widget resizing
    * @param doEnable
    * @param includeNewWidgets will force new widgets to be draggable as per
    * doEnable`s value by changing the disableResize grid option (default: true).
    */
  def enableResize(doEnable: Boolean): GridStack = js.native
  def enableResize(doEnable: Boolean, includeNewWidgets: Boolean): GridStack = js.native
  
  /** engine used to implement non DOM grid functionality */
  var engine: typings.gridstack.gridstackEngineMod.GridStackEngine = js.native
  
  /**
    * enable/disable floating widgets (default: `false`) See [example](http://gridstackjs.com/demo/float.html)
    */
  def float(`val`: Boolean): GridStack = js.native
  
  /**
    * Get the position of the cell under a pixel on screen.
    * @param position the position of the pixel to resolve in
    * absolute coordinates, as an object with top and left properties
    * @param useDocRelative if true, value will be based on document position vs parent position (Optional. Default false).
    * Useful when grid is within `position: relative` element
    *
    * Returns an object with properties `x` and `y` i.e. the column and row in the grid.
    */
  def getCellFromPixel(position: MousePosition): CellPosition = js.native
  def getCellFromPixel(position: MousePosition, useDocRelative: Boolean): CellPosition = js.native
  
  /**
    * Gets current cell height.
    */
  def getCellHeight(): Double = js.native
  def getCellHeight(forcePixel: Boolean): Double = js.native
  
  /**
    * get the number of columns in the grid (default 12)
    */
  def getColumn(): Double = js.native
  
  /**
    * get the current float mode
    */
  def getFloat(): Boolean = js.native
  
  /** returns an array of grid HTML elements (no placeholder) - used to iterate through our children */
  def getGridItems(): js.Array[GridItemHTMLElement] = js.native
  
  /** returns current margin number value (undefined if 4 sides don't match) */
  def getMargin(): Double = js.native
  
  /** returns the current number of rows, which will be at least `minRow` if set */
  def getRow(): Double = js.native
  
  /**
    * Checks if specified area is empty.
    * @param x the position x.
    * @param y the position y.
    * @param width the width of to check
    * @param height the height of to check
    */
  def isAreaEmpty(x: Double, y: Double, width: Double, height: Double): Boolean = js.native
  
  /**
    * load the widgets from a list. This will call update() on each (matching by id) or add/remove widgets that are not there.
    *
    * @param layout list of widgets definition to update/create
    * @param addAndRemove boolean (default true) or callback method can be passed to control if and how missing widgets can be added/removed, giving
    * the user control of insertion.
    *
    * @example
    * see http://gridstackjs.com/demo/serialization.html
    **/
  def load(layout: js.Array[GridStackWidget]): GridStack = js.native
  def load(
    layout: js.Array[GridStackWidget],
    addAndRemove: js.Function2[/* w */ GridStackWidget, /* add */ Boolean, Unit]
  ): GridStack = js.native
  def load(layout: js.Array[GridStackWidget], addAndRemove: Boolean): GridStack = js.native
  
  /**
    * Locks/unlocks widget.
    * @param el element or selector to modify.
    * @param val if true widget will be locked.
    */
  def locked(els: GridStackElement, `val`: Boolean): GridStack = js.native
  
  /**
    * If you add elements to your grid by hand, you have to tell gridstack afterwards to make them widgets.
    * If you want gridstack to add the elements for you, use `addWidget()` instead.
    * Makes the given element a widget and returns it.
    * @param els widget or single selector to convert.
    *
    * @example
    * let grid = GridStack.init();
    * grid.el.appendChild('<div id="gsi-1" data-gs-width="3"></div>');
    * grid.makeWidget('#gsi-1');
    */
  def makeWidget(els: GridStackElement): GridItemHTMLElement = js.native
  
  /**
    * Updates the margins which will set all 4 sides at once - see `GridStackOptions.margin` for format options (CSS string format of 1,2,4 values or single number).
    * @param value margin value
    */
  def margin(value: numberOrString): GridStack = js.native
  
  /**
    * Set the maxHeight for a widget.
    * @param els widget or selector to modify.
    * @param val A numeric value of the number of rows
    */
  def maxHeight(els: GridStackElement, `val`: Double): GridStack = js.native
  
  /**
    * Set the maxWidth for a widget.
    * @param els widget or selector to modify.
    * @param val A numeric value of the number of columns
    */
  def maxWidth(els: GridStackElement, `val`: Double): GridStack = js.native
  
  /**
    * Set the minHeight for a widget.
    * @param els widget or selector to modify.
    * @param val A numeric value of the number of rows
    */
  def minHeight(els: GridStackElement, `val`: Double): GridStack = js.native
  
  /**
    * Set the minWidth for a widget.
    * @param els widget or selector to modify.
    * @param val A numeric value of the number of columns
    */
  def minWidth(els: GridStackElement, `val`: Double): GridStack = js.native
  
  /**
    * Enables/Disables moving.
    * @param els widget or selector to modify.
    * @param val if true widget will be draggable.
    */
  def movable(els: GridStackElement, `val`: Boolean): GridStack = js.native
  
  /**
    * Changes widget position
    * @param els  widget or singular selector to modify
    * @param x new position x. If value is null or undefined it will be ignored.
    * @param y new position y. If value is null or undefined it will be ignored.
    */
  def move(els: GridStackElement): GridStack = js.native
  def move(els: GridStackElement, x: js.UndefOr[scala.Nothing], y: Double): GridStack = js.native
  def move(els: GridStackElement, x: Double): GridStack = js.native
  def move(els: GridStackElement, x: Double, y: Double): GridStack = js.native
  
  /**
    * unsubscribe from the 'on' event below
    * @param name of the event (see possible values)
    */
  def off(name: GridStackEvent): GridStack = js.native
  
  /**
    * Event handler that extracts our CustomEvent data out automatically for receiving custom
    * notifications (see doc for supported events)
    * @param name of the event (see possible values) or list of names space separated
    * @param callback function called with event and optional second/third param
    * (see README documentation for each signature).
    *
    * @example
    * grid.on('added', function(e, items) { log('added ', items)} );
    * or
    * grid.on('added removed change', function(e, items) { log(e.type, items)} );
    *
    * Note: in some cases it is the same as calling native handler and parsing the event.
    * grid.el.addEventListener('added', function(event) { log('added ', event.detail)} );
    *
    */
  def on(
    name: GridStackEvent,
    callback: js.Function2[
      /* event */ Event, 
      /* arg2 */ js.UndefOr[GridItemHTMLElement | js.Array[GridStackNode]], 
      Unit
    ]
  ): GridStack = js.native
  
  /**
    * called when we are being resized by the window - check if the one Column Mode needs to be turned on/off
    * and remember the prev columns we used, as well as check for auto cell height (square)
    */
  def onParentResize(): GridStack = js.native
  
  /** grid options - public for classes to access, but use methods to modify! */
  var opts: GridStackOptions = js.native
  
  /**
    * Removes all widgets from the grid.
    * @param removeDOM if `false` DOM elements won't be removed from the tree (Default? `true`).
    */
  def removeAll(): GridStack = js.native
  def removeAll(removeDOM: Boolean): GridStack = js.native
  
  /**
    * Removes widget from the grid.
    * @param el  widget or selector to modify
    * @param removeDOM if `false` DOM element won't be removed from the tree (Default? true).
    * @param triggerEvent if `false` (quiet mode) element will not be added to removed list and no 'removed' callbacks will be called (Default? true).
    */
  def removeWidget(els: GridStackElement): GridStack = js.native
  def removeWidget(els: GridStackElement, removeDOM: js.UndefOr[scala.Nothing], triggerEvent: Boolean): GridStack = js.native
  def removeWidget(els: GridStackElement, removeDOM: Boolean): GridStack = js.native
  def removeWidget(els: GridStackElement, removeDOM: Boolean, triggerEvent: Boolean): GridStack = js.native
  
  /**
    * Enables/Disables resizing.
    * @param els  widget or selector to modify
    * @param val  if true widget will be resizable.
    */
  def resizable(els: GridStackElement, `val`: Boolean): GridStack = js.native
  
  /**
    * Changes widget size
    * @param els  widget or singular selector to modify
    * @param width new dimensions width. If value is null or undefined it will be ignored.
    * @param height  new dimensions height. If value is null or undefined it will be ignored.
    */
  def resize(els: GridStackElement): GridStack = js.native
  def resize(els: GridStackElement, width: js.UndefOr[scala.Nothing], height: Double): GridStack = js.native
  def resize(els: GridStackElement, width: Double): GridStack = js.native
  def resize(els: GridStackElement, width: Double, height: Double): GridStack = js.native
  
  /** saves the current layout returning a list of widgets for serialization */
  def save(): js.Array[GridStackWidget] = js.native
  def save(saveContent: Boolean): js.Array[GridStackWidget] = js.native
  
  /**
    * Toggle the grid animation state.  Toggles the `grid-stack-animate` class.
    * @param doAnimate if true the grid will animate.
    */
  def setAnimation(doAnimate: Boolean): GridStack = js.native
  
  /**
    * Toggle the grid static state, which permanently removes/add Drag&Drop support, unlike disable()/enable() that just turns it off/on.
    * Also toggle the grid-stack-static class.
    * @param val if true the grid become static.
    */
  def setStatic(`val`: Boolean): GridStack = js.native
  
  /**
    * Updates widget position/size.
    * @param els  widget or singular selector to modify
    * @param x new position x. If value is null or undefined it will be ignored.
    * @param y new position y. If value is null or undefined it will be ignored.
    * @param width new dimensions width. If value is null or undefined it will be ignored.
    * @param height  new dimensions height. If value is null or undefined it will be ignored.
    */
  def update(els: GridStackElement): GridStack = js.native
  def update(
    els: GridStackElement,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ): GridStack = js.native
  def update(els: GridStackElement, x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double): GridStack = js.native
  def update(
    els: GridStackElement,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: Double,
    height: Double
  ): GridStack = js.native
  def update(els: GridStackElement, x: js.UndefOr[scala.Nothing], y: Double): GridStack = js.native
  def update(
    els: GridStackElement,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    width: js.UndefOr[scala.Nothing],
    height: Double
  ): GridStack = js.native
  def update(els: GridStackElement, x: js.UndefOr[scala.Nothing], y: Double, width: Double): GridStack = js.native
  def update(els: GridStackElement, x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double): GridStack = js.native
  def update(els: GridStackElement, x: Double): GridStack = js.native
  def update(
    els: GridStackElement,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ): GridStack = js.native
  def update(els: GridStackElement, x: Double, y: js.UndefOr[scala.Nothing], width: Double): GridStack = js.native
  def update(els: GridStackElement, x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double): GridStack = js.native
  def update(els: GridStackElement, x: Double, y: Double): GridStack = js.native
  def update(els: GridStackElement, x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): GridStack = js.native
  def update(els: GridStackElement, x: Double, y: Double, width: Double): GridStack = js.native
  def update(els: GridStackElement, x: Double, y: Double, width: Double, height: Double): GridStack = js.native
  
  /**
    * Returns true if the height of the grid will be less the vertical
    * constraint. Always returns true if grid doesn't have height constraint.
    * @param x new position x. If value is null or undefined it will be ignored.
    * @param y new position y. If value is null or undefined it will be ignored.
    * @param width new dimensions width. If value is null or undefined it will be ignored.
    * @param height new dimensions height. If value is null or undefined it will be ignored.
    * @param autoPosition if true then x, y parameters will be ignored and widget
    * will be places on the first available position
    *
    * @example
    * if (grid.willItFit(newNode.x, newNode.y, newNode.width, newNode.height, newNode.autoPosition)) {
    *   grid.addWidget(newNode);
    * } else {
    *   alert('Not enough free space to place the widget');
    * }
    */
  def willItFit(x: Double, y: Double, width: Double, height: Double, autoPosition: Boolean): Boolean = js.native
}
/* static members */
@JSImport("gridstack", "GridStack")
@js.native
object GridStack extends js.Object {
  
  /** scoping so users can call new GridStack.Engine(12) for example */
  var Engine: Instantiable5[
    /* column */ js.UndefOr[Double], 
    /* onchange */ js.UndefOr[onChangeCB], 
    /* float */ js.UndefOr[Boolean], 
    /* maxRow */ js.UndefOr[Double], 
    /* nodes */ js.UndefOr[js.Array[GridStackNode]], 
    typings.gridstack.gridstackEngineMod.GridStackEngine
  ] = js.native
  
  /** scoping so users can call GridStack.Utils.sort() for example */
  var Utils: TypeofUtils = js.native
  
  /**
    * initializing the HTML element, or selector string, into a grid will return the grid. Calling it again will
    * simply return the existing instance (ignore any passed options). There is also an initAll() version that support
    * multiple grids initialization at once.
    * @param options grid options (optional)
    * @param elOrString element or CSS selector (first one used) to convert to a grid (default to '.grid-stack' class selector)
    *
    * @example
    * let grid = GridStack.init();
    *
    * Note: the HTMLElement (of type GridHTMLElement) will store a `gridstack: GridStack` value that can be retrieve later
    * let grid = document.querySelector('.grid-stack').gridstack;
    */
  def init(): GridStack = js.native
  def init(options: js.UndefOr[scala.Nothing], elOrString: GridStackElement): GridStack = js.native
  def init(options: GridStackOptions): GridStack = js.native
  def init(options: GridStackOptions, elOrString: GridStackElement): GridStack = js.native
  
  /**
    * Will initialize a list of elements (given a selector) and return an array of grids.
    * @param options grid options (optional)
    * @param selector elements selector to convert to grids (default to '.grid-stack' class selector)
    *
    * @example
    * let grids = GridStack.initAll();
    * grids.forEach(...)
    */
  def initAll(): js.Array[GridStack] = js.native
  def initAll(options: js.UndefOr[scala.Nothing], selector: String): js.Array[GridStack] = js.native
  def initAll(options: GridStackOptions): js.Array[GridStack] = js.native
  def initAll(options: GridStackOptions, selector: String): js.Array[GridStack] = js.native
}
