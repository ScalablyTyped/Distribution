package typings.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resolverMod {
  type ResolverFilterArgFn[TSource, TContext, TArgs] = js.Function3[
    /* query */ js.Any, 
    /* value */ js.Any, 
    /* resolveParams */ typings.graphqlCompose.resolverMod.ResolveParams[TSource, TContext, TArgs], 
    js.Any
  ]
  type ResolverMiddleware[TSource, TContext, TArgs] = js.Function5[
    /* resolve */ js.Function4[
      /* source */ TSource, 
      /* args */ TArgs, 
      /* context */ TContext, 
      /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
      js.Any
    ], 
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type ResolverNextRpCb[TSource, TContext, TArgs] = js.Function1[
    /* next */ typings.graphqlCompose.resolverMod.ResolverRpCb[TSource, TContext, TArgs], 
    typings.graphqlCompose.resolverMod.ResolverRpCb[TSource, TContext, TArgs]
  ]
  type ResolverRpCb[TSource, TContext, TArgs] = js.Function1[
    /* resolveParams */ typings.graphqlCompose.resolverMod.ResolveParams[TSource, TContext, TArgs], 
    js.Promise[js.Any] | js.Any
  ]
  type ResolverSortArgFn[TSource, TContext, TArgs] = js.Function1[
    /* resolveParams */ typings.graphqlCompose.resolverMod.ResolveParams[TSource, TContext, TArgs], 
    js.Any
  ]
  type ResolverWrapArgsCb[TArgs] = js.Function1[
    /* prevArgs */ typings.graphql.definitionMod.GraphQLFieldConfigArgumentMap, 
    typings.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigArgumentMap[TArgs]
  ]
  type ResolverWrapCb[TNewSource, TPrevSource, TContext, TNewArgs, TPrevArgs] = js.Function2[
    /* newResolver */ typings.graphqlCompose.resolverMod.Resolver[TNewSource, TContext, TNewArgs, js.Any], 
    /* prevResolver */ typings.graphqlCompose.resolverMod.Resolver[TPrevSource, TContext, TPrevArgs, js.Any], 
    typings.graphqlCompose.resolverMod.Resolver[TNewSource, TContext, TNewArgs, js.Any]
  ]
  type ResolverWrapTypeCb[TContext, TReturn] = js.Function1[
    /* prevType */ typings.graphql.definitionMod.GraphQLOutputType, 
    typings.graphqlCompose.objectTypeComposerMod.ComposeOutputType[TReturn, TContext]
  ]
}
