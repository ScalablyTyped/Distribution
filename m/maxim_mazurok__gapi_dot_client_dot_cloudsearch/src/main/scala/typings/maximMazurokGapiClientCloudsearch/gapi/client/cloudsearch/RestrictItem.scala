package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestrictItem extends js.Object {
  
  /** LINT.ThenChange(//depot/google3/java/com/google/apps/search/quality/itemsuggest/utils/SubtypeRerankingUtils.java) */
  var driveFollowUpRestrict: js.UndefOr[DriveFollowUpRestrict] = js.native
  
  var driveLocationRestrict: js.UndefOr[DriveLocationRestrict] = js.native
  
  /** LINT.IfChange Drive Types. */
  var driveMimeTypeRestrict: js.UndefOr[DriveMimeTypeRestrict] = js.native
  
  var driveTimeSpanRestrict: js.UndefOr[DriveTimeSpanRestrict] = js.native
  
  /** The search restrict (e.g. "after:2017-09-11 before:2017-09-12"). */
  var searchOperator: js.UndefOr[String] = js.native
}
object RestrictItem {
  
  @scala.inline
  def apply(): RestrictItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestrictItem]
  }
  
  @scala.inline
  implicit class RestrictItemOps[Self <: RestrictItem] (val x: Self) extends AnyVal {
    
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
    def setDriveFollowUpRestrict(value: DriveFollowUpRestrict): Self = this.set("driveFollowUpRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveFollowUpRestrict: Self = this.set("driveFollowUpRestrict", js.undefined)
    
    @scala.inline
    def setDriveLocationRestrict(value: DriveLocationRestrict): Self = this.set("driveLocationRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveLocationRestrict: Self = this.set("driveLocationRestrict", js.undefined)
    
    @scala.inline
    def setDriveMimeTypeRestrict(value: DriveMimeTypeRestrict): Self = this.set("driveMimeTypeRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveMimeTypeRestrict: Self = this.set("driveMimeTypeRestrict", js.undefined)
    
    @scala.inline
    def setDriveTimeSpanRestrict(value: DriveTimeSpanRestrict): Self = this.set("driveTimeSpanRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveTimeSpanRestrict: Self = this.set("driveTimeSpanRestrict", js.undefined)
    
    @scala.inline
    def setSearchOperator(value: String): Self = this.set("searchOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchOperator: Self = this.set("searchOperator", js.undefined)
  }
}
