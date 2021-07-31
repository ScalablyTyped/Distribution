package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomEventInsert extends StObject {
  
  /** Campaign Manager dimensions associated with the event. */
  var cmDimensions: js.UndefOr[CampaignManagerIds] = js.undefined
  
  /** DV360 dimensions associated with the event. */
  var dv3Dimensions: js.UndefOr[DV3Ids] = js.undefined
  
  /** The type of event to insert. */
  var insertEventType: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventInsert". */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The match ID field. A match ID is your own first-party identifier that has been synced with Google using the match ID feature in Floodlight. This field is mutually exclusive with
    * mobileDeviceId, and at least one of the two fields is required.
    */
  var matchId: js.UndefOr[String] = js.undefined
  
  /** The mobile device ID. This field is mutually exclusive with matchId, and at least one of the two fields is required. */
  var mobileDeviceId: js.UndefOr[String] = js.undefined
}
object CustomEventInsert {
  
  @scala.inline
  def apply(): CustomEventInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventInsert]
  }
  
  @scala.inline
  implicit class CustomEventInsertMutableBuilder[Self <: CustomEventInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmDimensions(value: CampaignManagerIds): Self = StObject.set(x, "cmDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmDimensionsUndefined: Self = StObject.set(x, "cmDimensions", js.undefined)
    
    @scala.inline
    def setDv3Dimensions(value: DV3Ids): Self = StObject.set(x, "dv3Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDv3DimensionsUndefined: Self = StObject.set(x, "dv3Dimensions", js.undefined)
    
    @scala.inline
    def setInsertEventType(value: String): Self = StObject.set(x, "insertEventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertEventTypeUndefined: Self = StObject.set(x, "insertEventType", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMatchId(value: String): Self = StObject.set(x, "matchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchIdUndefined: Self = StObject.set(x, "matchId", js.undefined)
    
    @scala.inline
    def setMobileDeviceId(value: String): Self = StObject.set(x, "mobileDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileDeviceIdUndefined: Self = StObject.set(x, "mobileDeviceId", js.undefined)
  }
}
