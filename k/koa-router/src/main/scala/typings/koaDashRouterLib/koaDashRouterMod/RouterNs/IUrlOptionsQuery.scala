package typings
package koaDashRouterLib.koaDashRouterMod.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUrlOptionsQuery extends js.Object {
  var query: js.Object | java.lang.String
}

object IUrlOptionsQuery {
  @scala.inline
  def apply(query: js.Object | java.lang.String): IUrlOptionsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUrlOptionsQuery]
  }
}

