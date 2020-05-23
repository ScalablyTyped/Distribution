package typings.graphql.anon

import typings.graphql.astMod.DirectiveNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directives extends js.Object {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
}

object Directives {
  @scala.inline
  def apply(directives: js.Array[DirectiveNode] = null): Directives = {
    val __obj = js.Dynamic.literal()
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directives]
  }
}

