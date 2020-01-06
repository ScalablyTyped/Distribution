package typings.graphqlDashTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distInterfacesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.executionExecuteMod.ExecutionResult
  import typings.graphql.executionExecuteMod.ExecutionResultDataDefault
  import typings.graphql.graphqlMod.GraphQLScalarType
  import typings.graphql.languageAstMod.ASTNode
  import typings.graphql.languageAstMod.DocumentNode
  import typings.graphql.typeDefinitionMod.GraphQLField
  import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
  import typings.graphql.typeDefinitionMod.GraphQLNamedType
  import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typings.graphql.typeDefinitionMod.GraphQLType
  import typings.graphqlDashTools.Anon_Extensions
  import typings.graphqlDashTools.Anon_MergeInfo

  type DirectiveResolverFn[TSource, TContext] = js.Function5[
    /* next */ NextResolverFn, 
    /* source */ TSource, 
    /* args */ StringDictionary[js.Any], 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    js.Any
  ]
  type IConnector[TContext] = IConnectorCls[TContext] | IConnectorFn[TContext]
  type IConnectorFn[TContext] = js.Function1[/* context */ js.UndefOr[TContext], js.Any]
  type IConnectors[TContext] = StringDictionary[IConnector[TContext]]
  type IDirectiveResolvers[TSource, TContext] = StringDictionary[DirectiveResolverFn[TSource, TContext]]
  type IEnumResolver = StringDictionary[String | Double]
  type IFieldIteratorFn = js.Function3[
    /* fieldDef */ GraphQLField[js.Any, js.Any, StringDictionary[js.Any]], 
    /* typeName */ String, 
    /* fieldName */ String, 
    Unit
  ]
  type IFieldResolver[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo with Anon_MergeInfo, 
    js.Any
  ]
  type IMockFn = GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]
  type IMockTypeFn = js.Function3[
    /* type */ GraphQLType, 
    /* typeName */ js.UndefOr[String], 
    /* fieldName */ js.UndefOr[String], 
    GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]
  ]
  type IMocks = StringDictionary[IMockFn]
  type IResolvers[TSource, TContext] = StringDictionary[
    js.Function0[js.Any] | (IResolverObject[TSource, TContext, js.Any]) | (IResolverOptions[TSource, TContext, js.Any]) | GraphQLScalarType | IEnumResolver
  ]
  type IResolversParameter = (js.Array[
    (IResolvers[js.Any, js.Any]) | (js.Function1[/* mergeInfo */ MergeInfo, IResolvers[js.Any, js.Any]])
  ]) | (IResolvers[js.Any, js.Any]) | (js.Function1[/* mergeInfo */ MergeInfo, IResolvers[js.Any, js.Any]])
  type ITypeDefinitions = ITypedef | js.Array[ITypedef]
  type ITypedef = (js.Function0[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias graphql-tools.graphql-tools/dist/Interfaces.ITypedef */ js.Object
    ]
  ]) | String | DocumentNode | ASTNode
  type NextResolverFn = js.Function0[js.Promise[js.Any]]
  type ResolveType[T /* <: GraphQLType */] = js.Function1[/* type */ T, T]
  type Result = ExecutionResult[ExecutionResultDataDefault] with Anon_Extensions
  type UnitOrList[Type] = Type | js.Array[Type]
  type VisitType = js.Function2[/* name */ String, /* candidates */ js.Array[MergeTypeCandidate], VisitTypeResult]
  type VisitTypeResult = GraphQLNamedType | TypeWithResolvers | Null
}
