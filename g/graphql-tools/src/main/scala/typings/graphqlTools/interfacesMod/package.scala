package typings.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type DirectiveResolverFn[TSource, TContext] = js.Function5[
    /* next */ typings.graphqlTools.interfacesMod.NextResolverFn, 
    /* source */ TSource, 
    /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* context */ TContext, 
    /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type IConnector[TContext] = typings.graphqlTools.interfacesMod.IConnectorCls[TContext] | typings.graphqlTools.interfacesMod.IConnectorFn[TContext]
  type IConnectorFn[TContext] = js.Function1[/* context */ js.UndefOr[TContext], js.Any]
  type IConnectors[TContext] = org.scalablytyped.runtime.StringDictionary[typings.graphqlTools.interfacesMod.IConnector[TContext]]
  type IDirectiveResolvers[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[typings.graphqlTools.interfacesMod.DirectiveResolverFn[TSource, TContext]]
  type IEnumResolver = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  type IFieldIteratorFn = js.Function3[
    /* fieldDef */ typings.graphql.definitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    scala.Unit
  ]
  type IFieldResolver[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typings.graphqlTools.anon.GraphQLResolveInfomergeIn, 
    js.Any
  ]
  type IMockFn = typings.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  type IMockTypeFn = js.Function3[
    /* type */ typings.graphql.definitionMod.GraphQLType, 
    /* typeName */ js.UndefOr[java.lang.String], 
    /* fieldName */ js.UndefOr[java.lang.String], 
    typings.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type IMocks = org.scalablytyped.runtime.StringDictionary[typings.graphqlTools.interfacesMod.IMockFn]
  type IResolvers[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[
    js.Function0[js.Any] | (typings.graphqlTools.interfacesMod.IResolverObject[TSource, TContext, js.Any]) | (typings.graphqlTools.interfacesMod.IResolverOptions[TSource, TContext, js.Any]) | typings.graphql.mod.GraphQLScalarType | typings.graphqlTools.interfacesMod.IEnumResolver
  ]
  type IResolversParameter = (js.Array[
    (typings.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]) | (js.Function1[
      /* mergeInfo */ typings.graphqlTools.interfacesMod.MergeInfo, 
      typings.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]
    ])
  ]) | (typings.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]) | (js.Function1[
    /* mergeInfo */ typings.graphqlTools.interfacesMod.MergeInfo, 
    typings.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]
  ])
  type ITypeDefinitions = typings.graphqlTools.interfacesMod.ITypedef | js.Array[typings.graphqlTools.interfacesMod.ITypedef]
  type ITypedef = (js.Function0[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias graphql-tools.graphql-tools/dist/Interfaces.ITypedef */ js.Object
    ]
  ]) | java.lang.String | typings.graphql.astMod.DocumentNode | typings.graphql.astMod.ASTNode
  type NextResolverFn = js.Function0[js.Promise[js.Any]]
  type ResolveType[T /* <: typings.graphql.definitionMod.GraphQLType */] = js.Function1[/* type */ T, T]
  type UnitOrList[Type] = Type | js.Array[Type]
  type VisitType = js.Function2[
    /* name */ java.lang.String, 
    /* candidates */ js.Array[typings.graphqlTools.interfacesMod.MergeTypeCandidate], 
    typings.graphqlTools.interfacesMod.VisitTypeResult
  ]
  type VisitTypeResult = typings.graphql.definitionMod.GraphQLNamedType | typings.graphqlTools.interfacesMod.TypeWithResolvers | scala.Null
}
