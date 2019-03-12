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
    visitor: Visitor[
      _, 
      /* import warning: ImportType.apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: java.lang.String,
    isLeaving: scala.Boolean
  ): graphqlLib.tsutilsMaybeMod.Maybe[VisitFn[_, _]] = js.native
  def visit(
    root: graphqlLib.languageAstMod.ASTNode,
    visitor: Visitor[
      graphqlLib.languageAstMod.ASTKindToNode, 
      /* import warning: ImportType.apply Failed type conversion: graphql.graphql/language/ast.ASTKindToNode[keyof graphql.graphql/language/ast.ASTKindToNode] */ js.Any
    ]
  ): js.Any = js.native
  def visit(
    root: graphqlLib.languageAstMod.ASTNode,
    visitor: Visitor[
      graphqlLib.languageAstMod.ASTKindToNode, 
      /* import warning: ImportType.apply Failed type conversion: graphql.graphql/language/ast.ASTKindToNode[keyof graphql.graphql/language/ast.ASTKindToNode] */ js.Any
    ],
    visitorKeys: VisitorKeyMap[graphqlLib.languageAstMod.ASTKindToNode]
  ): js.Any = js.native
  def visitInParallel(
    visitors: js.Array[
      Visitor[
        graphqlLib.languageAstMod.ASTKindToNode, 
        /* import warning: ImportType.apply Failed type conversion: graphql.graphql/language/ast.ASTKindToNode[keyof graphql.graphql/language/ast.ASTKindToNode] */ js.Any
      ]
    ]
  ): Visitor[
    graphqlLib.languageAstMod.ASTKindToNode, 
    /* import warning: ImportType.apply Failed type conversion: graphql.graphql/language/ast.ASTKindToNode[keyof graphql.graphql/language/ast.ASTKindToNode] */ js.Any
  ] = js.native
  def visitWithTypeInfo(
    typeInfo: graphqlLib.utilitiesTypeInfoMod.TypeInfo,
    visitor: Visitor[
      graphqlLib.languageAstMod.ASTKindToNode, 
      /* import warning: ImportType.apply Failed type conversion: graphql.graphql/language/ast.ASTKindToNode[keyof graphql.graphql/language/ast.ASTKindToNode] */ js.Any
    ]
  ): Visitor[
    graphqlLib.languageAstMod.ASTKindToNode, 
    /* import warning: ImportType.apply Failed type conversion: graphql.graphql/language/ast.ASTKindToNode[keyof graphql.graphql/language/ast.ASTKindToNode] */ js.Any
  ] = js.native
}

