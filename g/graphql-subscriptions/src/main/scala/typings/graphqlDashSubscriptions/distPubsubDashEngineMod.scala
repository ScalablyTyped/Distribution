package typings.graphqlDashSubscriptions

import typings.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-subscriptions/dist/pubsub-engine", JSImport.Namespace)
@js.native
object distPubsubDashEngineMod extends js.Object {
  @js.native
  abstract class PubSubEngine () extends js.Object {
    def asyncIterator[T](triggers: String): AsyncIterator[T, _, js.UndefOr[scala.Nothing]] = js.native
    def asyncIterator[T](triggers: js.Array[String]): AsyncIterator[T, _, js.UndefOr[scala.Nothing]] = js.native
    def publish(triggerName: String, payload: js.Any): js.Promise[Unit] = js.native
    def subscribe(triggerName: String, onMessage: js.Function, options: js.Object): js.Promise[Double] = js.native
    def unsubscribe(subId: Double): js.Any = js.native
  }
  
}

