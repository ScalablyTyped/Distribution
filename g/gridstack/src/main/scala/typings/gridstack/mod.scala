package typings.gridstack

import org.scalablytyped.runtime.Instantiable5
import typings.gridstack.anon.TypeofGridStackDD
import typings.gridstack.anon.TypeofUtils
import typings.gridstack.gridstackEngineMod.onChangeCB
import typings.gridstack.gridstackNumbers.`-1`
import typings.gridstack.gridstackNumbers.`1`
import typings.gridstack.typesMod.ColumnOptions
import typings.gridstack.typesMod.GridItemHTMLElement
import typings.gridstack.typesMod.GridStackNode
import typings.gridstack.typesMod.GridStackOptions
import typings.gridstack.typesMod.GridStackWidget
import typings.gridstack.typesMod.numberOrString
import typings.gridstack.utilsMod.HeightData
import typings.std.AddEventListenerOptions
import typings.std.CSSStyleSheet
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gridstack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gridstack", "GridStack")
  @js.native
  class GridStack protected () extends StObject {
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
    def addWidget(els: Unit, options: GridStackWidget): GridItemHTMLElement = js.native
    def addWidget(els: GridStackElement): GridItemHTMLElement = js.native
    def addWidget(els: GridStackElement, options: GridStackWidget): GridItemHTMLElement = js.native
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
    def move(els: GridStackElement, x: Double): GridStack = js.native
    def move(els: GridStackElement, x: Double, y: Double): GridStack = js.native
    def move(els: GridStackElement, x: Unit, y: Double): GridStack = js.native
    
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
    def removeWidget(els: GridStackElement, removeDOM: Boolean): GridStack = js.native
    def removeWidget(els: GridStackElement, removeDOM: Boolean, triggerEvent: Boolean): GridStack = js.native
    def removeWidget(els: GridStackElement, removeDOM: Unit, triggerEvent: Boolean): GridStack = js.native
    
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
    def resize(els: GridStackElement, width: Double): GridStack = js.native
    def resize(els: GridStackElement, width: Double, height: Double): GridStack = js.native
    def resize(els: GridStackElement, width: Unit, height: Double): GridStack = js.native
    
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
    def update(els: GridStackElement, x: Double): GridStack = js.native
    def update(els: GridStackElement, x: Double, y: Double): GridStack = js.native
    def update(els: GridStackElement, x: Double, y: Double, width: Double): GridStack = js.native
    def update(els: GridStackElement, x: Double, y: Double, width: Double, height: Double): GridStack = js.native
    def update(els: GridStackElement, x: Double, y: Double, width: Unit, height: Double): GridStack = js.native
    def update(els: GridStackElement, x: Double, y: Unit, width: Double): GridStack = js.native
    def update(els: GridStackElement, x: Double, y: Unit, width: Double, height: Double): GridStack = js.native
    def update(els: GridStackElement, x: Double, y: Unit, width: Unit, height: Double): GridStack = js.native
    def update(els: GridStackElement, x: Unit, y: Double): GridStack = js.native
    def update(els: GridStackElement, x: Unit, y: Double, width: Double): GridStack = js.native
    def update(els: GridStackElement, x: Unit, y: Double, width: Double, height: Double): GridStack = js.native
    def update(els: GridStackElement, x: Unit, y: Double, width: Unit, height: Double): GridStack = js.native
    def update(els: GridStackElement, x: Unit, y: Unit, width: Double): GridStack = js.native
    def update(els: GridStackElement, x: Unit, y: Unit, width: Double, height: Double): GridStack = js.native
    def update(els: GridStackElement, x: Unit, y: Unit, width: Unit, height: Double): GridStack = js.native
    
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
  object GridStack {
    
    @JSImport("gridstack", "GridStack")
    @js.native
    val ^ : js.Any = js.native
    
    /** scoping so users can call new GridStack.Engine(12) for example */
    @JSImport("gridstack", "GridStack.Engine")
    @js.native
    def Engine: Instantiable5[
        /* column */ js.UndefOr[Double], 
        /* onchange */ js.UndefOr[onChangeCB], 
        /* float */ js.UndefOr[Boolean], 
        /* maxRow */ js.UndefOr[Double], 
        /* nodes */ js.UndefOr[js.Array[GridStackNode]], 
        typings.gridstack.gridstackEngineMod.GridStackEngine
      ] = js.native
    @scala.inline
    def Engine_=(
      x: Instantiable5[
          /* column */ js.UndefOr[Double], 
          /* onchange */ js.UndefOr[onChangeCB], 
          /* float */ js.UndefOr[Boolean], 
          /* maxRow */ js.UndefOr[Double], 
          /* nodes */ js.UndefOr[js.Array[GridStackNode]], 
          typings.gridstack.gridstackEngineMod.GridStackEngine
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Engine")(x.asInstanceOf[js.Any])
    
    /** scoping so users can call GridStack.Utils.sort() for example */
    @JSImport("gridstack", "GridStack.Utils")
    @js.native
    def Utils: TypeofUtils = js.native
    @scala.inline
    def Utils_=(x: TypeofUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Utils")(x.asInstanceOf[js.Any])
    
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
    @scala.inline
    def init(): GridStack = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[GridStack]
    @scala.inline
    def init(options: Unit, elOrString: GridStackElement): GridStack = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any], elOrString.asInstanceOf[js.Any])).asInstanceOf[GridStack]
    @scala.inline
    def init(options: GridStackOptions): GridStack = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[GridStack]
    @scala.inline
    def init(options: GridStackOptions, elOrString: GridStackElement): GridStack = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any], elOrString.asInstanceOf[js.Any])).asInstanceOf[GridStack]
    
    /**
      * Will initialize a list of elements (given a selector) and return an array of grids.
      * @param options grid options (optional)
      * @param selector elements selector to convert to grids (default to '.grid-stack' class selector)
      *
      * @example
      * let grids = GridStack.initAll();
      * grids.forEach(...)
      */
    @scala.inline
    def initAll(): js.Array[GridStack] = ^.asInstanceOf[js.Dynamic].applyDynamic("initAll")().asInstanceOf[js.Array[GridStack]]
    @scala.inline
    def initAll(options: Unit, selector: String): js.Array[GridStack] = (^.asInstanceOf[js.Dynamic].applyDynamic("initAll")(options.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStack]]
    @scala.inline
    def initAll(options: GridStackOptions): js.Array[GridStack] = ^.asInstanceOf[js.Dynamic].applyDynamic("initAll")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[GridStack]]
    @scala.inline
    def initAll(options: GridStackOptions, selector: String): js.Array[GridStack] = (^.asInstanceOf[js.Dynamic].applyDynamic("initAll")(options.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStack]]
  }
  
  @JSImport("gridstack", "GridStackDD")
  @js.native
  class GridStackDD protected ()
    extends typings.gridstack.gridstackDdMod.GridStackDD {
    def this(grid: GridStack) = this()
  }
  /* static members */
  object GridStackDD {
    
    @JSImport("gridstack", "GridStackDD")
    @js.native
    val ^ : js.Any = js.native
    
    /** get the current registered plugin to use */
    @scala.inline
    def get(): TypeofGridStackDD = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[TypeofGridStackDD]
    
    /** call this method to register your plugin instead of the default no-op one */
    @scala.inline
    def registerPlugin(pluginClass: TypeofGridStackDD): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(pluginClass.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("gridstack", "GridStackDD.registeredPlugins")
    @js.native
    def registeredPlugins: TypeofGridStackDD = js.native
    @scala.inline
    def registeredPlugins_=(x: TypeofGridStackDD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registeredPlugins")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("gridstack", "GridStackDDJQueryUI")
  @js.native
  class GridStackDDJQueryUI protected ()
    extends typings.gridstack.gridstackDdJqueryuiMod.GridStackDDJQueryUI {
    def this(grid: GridStack) = this()
  }
  
  @JSImport("gridstack", "GridStackEngine")
  @js.native
  class GridStackEngine ()
    extends typings.gridstack.gridstackEngineMod.GridStackEngine {
    def this(column: Double) = this()
    def this(column: Double, onchange: onChangeCB) = this()
    def this(column: Unit, onchange: onChangeCB) = this()
    def this(column: Double, onchange: Unit, float: Boolean) = this()
    def this(column: Double, onchange: onChangeCB, float: Boolean) = this()
    def this(column: Unit, onchange: Unit, float: Boolean) = this()
    def this(column: Unit, onchange: onChangeCB, float: Boolean) = this()
    def this(column: Double, onchange: Unit, float: Boolean, maxRow: Double) = this()
    def this(column: Double, onchange: Unit, float: Unit, maxRow: Double) = this()
    def this(column: Double, onchange: onChangeCB, float: Boolean, maxRow: Double) = this()
    def this(column: Double, onchange: onChangeCB, float: Unit, maxRow: Double) = this()
    def this(column: Unit, onchange: Unit, float: Boolean, maxRow: Double) = this()
    def this(column: Unit, onchange: Unit, float: Unit, maxRow: Double) = this()
    def this(column: Unit, onchange: onChangeCB, float: Boolean, maxRow: Double) = this()
    def this(column: Unit, onchange: onChangeCB, float: Unit, maxRow: Double) = this()
    def this(column: Double, onchange: Unit, float: Boolean, maxRow: Double, nodes: js.Array[GridStackNode]) = this()
    def this(column: Double, onchange: Unit, float: Boolean, maxRow: Unit, nodes: js.Array[GridStackNode]) = this()
    def this(column: Double, onchange: Unit, float: Unit, maxRow: Double, nodes: js.Array[GridStackNode]) = this()
    def this(column: Double, onchange: Unit, float: Unit, maxRow: Unit, nodes: js.Array[GridStackNode]) = this()
    def this(
      column: Double,
      onchange: onChangeCB,
      float: Boolean,
      maxRow: Double,
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(column: Double, onchange: onChangeCB, float: Boolean, maxRow: Unit, nodes: js.Array[GridStackNode]) = this()
    def this(column: Double, onchange: onChangeCB, float: Unit, maxRow: Double, nodes: js.Array[GridStackNode]) = this()
    def this(column: Double, onchange: onChangeCB, float: Unit, maxRow: Unit, nodes: js.Array[GridStackNode]) = this()
    def this(column: Unit, onchange: Unit, float: Boolean, maxRow: Double, nodes: js.Array[GridStackNode]) = this()
    def this(column: Unit, onchange: Unit, float: Boolean, maxRow: Unit, nodes: js.Array[GridStackNode]) = this()
    def this(column: Unit, onchange: Unit, float: Unit, maxRow: Double, nodes: js.Array[GridStackNode]) = this()
    def this(column: Unit, onchange: Unit, float: Unit, maxRow: Unit, nodes: js.Array[GridStackNode]) = this()
    def this(column: Unit, onchange: onChangeCB, float: Boolean, maxRow: Double, nodes: js.Array[GridStackNode]) = this()
    def this(column: Unit, onchange: onChangeCB, float: Boolean, maxRow: Unit, nodes: js.Array[GridStackNode]) = this()
    def this(column: Unit, onchange: onChangeCB, float: Unit, maxRow: Double, nodes: js.Array[GridStackNode]) = this()
    def this(column: Unit, onchange: onChangeCB, float: Unit, maxRow: Unit, nodes: js.Array[GridStackNode]) = this()
  }
  
  @JSImport("gridstack", "Utils")
  @js.native
  class Utils ()
    extends typings.gridstack.utilsMod.Utils
  /* static members */
  object Utils {
    
    @JSImport("gridstack", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    /** inserts a CSS rule */
    @scala.inline
    def addCSSRule(sheet: CSSStyleSheet, selector: String, rules: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCSSRule")(sheet.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** makes a shallow copy of the passed json struct */
    @scala.inline
    def clone(target: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(target.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /** return the closest parent matching the given class */
    @scala.inline
    def closestByClass(el: HTMLElement, name: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("closestByClass")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /**
      * creates a style sheet with style id under given parent
      * @param id will set the 'data-gs-style-id' attribute to that id
      * @param parent to insert the stylesheet as first child,
      * if none supplied it will be appended to the document head instead.
      */
    @scala.inline
    def createStylesheet(id: String): CSSStyleSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("createStylesheet")(id.asInstanceOf[js.Any]).asInstanceOf[CSSStyleSheet]
    @scala.inline
    def createStylesheet(id: String, parent: HTMLElement): CSSStyleSheet = (^.asInstanceOf[js.Dynamic].applyDynamic("createStylesheet")(id.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[CSSStyleSheet]
    
    /** copies unset fields in target to use the given default sources values */
    @scala.inline
    def defaults(target: js.Any, sources: js.Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    /** returns true if a and b overlap */
    @scala.inline
    def isIntercepted(a: GridStackWidget, b: GridStackWidget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntercepted")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def parseHeight(`val`: numberOrString): HeightData = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHeight")(`val`.asInstanceOf[js.Any]).asInstanceOf[HeightData]
    
    @scala.inline
    def removePositioningStyles(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removePositioningStyles")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** removed the given stylesheet id */
    @scala.inline
    def removeStylesheet(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStylesheet")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Sorts array of nodes
      * @param nodes array to sort
      * @param dir 1 for asc, -1 for desc (optional)
      * @param width width of the grid. If undefined the width will be calculated automatically (optional).
      **/
    @scala.inline
    def sort(nodes: js.Array[GridStackNode]): js.Array[GridStackNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[GridStackNode]]
    @scala.inline
    def sort(nodes: js.Array[GridStackNode], dir: Unit, column: Double): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    
    @scala.inline
    def sort_1(nodes: js.Array[GridStackNode], dir: `-1`): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    @scala.inline
    def sort_1(nodes: js.Array[GridStackNode], dir: `-1`, column: Double): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    @scala.inline
    def sort_1(nodes: js.Array[GridStackNode], dir: `1`): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    @scala.inline
    def sort_1(nodes: js.Array[GridStackNode], dir: `1`, column: Double): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    
    @scala.inline
    def toBool(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBool")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def toNumber(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")().asInstanceOf[Double | Null]
    @scala.inline
    def toNumber(value: String): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  }
  
  @scala.inline
  def obsolete(self: js.Any, f: js.Any, oldName: String, newName: String, rev: String): js.Function1[/* repeated */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("obsolete")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Any]]
  
  @scala.inline
  def obsoleteAttr(el: HTMLElement, oldName: String, newName: String, rev: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("obsoleteAttr")(el.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def obsoleteOpts(opts: GridStackOptions, oldName: String, newName: String, rev: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("obsoleteOpts")(opts.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def obsoleteOptsDel(opts: GridStackOptions, oldName: String, rev: String, info: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("obsoleteOptsDel")(opts.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CellPosition extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object CellPosition {
    
    @scala.inline
    def apply(x: Double, y: Double): CellPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellPosition]
    }
    
    @scala.inline
    implicit class CellPositionMutableBuilder[Self <: CellPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GridHTMLElement
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var gridstack: js.UndefOr[GridStack] = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  type GridStackElement = String | HTMLElement | GridItemHTMLElement
  
  /* Rewritten from type alias, can be one of: 
    - typings.gridstack.gridstackStrings.added
    - typings.gridstack.gridstackStrings.change
    - typings.gridstack.gridstackStrings.disable
    - typings.gridstack.gridstackStrings.dragstart
    - typings.gridstack.gridstackStrings.dragstop
    - typings.gridstack.gridstackStrings.dropped
    - typings.gridstack.gridstackStrings.enable
    - typings.gridstack.gridstackStrings.removed
    - typings.gridstack.gridstackStrings.resizestart
    - typings.gridstack.gridstackStrings.resizestop
  */
  trait GridStackEvent extends StObject
  object GridStackEvent {
    
    @scala.inline
    def added: typings.gridstack.gridstackStrings.added = "added".asInstanceOf[typings.gridstack.gridstackStrings.added]
    
    @scala.inline
    def change: typings.gridstack.gridstackStrings.change = "change".asInstanceOf[typings.gridstack.gridstackStrings.change]
    
    @scala.inline
    def disable: typings.gridstack.gridstackStrings.disable = "disable".asInstanceOf[typings.gridstack.gridstackStrings.disable]
    
    @scala.inline
    def dragstart: typings.gridstack.gridstackStrings.dragstart = "dragstart".asInstanceOf[typings.gridstack.gridstackStrings.dragstart]
    
    @scala.inline
    def dragstop: typings.gridstack.gridstackStrings.dragstop = "dragstop".asInstanceOf[typings.gridstack.gridstackStrings.dragstop]
    
    @scala.inline
    def dropped: typings.gridstack.gridstackStrings.dropped = "dropped".asInstanceOf[typings.gridstack.gridstackStrings.dropped]
    
    @scala.inline
    def enable: typings.gridstack.gridstackStrings.enable = "enable".asInstanceOf[typings.gridstack.gridstackStrings.enable]
    
    @scala.inline
    def removed: typings.gridstack.gridstackStrings.removed = "removed".asInstanceOf[typings.gridstack.gridstackStrings.removed]
    
    @scala.inline
    def resizestart: typings.gridstack.gridstackStrings.resizestart = "resizestart".asInstanceOf[typings.gridstack.gridstackStrings.resizestart]
    
    @scala.inline
    def resizestop: typings.gridstack.gridstackStrings.resizestop = "resizestop".asInstanceOf[typings.gridstack.gridstackStrings.resizestop]
  }
  
  trait MousePosition extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object MousePosition {
    
    @scala.inline
    def apply(left: Double, top: Double): MousePosition = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[MousePosition]
    }
    
    @scala.inline
    implicit class MousePositionMutableBuilder[Self <: MousePosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
