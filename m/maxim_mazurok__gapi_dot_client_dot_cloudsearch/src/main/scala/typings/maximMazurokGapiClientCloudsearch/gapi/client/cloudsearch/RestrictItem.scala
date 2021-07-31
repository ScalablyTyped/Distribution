package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestrictItem extends StObject {
  
  /** LINT.ThenChange(//depot/google3/java/com/google/apps/search/quality/itemsuggest/utils/SubtypeRerankingUtils.java) */
  var driveFollowUpRestrict: js.UndefOr[DriveFollowUpRestrict] = js.undefined
  
  var driveLocationRestrict: js.UndefOr[DriveLocationRestrict] = js.undefined
  
  /** LINT.IfChange Drive Types. */
  var driveMimeTypeRestrict: js.UndefOr[DriveMimeTypeRestrict] = js.undefined
  
  var driveTimeSpanRestrict: js.UndefOr[DriveTimeSpanRestrict] = js.undefined
  
  /** The search restrict (e.g. "after:2017-09-11 before:2017-09-12"). */
  var searchOperator: js.UndefOr[String] = js.undefined
}
object RestrictItem {
  
  @scala.inline
  def apply(): RestrictItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestrictItem]
  }
  
  @scala.inline
  implicit class RestrictItemMutableBuilder[Self <: RestrictItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveFollowUpRestrict(value: DriveFollowUpRestrict): Self = StObject.set(x, "driveFollowUpRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveFollowUpRestrictUndefined: Self = StObject.set(x, "driveFollowUpRestrict", js.undefined)
    
    @scala.inline
    def setDriveLocationRestrict(value: DriveLocationRestrict): Self = StObject.set(x, "driveLocationRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveLocationRestrictUndefined: Self = StObject.set(x, "driveLocationRestrict", js.undefined)
    
    @scala.inline
    def setDriveMimeTypeRestrict(value: DriveMimeTypeRestrict): Self = StObject.set(x, "driveMimeTypeRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveMimeTypeRestrictUndefined: Self = StObject.set(x, "driveMimeTypeRestrict", js.undefined)
    
    @scala.inline
    def setDriveTimeSpanRestrict(value: DriveTimeSpanRestrict): Self = StObject.set(x, "driveTimeSpanRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveTimeSpanRestrictUndefined: Self = StObject.set(x, "driveTimeSpanRestrict", js.undefined)
    
    @scala.inline
    def setSearchOperator(value: String): Self = StObject.set(x, "searchOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchOperatorUndefined: Self = StObject.set(x, "searchOperator", js.undefined)
  }
}
