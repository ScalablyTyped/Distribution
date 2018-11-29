package typings
package graphqlDashSubscriptionsLib.distPubsubDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PubSubEngine extends js.Object {
  def asyncIterator[T](triggers: java.lang.String): stdLib.AsyncIterator[T] = js.native
  def asyncIterator[T](triggers: js.Array[java.lang.String]): stdLib.AsyncIterator[T] = js.native
  def publish(triggerName: java.lang.String, payload: js.Any): stdLib.Promise[scala.Unit] = js.native
  def subscribe(triggerName: java.lang.String, onMessage: js.Function, options: js.Object): stdLib.Promise[scala.Double] = js.native
  def unsubscribe(subId: scala.Double): js.Any = js.native
}

