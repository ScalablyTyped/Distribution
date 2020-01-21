package typings.lightship.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeaconControllerType extends js.Object {
  def die(): js.Promise[Unit]
}

object BeaconControllerType {
  @scala.inline
  def apply(die: () => js.Promise[Unit]): BeaconControllerType = {
    val __obj = js.Dynamic.literal(die = js.Any.fromFunction0(die))
  
    __obj.asInstanceOf[BeaconControllerType]
  }
}

