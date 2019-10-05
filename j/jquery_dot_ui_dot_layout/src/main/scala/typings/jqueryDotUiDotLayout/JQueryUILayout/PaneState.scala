package typings.jqueryDotUiDotLayout.JQueryUILayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneState extends js.Object {
  var isClosed: Boolean
  var isHidden: Boolean
  var isResizing: Boolean
  var isSliding: Boolean
  var maxSize: Double
  var minSize: Double
  var noRoom: Boolean
  var size: Double
}

object PaneState {
  @scala.inline
  def apply(
    isClosed: Boolean,
    isHidden: Boolean,
    isResizing: Boolean,
    isSliding: Boolean,
    maxSize: Double,
    minSize: Double,
    noRoom: Boolean,
    size: Double
  ): PaneState = {
    val __obj = js.Dynamic.literal(isClosed = isClosed, isHidden = isHidden, isResizing = isResizing, isSliding = isSliding, maxSize = maxSize, minSize = minSize, noRoom = noRoom, size = size)
  
    __obj.asInstanceOf[PaneState]
  }
}

