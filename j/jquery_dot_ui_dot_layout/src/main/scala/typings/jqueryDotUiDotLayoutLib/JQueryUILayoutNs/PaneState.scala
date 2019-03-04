package typings
package jqueryDotUiDotLayoutLib.JQueryUILayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneState extends js.Object {
  var isClosed: scala.Boolean
  var isHidden: scala.Boolean
  var isResizing: scala.Boolean
  var isSliding: scala.Boolean
  var maxSize: scala.Double
  var minSize: scala.Double
  var noRoom: scala.Boolean
  var size: scala.Double
}

object PaneState {
  @scala.inline
  def apply(
    isClosed: scala.Boolean,
    isHidden: scala.Boolean,
    isResizing: scala.Boolean,
    isSliding: scala.Boolean,
    maxSize: scala.Double,
    minSize: scala.Double,
    noRoom: scala.Boolean,
    size: scala.Double
  ): PaneState = {
    val __obj = js.Dynamic.literal(isClosed = isClosed, isHidden = isHidden, isResizing = isResizing, isSliding = isSliding, maxSize = maxSize, minSize = minSize, noRoom = noRoom, size = size)
  
    __obj.asInstanceOf[PaneState]
  }
}

