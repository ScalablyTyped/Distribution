package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "forEachChild")
@js.native
object forEachChild extends js.Object {
  def apply[T](
    node: js.UndefOr[Node[SyntaxKind]],
    cbNode: js.Function1[/* node */ Node[SyntaxKind], js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
}

