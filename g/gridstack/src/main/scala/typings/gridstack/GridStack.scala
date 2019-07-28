package typings.gridstack

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridStack extends js.Object {
  /**
    * Creates new widget and returns it.
    *
    *   Widget will be always placed even if result height is more than actual grid height. You need to use willItFit method before calling addWidget for additional check.
    *
    * @param {string | HTMLElement | JQuery} el widget to add
    * @param {number} x widget position x (optional)
    * @param {number} y widget position y (optional)
    * @param {number} width  widget dimension width (optional)
    * @param {number} height widget dimension height (optional)
    * @param {boolean} autoPosition if true then x, y parameters will be ignored and widget will be places on the first available position (optional)
    * @param {number} minWidth minimum width allowed during resize/creation (optional)
    * @param {number} maxWidth maximum width allowed during resize/creation (optional)
    * @param {number} minHeight minimum height allowed during resize/creation (optional)
    * @param {number} maxHeight maximum height allowed during resize/creation (optional)
    * @param {number | string} id value for data-gs-id (optional)
    */
  def addWidget(
    el: String,
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
  def addWidget(
    el: JQuery,
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
  def addWidget(
    el: HTMLElement,
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
  /**
    * Update current cell height. This method rebuilds an internal CSS style sheet. Note: You can expect performance issues if call this method too often.
    * @param {number} val the cell height
    */
  def cellHeight(`val`: Double): Unit = js.native
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
  /*
    * Disables widgets moving/resizing.
    */
  def disable(): Unit = js.native
  /*
    * Enables widgets moving/resizing.
    */
  def enable(): Unit = js.native
  /**
    * Enables/disables widget moving.
    * This is a shortcut for:
    * grid.movable(this.container.children('.' + this.opts.itemClass), doEnable);
    * @param {boolean} doEnable
    * @param {boolean} includeNewWidgets will force new widgets to be draggable
    */
  def enableMove(doEnable: Boolean, includeNewWidgets: Boolean): Unit = js.native
  /**
    * Enables/disables widget resizing.
    * @param {boolean} doEnable
    * @param {boolean} includeNewWidgets will force new widgets to be resizable
    */
  def enableResize(doEnable: Boolean, includeNewWidgets: Boolean): Unit = js.native
  /**
    * Get the position of the cell under a pixel on screen.
    * @param  {MousePosition}  position the position of the pixel to resolve in absolute coordinates, as an object with top and leftproperties
    * @param  {boolean}  useOffset if true, value will be based on offset vs position (Optional. Default false). Useful when grid is within position: relative element.
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
    * @param {HTMLElement} el widget to modify.
    * @param {boolean} val if true widget will be locked.
    */
  def locked(el: HTMLElement, `val`: Boolean): Unit = js.native
  /**
    * If you add elements to your gridstack container by hand, you have to tell gridstack afterwards to make them widgets.
    *
    *   If you want gridstack to add the elements for you, use addWidget instead. Makes the given element a widget and returns it.
    *
    * @param {string | HTMLElement | JQuery} el widget to add
    */
  def makeWidget(el: String): JQuery = js.native
  def makeWidget(el: JQuery): JQuery = js.native
  def makeWidget(el: HTMLElement): JQuery = js.native
  /**
    * Set the maxHeight for a widget.
    * @param {HTMLElement} el widget to modify.
    * @param {number} val A numeric value of the number of rows
    */
  def maxHeight(el: HTMLElement, `val`: Double): Unit = js.native
  /**
    * Set the maxWidth for a widget.
    * @param {HTMLElement} el widget to modify.
    * @param {number} val A numeric value of the number of columns
    */
  def maxWidth(el: HTMLElement, `val`: Double): Unit = js.native
  /**
    * Set the minHeight for a widget.
    * @param {HTMLElement} el widget to modify.
    * @param {number} val A numeric value of the number of rows
    */
  def minHeight(el: HTMLElement, `val`: Double): Unit = js.native
  /**
    * Set the minWidth for a widget.
    * @param {HTMLElement} el widget to modify.
    * @param {number} val A numeric value of the number of columns
    */
  def minWidth(el: HTMLElement, `val`: Double): Unit = js.native
  /**
    * Enables/Disables moving.
    * @param {HTMLElement} el widget to modify.
    * @param {number} val if true widget will be draggable.
    */
  def movable(el: HTMLElement, `val`: Boolean): Unit = js.native
  /**
    * Changes widget position
    * @param {HTMLElement} el  widget to modify
    * @param {number} x new position x. If value is null or undefined it will be ignored.
    * @param {number} y new position y. If value is null or undefined it will be ignored.
    *
    */
  def move(el: HTMLElement, x: Double, y: Double): Unit = js.native
  /**
    * Removes all widgets from the grid.
    * @param {boolean} detachNode if false DOM node won't be removed from the tree (Optional. Default true).
    */
  def removeAll(): Unit = js.native
  def removeAll(detachNode: Boolean): Unit = js.native
  /**
    * Removes widget from the grid.
    * @param {HTMLElement} el  widget to modify
    * @param {boolean} detachNode if false DOM node won't be removed from the tree (Optional. Default true).
    */
  def removeWidget(el: HTMLElement): Unit = js.native
  def removeWidget(el: HTMLElement, detachNode: Boolean): Unit = js.native
  /**
    * Enables/Disables resizing.
    * @param {HTMLElement} el  widget to modify
    * @param {boolean} val  if true widget will be resizable.
    */
  def resizable(el: HTMLElement, `val`: Boolean): Unit = js.native
  /**
    * Changes widget size
    * @param {HTMLElement} el  widget to modify
    * @param {number} width new dimensions width. If value is null or undefined it will be ignored.
    * @param {number} height  new dimensions height. If value is null or undefined it will be ignored.
    */
  def resize(el: HTMLElement, width: Double, height: Double): Unit = js.native
  /**
    * Toggle the grid animation state. Toggles the grid-stack-animate class.
    * @param {boolean} doAnimate if true the grid will animate.
    */
  def setAnimation(doAnimate: Boolean): Unit = js.native
  /**
    * (Experimental) Modify number of columns in the grid.
    * Will attempt to update existing widgets to conform to new number of columns.
    * Requires gridstack-extra.css or gridstack-extra.min.css.
    * @param {number} gridWidth Integer between 1 and 12.
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
    * @param {HTMLElement} el  widget to modify
    * @param {number} x new position x. If value is null or undefined it will be ignored.
    * @param {number} y new position y. If value is null or undefined it will be ignored.
    * @param {number} width new dimensions width. If value is null or undefined it will be ignored.
    * @param {number} height  new dimensions height. If value is null or undefined it will be ignored.
    */
  def update(el: HTMLElement, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
    * Sets the vertial margin
    * @param {number} value new vertical margin value.
    * @param {boolean} noUpdate if true, styles will not be updated.
    */
  def verticalMargin(value: Double, noUpdate: Boolean): Unit = js.native
  /**
    * Returns true if the height of the grid will be less the vertical constraint. Always returns true if grid doesn't have height constraint.
    * @param {number} x new position x. If value is null or undefined it will be ignored.
    * @param {number} y new position y. If value is null or undefined it will be ignored.
    * @param {number} width new dimensions width. If value is null or undefined it will be ignored.
    * @param {number} height  new dimensions height. If value is null or undefined it will be ignored.
    * @param {boolean} autoPosition  if true then x, y parameters will be ignored and widget will be places on the first available position
    */
  def willItFit(x: Double, y: Double, width: Double, height: Double, autoPosition: Boolean): Boolean = js.native
}

