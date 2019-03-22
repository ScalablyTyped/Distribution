package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libResolverMod {
  type ResolverFilterArgFn[TSource, TContext, TArgs] = js.Function3[
    /* query */ js.Any, 
    /* value */ js.Any, 
    /* resolveParams */ ResolveParams[TSource, TContext, TArgs], 
    js.Any
  ]
  type ResolverMiddleware[TSource, TContext, TArgs] = js.Function5[
    /* resolve */ js.Function4[
      /* source */ TSource, 
      /* args */ TArgs, 
      /* context */ TContext, 
      /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
      js.Any
    ], 
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type ResolverNextRpCb[TSource, TContext, TArgs] = js.Function1[
    /* next */ ResolverRpCb[TSource, TContext, TArgs], 
    ResolverRpCb[TSource, TContext, TArgs]
  ]
  type ResolverRpCb[TSource, TContext, TArgs] = js.Function1[
    /* resolveParams */ ResolveParams[TSource, TContext, TArgs], 
    js.Promise[js.Any] | js.Any
  ]
  type ResolverSortArgFn[TSource, TContext, TArgs] = js.Function1[/* resolveParams */ ResolveParams[TSource, TContext, TArgs], js.Any]
  type ResolverWrapArgsCb[TArgs] = js.Function1[
    /* prevArgs */ graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap, 
    graphqlDashComposeLib.libObjectTypeComposerMod.ComposeFieldConfigArgumentMap[TArgs]
  ]
  type ResolverWrapCb[TNewSource, TPrevSource, TContext, TNewArgs, TPrevArgs] = js.Function2[
    /* newResolver */ Resolver[TNewSource, TContext, TNewArgs, js.Any], 
    /* prevResolver */ Resolver[TPrevSource, TContext, TPrevArgs, js.Any], 
    Resolver[TNewSource, TContext, TNewArgs, js.Any]
  ]
  type ResolverWrapTypeCb[TContext, TReturn] = js.Function1[
    /* prevType */ graphqlLib.typeDefinitionMod.GraphQLOutputType, 
    graphqlDashComposeLib.libObjectTypeComposerMod.ComposeOutputType[TReturn, TContext]
  ]
}
