package typings.jscodeshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object variableDeclaratorMod {
  type ASTPath[N] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.NodePath<N, N> */ js.Any
  type Filter = js.Function1[
    /* path */ typings.jscodeshift.variableDeclaratorMod.ASTPath[js.Any], 
    scala.Boolean
  ]
}
