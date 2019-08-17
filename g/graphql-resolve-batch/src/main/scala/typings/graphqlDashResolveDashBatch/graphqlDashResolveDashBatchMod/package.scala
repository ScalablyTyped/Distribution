package typings.graphqlDashResolveDashBatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlDashResolveDashBatchMod {
  import typings.graphql.typeDefinitionMod.GraphQLResolveInfo

  type BatchResolveFunction[TSource, TArgs, TContext, TReturn] = js.Function4[
    /* sources */ js.Array[TSource], 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    js.Array[TReturn] | js.Promise[js.Array[TReturn]]
  ]
  type ResolverFunction[TSource, TArgs, TContext, TReturn] = js.Function3[/* source */ TSource, /* args */ TArgs, /* context */ TContext, js.Promise[TReturn]]
}
