package typings
package gridstackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridStack extends js.Object {
  def addWidget(
    el: JQuery,
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    width: js.UndefOr[scala.Double],
    height: js.UndefOr[scala.Double],
    autoPosition: js.UndefOr[scala.Boolean],
    minWidth: js.UndefOr[scala.Double],
    maxWidth: js.UndefOr[scala.Double],
    minHeight: js.UndefOr[scala.Double],
    maxHeight: js.UndefOr[scala.Double],
    id: js.UndefOr[scala.Double]
  ): JQuery = js.native
  /**
    * Creates new widget and returns it.
    *
    *   Widget will be always placed even if result height is more than actual grid height. You need to use willItFit method before calling addWidget for additional check.
    *
    * @param {string | HTMLElement | JQuery} el widget to add
    * @param {number} x widget position x
    * @param {number} y widget position y
    * @param {number} width  widget dimension width
    * @param {number} height widget dimension height
    * @param {boolean} autoPosition if true then x, y parameters will be ignored and widget will be places on the first available position
    */
  def addWidget(
    el: java.lang.String,
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    width: js.UndefOr[scala.Double],
    height: js.UndefOr[scala.Double],
    autoPosition: js.UndefOr[scala.Boolean],
    minWidth: js.UndefOr[scala.Double],
    maxWidth: js.UndefOr[scala.Double],
    minHeight: js.UndefOr[scala.Double],
    maxHeight: js.UndefOr[scala.Double],
    id: js.UndefOr[scala.Double]
  ): JQuery = js.native
  def addWidget(
    el: stdLib.HTMLElement,
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    width: js.UndefOr[scala.Double],
    height: js.UndefOr[scala.Double],
    autoPosition: js.UndefOr[scala.Boolean],
    minWidth: js.UndefOr[scala.Double],
    maxWidth: js.UndefOr[scala.Double],
    minHeight: js.UndefOr[scala.Double],
    maxHeight: js.UndefOr[scala.Double],
    id: js.UndefOr[scala.Double]
  ): JQuery = js.native
  /**
    * Initializes batch updates. You will see no changes until commit method is called.
    */
  def batchUpdate(): scala.Unit = js.native
  /**
    * Gets current cell height.
    */
  def cellHeight(): scala.Double = js.native
  /**
    * Update current cell height. This method rebuilds an internal CSS style sheet. Note: You can expect performance issues if call this method too often.
    * @param {number} val the cell height
    */
  def cellHeight(`val`: scala.Double): scala.Unit = js.native
  /**
    * Gets current cell width.
    */
  def cellWidth(): scala.Double = js.native
  /**
    * Finishes batch updates. Updates DOM nodes. You must call it after batchUpdate.
    */
  def commit(): scala.Unit = js.native
  /**
    * Destroys a grid instance.
    * @param {boolean} detachGrid if false nodes and grid will not be removed from the DOM (Optional. Default true).
    */
  def destroy(): scala.Unit = js.native
  def destroy(detachGrid: scala.Boolean): scala.Unit = js.native
  /*
    * Disables widgets moving/resizing.
    */
  def disable(): scala.Unit = js.native
  /*
    * Enables widgets moving/resizing.
    */
  def enable(): scala.Unit = js.native
  /**
    * Enables/disables widget moving.
    * This is a shortcut for:
    * grid.movable(this.container.children('.' + this.opts.itemClass), doEnable);
    * @param {boolean} doEnable 
    * @param {boolean} includeNewWidgets will force new widgets to be draggable
    */
  def enableMove(doEnable: scala.Boolean, includeNewWidgets: scala.Boolean): scala.Unit = js.native
  /**
    * Enables/disables widget resizing.
    * @param {boolean} doEnable 
    * @param {boolean} includeNewWidgets will force new widgets to be resizable
    */
  def enableResize(doEnable: scala.Boolean, includeNewWidgets: scala.Boolean): scala.Unit = js.native
  /** 
    * Get the position of the cell under a pixel on screen.
    * @param  {MousePosition}  position the position of the pixel to resolve in absolute coordinates, as an object with top and leftproperties
    * @param  {boolean}  useOffset if true, value will be based on offset vs position (Optional. Default false). Useful when grid is within position: relative element.
    */
  def getCellFromPixel(position: MousePosition): CellPosition = js.native
  def getCellFromPixel(position: MousePosition, useOffset: scala.Boolean): CellPosition = js.native
  /**
    * Checks if specified area is empty.
    * @param {number} x the position x.
    * @param {number} y the position y.
    * @param {number} width the width of to check
    * @param {number} height the height of to check
    */
  def isAreaEmpty(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * Locks/unlocks widget.
    * @param {HTMLElement} el widget to modify.
    * @param {boolean} val if true widget will be locked.
    */
  def locked(el: stdLib.HTMLElement, `val`: scala.Boolean): scala.Unit = js.native
  def makeWidget(el: JQuery): JQuery = js.native
  /**
    * If you add elements to your gridstack container by hand, you have to tell gridstack afterwards to make them widgets. 
    *
    *   If you want gridstack to add the elements for you, use addWidget instead. Makes the given element a widget and returns it.
    *
    * @param {string | HTMLElement | JQuery} el widget to add
    */
  def makeWidget(el: java.lang.String): JQuery = js.native
  def makeWidget(el: stdLib.HTMLElement): JQuery = js.native
  /**
    * Set the maxHeight for a widget.
    * @param {HTMLElement} el widget to modify.
    * @param {number} val A numeric value of the number of rows
    */
  def maxHeight(el: stdLib.HTMLElement, `val`: scala.Double): scala.Unit = js.native
  /**
    * Set the maxWidth for a widget.
    * @param {HTMLElement} el widget to modify.
    * @param {number} val A numeric value of the number of columns
    */
  def maxWidth(el: stdLib.HTMLElement, `val`: scala.Double): scala.Unit = js.native
  /**
    * Set the minHeight for a widget.
    * @param {HTMLElement} el widget to modify.
    * @param {number} val A numeric value of the number of rows
    */
  def minHeight(el: stdLib.HTMLElement, `val`: scala.Double): scala.Unit = js.native
  /**
    * Set the minWidth for a widget.
    * @param {HTMLElement} el widget to modify.
    * @param {number} val A numeric value of the number of columns
    */
  def minWidth(el: stdLib.HTMLElement, `val`: scala.Double): scala.Unit = js.native
  /** 
    * Enables/Disables moving.
    * @param {HTMLElement} el widget to modify.
    * @param {number} val if true widget will be draggable.
    */
  def movable(el: stdLib.HTMLElement, `val`: scala.Boolean): scala.Unit = js.native
  /**
    * Changes widget position
    * @param {HTMLElement} el  widget to modify
    * @param {number} x new position x. If value is null or undefined it will be ignored.
    * @param {number} y new position y. If value is null or undefined it will be ignored.
    *
    */
  def move(el: stdLib.HTMLElement, x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Removes all widgets from the grid.
    * @param {boolean} detachNode if false DOM node won't be removed from the tree (Optional. Default true).
    */
  def removeAll(): scala.Unit = js.native
  def removeAll(detachNode: scala.Boolean): scala.Unit = js.native
  /**
    * Removes widget from the grid.
    * @param {HTMLElement} el  widget to modify
    * @param {boolean} detachNode if false DOM node won't be removed from the tree (Optional. Default true).
    */
  def removeWidget(el: stdLib.HTMLElement): scala.Unit = js.native
  def removeWidget(el: stdLib.HTMLElement, detachNode: scala.Boolean): scala.Unit = js.native
  /**
    * Enables/Disables resizing.
    * @param {HTMLElement} el  widget to modify
    * @param {boolean} val  if true widget will be resizable.
    */
  def resizable(el: stdLib.HTMLElement, `val`: scala.Boolean): scala.Unit = js.native
  /**
    * Changes widget size
    * @param {HTMLElement} el  widget to modify
    * @param {number} width new dimensions width. If value is null or undefined it will be ignored.
    * @param {number} height  new dimensions height. If value is null or undefined it will be ignored.
    */
  def resize(el: stdLib.HTMLElement, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * Toggle the grid animation state. Toggles the grid-stack-animate class.
    * @param {boolean} doAnimate if true the grid will animate.
    */
  def setAnimation(doAnimate: scala.Boolean): scala.Unit = js.native
  /**
    * (Experimental) Modify number of columns in the grid. 
    * Will attempt to update existing widgets to conform to new number of columns. 
    * Requires gridstack-extra.css or gridstack-extra.min.css.
    * @param {number} gridWidth Integer between 1 and 12.
    * @param {boolean} doNotPropagate if true existing widgets will not be updated.
    */
  def setGridWidth(gridWidth: scala.Double, doNotPropagate: scala.Boolean): scala.Unit = js.native
  /**
    * Toggle the grid static state. Also toggle the grid-stack-static class.
    * @param {boolean} staticValue if true the grid become static.
    */
  def setStatic(staticValue: scala.Boolean): scala.Unit = js.native
  /**
    * Updates widget position/size.
    * @param {HTMLElement} el  widget to modify
    * @param {number} x new position x. If value is null or undefined it will be ignored.
    * @param {number} y new position y. If value is null or undefined it will be ignored.
    * @param {number} width new dimensions width. If value is null or undefined it will be ignored.
    * @param {number} height  new dimensions height. If value is null or undefined it will be ignored.
    */
  def update(
    el: stdLib.HTMLElement,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): scala.Unit = js.native
  /**
    * Sets the vertial margin
    * @param {number} value new vertical margin value.
    * @param {boolean} noUpdate if true, styles will not be updated.
    */
  def verticalMargin(value: scala.Double, noUpdate: scala.Boolean): scala.Unit = js.native
  /**
    * Returns true if the height of the grid will be less the vertical constraint. Always returns true if grid doesn't have height constraint.
    * @param {number} x new position x. If value is null or undefined it will be ignored.
    * @param {number} y new position y. If value is null or undefined it will be ignored.
    * @param {number} width new dimensions width. If value is null or undefined it will be ignored.
    * @param {number} height  new dimensions height. If value is null or undefined it will be ignored.
    * @param {boolean} autoPosition  if true then x, y parameters will be ignored and widget will be places on the first available position
    */
  def willItFit(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    autoPosition: scala.Boolean
  ): scala.Boolean = js.native
}

