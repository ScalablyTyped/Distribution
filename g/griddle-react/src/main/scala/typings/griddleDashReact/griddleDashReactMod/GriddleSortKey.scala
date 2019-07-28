package typings.griddleDashReact.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleSortKey extends js.Object {
  var id: String
  var sortAscending: Boolean
}

object GriddleSortKey {
  @scala.inline
  def apply(id: String, sortAscending: Boolean): GriddleSortKey = {
    val __obj = js.Dynamic.literal(id = id, sortAscending = sortAscending)
  
    __obj.asInstanceOf[GriddleSortKey]
  }
}

