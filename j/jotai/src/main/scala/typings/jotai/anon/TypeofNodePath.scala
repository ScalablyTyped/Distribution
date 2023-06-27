package typings.jotai.anon

import org.scalablytyped.runtime.Instantiable2
import typings.babelCore.mod.NodePath
import typings.babelTraverse.anon.Container
import typings.babelTraverse.anon.Hub
import typings.babelTraverse.mod.HubInterface
import typings.babelTraverse.mod.NodeKeyOfArrays
import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNodePath
  extends StObject
     with Instantiable2[/* hub */ HubInterface, /* parent */ Node, NodePath[js.Object]] {
  
  def get[C /* <: Node */, K /* <: /* keyof C */ String */](opts: Container[C, K]): typings.babelTraverse.mod.NodePath[
    /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ] = js.native
  def get[C /* <: Node */, L /* <: NodeKeyOfArrays[C] */](opts: Hub[C, L]): /* import warning: importer.ImportType#apply Failed type conversion: C[L] extends std.Array<@babel/types.@babel/types.Node | null | undefined> ? @babel/traverse.@babel/traverse.NodePath<C[L][number]> : never */ js.Any = js.native
}
