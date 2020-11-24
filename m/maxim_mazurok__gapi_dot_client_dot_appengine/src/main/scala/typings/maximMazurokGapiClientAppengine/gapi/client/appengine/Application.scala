package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends js.Object {
  
  /** Google Apps authentication domain that controls which users can access this application.Defaults to open access for any Google Account. */
  var authDomain: js.UndefOr[String] = js.native
  
  /**
    * Google Cloud Storage bucket that can be used for storing files associated with this application. This bucket is associated with the application and can be used by the gcloud
    * deployment commands.@OutputOnly
    */
  var codeBucket: js.UndefOr[String] = js.native
  
  /** The type of the Cloud Firestore or Cloud Datastore database associated with this application. */
  var databaseType: js.UndefOr[String] = js.native
  
  /** Google Cloud Storage bucket that can be used by this application to store content.@OutputOnly */
  var defaultBucket: js.UndefOr[String] = js.native
  
  /** Cookie expiration policy for this application. */
  var defaultCookieExpiration: js.UndefOr[String] = js.native
  
  /** Hostname used to reach this application, as resolved by App Engine.@OutputOnly */
  var defaultHostname: js.UndefOr[String] = js.native
  
  /** HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported. */
  var dispatchRules: js.UndefOr[js.Array[UrlDispatchRule]] = js.native
  
  /** The feature specific settings to be used in the application. */
  var featureSettings: js.UndefOr[FeatureSettings] = js.native
  
  /** The Google Container Registry domain used for storing managed build docker images for this application. */
  var gcrDomain: js.UndefOr[String] = js.native
  
  var iap: js.UndefOr[IdentityAwareProxy] = js.native
  
  /**
    * Identifier of the Application resource. This identifier is equivalent to the project ID of the Google Cloud Platform project where you want to deploy your application. Example:
    * myapp.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Location from which this application runs. Application instances run out of the data centers in the specified location, which is also where all of the application's end user content
    * is stored.Defaults to us-central.View the list of supported locations (https://cloud.google.com/appengine/docs/locations).
    */
  var locationId: js.UndefOr[String] = js.native
  
  /** Full path to the Application resource in the API. Example: apps/myapp.@OutputOnly */
  var name: js.UndefOr[String] = js.native
  
  /** Serving status of this application. */
  var servingStatus: js.UndefOr[String] = js.native
}
object Application {
  
  @scala.inline
  def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthDomain(value: String): Self = this.set("authDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthDomain: Self = this.set("authDomain", js.undefined)
    
    @scala.inline
    def setCodeBucket(value: String): Self = this.set("codeBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeBucket: Self = this.set("codeBucket", js.undefined)
    
    @scala.inline
    def setDatabaseType(value: String): Self = this.set("databaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseType: Self = this.set("databaseType", js.undefined)
    
    @scala.inline
    def setDefaultBucket(value: String): Self = this.set("defaultBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBucket: Self = this.set("defaultBucket", js.undefined)
    
    @scala.inline
    def setDefaultCookieExpiration(value: String): Self = this.set("defaultCookieExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCookieExpiration: Self = this.set("defaultCookieExpiration", js.undefined)
    
    @scala.inline
    def setDefaultHostname(value: String): Self = this.set("defaultHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHostname: Self = this.set("defaultHostname", js.undefined)
    
    @scala.inline
    def setDispatchRulesVarargs(value: UrlDispatchRule*): Self = this.set("dispatchRules", js.Array(value :_*))
    
    @scala.inline
    def setDispatchRules(value: js.Array[UrlDispatchRule]): Self = this.set("dispatchRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDispatchRules: Self = this.set("dispatchRules", js.undefined)
    
    @scala.inline
    def setFeatureSettings(value: FeatureSettings): Self = this.set("featureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureSettings: Self = this.set("featureSettings", js.undefined)
    
    @scala.inline
    def setGcrDomain(value: String): Self = this.set("gcrDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcrDomain: Self = this.set("gcrDomain", js.undefined)
    
    @scala.inline
    def setIap(value: IdentityAwareProxy): Self = this.set("iap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIap: Self = this.set("iap", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setServingStatus(value: String): Self = this.set("servingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServingStatus: Self = this.set("servingStatus", js.undefined)
  }
}
