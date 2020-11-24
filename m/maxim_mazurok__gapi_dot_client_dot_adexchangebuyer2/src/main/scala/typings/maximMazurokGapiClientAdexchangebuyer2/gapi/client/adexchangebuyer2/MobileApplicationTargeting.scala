package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileApplicationTargeting extends js.Object {
  
  /** Publisher owned apps to be targeted or excluded by the publisher to display the ads in. */
  var firstPartyTargeting: js.UndefOr[FirstPartyMobileApplicationTargeting] = js.native
}
object MobileApplicationTargeting {
  
  @scala.inline
  def apply(): MobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileApplicationTargeting]
  }
  
  @scala.inline
  implicit class MobileApplicationTargetingOps[Self <: MobileApplicationTargeting] (val x: Self) extends AnyVal {
    
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
    def setFirstPartyTargeting(value: FirstPartyMobileApplicationTargeting): Self = this.set("firstPartyTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPartyTargeting: Self = this.set("firstPartyTargeting", js.undefined)
  }
}
