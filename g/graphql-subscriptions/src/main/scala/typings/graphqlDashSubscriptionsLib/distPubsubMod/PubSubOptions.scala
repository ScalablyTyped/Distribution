package typings
package graphqlDashSubscriptionsLib.distPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubSubOptions extends js.Object {
  var eventEmitter: js.UndefOr[nodeLib.eventsMod.EventEmitter] = js.undefined
}

object PubSubOptions {
  @scala.inline
  def apply(eventEmitter: nodeLib.eventsMod.EventEmitter = null): PubSubOptions = {
    val __obj = js.Dynamic.literal()
    if (eventEmitter != null) __obj.updateDynamic("eventEmitter")(eventEmitter)
    __obj.asInstanceOf[PubSubOptions]
  }
}

