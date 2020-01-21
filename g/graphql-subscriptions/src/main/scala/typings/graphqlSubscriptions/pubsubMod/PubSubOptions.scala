package typings.graphqlSubscriptions.pubsubMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubSubOptions extends js.Object {
  var eventEmitter: js.UndefOr[EventEmitter] = js.undefined
}

object PubSubOptions {
  @scala.inline
  def apply(eventEmitter: EventEmitter = null): PubSubOptions = {
    val __obj = js.Dynamic.literal()
    if (eventEmitter != null) __obj.updateDynamic("eventEmitter")(eventEmitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubSubOptions]
  }
}

