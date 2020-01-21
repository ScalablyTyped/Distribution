package typings.jscodeshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsxelementMod {
  type ASTPath[N] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.NodePath<N, N> */ js.Any
  type Defined[T] = T
  type Filter = js.Function1[/* path */ typings.jscodeshift.jsxelementMod.ASTPath[js.Any], scala.Boolean]
  type JSXElement = typings.astTypes.nodesMod.JSXElement
  type JSXElementChild = /* import warning: importer.ImportType#apply Failed type conversion: jscodeshift.jscodeshift/src/collections/JSXElement.Defined<std.Array<ast-types.ast-types/gen/kinds.JSXElementKind | ast-types.ast-types/gen/kinds.JSXExpressionContainerKind | ast-types.ast-types/gen/kinds.JSXFragmentKind | ast-types.ast-types/gen/kinds.JSXTextKind | ast-types.ast-types/gen/kinds.LiteralKind>>[0] */ js.Any
}
