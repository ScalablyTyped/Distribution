package typings
package graphqlLib.languageVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/visitor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BREAK: js.Any = js.native
  def getVisitFn(
    visitor: graphqlLib.languageVisitorMod.Visitor[
      _, 
      /* import warning: ImportType.apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: java.lang.String,
    isLeaving: scala.Boolean
  ): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageVisitorMod.VisitFn[_, _]] = js.native
  def visit(
    root: graphqlLib.languageAstMod.ASTNode,
    visitor: graphqlLib.languageVisitorMod.Visitor[
      graphqlLib.languageAstMod.ASTKindToNode, 
      /* import warning: ImportType.apply Failed type conversion: graphql.graphql/language/ast.ASTKindToNode[keyof graphql.graphql/language/ast.ASTKindToNode] */ js.Any
    ]
  ): js.Any = js.native
  def visit(
    root: graphqlLib.languageAstMod.ASTNode,
    visitor: graphqlLib.languageVisitorMod.Visitor[
      graphqlLib.languageAstMod.ASTKindToNode, 
      /* import warning: ImportType.apply Failed type conversion: graphql.graphql/language/ast.ASTKindToNode[keyof graphql.graphql/language/ast.ASTKindToNode] */ js.Any
    ],
    visitorKeys: graphqlLib.languageVisitorMod.VisitorKeyMap[graphqlLib.languageAstMod.ASTKindToNode]
  ): js.Any = js.native
  def visitInParallel(
    visitors: js.Array[
      graphqlLib.languageVisitorMod.Visitor[
        graphqlLib.languageAstMod.ASTKindToNode, 
        /* import warning: ImportType.apply Failed type conversion: graphql.graphql/language/ast.ASTKindToNode[keyof graphql.graphql/language/ast.ASTKindToNode] */ js.Any
      ]
    ]
  ): graphqlLib.languageVisitorMod.Visitor[
    graphqlLib.languageAstMod.ASTKindToNode, 
    /* import warning: ImportType.apply Failed type conversion: graphql.graphql/language/ast.ASTKindToNode[keyof graphql.graphql/language/ast.ASTKindToNode] */ js.Any
  ] = js.native
  def visitWithTypeInfo(
    typeInfo: graphqlLib.utilitiesTypeInfoMod.TypeInfo,
    visitor: graphqlLib.languageVisitorMod.Visitor[
      graphqlLib.languageAstMod.ASTKindToNode, 
      /* import warning: ImportType.apply Failed type conversion: graphql.graphql/language/ast.ASTKindToNode[keyof graphql.graphql/language/ast.ASTKindToNode] */ js.Any
    ]
  ): graphqlLib.languageVisitorMod.Visitor[
    graphqlLib.languageAstMod.ASTKindToNode, 
    /* import warning: ImportType.apply Failed type conversion: graphql.graphql/language/ast.ASTKindToNode[keyof graphql.graphql/language/ast.ASTKindToNode] */ js.Any
  ] = js.native
}

