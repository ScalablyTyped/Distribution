package typings.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult[Raw] extends js.Object {
  var bounds: BoundsTuple
  var label: String
  var raw: Raw
  var x: String
  var y: String
}

object SearchResult {
  @scala.inline
  def apply[Raw](bounds: BoundsTuple, label: String, raw: Raw, x: String, y: String): SearchResult[Raw] = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResult[Raw]]
  }
}

