package typings.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "forEachChild")
@js.native
object forEachChild extends js.Object {
  
  def apply[T](
    node: js.UndefOr[scala.Nothing],
    cbNode: js.Function1[
      /* node */ typings.grammarkdown.nodesMod.Node[typings.grammarkdown.tokensMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = js.native
  def apply[T](
    node: typings.grammarkdown.nodesMod.Node[typings.grammarkdown.tokensMod.SyntaxKind],
    cbNode: js.Function1[
      /* node */ typings.grammarkdown.nodesMod.Node[typings.grammarkdown.tokensMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = js.native
}
