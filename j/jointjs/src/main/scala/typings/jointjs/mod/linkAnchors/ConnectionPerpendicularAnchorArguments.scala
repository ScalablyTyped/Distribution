package typings.jointjs.mod.linkAnchors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionPerpendicularAnchorArguments extends js.Object {
  
  var fallbackAt: js.UndefOr[Double | String] = js.native
  
  var fixedAt: js.UndefOr[Double | String] = js.native
}
object ConnectionPerpendicularAnchorArguments {
  
  @scala.inline
  def apply(): ConnectionPerpendicularAnchorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionPerpendicularAnchorArguments]
  }
  
  @scala.inline
  implicit class ConnectionPerpendicularAnchorArgumentsOps[Self <: ConnectionPerpendicularAnchorArguments] (val x: Self) extends AnyVal {
    
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
    def setFallbackAt(value: Double | String): Self = this.set("fallbackAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackAt: Self = this.set("fallbackAt", js.undefined)
    
    @scala.inline
    def setFixedAt(value: Double | String): Self = this.set("fixedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedAt: Self = this.set("fixedAt", js.undefined)
  }
}
