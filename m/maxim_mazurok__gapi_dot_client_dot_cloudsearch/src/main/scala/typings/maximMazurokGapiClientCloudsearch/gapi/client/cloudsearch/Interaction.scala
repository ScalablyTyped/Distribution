package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interaction extends js.Object {
  
  /** The time when the user acted on the item. If multiple actions of the same type exist for a single user, only the most recent action is recorded. */
  var interactionTime: js.UndefOr[String] = js.native
  
  /** The user that acted on the item. */
  var principal: js.UndefOr[Principal] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Interaction {
  
  @scala.inline
  def apply(): Interaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interaction]
  }
  
  @scala.inline
  implicit class InteractionOps[Self <: Interaction] (val x: Self) extends AnyVal {
    
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
    def setInteractionTime(value: String): Self = this.set("interactionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractionTime: Self = this.set("interactionTime", js.undefined)
    
    @scala.inline
    def setPrincipal(value: Principal): Self = this.set("principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipal: Self = this.set("principal", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
