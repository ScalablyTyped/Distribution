package typings.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelCredentials extends js.Object {
  /**
    * Returns a copy of this object with the included set of per-call credentials
    * expanded to include callCredentials.
    * @param callCredentials A CallCredentials object to associate with this
    * instance.
    */
  def compose(callCredentials: CallCredentials): ChannelCredentials = js.native
}

object ChannelCredentials {
  @scala.inline
  def apply(compose: CallCredentials => ChannelCredentials): ChannelCredentials = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
    __obj.asInstanceOf[ChannelCredentials]
  }
  @scala.inline
  implicit class ChannelCredentialsOps[Self <: ChannelCredentials] (val x: Self) extends AnyVal {
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
    def setCompose(value: CallCredentials => ChannelCredentials): Self = this.set("compose", js.Any.fromFunction1(value))
  }
  
}

