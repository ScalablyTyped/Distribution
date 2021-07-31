package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A BackendBucket resource. This resource defines a Cloud Storage bucket.
  */
trait SchemaBackendBucket extends StObject {
  
  /**
    * Cloud Storage bucket name.
    */
  var bucketName: js.UndefOr[String] = js.undefined
  
  /**
    * Cloud CDN configuration for this BackendBucket.
    */
  var cdnPolicy: js.UndefOr[SchemaBackendBucketCdnPolicy] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * An optional textual description of the resource; provided by the client
    * when the resource is created.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * If true, enable Cloud CDN for this BackendBucket.
    */
  var enableCdn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Output Only] Unique identifier for the resource; defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the resource.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaBackendBucket {
  
  @scala.inline
  def apply(): SchemaBackendBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendBucket]
  }
  
  @scala.inline
  implicit class SchemaBackendBucketMutableBuilder[Self <: SchemaBackendBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    @scala.inline
    def setCdnPolicy(value: SchemaBackendBucketCdnPolicy): Self = StObject.set(x, "cdnPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdnPolicyUndefined: Self = StObject.set(x, "cdnPolicy", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnableCdn(value: Boolean): Self = StObject.set(x, "enableCdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCdnUndefined: Self = StObject.set(x, "enableCdn", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
