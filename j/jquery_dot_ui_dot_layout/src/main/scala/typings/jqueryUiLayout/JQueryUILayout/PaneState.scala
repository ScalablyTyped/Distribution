package typings.jqueryUiLayout.JQueryUILayout

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
    val __obj = js.Dynamic.literal(isClosed = isClosed.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], isSliding = isSliding.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], noRoom = noRoom.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaneState]
  }
}

