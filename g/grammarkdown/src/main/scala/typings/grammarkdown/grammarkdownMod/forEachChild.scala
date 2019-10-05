package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "forEachChild")
@js.native
object forEachChild extends js.Object {
  def apply[T](
    node: js.UndefOr[scala.Nothing],
    cbNode: js.Function1[/* node */ typings.grammarkdown.distNodesMod.Node[SyntaxKind], js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
  def apply[T](
    node: typings.grammarkdown.distNodesMod.Node[SyntaxKind],
    cbNode: js.Function1[/* node */ typings.grammarkdown.distNodesMod.Node[SyntaxKind], js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
}

