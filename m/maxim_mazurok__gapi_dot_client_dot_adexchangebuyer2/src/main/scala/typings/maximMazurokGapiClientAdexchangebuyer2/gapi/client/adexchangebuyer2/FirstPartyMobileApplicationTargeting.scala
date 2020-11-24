package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstPartyMobileApplicationTargeting extends js.Object {
  
  /** A list of application IDs to be excluded. */
  var excludedAppIds: js.UndefOr[js.Array[String]] = js.native
  
  /** A list of application IDs to be included. */
  var targetedAppIds: js.UndefOr[js.Array[String]] = js.native
}
object FirstPartyMobileApplicationTargeting {
  
  @scala.inline
  def apply(): FirstPartyMobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstPartyMobileApplicationTargeting]
  }
  
  @scala.inline
  implicit class FirstPartyMobileApplicationTargetingOps[Self <: FirstPartyMobileApplicationTargeting] (val x: Self) extends AnyVal {
    
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
    def setExcludedAppIdsVarargs(value: String*): Self = this.set("excludedAppIds", js.Array(value :_*))
    
    @scala.inline
    def setExcludedAppIds(value: js.Array[String]): Self = this.set("excludedAppIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedAppIds: Self = this.set("excludedAppIds", js.undefined)
    
    @scala.inline
    def setTargetedAppIdsVarargs(value: String*): Self = this.set("targetedAppIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetedAppIds(value: js.Array[String]): Self = this.set("targetedAppIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetedAppIds: Self = this.set("targetedAppIds", js.undefined)
  }
}
