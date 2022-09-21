package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountItemUpdates extends StObject {
  
  /**
    * Determines which attributes of the items should be automatically updated. If this field is not present, then the settings will be deleted. If there are no settings for subaccount, they are inherited from aggregator.
    */
  var accountItemUpdatesSettings: js.UndefOr[SchemaAccountItemUpdatesSettings] = js.undefined
  
  /**
    * Output only. The effective value of allow_availability_updates. If account_item_updates_settings is present, then this value is the same. Otherwise, it represents the inherited value of the parent account. Read-only.
    */
  var effectiveAllowAvailabilityUpdates: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The effective value of allow_condition_updates. If account_item_updates_settings is present, then this value is the same. Otherwise, it represents the inherited value of the parent account. Read-only.
    */
  var effectiveAllowConditionUpdates: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The effective value of allow_price_updates. If account_item_updates_settings is present, then this value is the same. Otherwise, it represents the inherited value of the parent account. Read-only.
    */
  var effectiveAllowPriceUpdates: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The effective value of allow_strict_availability_updates. If account_item_updates_settings is present, then this value is the same. Otherwise, it represents the inherited value of the parent account. Read-only.
    */
  var effectiveAllowStrictAvailabilityUpdates: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAccountItemUpdates {
  
  inline def apply(): SchemaAccountItemUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountItemUpdates]
  }
  
  extension [Self <: SchemaAccountItemUpdates](x: Self) {
    
    inline def setAccountItemUpdatesSettings(value: SchemaAccountItemUpdatesSettings): Self = StObject.set(x, "accountItemUpdatesSettings", value.asInstanceOf[js.Any])
    
    inline def setAccountItemUpdatesSettingsUndefined: Self = StObject.set(x, "accountItemUpdatesSettings", js.undefined)
    
    inline def setEffectiveAllowAvailabilityUpdates(value: Boolean): Self = StObject.set(x, "effectiveAllowAvailabilityUpdates", value.asInstanceOf[js.Any])
    
    inline def setEffectiveAllowAvailabilityUpdatesNull: Self = StObject.set(x, "effectiveAllowAvailabilityUpdates", null)
    
    inline def setEffectiveAllowAvailabilityUpdatesUndefined: Self = StObject.set(x, "effectiveAllowAvailabilityUpdates", js.undefined)
    
    inline def setEffectiveAllowConditionUpdates(value: Boolean): Self = StObject.set(x, "effectiveAllowConditionUpdates", value.asInstanceOf[js.Any])
    
    inline def setEffectiveAllowConditionUpdatesNull: Self = StObject.set(x, "effectiveAllowConditionUpdates", null)
    
    inline def setEffectiveAllowConditionUpdatesUndefined: Self = StObject.set(x, "effectiveAllowConditionUpdates", js.undefined)
    
    inline def setEffectiveAllowPriceUpdates(value: Boolean): Self = StObject.set(x, "effectiveAllowPriceUpdates", value.asInstanceOf[js.Any])
    
    inline def setEffectiveAllowPriceUpdatesNull: Self = StObject.set(x, "effectiveAllowPriceUpdates", null)
    
    inline def setEffectiveAllowPriceUpdatesUndefined: Self = StObject.set(x, "effectiveAllowPriceUpdates", js.undefined)
    
    inline def setEffectiveAllowStrictAvailabilityUpdates(value: Boolean): Self = StObject.set(x, "effectiveAllowStrictAvailabilityUpdates", value.asInstanceOf[js.Any])
    
    inline def setEffectiveAllowStrictAvailabilityUpdatesNull: Self = StObject.set(x, "effectiveAllowStrictAvailabilityUpdates", null)
    
    inline def setEffectiveAllowStrictAvailabilityUpdatesUndefined: Self = StObject.set(x, "effectiveAllowStrictAvailabilityUpdates", js.undefined)
  }
}
