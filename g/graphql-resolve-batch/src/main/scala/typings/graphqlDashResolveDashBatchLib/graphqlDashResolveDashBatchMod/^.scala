package typings
package graphqlDashResolveDashBatchLib.graphqlDashResolveDashBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-resolve-batch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createBatchResolver[TSource, TReturn, TArgs, TContext](batchResolveFn: BatchResolveFunction[TSource, TArgs, TContext, TReturn]): ResolverFunction[TSource, TArgs, TContext, TReturn] = js.native
}

