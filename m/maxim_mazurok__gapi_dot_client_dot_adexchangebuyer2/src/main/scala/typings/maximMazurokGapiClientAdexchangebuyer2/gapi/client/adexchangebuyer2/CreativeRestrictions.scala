package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeRestrictions extends js.Object {
  
  /** The format of the environment that the creatives will be displayed in. */
  var creativeFormat: js.UndefOr[String] = js.native
  
  var creativeSpecifications: js.UndefOr[js.Array[CreativeSpecification]] = js.native
  
  /** Skippable video ads allow viewers to skip ads after 5 seconds. */
  var skippableAdType: js.UndefOr[String] = js.native
}
object CreativeRestrictions {
  
  @scala.inline
  def apply(): CreativeRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeRestrictions]
  }
  
  @scala.inline
  implicit class CreativeRestrictionsOps[Self <: CreativeRestrictions] (val x: Self) extends AnyVal {
    
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
    def setCreativeFormat(value: String): Self = this.set("creativeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeFormat: Self = this.set("creativeFormat", js.undefined)
    
    @scala.inline
    def setCreativeSpecificationsVarargs(value: CreativeSpecification*): Self = this.set("creativeSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setCreativeSpecifications(value: js.Array[CreativeSpecification]): Self = this.set("creativeSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeSpecifications: Self = this.set("creativeSpecifications", js.undefined)
    
    @scala.inline
    def setSkippableAdType(value: String): Self = this.set("skippableAdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippableAdType: Self = this.set("skippableAdType", js.undefined)
  }
}
