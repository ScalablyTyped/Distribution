package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteFrontendBotInfo extends StObject {
  
  /** Identifier of the application associated with the bot. */
  var appId: js.UndefOr[AppsDynamiteAppId] = js.undefined
  
  /** URL for the avatar picture of the User in dynamite. This field should be populated if the request is FetchBotCategories/ListBotCatalogEntries */
  var botAvatarUrl: js.UndefOr[String] = js.undefined
  
  /** Non-unique, user-defined display name of the Bot. This field should be populated if the request is FetchBotCategories/ListBotCatalogEntries. */
  var botName: js.UndefOr[String] = js.undefined
  
  /** Short description for the bot. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Name of bot developer. */
  var developerName: js.UndefOr[String] = js.undefined
  
  /** URL for the banner image in GSuite Market Place. The banner will be 220x140. */
  var marketPlaceBannerUrl: js.UndefOr[String] = js.undefined
  
  /** Indicates whether bot is enabled/disabled. */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Urls with additional information related to the bot. This field should always be set even if all the fields within it are empty, so that it is convenient for clients to work with
    * this field in javascript.
    */
  var supportUrls: js.UndefOr[AppsDynamiteFrontendBotInfoSupportUrls] = js.undefined
  
  /**
    * The supported uses are limited according to the user that made the request. If the user does not have permission to use the bot, the list will be empty. This could occur for non
    * whitelisted bots in the catalog.
    */
  var supportedUses: js.UndefOr[js.Array[String]] = js.undefined
  
  var whitelistStatus: js.UndefOr[String] = js.undefined
}
object AppsDynamiteFrontendBotInfo {
  
  inline def apply(): AppsDynamiteFrontendBotInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteFrontendBotInfo]
  }
  
  extension [Self <: AppsDynamiteFrontendBotInfo](x: Self) {
    
    inline def setAppId(value: AppsDynamiteAppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setBotAvatarUrl(value: String): Self = StObject.set(x, "botAvatarUrl", value.asInstanceOf[js.Any])
    
    inline def setBotAvatarUrlUndefined: Self = StObject.set(x, "botAvatarUrl", js.undefined)
    
    inline def setBotName(value: String): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeveloperName(value: String): Self = StObject.set(x, "developerName", value.asInstanceOf[js.Any])
    
    inline def setDeveloperNameUndefined: Self = StObject.set(x, "developerName", js.undefined)
    
    inline def setMarketPlaceBannerUrl(value: String): Self = StObject.set(x, "marketPlaceBannerUrl", value.asInstanceOf[js.Any])
    
    inline def setMarketPlaceBannerUrlUndefined: Self = StObject.set(x, "marketPlaceBannerUrl", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSupportUrls(value: AppsDynamiteFrontendBotInfoSupportUrls): Self = StObject.set(x, "supportUrls", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlsUndefined: Self = StObject.set(x, "supportUrls", js.undefined)
    
    inline def setSupportedUses(value: js.Array[String]): Self = StObject.set(x, "supportedUses", value.asInstanceOf[js.Any])
    
    inline def setSupportedUsesUndefined: Self = StObject.set(x, "supportedUses", js.undefined)
    
    inline def setSupportedUsesVarargs(value: String*): Self = StObject.set(x, "supportedUses", js.Array(value*))
    
    inline def setWhitelistStatus(value: String): Self = StObject.set(x, "whitelistStatus", value.asInstanceOf[js.Any])
    
    inline def setWhitelistStatusUndefined: Self = StObject.set(x, "whitelistStatus", js.undefined)
  }
}
