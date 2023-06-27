package typings.jotai.anon

import typings.babelTraverse.anon.Typeofcache
import typings.babelTraverse.anon.Typeofvisitors
import typings.babelTraverse.mod.NodePath
import typings.babelTraverse.mod.Scope
import typings.babelTraverse.mod.TraverseOptions
import typings.babelTraverse.mod.Visitor
import typings.babelTypes.mod.Node
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftraverse extends StObject {
  
  def apply(parent: Node): Unit = js.native
  def apply(parent: Node, opts: Unit, scope: Unit, state: Any): Unit = js.native
  def apply(parent: Node, opts: Unit, scope: Unit, state: Any, parentPath: NodePath[Node]): Unit = js.native
  def apply(parent: Node, opts: Unit, scope: Unit, state: Unit, parentPath: NodePath[Node]): Unit = js.native
  def apply(parent: Node, opts: Unit, scope: Scope): Unit = js.native
  def apply(parent: Node, opts: Unit, scope: Scope, state: Any): Unit = js.native
  def apply(parent: Node, opts: Unit, scope: Scope, state: Any, parentPath: NodePath[Node]): Unit = js.native
  def apply(parent: Node, opts: Unit, scope: Scope, state: Unit, parentPath: NodePath[Node]): Unit = js.native
  def apply(parent: Node, opts: TraverseOptions[Node]): Unit = js.native
  def apply(parent: Node, opts: TraverseOptions[Node], scope: Unit, state: Any): Unit = js.native
  def apply(parent: Node, opts: TraverseOptions[Node], scope: Unit, state: Any, parentPath: NodePath[Node]): Unit = js.native
  def apply(parent: Node, opts: TraverseOptions[Node], scope: Unit, state: Unit, parentPath: NodePath[Node]): Unit = js.native
  def apply(parent: Node, opts: TraverseOptions[Node], scope: Scope): Unit = js.native
  def apply(parent: Node, opts: TraverseOptions[Node], scope: Scope, state: Any): Unit = js.native
  def apply(parent: Node, opts: TraverseOptions[Node], scope: Scope, state: Any, parentPath: NodePath[Node]): Unit = js.native
  def apply(parent: Node, opts: TraverseOptions[Node], scope: Scope, state: Unit, parentPath: NodePath[Node]): Unit = js.native
  
  var cache: Typeofcache = js.native
  
  def cheap(node: Node, enter: js.Function1[/* node */ Node, Unit]): Unit = js.native
  
  def clearNode(node: Node): Unit = js.native
  def clearNode(
    node: Node,
    opts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemovePropertiesOptions */ Any
  ): Unit = js.native
  
  def explode[S](visitor: Visitor[S]): /* import warning: importer.ImportType#apply Failed type conversion: {[ Type in std.Exclude<@babel/types.@babel/types.Node, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.DeprecatedAliases * / any>['type'] ]:? @babel/traverse.@babel/traverse.VisitNodeObject<S, std.Extract<@babel/types.@babel/types.Node, {  type :Type}>>} */ js.Any = js.native
  @JSName("explode")
  var explode_Original: typings.babelTraverse.anon.FnCall = js.native
  
  def hasType(
    tree: Node,
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.jotai.jotaiStrings.ClassAccessorProperty, typings.jotai.jotaiStrings.AnyTypeAnnotation, typings.jotai.jotaiStrings.ArgumentPlaceholder */ Any
  ): Boolean = js.native
  def hasType(
    tree: Node,
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.jotai.jotaiStrings.ClassAccessorProperty, typings.jotai.jotaiStrings.AnyTypeAnnotation, typings.jotai.jotaiStrings.ArgumentPlaceholder */ Any,
    denylistTypes: js.Array[String]
  ): Boolean = js.native
  
  def node(node: Node, opts: TraverseOptions[Node]): Unit = js.native
  def node(node: Node, opts: TraverseOptions[Node], scope: Unit, state: Any): Unit = js.native
  def node(
    node: Node,
    opts: TraverseOptions[Node],
    scope: Unit,
    state: Any,
    path: Unit,
    skipKeys: Record[String, Boolean]
  ): Unit = js.native
  def node(node: Node, opts: TraverseOptions[Node], scope: Unit, state: Any, path: NodePath[Node]): Unit = js.native
  def node(
    node: Node,
    opts: TraverseOptions[Node],
    scope: Unit,
    state: Any,
    path: NodePath[Node],
    skipKeys: Record[String, Boolean]
  ): Unit = js.native
  def node(
    node: Node,
    opts: TraverseOptions[Node],
    scope: Unit,
    state: Unit,
    path: Unit,
    skipKeys: Record[String, Boolean]
  ): Unit = js.native
  def node(node: Node, opts: TraverseOptions[Node], scope: Unit, state: Unit, path: NodePath[Node]): Unit = js.native
  def node(
    node: Node,
    opts: TraverseOptions[Node],
    scope: Unit,
    state: Unit,
    path: NodePath[Node],
    skipKeys: Record[String, Boolean]
  ): Unit = js.native
  def node(node: Node, opts: TraverseOptions[Node], scope: Scope): Unit = js.native
  def node(node: Node, opts: TraverseOptions[Node], scope: Scope, state: Any): Unit = js.native
  def node(
    node: Node,
    opts: TraverseOptions[Node],
    scope: Scope,
    state: Any,
    path: Unit,
    skipKeys: Record[String, Boolean]
  ): Unit = js.native
  def node(node: Node, opts: TraverseOptions[Node], scope: Scope, state: Any, path: NodePath[Node]): Unit = js.native
  def node(
    node: Node,
    opts: TraverseOptions[Node],
    scope: Scope,
    state: Any,
    path: NodePath[Node],
    skipKeys: Record[String, Boolean]
  ): Unit = js.native
  def node(
    node: Node,
    opts: TraverseOptions[Node],
    scope: Scope,
    state: Unit,
    path: Unit,
    skipKeys: Record[String, Boolean]
  ): Unit = js.native
  def node(node: Node, opts: TraverseOptions[Node], scope: Scope, state: Unit, path: NodePath[Node]): Unit = js.native
  def node(
    node: Node,
    opts: TraverseOptions[Node],
    scope: Scope,
    state: Unit,
    path: NodePath[Node],
    skipKeys: Record[String, Boolean]
  ): Unit = js.native
  
  def removeProperties(tree: Node): Node = js.native
  def removeProperties(
    tree: Node,
    opts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemovePropertiesOptions */ Any
  ): Node = js.native
  
  def verify(visitor: Visitor[Any]): Unit = js.native
  @JSName("verify")
  var verify_Original: js.Function1[/* visitor */ Visitor[Any], Unit] = js.native
  
  var visitors: Typeofvisitors = js.native
}
