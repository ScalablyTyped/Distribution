package typings.graphqlSubscriptions

import typings.graphqlSubscriptions.pubsubMod.PubSubOptions
import typings.graphqlSubscriptions.withFilterMod.FilterFn
import typings.graphqlSubscriptions.withFilterMod.ResolverFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-subscriptions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class PubSub ()
    extends typings.graphqlSubscriptions.pubsubMod.PubSub {
    def this(options: PubSubOptions) = this()
  }
  
  @js.native
  abstract class PubSubEngine ()
    extends typings.graphqlSubscriptions.pubsubEngineMod.PubSubEngine
  
  def withFilter(asyncIteratorFn: ResolverFn, filterFn: FilterFn): ResolverFn = js.native
}

