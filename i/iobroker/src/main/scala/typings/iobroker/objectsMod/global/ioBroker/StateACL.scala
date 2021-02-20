package typings.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines access rights for a single state object */
@js.native
trait StateACL extends ObjectACL {
  
  /** Linux-type permissions defining access to this state */
  var state: Double = js.native
}
object StateACL {
  
  @scala.inline
  def apply(`object`: Double, owner: String, ownerGroup: String, state: Double): StateACL = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ownerGroup = ownerGroup.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateACL]
  }
  
  @scala.inline
  implicit class StateACLMutableBuilder[Self <: StateACL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
