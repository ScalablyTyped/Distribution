package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendBucket extends StObject {
  
  /** Cloud Storage bucket name. */
  var bucketName: js.UndefOr[String] = js.undefined
  
  /** Cloud CDN configuration for this BackendBucket. */
  var cdnPolicy: js.UndefOr[BackendBucketCdnPolicy] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** Headers that the HTTP/S load balancer should add to proxied responses. */
  var customResponseHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  /** An optional textual description of the resource; provided by the client when the resource is created. */
  var description: js.UndefOr[String] = js.undefined
  
  /** If true, enable Cloud CDN for this BackendBucket. */
  var enableCdn: js.UndefOr[Boolean] = js.undefined
  
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Type of the resource. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
}
object BackendBucket {
  
  inline def apply(): BackendBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendBucket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackendBucket] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setCdnPolicy(value: BackendBucketCdnPolicy): Self = StObject.set(x, "cdnPolicy", value.asInstanceOf[js.Any])
    
    inline def setCdnPolicyUndefined: Self = StObject.set(x, "cdnPolicy", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setCustomResponseHeaders(value: js.Array[String]): Self = StObject.set(x, "customResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomResponseHeadersUndefined: Self = StObject.set(x, "customResponseHeaders", js.undefined)
    
    inline def setCustomResponseHeadersVarargs(value: String*): Self = StObject.set(x, "customResponseHeaders", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnableCdn(value: Boolean): Self = StObject.set(x, "enableCdn", value.asInstanceOf[js.Any])
    
    inline def setEnableCdnUndefined: Self = StObject.set(x, "enableCdn", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
