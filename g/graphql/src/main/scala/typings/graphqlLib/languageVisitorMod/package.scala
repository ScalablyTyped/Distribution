package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object languageVisitorMod {
  type ASTVisitor = Visitor[
    graphqlLib.languageAstMod.ASTKindToNode, 
    /* import warning: ImportType.apply Failed type conversion: graphql.graphql/language/ast.ASTKindToNode[keyof graphql.graphql/language/ast.ASTKindToNode] */ js.Any
  ]
  type EnterLeaveVisitor[KindToNode, Nodes] = EnterLeave[
    (VisitFn[Nodes, Nodes]) | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof KindToNode ]:? graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]>}
    */ graphqlLib.graphqlLibStrings.EnterLeaveVisitor with KindToNode)
  ]
  type ShapeMapVisitor[KindToNode, Nodes] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof KindToNode ]:? graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]> | graphql.graphql/language/visitor.EnterLeave<graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]>>}
    */ graphqlLib.graphqlLibStrings.ShapeMapVisitor with js.Any
  type VisitFn[TAnyNode, TVisitedNode] = js.Function5[
    /* node */ TVisitedNode, 
    /* key */ js.UndefOr[java.lang.String | scala.Double], 
    /* parent */ js.UndefOr[TAnyNode | js.Array[TAnyNode]], 
    /* path */ js.Array[java.lang.String | scala.Double], 
    /* ancestors */ js.Array[TAnyNode | js.Array[TAnyNode]], 
    js.Any
  ]
  type Visitor[KindToNode, Nodes] = (EnterLeaveVisitor[KindToNode, Nodes]) | (ShapeMapVisitor[KindToNode, Nodes])
  type VisitorKeyMap[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.ReadonlyArray<keyof T[P]>}
    */ graphqlLib.graphqlLibStrings.VisitorKeyMap with T
}
