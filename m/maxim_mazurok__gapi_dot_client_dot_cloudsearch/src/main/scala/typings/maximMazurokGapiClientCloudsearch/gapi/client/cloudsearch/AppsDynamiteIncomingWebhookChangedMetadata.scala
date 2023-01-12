package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteIncomingWebhookChangedMetadata extends StObject {
  
  /** The webhook name at the time of the change. Used in Spanner storage, BE API responses and FE API responses. */
  var incomingWebhookName: js.UndefOr[String] = js.undefined
  
  /** The user id of the user whose action triggered this system message. Used in Spanner storage, BE API responses and FE API responses. */
  var initiatorId: js.UndefOr[AppsDynamiteUserId] = js.undefined
  
  /** Complete profile when ListTopicsRequest FetchOptions.USER is set. Otherwise, only the id will be filled in. Used in FE API responses. */
  var initiatorProfile: js.UndefOr[AppsDynamiteFrontendUser] = js.undefined
  
  /**
    * The webhook id of the incoming webhook in question. This field should not be used to load webhook information dynamically and is only present for debugging purposes. Used in Spanner
    * storage, BE API responses and FE API responses.
    */
  var obfuscatedIncomingWebhookId: js.UndefOr[String] = js.undefined
  
  /** Only populated for UPDATED_NAME and UPDATED_NAME_AND_AVATAR events, where the webhook name was changed. Used in Spanner storage, BE API responses and FE API responses. */
  var oldIncomingWebhookName: js.UndefOr[String] = js.undefined
  
  /** Used in Spanner storage, BE API responses and FE API responses. */
  var `type`: js.UndefOr[String] = js.undefined
}
object AppsDynamiteIncomingWebhookChangedMetadata {
  
  inline def apply(): AppsDynamiteIncomingWebhookChangedMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteIncomingWebhookChangedMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteIncomingWebhookChangedMetadata] (val x: Self) extends AnyVal {
    
    inline def setIncomingWebhookName(value: String): Self = StObject.set(x, "incomingWebhookName", value.asInstanceOf[js.Any])
    
    inline def setIncomingWebhookNameUndefined: Self = StObject.set(x, "incomingWebhookName", js.undefined)
    
    inline def setInitiatorId(value: AppsDynamiteUserId): Self = StObject.set(x, "initiatorId", value.asInstanceOf[js.Any])
    
    inline def setInitiatorIdUndefined: Self = StObject.set(x, "initiatorId", js.undefined)
    
    inline def setInitiatorProfile(value: AppsDynamiteFrontendUser): Self = StObject.set(x, "initiatorProfile", value.asInstanceOf[js.Any])
    
    inline def setInitiatorProfileUndefined: Self = StObject.set(x, "initiatorProfile", js.undefined)
    
    inline def setObfuscatedIncomingWebhookId(value: String): Self = StObject.set(x, "obfuscatedIncomingWebhookId", value.asInstanceOf[js.Any])
    
    inline def setObfuscatedIncomingWebhookIdUndefined: Self = StObject.set(x, "obfuscatedIncomingWebhookId", js.undefined)
    
    inline def setOldIncomingWebhookName(value: String): Self = StObject.set(x, "oldIncomingWebhookName", value.asInstanceOf[js.Any])
    
    inline def setOldIncomingWebhookNameUndefined: Self = StObject.set(x, "oldIncomingWebhookName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
