package typings.jscodeshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jsxelementMod {
  
  type ASTPath[N] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.NodePath<N, N> */ js.Any
  
  type Defined[T] = T
  
  type Filter = js.Function1[/* path */ typings.jscodeshift.jsxelementMod.ASTPath[js.Any], scala.Boolean]
  
  type JSXElement = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nodes.JSXElement */ js.Any
  
  type JSXElementChild = /* import warning: importer.ImportType#apply Failed type conversion: jscodeshift.jscodeshift/src/collections/JSXElement.Defined<jscodeshift.jscodeshift/src/collections/JSXElement.JSXElement['children']>[0] */ js.Any
}
