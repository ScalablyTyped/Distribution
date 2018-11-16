package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object languageVisitorMod {
  type ASTVisitor = Visitor[
    graphqlLib.languageAstMod.ASTKindToNode, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List())))) */js.Any
  ]
  type EnterLeaveVisitor[KindToNode, Nodes] = EnterLeave[
    (VisitFn[Nodes, Nodes]) | (graphqlLib.graphqlLibStrings.EnterLeaveVisitor with KindToNode)
  ]
  type ShapeMapVisitor[KindToNode, Nodes] = graphqlLib.graphqlLibStrings.ShapeMapVisitor with KindToNode
  type VisitFn[TAnyNode, TVisitedNode] = js.Function5[
    /* node */ TVisitedNode, 
    /* key */ js.UndefOr[java.lang.String | scala.Double], 
    /* parent */ js.UndefOr[TAnyNode | js.Array[TAnyNode]], 
    /* path */ js.Array[java.lang.String | scala.Double], 
    /* ancestors */ js.Array[TAnyNode | js.Array[TAnyNode]], 
    js.Any
  ]
  type Visitor[KindToNode, Nodes] = (EnterLeaveVisitor[KindToNode, Nodes]) | (ShapeMapVisitor[KindToNode, Nodes])
  type VisitorKeyMap[T] = graphqlLib.graphqlLibStrings.VisitorKeyMap with T
}
