package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendBucket extends StObject {
  
  /**
    * Cloud Storage bucket name.
    */
  var bucketName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cloud CDN configuration for this BackendBucket.
    */
  var cdnPolicy: js.UndefOr[SchemaBackendBucketCdnPolicy] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Headers that the HTTP/S load balancer should add to proxied responses.
    */
  var customResponseHeaders: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * An optional textual description of the resource; provided by the client when the resource is created.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The resource URL for the edge security policy associated with this backend bucket.
    */
  var edgeSecurityPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, enable Cloud CDN for this BackendBucket.
    */
  var enableCdn: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output Only] Unique identifier for the resource; defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the resource.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackendBucket {
  
  inline def apply(): SchemaBackendBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendBucket]
  }
  
  extension [Self <: SchemaBackendBucket](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameNull: Self = StObject.set(x, "bucketName", null)
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setCdnPolicy(value: SchemaBackendBucketCdnPolicy): Self = StObject.set(x, "cdnPolicy", value.asInstanceOf[js.Any])
    
    inline def setCdnPolicyUndefined: Self = StObject.set(x, "cdnPolicy", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setCustomResponseHeaders(value: js.Array[String]): Self = StObject.set(x, "customResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomResponseHeadersNull: Self = StObject.set(x, "customResponseHeaders", null)
    
    inline def setCustomResponseHeadersUndefined: Self = StObject.set(x, "customResponseHeaders", js.undefined)
    
    inline def setCustomResponseHeadersVarargs(value: String*): Self = StObject.set(x, "customResponseHeaders", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEdgeSecurityPolicy(value: String): Self = StObject.set(x, "edgeSecurityPolicy", value.asInstanceOf[js.Any])
    
    inline def setEdgeSecurityPolicyNull: Self = StObject.set(x, "edgeSecurityPolicy", null)
    
    inline def setEdgeSecurityPolicyUndefined: Self = StObject.set(x, "edgeSecurityPolicy", js.undefined)
    
    inline def setEnableCdn(value: Boolean): Self = StObject.set(x, "enableCdn", value.asInstanceOf[js.Any])
    
    inline def setEnableCdnNull: Self = StObject.set(x, "enableCdn", null)
    
    inline def setEnableCdnUndefined: Self = StObject.set(x, "enableCdn", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
