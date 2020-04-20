package typings.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversalContext extends js.Object {
  var colorMap: js.Any
  var searchStatus: String
  var undiscoveredMap: js.Any
}

object TraversalContext {
  @scala.inline
  def apply(colorMap: js.Any, searchStatus: String, undiscoveredMap: js.Any): TraversalContext = {
    val __obj = js.Dynamic.literal(colorMap = colorMap.asInstanceOf[js.Any], searchStatus = searchStatus.asInstanceOf[js.Any], undiscoveredMap = undiscoveredMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraversalContext]
  }
}

