package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseProfileActions extends js.Object {
  
  var actions: InsightsServicePostResponseActions = js.native
}
object InsightsServicePostResponseProfileActions {
  
  @scala.inline
  def apply(actions: InsightsServicePostResponseActions): InsightsServicePostResponseProfileActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseProfileActions]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseProfileActionsOps[Self <: InsightsServicePostResponseProfileActions] (val x: Self) extends AnyVal {
    
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
    def setActions(value: InsightsServicePostResponseActions): Self = this.set("actions", value.asInstanceOf[js.Any])
  }
}
