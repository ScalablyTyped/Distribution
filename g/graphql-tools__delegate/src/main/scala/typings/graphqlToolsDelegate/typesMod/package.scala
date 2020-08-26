package typings.graphqlToolsDelegate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AsyncExecutor = js.Function1[
    /* params */ typings.graphqlToolsDelegate.typesMod.ExecutionParams[
      typings.std.Record[java.lang.String, js.Any], 
      typings.std.Record[java.lang.String, js.Any]
    ], 
    js.Promise[
      typings.graphqlToolsUtils.interfacesMod.ExecutionResult[typings.std.Record[java.lang.String, js.Any]]
    ]
  ]
  type CreateProxyingResolverFn = js.Function1[
    /* options */ typings.graphqlToolsDelegate.typesMod.ICreateProxyingResolverOptions, 
    typings.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type DelegationBinding = js.Function1[
    /* delegationContext */ typings.graphqlToolsDelegate.typesMod.DelegationContext, 
    js.Array[
      typings.graphqlToolsUtils.interfacesMod.Transform[typings.std.Record[java.lang.String, js.Any]]
    ]
  ]
  type Executor = typings.graphqlToolsDelegate.typesMod.AsyncExecutor | typings.graphqlToolsDelegate.typesMod.SyncExecutor
  type MergedTypeResolver = js.Function5[
    /* originalResult */ js.Any, 
    /* context */ typings.std.Record[java.lang.String, js.Any], 
    /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
    /* subschema */ typings.graphql.mod.GraphQLSchema | typings.graphqlToolsDelegate.typesMod.SubschemaConfig, 
    /* selectionSet */ typings.graphql.astMod.SelectionSetNode, 
    js.Any
  ]
  type Subscriber = js.Function1[
    /* params */ typings.graphqlToolsDelegate.typesMod.ExecutionParams[
      typings.std.Record[java.lang.String, js.Any], 
      typings.std.Record[java.lang.String, js.Any]
    ], 
    js.Promise[
      (typings.std.AsyncIterator[
        typings.graphqlToolsUtils.interfacesMod.ExecutionResult[typings.std.Record[java.lang.String, js.Any]], 
        js.Any, 
        js.UndefOr[scala.Nothing]
      ]) | (typings.graphqlToolsUtils.interfacesMod.ExecutionResult[typings.std.Record[java.lang.String, js.Any]])
    ]
  ]
  type SyncExecutor = js.Function1[
    /* params */ typings.graphqlToolsDelegate.typesMod.ExecutionParams[
      typings.std.Record[java.lang.String, js.Any], 
      typings.std.Record[java.lang.String, js.Any]
    ], 
    typings.graphqlToolsUtils.interfacesMod.ExecutionResult[typings.std.Record[java.lang.String, js.Any]]
  ]
}
