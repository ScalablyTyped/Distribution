package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEventInsert extends js.Object {
  
  /** Campaign Manager dimensions associated with the event. */
  var cmDimensions: js.UndefOr[CampaignManagerIds] = js.native
  
  /** DV360 dimensions associated with the event. */
  var dv3Dimensions: js.UndefOr[DV3Ids] = js.native
  
  /** The type of event to insert. */
  var insertEventType: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventInsert". */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The match ID field. A match ID is your own first-party identifier that has been synced with Google using the match ID feature in Floodlight. This field is mutually exclusive with
    * mobileDeviceId, and at least one of the two fields is required.
    */
  var matchId: js.UndefOr[String] = js.native
  
  /** The mobile device ID. This field is mutually exclusive with matchId, and at least one of the two fields is required. */
  var mobileDeviceId: js.UndefOr[String] = js.native
}
object CustomEventInsert {
  
  @scala.inline
  def apply(): CustomEventInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventInsert]
  }
  
  @scala.inline
  implicit class CustomEventInsertOps[Self <: CustomEventInsert] (val x: Self) extends AnyVal {
    
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
    def setCmDimensions(value: CampaignManagerIds): Self = this.set("cmDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmDimensions: Self = this.set("cmDimensions", js.undefined)
    
    @scala.inline
    def setDv3Dimensions(value: DV3Ids): Self = this.set("dv3Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDv3Dimensions: Self = this.set("dv3Dimensions", js.undefined)
    
    @scala.inline
    def setInsertEventType(value: String): Self = this.set("insertEventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertEventType: Self = this.set("insertEventType", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMatchId(value: String): Self = this.set("matchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchId: Self = this.set("matchId", js.undefined)
    
    @scala.inline
    def setMobileDeviceId(value: String): Self = this.set("mobileDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileDeviceId: Self = this.set("mobileDeviceId", js.undefined)
  }
}
