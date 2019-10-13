package typings.iobroker.iobrokerMod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines access rights for a single state object */
trait StateACL extends ObjectACL {
  /** Linux-type permissions defining access to this state */
  var state: Double
}

object StateACL {
  @scala.inline
  def apply(`object`: Double, owner: String, ownerGroup: String, state: Double): StateACL = {
    val __obj = js.Dynamic.literal(owner = owner, ownerGroup = ownerGroup, state = state)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[StateACL]
  }
}

