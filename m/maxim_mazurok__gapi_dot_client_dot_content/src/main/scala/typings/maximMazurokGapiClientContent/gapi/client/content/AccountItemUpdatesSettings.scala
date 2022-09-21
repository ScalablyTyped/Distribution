package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountItemUpdatesSettings extends StObject {
  
  /**
    * If availability updates are enabled, any previous availability values get overwritten if Google finds an out-of-stock annotation on the offer's page. If additionally
    * `allow_availability_updates` field is set to true, values get overwritten if Google finds an in-stock annotation on the offer’s page.
    */
  var allowAvailabilityUpdates: js.UndefOr[Boolean] = js.undefined
  
  /** If condition updates are enabled, Google always updates item condition with the condition detected from the details of your product. */
  var allowConditionUpdates: js.UndefOr[Boolean] = js.undefined
  
  /** If price updates are enabled, Google always updates the active price with the crawled information. */
  var allowPriceUpdates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If allow_availability_updates is enabled, items are automatically updated in all your Shopping target countries. By default, availability updates will only be applied to items that
    * are 'out of stock' on your website but 'in stock' on Shopping. Set this to true to also update items that are 'in stock' on your website, but 'out of stock' on Google Shopping. In
    * order for this field to have an effect, you must also allow availability updates.
    */
  var allowStrictAvailabilityUpdates: js.UndefOr[Boolean] = js.undefined
}
object AccountItemUpdatesSettings {
  
  inline def apply(): AccountItemUpdatesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountItemUpdatesSettings]
  }
  
  extension [Self <: AccountItemUpdatesSettings](x: Self) {
    
    inline def setAllowAvailabilityUpdates(value: Boolean): Self = StObject.set(x, "allowAvailabilityUpdates", value.asInstanceOf[js.Any])
    
    inline def setAllowAvailabilityUpdatesUndefined: Self = StObject.set(x, "allowAvailabilityUpdates", js.undefined)
    
    inline def setAllowConditionUpdates(value: Boolean): Self = StObject.set(x, "allowConditionUpdates", value.asInstanceOf[js.Any])
    
    inline def setAllowConditionUpdatesUndefined: Self = StObject.set(x, "allowConditionUpdates", js.undefined)
    
    inline def setAllowPriceUpdates(value: Boolean): Self = StObject.set(x, "allowPriceUpdates", value.asInstanceOf[js.Any])
    
    inline def setAllowPriceUpdatesUndefined: Self = StObject.set(x, "allowPriceUpdates", js.undefined)
    
    inline def setAllowStrictAvailabilityUpdates(value: Boolean): Self = StObject.set(x, "allowStrictAvailabilityUpdates", value.asInstanceOf[js.Any])
    
    inline def setAllowStrictAvailabilityUpdatesUndefined: Self = StObject.set(x, "allowStrictAvailabilityUpdates", js.undefined)
  }
}
