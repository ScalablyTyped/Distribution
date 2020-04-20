package typings.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelCredentials extends js.Object {
  /**
    * Returns a copy of this object with the included set of per-call credentials
    * expanded to include callCredentials.
    * @param callCredentials A CallCredentials object to associate with this
    * instance.
    */
  def compose(callCredentials: CallCredentials): ChannelCredentials
}

object ChannelCredentials {
  @scala.inline
  def apply(compose: CallCredentials => ChannelCredentials): ChannelCredentials = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
    __obj.asInstanceOf[ChannelCredentials]
  }
}

