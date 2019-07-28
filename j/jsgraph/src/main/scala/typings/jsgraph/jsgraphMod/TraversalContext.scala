package typings.jsgraph.jsgraphMod

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
    val __obj = js.Dynamic.literal(colorMap = colorMap, searchStatus = searchStatus, undiscoveredMap = undiscoveredMap)
  
    __obj.asInstanceOf[TraversalContext]
  }
}

