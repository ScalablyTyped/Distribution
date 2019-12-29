package typings.graphqlDashResolveDashBatch

import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-resolve-batch", JSImport.Namespace)
@js.native
object graphqlDashResolveDashBatchMod extends js.Object {
  def createBatchResolver[TSource, TReturn, TArgs, TContext](batchResolveFn: BatchResolveFunction[TSource, TArgs, TContext, TReturn]): ResolverFunction[TSource, TArgs, TContext, TReturn] = js.native
  type BatchResolveFunction[TSource, TArgs, TContext, TReturn] = js.Function4[
    /* sources */ js.Array[TSource], 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    js.Array[TReturn] | js.Promise[js.Array[TReturn]]
  ]
  type ResolverFunction[TSource, TArgs, TContext, TReturn] = js.Function3[/* source */ TSource, /* args */ TArgs, /* context */ TContext, js.Promise[TReturn]]
}

