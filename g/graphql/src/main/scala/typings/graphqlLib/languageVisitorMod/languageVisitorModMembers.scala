package typings
package graphqlLib.languageVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/visitor", JSImport.Namespace)
@js.native
object languageVisitorModMembers extends js.Object {
  val BREAK: js.Any = js.native
  def getVisitFn(
    visitor: Visitor[
      _, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(any))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(any))),List())))) */js.Any
    ],
    kind: java.lang.String,
    isLeaving: scala.Boolean
  ): graphqlLib.tsutilsMaybeMod.Maybe[VisitFn[_, _]] = js.native
  def visit(
    root: graphqlLib.languageAstMod.ASTNode,
    visitor: Visitor[
      graphqlLib.languageAstMod.ASTKindToNode, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List())))) */js.Any
    ]
  ): js.Any = js.native
  def visit(
    root: graphqlLib.languageAstMod.ASTNode,
    visitor: Visitor[
      graphqlLib.languageAstMod.ASTKindToNode, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List())))) */js.Any
    ],
    visitorKeys: VisitorKeyMap[graphqlLib.languageAstMod.ASTKindToNode]
  ): js.Any = js.native
  def visitInParallel(
    visitors: js.Array[
      Visitor[
        graphqlLib.languageAstMod.ASTKindToNode, 
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List())))) */js.Any
      ]
    ]
  ): Visitor[
    graphqlLib.languageAstMod.ASTKindToNode, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List())))) */js.Any
  ] = js.native
  def visitWithTypeInfo(
    typeInfo: graphqlLib.utilitiesTypeInfoMod.TypeInfo,
    visitor: Visitor[
      graphqlLib.languageAstMod.ASTKindToNode, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List())))) */js.Any
    ]
  ): Visitor[
    graphqlLib.languageAstMod.ASTKindToNode, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(graphql), TsIdentModule(None,List(graphql, language, ast)), TsIdentSimple(ASTKindToNode))),List())))) */js.Any
  ] = js.native
}

