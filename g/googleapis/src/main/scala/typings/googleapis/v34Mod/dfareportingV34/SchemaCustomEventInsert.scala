package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomEventInsert extends StObject {
  
  /**
    * Campaign Manager dimensions associated with the event.
    */
  var cmDimensions: js.UndefOr[SchemaCampaignManagerIds] = js.undefined
  
  /**
    * DV360 dimensions associated with the event.
    */
  var dv3Dimensions: js.UndefOr[SchemaDV3Ids] = js.undefined
  
  /**
    * The type of event to insert.
    */
  var insertEventType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventInsert".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The match ID field. A match ID is your own first-party identifier that has been synced with Google using the match ID feature in Floodlight. This field is mutually exclusive with mobileDeviceId, and at least one of the two fields is required.
    */
  var matchId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mobile device ID. This field is mutually exclusive with matchId, and at least one of the two fields is required.
    */
  var mobileDeviceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomEventInsert {
  
  inline def apply(): SchemaCustomEventInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomEventInsert]
  }
  
  extension [Self <: SchemaCustomEventInsert](x: Self) {
    
    inline def setCmDimensions(value: SchemaCampaignManagerIds): Self = StObject.set(x, "cmDimensions", value.asInstanceOf[js.Any])
    
    inline def setCmDimensionsUndefined: Self = StObject.set(x, "cmDimensions", js.undefined)
    
    inline def setDv3Dimensions(value: SchemaDV3Ids): Self = StObject.set(x, "dv3Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDv3DimensionsUndefined: Self = StObject.set(x, "dv3Dimensions", js.undefined)
    
    inline def setInsertEventType(value: String): Self = StObject.set(x, "insertEventType", value.asInstanceOf[js.Any])
    
    inline def setInsertEventTypeNull: Self = StObject.set(x, "insertEventType", null)
    
    inline def setInsertEventTypeUndefined: Self = StObject.set(x, "insertEventType", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMatchId(value: String): Self = StObject.set(x, "matchId", value.asInstanceOf[js.Any])
    
    inline def setMatchIdNull: Self = StObject.set(x, "matchId", null)
    
    inline def setMatchIdUndefined: Self = StObject.set(x, "matchId", js.undefined)
    
    inline def setMobileDeviceId(value: String): Self = StObject.set(x, "mobileDeviceId", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceIdNull: Self = StObject.set(x, "mobileDeviceId", null)
    
    inline def setMobileDeviceIdUndefined: Self = StObject.set(x, "mobileDeviceId", js.undefined)
  }
}
