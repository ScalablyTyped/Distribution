package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def forEachChild[T](
    node: Node[grammarkdownLib.distTokensMod.SyntaxKind],
    cbNode: js.Function1[/* node */ Node[grammarkdownLib.distTokensMod.SyntaxKind], js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
  def forEachChild[T](
    node: js.UndefOr[scala.Nothing],
    cbNode: js.Function1[/* node */ Node[grammarkdownLib.distTokensMod.SyntaxKind], js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
}

