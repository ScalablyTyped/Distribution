package typings
package jqueryDashMatchDashHeightLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryMatchHeight extends js.Object {
  var _groups: js.Array[_] = js.native
  var _maintainScroll: scala.Boolean = js.native
  var _throttle: scala.Double = js.native
  /**
       * Set all selected elements to the height of the tallest.
       * If the items are on multiple rows, the items of each row will be set to the tallest of that row.
       */
  def apply(): JQuery = js.native
  /**
       * Set all selected elements to the height of the tallest.
       * If the items are on multiple rows, the items of each row will be set to the tallest of that row.
       */
  def apply(options: jqueryDashMatchDashHeightLib.JQueryMatchHeightNs.Options): JQuery = js.native
  def _afterUpdate(event: jqueryLib.JQueryEventObject, groups: js.Array[_]): js.Any = js.native
  def _apply(elements: js.Any, options: js.Any): scala.Unit = js.native
  def _beforeUpdate(event: jqueryLib.JQueryEventObject, groups: js.Array[_]): js.Any = js.native
  def _rows($item: JQuery): js.Array[_] = js.native
  def _update(): scala.Unit = js.native
}

