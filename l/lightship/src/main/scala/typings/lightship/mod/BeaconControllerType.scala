package typings.lightship.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeaconControllerType extends js.Object {
  
  def die(): js.Promise[Unit] = js.native
}
object BeaconControllerType {
  
  @scala.inline
  def apply(die: () => js.Promise[Unit]): BeaconControllerType = {
    val __obj = js.Dynamic.literal(die = js.Any.fromFunction0(die))
    __obj.asInstanceOf[BeaconControllerType]
  }
  
  @scala.inline
  implicit class BeaconControllerTypeOps[Self <: BeaconControllerType] (val x: Self) extends AnyVal {
    
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
    def setDie(value: () => js.Promise[Unit]): Self = this.set("die", js.Any.fromFunction0(value))
  }
}
