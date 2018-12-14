package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distInterfacesMod {
  type DirectiveResolverFn[TSource, TContext] = js.Function5[
    /* next */ NextResolverFn, 
    /* source */ TSource, 
    /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* context */ TContext, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type IConnector[TContext] = IConnectorCls[TContext] | IConnectorFn[TContext]
  type IConnectorFn[TContext] = js.Function1[/* context */ js.UndefOr[TContext], js.Any]
  type IFieldIteratorFn = js.Function3[
    /* fieldDef */ graphqlLib.typeDefinitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    scala.Unit
  ]
  type IFieldResolver[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo with graphqlDashToolsLib.Anon_MergeInfo, 
    js.Any
  ]
  type IMockFn = graphqlLib.typeDefinitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  type IMockTypeFn = js.Function3[
    /* type */ graphqlLib.typeDefinitionMod.GraphQLType, 
    /* typeName */ js.UndefOr[java.lang.String], 
    /* fieldName */ js.UndefOr[java.lang.String], 
    graphqlLib.typeDefinitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type IResolversParameter = (js.Array[
    (IResolvers[js.Any, js.Any]) | (js.Function1[/* mergeInfo */ MergeInfo, IResolvers[js.Any, js.Any]])
  ]) | (IResolvers[js.Any, js.Any]) | (js.Function1[/* mergeInfo */ MergeInfo, IResolvers[js.Any, js.Any]])
  type ITypeDefinitions = ITypedef | js.Array[ITypedef]
  type ITypedef = js.Function0[js.Array[js.Object]] | java.lang.String | graphqlLib.languageAstMod.DocumentNode
  type NextResolverFn = js.Function0[js.Promise[js.Any]]
  type Operation = graphqlDashToolsLib.graphqlDashToolsLibStrings.query | graphqlDashToolsLib.graphqlDashToolsLibStrings.mutation | graphqlDashToolsLib.graphqlDashToolsLibStrings.subscription
  type ResolveType[T /* <: graphqlLib.typeDefinitionMod.GraphQLType */] = js.Function1[/* type */ T, T]
  type Result = graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault] with graphqlDashToolsLib.Anon_Extensions
  type UnitOrList[Type] = Type | js.Array[Type]
  type VisitType = js.Function2[
    /* name */ java.lang.String, 
    /* candidates */ js.Array[MergeTypeCandidate], 
    VisitTypeResult
  ]
  type VisitTypeResult = graphqlLib.typeDefinitionMod.GraphQLNamedType | TypeWithResolvers | scala.Null
}
