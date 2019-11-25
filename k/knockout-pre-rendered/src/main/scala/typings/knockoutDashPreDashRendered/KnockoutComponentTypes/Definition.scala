package typings.knockoutDashPreDashRendered.KnockoutComponentTypes

import typings.knockoutDashPreDashRendered.Anon_ElementNode
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var createViewModel: js.UndefOr[js.Function2[/* params */ js.Any, /* options */ Anon_ElementNode, _]] = js.undefined
  var template: js.Array[Node]
}

object Definition {
  @scala.inline
  def apply(
    template: js.Array[Node],
    createViewModel: (/* params */ js.Any, /* options */ Anon_ElementNode) => _ = null
  ): Definition = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (createViewModel != null) __obj.updateDynamic("createViewModel")(js.Any.fromFunction2(createViewModel))
    __obj.asInstanceOf[Definition]
  }
}

