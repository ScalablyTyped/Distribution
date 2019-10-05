package typings.graphqlDashSubscriptions

import typings.graphqlDashSubscriptions.distPubsubMod.PubSubOptions
import typings.graphqlDashSubscriptions.distWithDashFilterMod.FilterFn
import typings.graphqlDashSubscriptions.distWithDashFilterMod.ResolverFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-subscriptions", JSImport.Namespace)
@js.native
object graphqlDashSubscriptionsMod extends js.Object {
  @js.native
  class PubSub ()
    extends typings.graphqlDashSubscriptions.distPubsubMod.PubSub {
    def this(options: PubSubOptions) = this()
  }
  
  @js.native
  abstract class PubSubEngine ()
    extends typings.graphqlDashSubscriptions.distPubsubDashEngineMod.PubSubEngine
  
  def withFilter(asyncIteratorFn: ResolverFn, filterFn: FilterFn): ResolverFn = js.native
}

