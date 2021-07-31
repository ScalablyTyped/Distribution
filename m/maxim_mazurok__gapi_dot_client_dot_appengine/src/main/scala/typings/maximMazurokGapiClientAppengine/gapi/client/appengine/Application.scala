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
  
  @scala.inline
  def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthDomain(value: String): Self = StObject.set(x, "authDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthDomainUndefined: Self = StObject.set(x, "authDomain", js.undefined)
    
    @scala.inline
    def setCodeBucket(value: String): Self = StObject.set(x, "codeBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeBucketUndefined: Self = StObject.set(x, "codeBucket", js.undefined)
    
    @scala.inline
    def setDatabaseType(value: String): Self = StObject.set(x, "databaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseTypeUndefined: Self = StObject.set(x, "databaseType", js.undefined)
    
    @scala.inline
    def setDefaultBucket(value: String): Self = StObject.set(x, "defaultBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBucketUndefined: Self = StObject.set(x, "defaultBucket", js.undefined)
    
    @scala.inline
    def setDefaultCookieExpiration(value: String): Self = StObject.set(x, "defaultCookieExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCookieExpirationUndefined: Self = StObject.set(x, "defaultCookieExpiration", js.undefined)
    
    @scala.inline
    def setDefaultHostname(value: String): Self = StObject.set(x, "defaultHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHostnameUndefined: Self = StObject.set(x, "defaultHostname", js.undefined)
    
    @scala.inline
    def setDispatchRules(value: js.Array[UrlDispatchRule]): Self = StObject.set(x, "dispatchRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispatchRulesUndefined: Self = StObject.set(x, "dispatchRules", js.undefined)
    
    @scala.inline
    def setDispatchRulesVarargs(value: UrlDispatchRule*): Self = StObject.set(x, "dispatchRules", js.Array(value :_*))
    
    @scala.inline
    def setFeatureSettings(value: FeatureSettings): Self = StObject.set(x, "featureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureSettingsUndefined: Self = StObject.set(x, "featureSettings", js.undefined)
    
    @scala.inline
    def setGcrDomain(value: String): Self = StObject.set(x, "gcrDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcrDomainUndefined: Self = StObject.set(x, "gcrDomain", js.undefined)
    
    @scala.inline
    def setIap(value: IdentityAwareProxy): Self = StObject.set(x, "iap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIapUndefined: Self = StObject.set(x, "iap", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setServingStatus(value: String): Self = StObject.set(x, "servingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServingStatusUndefined: Self = StObject.set(x, "servingStatus", js.undefined)
  }
}
