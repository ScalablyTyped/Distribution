package typings
package graphqlDashSubscriptionsLib.distPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-subscriptions/dist/pubsub", "PubSub")
@js.native
class PubSub ()
  extends graphqlDashSubscriptionsLib.distPubsubDashEngineMod.PubSubEngine {
  def this(options: PubSubOptions) = this()
  var ee: eventsLib.eventsMod.EventEmitter = js.native
  var subIdCounter: js.Any = js.native
  var subscriptions: js.Any = js.native
  def subscribe(triggerName: java.lang.String, onMessage: js.Function1[/* repeated */js.Any, scala.Unit]): stdLib.Promise[scala.Double] = js.native
}

