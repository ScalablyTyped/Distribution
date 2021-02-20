package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for App Access Collections Resource object in Directory API.
  */
@js.native
trait SchemaAppAccessCollections extends StObject {
  
  /**
    * List of blocked api access buckets.
    */
  var blockedApiAccessBuckets: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Boolean to indicate whether to enforce app access settings on Android
    * Drive or not.
    */
  var enforceSettingsForAndroidDrive: js.UndefOr[Boolean] = js.native
  
  /**
    * Error message provided by the Admin that will be shown to the user when
    * an app is blocked.
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Identifies the resource as an app access collection. Value:
    * admin#directory#appaccesscollection
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Unique ID of app access collection. (Readonly)
    */
  var resourceId: js.UndefOr[String] = js.native
  
  /**
    * Resource name given by the customer while creating/updating. Should be
    * unique under given customer.
    */
  var resourceName: js.UndefOr[String] = js.native
  
  /**
    * Boolean that indicates whether to trust domain owned apps.
    */
  var trustDomainOwnedApps: js.UndefOr[Boolean] = js.native
}
object SchemaAppAccessCollections {
  
  @scala.inline
  def apply(): SchemaAppAccessCollections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppAccessCollections]
  }
  
  @scala.inline
  implicit class SchemaAppAccessCollectionsMutableBuilder[Self <: SchemaAppAccessCollections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockedApiAccessBuckets(value: js.Array[String]): Self = StObject.set(x, "blockedApiAccessBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedApiAccessBucketsUndefined: Self = StObject.set(x, "blockedApiAccessBuckets", js.undefined)
    
    @scala.inline
    def setBlockedApiAccessBucketsVarargs(value: String*): Self = StObject.set(x, "blockedApiAccessBuckets", js.Array(value :_*))
    
    @scala.inline
    def setEnforceSettingsForAndroidDrive(value: Boolean): Self = StObject.set(x, "enforceSettingsForAndroidDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceSettingsForAndroidDriveUndefined: Self = StObject.set(x, "enforceSettingsForAndroidDrive", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setTrustDomainOwnedApps(value: Boolean): Self = StObject.set(x, "trustDomainOwnedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustDomainOwnedAppsUndefined: Self = StObject.set(x, "trustDomainOwnedApps", js.undefined)
  }
}
