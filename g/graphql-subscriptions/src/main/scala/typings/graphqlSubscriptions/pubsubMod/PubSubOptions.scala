package typings.graphqlSubscriptions.pubsubMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PubSubOptions extends js.Object {
  var eventEmitter: js.UndefOr[EventEmitter] = js.native
}

object PubSubOptions {
  @scala.inline
  def apply(): PubSubOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubSubOptions]
  }
  @scala.inline
  implicit class PubSubOptionsOps[Self <: PubSubOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventEmitter(value: EventEmitter): Self = this.set("eventEmitter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventEmitter: Self = this.set("eventEmitter", js.undefined)
  }
  
}

