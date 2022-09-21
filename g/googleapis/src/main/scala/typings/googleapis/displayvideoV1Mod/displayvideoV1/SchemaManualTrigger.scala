package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManualTrigger extends StObject {
  
  /**
    * Required. The maximum duration of each activation in minutes. Must be between 1 and 360 inclusive. After this duration, the trigger will be automatically deactivated.
    */
  var activationDurationMinutes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The unique ID of the advertiser that the manual trigger belongs to.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The display name of the manual trigger. Must be UTF-8 encoded with a maximum size of 240 bytes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp of the trigger's latest activation.
    */
  var latestActivationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the manual trigger.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The state of the manual trigger. Will be set to the `INACTIVE` state upon creation.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique ID of the manual trigger.
    */
  var triggerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaManualTrigger {
  
  inline def apply(): SchemaManualTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManualTrigger]
  }
  
  extension [Self <: SchemaManualTrigger](x: Self) {
    
    inline def setActivationDurationMinutes(value: String): Self = StObject.set(x, "activationDurationMinutes", value.asInstanceOf[js.Any])
    
    inline def setActivationDurationMinutesNull: Self = StObject.set(x, "activationDurationMinutes", null)
    
    inline def setActivationDurationMinutesUndefined: Self = StObject.set(x, "activationDurationMinutes", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLatestActivationTime(value: String): Self = StObject.set(x, "latestActivationTime", value.asInstanceOf[js.Any])
    
    inline def setLatestActivationTimeNull: Self = StObject.set(x, "latestActivationTime", null)
    
    inline def setLatestActivationTimeUndefined: Self = StObject.set(x, "latestActivationTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerIdNull: Self = StObject.set(x, "triggerId", null)
    
    inline def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
  }
}
