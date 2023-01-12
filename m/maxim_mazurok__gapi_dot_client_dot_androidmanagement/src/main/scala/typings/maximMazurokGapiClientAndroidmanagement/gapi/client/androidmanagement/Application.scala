package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application extends StObject {
  
  /**
    * Whether this app is free, free with in-app purchases, or paid. If the pricing is unspecified, this means the app is not generally available anymore (even though it might still be
    * available to people who own it).
    */
  var appPricing: js.UndefOr[String] = js.undefined
  
  /** Application tracks visible to the enterprise. */
  var appTracks: js.UndefOr[js.Array[AppTrackInfo]] = js.undefined
  
  /** Versions currently available for this app. */
  var appVersions: js.UndefOr[js.Array[AppVersion]] = js.undefined
  
  /** The name of the author of the apps (for example, the app developer). */
  var author: js.UndefOr[String] = js.undefined
  
  /** The countries which this app is available in as per ISO 3166-1 alpha-2. */
  var availableCountries: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The app category (e.g. RACING, SOCIAL, etc.) */
  var category: js.UndefOr[String] = js.undefined
  
  /** The content rating for this app. */
  var contentRating: js.UndefOr[String] = js.undefined
  
  /** The localized promotional description, if available. */
  var description: js.UndefOr[String] = js.undefined
  
  /** How and to whom the package is made available. */
  var distributionChannel: js.UndefOr[String] = js.undefined
  
  /** Noteworthy features (if any) of this app. */
  var features: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Full app description, if available. */
  var fullDescription: js.UndefOr[String] = js.undefined
  
  /** A link to an image that can be used as an icon for the app. This image is suitable for use up to a pixel size of 512 x 512. */
  var iconUrl: js.UndefOr[String] = js.undefined
  
  /** The set of managed properties available to be pre-configured for the app. */
  var managedProperties: js.UndefOr[js.Array[ManagedProperty]] = js.undefined
  
  /** The minimum Android SDK necessary to run the app. */
  var minAndroidSdkVersion: js.UndefOr[Double] = js.undefined
  
  /** The name of the app in the form enterprises/{enterprise}/applications/{package_name}. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The permissions required by the app. */
  var permissions: js.UndefOr[js.Array[ApplicationPermission]] = js.undefined
  
  /** A link to the (consumer) Google Play details page for the app. */
  var playStoreUrl: js.UndefOr[String] = js.undefined
  
  /** A localised description of the recent changes made to the app. */
  var recentChanges: js.UndefOr[String] = js.undefined
  
  /** A list of screenshot links representing the app. */
  var screenshotUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A link to a smaller image that can be used as an icon for the app. This image is suitable for use up to a pixel size of 128 x 128. */
  var smallIconUrl: js.UndefOr[String] = js.undefined
  
  /** The title of the app. Localized. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Output only. The approximate time (within 7 days) the app was last published. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Application {
  
  inline def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    inline def setAppPricing(value: String): Self = StObject.set(x, "appPricing", value.asInstanceOf[js.Any])
    
    inline def setAppPricingUndefined: Self = StObject.set(x, "appPricing", js.undefined)
    
    inline def setAppTracks(value: js.Array[AppTrackInfo]): Self = StObject.set(x, "appTracks", value.asInstanceOf[js.Any])
    
    inline def setAppTracksUndefined: Self = StObject.set(x, "appTracks", js.undefined)
    
    inline def setAppTracksVarargs(value: AppTrackInfo*): Self = StObject.set(x, "appTracks", js.Array(value*))
    
    inline def setAppVersions(value: js.Array[AppVersion]): Self = StObject.set(x, "appVersions", value.asInstanceOf[js.Any])
    
    inline def setAppVersionsUndefined: Self = StObject.set(x, "appVersions", js.undefined)
    
    inline def setAppVersionsVarargs(value: AppVersion*): Self = StObject.set(x, "appVersions", js.Array(value*))
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAvailableCountries(value: js.Array[String]): Self = StObject.set(x, "availableCountries", value.asInstanceOf[js.Any])
    
    inline def setAvailableCountriesUndefined: Self = StObject.set(x, "availableCountries", js.undefined)
    
    inline def setAvailableCountriesVarargs(value: String*): Self = StObject.set(x, "availableCountries", js.Array(value*))
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setContentRating(value: String): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
    
    inline def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDistributionChannel(value: String): Self = StObject.set(x, "distributionChannel", value.asInstanceOf[js.Any])
    
    inline def setDistributionChannelUndefined: Self = StObject.set(x, "distributionChannel", js.undefined)
    
    inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setFullDescription(value: String): Self = StObject.set(x, "fullDescription", value.asInstanceOf[js.Any])
    
    inline def setFullDescriptionUndefined: Self = StObject.set(x, "fullDescription", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setManagedProperties(value: js.Array[ManagedProperty]): Self = StObject.set(x, "managedProperties", value.asInstanceOf[js.Any])
    
    inline def setManagedPropertiesUndefined: Self = StObject.set(x, "managedProperties", js.undefined)
    
    inline def setManagedPropertiesVarargs(value: ManagedProperty*): Self = StObject.set(x, "managedProperties", js.Array(value*))
    
    inline def setMinAndroidSdkVersion(value: Double): Self = StObject.set(x, "minAndroidSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setMinAndroidSdkVersionUndefined: Self = StObject.set(x, "minAndroidSdkVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissions(value: js.Array[ApplicationPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: ApplicationPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setPlayStoreUrl(value: String): Self = StObject.set(x, "playStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setPlayStoreUrlUndefined: Self = StObject.set(x, "playStoreUrl", js.undefined)
    
    inline def setRecentChanges(value: String): Self = StObject.set(x, "recentChanges", value.asInstanceOf[js.Any])
    
    inline def setRecentChangesUndefined: Self = StObject.set(x, "recentChanges", js.undefined)
    
    inline def setScreenshotUrls(value: js.Array[String]): Self = StObject.set(x, "screenshotUrls", value.asInstanceOf[js.Any])
    
    inline def setScreenshotUrlsUndefined: Self = StObject.set(x, "screenshotUrls", js.undefined)
    
    inline def setScreenshotUrlsVarargs(value: String*): Self = StObject.set(x, "screenshotUrls", js.Array(value*))
    
    inline def setSmallIconUrl(value: String): Self = StObject.set(x, "smallIconUrl", value.asInstanceOf[js.Any])
    
    inline def setSmallIconUrlUndefined: Self = StObject.set(x, "smallIconUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
