package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application extends StObject {
  
  /** Google Apps authentication domain that controls which users can access this application.Defaults to open access for any Google Account. */
  var authDomain: js.UndefOr[String] = js.undefined
  
  /**
    * Google Cloud Storage bucket that can be used for storing files associated with this application. This bucket is associated with the application and can be used by the gcloud
    * deployment commands.@OutputOnly
    */
  var codeBucket: js.UndefOr[String] = js.undefined
  
  /** The type of the Cloud Firestore or Cloud Datastore database associated with this application. */
  var databaseType: js.UndefOr[String] = js.undefined
  
  /** Google Cloud Storage bucket that can be used by this application to store content.@OutputOnly */
  var defaultBucket: js.UndefOr[String] = js.undefined
  
  /** Cookie expiration policy for this application. */
  var defaultCookieExpiration: js.UndefOr[String] = js.undefined
  
  /** Hostname used to reach this application, as resolved by App Engine.@OutputOnly */
  var defaultHostname: js.UndefOr[String] = js.undefined
  
  /** HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported. */
  var dispatchRules: js.UndefOr[js.Array[UrlDispatchRule]] = js.undefined
  
  /** The feature specific settings to be used in the application. */
  var featureSettings: js.UndefOr[FeatureSettings] = js.undefined
  
  /** The Google Container Registry domain used for storing managed build docker images for this application. */
  var gcrDomain: js.UndefOr[String] = js.undefined
  
  var iap: js.UndefOr[IdentityAwareProxy] = js.undefined
  
  /**
    * Identifier of the Application resource. This identifier is equivalent to the project ID of the Google Cloud Platform project where you want to deploy your application. Example:
    * myapp.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Location from which this application runs. Application instances run out of the data centers in the specified location, which is also where all of the application's end user content
    * is stored.Defaults to us-central.View the list of supported locations (https://cloud.google.com/appengine/docs/locations).
    */
  var locationId: js.UndefOr[String] = js.undefined
  
  /** Full path to the Application resource in the API. Example: apps/myapp.@OutputOnly */
  var name: js.UndefOr[String] = js.undefined
  
  /** Serving status of this application. */
  var servingStatus: js.UndefOr[String] = js.undefined
}
object Application {
  
  inline def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  extension [Self <: Application](x: Self) {
    
    inline def setAuthDomain(value: String): Self = StObject.set(x, "authDomain", value.asInstanceOf[js.Any])
    
    inline def setAuthDomainUndefined: Self = StObject.set(x, "authDomain", js.undefined)
    
    inline def setCodeBucket(value: String): Self = StObject.set(x, "codeBucket", value.asInstanceOf[js.Any])
    
    inline def setCodeBucketUndefined: Self = StObject.set(x, "codeBucket", js.undefined)
    
    inline def setDatabaseType(value: String): Self = StObject.set(x, "databaseType", value.asInstanceOf[js.Any])
    
    inline def setDatabaseTypeUndefined: Self = StObject.set(x, "databaseType", js.undefined)
    
    inline def setDefaultBucket(value: String): Self = StObject.set(x, "defaultBucket", value.asInstanceOf[js.Any])
    
    inline def setDefaultBucketUndefined: Self = StObject.set(x, "defaultBucket", js.undefined)
    
    inline def setDefaultCookieExpiration(value: String): Self = StObject.set(x, "defaultCookieExpiration", value.asInstanceOf[js.Any])
    
    inline def setDefaultCookieExpirationUndefined: Self = StObject.set(x, "defaultCookieExpiration", js.undefined)
    
    inline def setDefaultHostname(value: String): Self = StObject.set(x, "defaultHostname", value.asInstanceOf[js.Any])
    
    inline def setDefaultHostnameUndefined: Self = StObject.set(x, "defaultHostname", js.undefined)
    
    inline def setDispatchRules(value: js.Array[UrlDispatchRule]): Self = StObject.set(x, "dispatchRules", value.asInstanceOf[js.Any])
    
    inline def setDispatchRulesUndefined: Self = StObject.set(x, "dispatchRules", js.undefined)
    
    inline def setDispatchRulesVarargs(value: UrlDispatchRule*): Self = StObject.set(x, "dispatchRules", js.Array(value :_*))
    
    inline def setFeatureSettings(value: FeatureSettings): Self = StObject.set(x, "featureSettings", value.asInstanceOf[js.Any])
    
    inline def setFeatureSettingsUndefined: Self = StObject.set(x, "featureSettings", js.undefined)
    
    inline def setGcrDomain(value: String): Self = StObject.set(x, "gcrDomain", value.asInstanceOf[js.Any])
    
    inline def setGcrDomainUndefined: Self = StObject.set(x, "gcrDomain", js.undefined)
    
    inline def setIap(value: IdentityAwareProxy): Self = StObject.set(x, "iap", value.asInstanceOf[js.Any])
    
    inline def setIapUndefined: Self = StObject.set(x, "iap", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServingStatus(value: String): Self = StObject.set(x, "servingStatus", value.asInstanceOf[js.Any])
    
    inline def setServingStatusUndefined: Self = StObject.set(x, "servingStatus", js.undefined)
  }
}
