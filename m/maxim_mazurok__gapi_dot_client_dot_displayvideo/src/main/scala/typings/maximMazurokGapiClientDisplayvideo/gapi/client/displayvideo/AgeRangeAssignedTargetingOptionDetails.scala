package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgeRangeAssignedTargetingOptionDetails extends js.Object {
  
  /**
    * Output only. The age range of an audience. We only support targeting a continuous age range of an audience. Thus, the age range represented in this field can be 1) targeted solely,
    * or, 2) part of a larger continuous age range. The reach of a continuous age range targeting can be expanded by also targeting an audience of an unknown age.
    */
  var ageRange: js.UndefOr[String] = js.native
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_AGE_RANGE`. */
  var targetingOptionId: js.UndefOr[String] = js.native
}
object AgeRangeAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): AgeRangeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgeRangeAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class AgeRangeAssignedTargetingOptionDetailsOps[Self <: AgeRangeAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setAgeRange(value: String): Self = this.set("ageRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgeRange: Self = this.set("ageRange", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = this.set("targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingOptionId: Self = this.set("targetingOptionId", js.undefined)
  }
}
