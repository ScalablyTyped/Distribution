package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Product extends StObject {
  
  /** The app restriction schema */
  var appRestrictionsSchema: js.UndefOr[AppRestrictionsSchema] = js.undefined
  
  /** The tracks visible to the enterprise. */
  var appTracks: js.UndefOr[js.Array[TrackInfo]] = js.undefined
  
  /** App versions currently available for this product. */
  var appVersion: js.UndefOr[js.Array[AppVersion]] = js.undefined
  
  /** The name of the author of the product (for example, the app developer). */
  var authorName: js.UndefOr[String] = js.undefined
  
  /** The countries which this app is available in. */
  var availableCountries: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Deprecated, use appTracks instead. */
  var availableTracks: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The app category (e.g. RACING, SOCIAL, etc.) */
  var category: js.UndefOr[String] = js.undefined
  
  /** The content rating for this app. */
  var contentRating: js.UndefOr[String] = js.undefined
  
  /** The localized promotional description, if available. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A link to the (consumer) Google Play details page for the product. */
  var detailsUrl: js.UndefOr[String] = js.undefined
  
  /**
    * How and to whom the package is made available. The value publicGoogleHosted means that the package is available through the Play store and not restricted to a specific enterprise.
    * The value privateGoogleHosted means that the package is a private app (restricted to an enterprise) but hosted by Google. The value privateSelfHosted means that the package is a
    * private app (restricted to an enterprise) and is privately hosted.
    */
  var distributionChannel: js.UndefOr[String] = js.undefined
  
  /** Noteworthy features (if any) of this product. */
  var features: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A link to an image that can be used as an icon for the product. This image is suitable for use at up to 512px x 512px. */
  var iconUrl: js.UndefOr[String] = js.undefined
  
  /** The approximate time (within 7 days) the app was last published, expressed in milliseconds since epoch. */
  var lastUpdatedTimestampMillis: js.UndefOr[String] = js.undefined
  
  /** The minimum Android SDK necessary to run the app. */
  var minAndroidSdkVersion: js.UndefOr[Double] = js.undefined
  
  /** A list of permissions required by the app. */
  var permissions: js.UndefOr[js.Array[ProductPermission]] = js.undefined
  
  /** A string of the form *app:<package name>*. For example, app:com.google.android.gm represents the Gmail app. */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this product is free, free with in-app purchases, or paid. If the pricing is unknown, this means the product is not generally available anymore (even though it might still
    * be available to people who own it).
    */
  var productPricing: js.UndefOr[String] = js.undefined
  
  /** A description of the recent changes made to the app. */
  var recentChanges: js.UndefOr[String] = js.undefined
  
  /** Deprecated. */
  var requiresContainerApp: js.UndefOr[Boolean] = js.undefined
  
  /** A list of screenshot links representing the app. */
  var screenshotUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The certificate used to sign this product. */
  var signingCertificate: js.UndefOr[ProductSigningCertificate] = js.undefined
  
  /** A link to a smaller image that can be used as an icon for the product. This image is suitable for use at up to 128px x 128px. */
  var smallIconUrl: js.UndefOr[String] = js.undefined
  
  /** The name of the product. */
  var title: js.UndefOr[String] = js.undefined
  
  /** A link to the managed Google Play details page for the product, for use by an Enterprise admin. */
  var workDetailsUrl: js.UndefOr[String] = js.undefined
}
object Product {
  
  inline def apply(): Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Product]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Product] (val x: Self) extends AnyVal {
    
    inline def setAppRestrictionsSchema(value: AppRestrictionsSchema): Self = StObject.set(x, "appRestrictionsSchema", value.asInstanceOf[js.Any])
    
    inline def setAppRestrictionsSchemaUndefined: Self = StObject.set(x, "appRestrictionsSchema", js.undefined)
    
    inline def setAppTracks(value: js.Array[TrackInfo]): Self = StObject.set(x, "appTracks", value.asInstanceOf[js.Any])
    
    inline def setAppTracksUndefined: Self = StObject.set(x, "appTracks", js.undefined)
    
    inline def setAppTracksVarargs(value: TrackInfo*): Self = StObject.set(x, "appTracks", js.Array(value*))
    
    inline def setAppVersion(value: js.Array[AppVersion]): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
    
    inline def setAppVersionVarargs(value: AppVersion*): Self = StObject.set(x, "appVersion", js.Array(value*))
    
    inline def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    inline def setAvailableCountries(value: js.Array[String]): Self = StObject.set(x, "availableCountries", value.asInstanceOf[js.Any])
    
    inline def setAvailableCountriesUndefined: Self = StObject.set(x, "availableCountries", js.undefined)
    
    inline def setAvailableCountriesVarargs(value: String*): Self = StObject.set(x, "availableCountries", js.Array(value*))
    
    inline def setAvailableTracks(value: js.Array[String]): Self = StObject.set(x, "availableTracks", value.asInstanceOf[js.Any])
    
    inline def setAvailableTracksUndefined: Self = StObject.set(x, "availableTracks", js.undefined)
    
    inline def setAvailableTracksVarargs(value: String*): Self = StObject.set(x, "availableTracks", js.Array(value*))
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setContentRating(value: String): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
    
    inline def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetailsUrl(value: String): Self = StObject.set(x, "detailsUrl", value.asInstanceOf[js.Any])
    
    inline def setDetailsUrlUndefined: Self = StObject.set(x, "detailsUrl", js.undefined)
    
    inline def setDistributionChannel(value: String): Self = StObject.set(x, "distributionChannel", value.asInstanceOf[js.Any])
    
    inline def setDistributionChannelUndefined: Self = StObject.set(x, "distributionChannel", js.undefined)
    
    inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setLastUpdatedTimestampMillis(value: String): Self = StObject.set(x, "lastUpdatedTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampMillisUndefined: Self = StObject.set(x, "lastUpdatedTimestampMillis", js.undefined)
    
    inline def setMinAndroidSdkVersion(value: Double): Self = StObject.set(x, "minAndroidSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setMinAndroidSdkVersionUndefined: Self = StObject.set(x, "minAndroidSdkVersion", js.undefined)
    
    inline def setPermissions(value: js.Array[ProductPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: ProductPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductPricing(value: String): Self = StObject.set(x, "productPricing", value.asInstanceOf[js.Any])
    
    inline def setProductPricingUndefined: Self = StObject.set(x, "productPricing", js.undefined)
    
    inline def setRecentChanges(value: String): Self = StObject.set(x, "recentChanges", value.asInstanceOf[js.Any])
    
    inline def setRecentChangesUndefined: Self = StObject.set(x, "recentChanges", js.undefined)
    
    inline def setRequiresContainerApp(value: Boolean): Self = StObject.set(x, "requiresContainerApp", value.asInstanceOf[js.Any])
    
    inline def setRequiresContainerAppUndefined: Self = StObject.set(x, "requiresContainerApp", js.undefined)
    
    inline def setScreenshotUrls(value: js.Array[String]): Self = StObject.set(x, "screenshotUrls", value.asInstanceOf[js.Any])
    
    inline def setScreenshotUrlsUndefined: Self = StObject.set(x, "screenshotUrls", js.undefined)
    
    inline def setScreenshotUrlsVarargs(value: String*): Self = StObject.set(x, "screenshotUrls", js.Array(value*))
    
    inline def setSigningCertificate(value: ProductSigningCertificate): Self = StObject.set(x, "signingCertificate", value.asInstanceOf[js.Any])
    
    inline def setSigningCertificateUndefined: Self = StObject.set(x, "signingCertificate", js.undefined)
    
    inline def setSmallIconUrl(value: String): Self = StObject.set(x, "smallIconUrl", value.asInstanceOf[js.Any])
    
    inline def setSmallIconUrlUndefined: Self = StObject.set(x, "smallIconUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWorkDetailsUrl(value: String): Self = StObject.set(x, "workDetailsUrl", value.asInstanceOf[js.Any])
    
    inline def setWorkDetailsUrlUndefined: Self = StObject.set(x, "workDetailsUrl", js.undefined)
  }
}
