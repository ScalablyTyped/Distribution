package typings.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.iobroker.iobrokerStrings.state
  - typings.iobroker.iobrokerStrings.channel
  - typings.iobroker.iobrokerStrings.device
*/
trait ObjectType extends js.Object

object ObjectType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def channel: typings.iobroker.iobrokerStrings.channel = this.cast("channel")
  @scala.inline
  def device: typings.iobroker.iobrokerStrings.device = this.cast("device")
  @scala.inline
  def state: typings.iobroker.iobrokerStrings.state = this.cast("state")
}

