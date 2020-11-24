package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeConditions extends js.Object {
  
  /**
    * The look-back window lets you specify a time frame for evaluating the behavior that qualifies users for your audience. For example, if your filters include users from Central Asia,
    * and Transactions Greater than 2, and you set the look-back window to 14 days, then any user from Central Asia whose cumulative transactions exceed 2 during the last 14 days is added
    * to the audience.
    */
  var daysToLookBack: js.UndefOr[Double] = js.native
  
  /** Boolean indicating whether this segment is a smart list. https://support.google.com/analytics/answer/4628577 */
  var isSmartList: js.UndefOr[Boolean] = js.native
  
  /** Resource type for include conditions. */
  var kind: js.UndefOr[String] = js.native
  
  /** Number of days (in the range 1 to 540) a user remains in the audience. */
  var membershipDurationDays: js.UndefOr[Double] = js.native
  
  /** The segment condition that will cause a user to be added to an audience. */
  var segment: js.UndefOr[String] = js.native
}
object IncludeConditions {
  
  @scala.inline
  def apply(): IncludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeConditions]
  }
  
  @scala.inline
  implicit class IncludeConditionsOps[Self <: IncludeConditions] (val x: Self) extends AnyVal {
    
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
    def setDaysToLookBack(value: Double): Self = this.set("daysToLookBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysToLookBack: Self = this.set("daysToLookBack", js.undefined)
    
    @scala.inline
    def setIsSmartList(value: Boolean): Self = this.set("isSmartList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSmartList: Self = this.set("isSmartList", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMembershipDurationDays(value: Double): Self = this.set("membershipDurationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembershipDurationDays: Self = this.set("membershipDurationDays", js.undefined)
    
    @scala.inline
    def setSegment(value: String): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
  }
}
