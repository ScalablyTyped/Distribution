package typings.graphqlDashSubscriptions.distPubsubMod

import typings.graphqlDashSubscriptions.distPubsubDashEngineMod.PubSubEngine
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-subscriptions/dist/pubsub", "PubSub")
@js.native
class PubSub () extends PubSubEngine {
  def this(options: PubSubOptions) = this()
  var ee: EventEmitter = js.native
  var subIdCounter: js.Any = js.native
  var subscriptions: js.Any = js.native
  def subscribe(triggerName: String, onMessage: js.Function1[/* repeated */ js.Any, Unit]): js.Promise[Double] = js.native
}

