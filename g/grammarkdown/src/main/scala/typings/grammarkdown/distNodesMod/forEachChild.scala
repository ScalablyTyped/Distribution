package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "forEachChild")
@js.native
object forEachChild extends js.Object {
  def apply[T](node: js.UndefOr[scala.Nothing], cbNode: js.Function1[/* node */ Node[SyntaxKind], js.UndefOr[T]]): js.UndefOr[T] = js.native
  def apply[T](node: Node[SyntaxKind], cbNode: js.Function1[/* node */ Node[SyntaxKind], js.UndefOr[T]]): js.UndefOr[T] = js.native
}

