package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleSortKey extends js.Object {
  var id: java.lang.String
  var sortAscending: scala.Boolean
}

object GriddleSortKey {
  @scala.inline
  def apply(id: java.lang.String, sortAscending: scala.Boolean): GriddleSortKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("sortAscending")(sortAscending)
    __obj.asInstanceOf[GriddleSortKey]
  }
}

