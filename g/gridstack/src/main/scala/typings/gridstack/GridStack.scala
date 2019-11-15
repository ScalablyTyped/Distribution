package typings.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridStack extends js.Object {
  /**
    * Creates new widget and returns it.
    *
    * Widget will be always placed even if result height is more than actual grid height.
    * You need to use willItFit method before calling addWidget for additional check.
    * See also makeWidget.
    *
    * @example
    * $('.grid-stack').gridstack();
    * var grid = $('.grid-stack').data('gridstack');
    * grid.addWidget(el, 0, 0, 3, 2, true);
    *
    * @param {GridStackElement} el widget to add
    * @param {number} x widget position x (optional)
    * @param {number} y widget position y (optional)
    * @param {number} width  widget dimension width (optional)
    * @param {number} height widget dimension height (optional)
    * @param {boolean} autoPosition if true then x, y parameters will be ignored and widget will be places on the first available position (optional)
    * @param {number} minWidth minimum width allowed during resize/creation (optional)
    * @param {number} maxWidth maximum width allowed during resize/creation (optional)
    * @param {number} minHeight minimum height allowed during resize/creation (optional)
    * @param {number} maxHeight maximum height allowed during resize/creation (optional)
    * @param {number | string} id value for `data-gs-id` (optional)
    */
  def addWidget(
    el: GridStackElement,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    autoPosition: js.UndefOr[Boolean],
    minWidth: js.UndefOr[Double],
    maxWidth: js.UndefOr[Double],
    minHeight: js.UndefOr[Double],
    maxHeight: js.UndefOr[Double],
    id: js.UndefOr[Double | String]
  ): JQuery = js.native
  /**
    * Initializes batch updates. You will see no changes until commit method is called.
    */
  def batchUpdate(): Unit = js.native
  /**
    * Gets current cell height.
    */
  def cellHeight(): Double = js.native
  def cellHeight(`val`: String): Unit = js.native
  def cellHeight(`val`: String, noUpdate: Boolean): Unit = js.native
  /**
    * Update current cell height - see `GridstackOptions.cellHeight` for format.
    * This method rebuilds an internal CSS style sheet.
    * Note: You can expect performance issues if call this method too often.
    *
    * @param {number | string} val the cell height
    * @param {boolean} noUpdate (Optional) if true, styles will not be updated
    *
    * @example
    * grid.cellHeight(grid.cellWidth() * 1.2);
    */
  def cellHeight(`val`: Double): Unit = js.native
  def cellHeight(`val`: Double, noUpdate: Boolean): Unit = js.native
  /**
    * Gets current cell width.
    */
  def cellWidth(): Double = js.native
  /**
    * Finishes batch updates. Updates DOM nodes. You must call it after batchUpdate.
    */
  def commit(): Unit = js.native
  /**
    * Destroys a grid instance.
    * @param {boolean} detachGrid if false nodes and grid will not be removed from the DOM (Optional. Default true).
    */
  def destroy(): Unit = js.native
  def destroy(detachGrid: Boolean): Unit = js.native
  /**
    * Disables widgets moving/resizing. This is a shortcut for:
    * @example
    *  grid.movable('.grid-stack-item', false);
    *  grid.resizable('.grid-stack-item', false);
    */
  def disable(): Unit = js.native
  /**
    * Enables widgets moving/resizing. This is a shortcut for:
    * @example
    *  grid.movable('.grid-stack-item', true);
    *  grid.resizable('.grid-stack-item', true);
    */
  def enable(): Unit = js.native
  /**
    * Enables/disables widget moving.
    * This is a shortcut for:
    * @example
    * grid.movable(this.container.children('.' + this.opts.itemClass), doEnable);
    *
    * @param {boolean} doEnable
    * @param {boolean} includeNewWidgets will force new widgets to be draggable as per
    * doEnable`s value by changing the disableDrag grid option.
    */
  def enableMove(doEnable: Boolean, includeNewWidgets: Boolean): Unit = js.native
  /**
    * Enables/disables widget resizing
    * @param {boolean} doEnable
    * @param {boolean} includeNewWidgets will force new widgets to be draggable as per
    * doEnable`s value by changing the disableResize grid option.
    *
    * This is a shortcut for:
    * @example
    *  grid.resizable(this.container.children('.' + this.opts.itemClass), doEnable);
    */
  def enableResize(doEnable: Boolean, includeNewWidgets: Boolean): Unit = js.native
  /**
    * Get the position of the cell under a pixel on screen.
    * @param {MousePosition} position the position of the pixel to resolve in
    * absolute coordinates, as an object with top and left properties
    * @param {boolean} useOffset if true, value will be based on offset vs position (Optional. Default false).
    * Useful when grid is within `position: relative` element
    *
    * Returns an object with properties `x` and `y` i.e. the column and row in the grid.
    */
  def getCellFromPixel(position: MousePosition): CellPosition = js.native
  def getCellFromPixel(position: MousePosition, useOffset: Boolean): CellPosition = js.native
  /**
    * Checks if specified area is empty.
    * @param {number} x the position x.
    * @param {number} y the position y.
    * @param {number} width the width of to check
    * @param {number} height the height of to check
    */
  def isAreaEmpty(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
    * Locks/unlocks widget.
    * @param {GridStackElement} el widget to modify.
    * @param {boolean} val if true widget will be locked.
    */
  def locked(el: GridStackElement, `val`: Boolean): Unit = js.native
  /**
    * If you add elements to your gridstack container by hand, you have to tell gridstack afterwards to make them widgets.
    * If you want gridstack to add the elements for you, use addWidget instead.
    * Makes the given element a widget and returns it.
    * @param {GridStackElement} el widget to convert.
    *
    * @example
    * $('.grid-stack').gridstack();
    * $('.grid-stack').append('<div id="gsi-1" data-gs-x="0" data-gs-y="0" data-gs-width="3" data-gs-height="2"
    *                     data-gs-auto-position="1"></div>')
    * var grid = $('.grid-stack').data('gridstack');
    * grid.makeWidget('gsi-1');
    */
  def makeWidget(el: GridStackElement): JQuery = js.native
  /**
    * Set the maxHeight for a widget.
    * @param {GridStackElement} el widget to modify.
    * @param {number} val A numeric value of the number of rows
    */
  def maxHeight(el: GridStackElement, `val`: Double): Unit = js.native
  /**
    * Set the maxWidth for a widget.
    * @param {GridStackElement} el widget to modify.
    * @param {number} val A numeric value of the number of columns
    */
  def maxWidth(el: GridStackElement, `val`: Double): Unit = js.native
  /**
    * Set the minHeight for a widget.
    * @param {GridStackElement} el widget to modify.
    * @param {number} val A numeric value of the number of rows
    */
  def minHeight(el: GridStackElement, `val`: Double): Unit = js.native
  /**
    * Set the minWidth for a widget.
    * @param {GridStackElement} el widget to modify.
    * @param {number} val A numeric value of the number of columns
    */
  def minWidth(el: GridStackElement, `val`: Double): Unit = js.native
  /**
    * Enables/Disables moving.
    * @param {GridStackElement} el widget to modify.
    * @param {number} val if true widget will be draggable.
    */
  def movable(el: GridStackElement, `val`: Boolean): Unit = js.native
  /**
    * Changes widget position
    * @param {GridStackElement} el  widget to modify
    * @param {number} x new position x. If value is null or undefined it will be ignored.
    * @param {number} y new position y. If value is null or undefined it will be ignored.
    */
  def move(el: GridStackElement, x: Double, y: Double): Unit = js.native
  /**
    * Removes all widgets from the grid.
    * @param {boolean} detachNode if false DOM nodes won't be removed from the tree (Default? true).
    */
  def removeAll(): Unit = js.native
  def removeAll(detachNode: Boolean): Unit = js.native
  /**
    * Removes widget from the grid.
    * @param {GridStackElement} el  widget to modify
    * @param {boolean} detachNode if false DOM node won't be removed from the tree (Default? true).
    */
  def removeWidget(el: GridStackElement): Unit = js.native
  def removeWidget(el: GridStackElement, detachNode: Boolean): Unit = js.native
  /**
    * Enables/Disables resizing.
    * @param {GridStackElement} el  widget to modify
    * @param {boolean} val  if true widget will be resizable.
    */
  def resizable(el: GridStackElement, `val`: Boolean): Unit = js.native
  /**
    * Changes widget size
    * @param {GridStackElement} el  widget to modify
    * @param {number} width new dimensions width. If value is null or undefined it will be ignored.
    * @param {number} height  new dimensions height. If value is null or undefined it will be ignored.
    */
  def resize(el: GridStackElement, width: Double, height: Double): Unit = js.native
  /**
    * Toggle the grid animation state.  Toggles the `grid-stack-animate` class.
    * @param {boolean} doAnimate if true the grid will animate.
    */
  def setAnimation(doAnimate: Boolean): Unit = js.native
  /**
    * (Experimental) Modify number of columns in the grid. Will attempt to update existing widgets
    * to conform to new number of columns. Requires `gridstack-extra.css` or `gridstack-extra.min.css`.
    * @param {number} gridWidth - Integer between 1 and 12.
    * @param {boolean} doNotPropagate if true existing widgets will not be updated.
    */
  def setGridWidth(gridWidth: Double, doNotPropagate: Boolean): Unit = js.native
  /**
    * Toggle the grid static state. Also toggle the grid-stack-static class.
    * @param {boolean} staticValue if true the grid become static.
    */
  def setStatic(staticValue: Boolean): Unit = js.native
  /**
    * Updates widget position/size.
    * @param {GridStackElement} el widget to modify
    * @param {number} x new position x. If value is null or undefined it will be ignored.
    * @param {number} y new position y. If value is null or undefined it will be ignored.
    * @param {number} width new dimensions width. If value is null or undefined it will be ignored.
    * @param {number} height  new dimensions height. If value is null or undefined it will be ignored.
    */
  def update(el: GridStackElement, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
    * returns current vertical margin value
    */
  def verticalMargin(): Double = js.native
  def verticalMargin(value: String): Unit = js.native
  def verticalMargin(value: String, noUpdate: Boolean): Unit = js.native
  /**
    * Updates the vertical margin - see `GridstackOptions.verticalMargin` for format options.
    *
    * @param {number | string} value new vertical margin value
    * @param {boolean} noUpdate (optional) if true, styles will not be updated
    */
  def verticalMargin(value: Double): Unit = js.native
  def verticalMargin(value: Double, noUpdate: Boolean): Unit = js.native
  /**
    * Returns true if the height of the grid will be less the vertical
    * constraint. Always returns true if grid doesn't have height constraint.
    * @param {number} x new position x. If value is null or undefined it will be ignored.
    * @param {number} y new position y. If value is null or undefined it will be ignored.
    * @param {number} width new dimensions width. If value is null or undefined it will be ignored.
    * @param {number} height new dimensions height. If value is null or undefined it will be ignored.
    * @param {boolean} autoPosition if true then x, y parameters will be ignored and widget
    * will be places on the first available position
    *
    * @example
    * if (grid.willItFit(newNode.x, newNode.y, newNode.width, newNode.height, true)) {
    *   grid.addWidget(newNode.el, newNode.x, newNode.y, newNode.width, newNode.height, true);
    * } else {
    *   alert('Not enough free space to place the widget');
    * }
    */
  def willItFit(x: Double, y: Double, width: Double, height: Double, autoPosition: Boolean): Boolean = js.native
}

