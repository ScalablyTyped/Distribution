package typings.graphqlDashSubscriptions

import typings.graphqlDashSubscriptions.distWithDashFilterMod.FilterFn
import typings.graphqlDashSubscriptions.distWithDashFilterMod.ResolverFn
import typings.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-subscriptions/dist/with-filter", JSImport.Namespace)
@js.native
object distWithDashFilterMod extends js.Object {
  def withFilter(asyncIteratorFn: ResolverFn, filterFn: FilterFn): ResolverFn = js.native
  type FilterFn = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    Boolean | js.Promise[Boolean]
  ]
  type ResolverFn = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]
  ]
}

