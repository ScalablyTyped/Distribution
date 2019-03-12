package typings
package knockoutDashPagingLib.KnockoutComponentTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var createViewModel: js.UndefOr[
    js.Function2[/* params */ js.Any, /* options */ knockoutDashPagingLib.Anon_ElementNode, _]
  ] = js.undefined
  var template: js.Array[stdLib.Node]
}

object Definition {
  @scala.inline
  def apply(
    template: js.Array[stdLib.Node],
    createViewModel: (/* params */ js.Any, /* options */ knockoutDashPagingLib.Anon_ElementNode) => _ = null
  ): Definition = {
    val __obj = js.Dynamic.literal(template = template)
    if (createViewModel != null) __obj.updateDynamic("createViewModel")(js.Any.fromFunction2(createViewModel))
    __obj.asInstanceOf[Definition]
  }
}

