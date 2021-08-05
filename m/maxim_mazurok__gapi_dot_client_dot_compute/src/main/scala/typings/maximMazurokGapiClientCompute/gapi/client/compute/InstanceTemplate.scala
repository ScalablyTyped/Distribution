package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTemplate extends StObject {
  
  /** [Output Only] The creation timestamp for this instance template in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** [Output Only] A unique identifier for this instance template. The server defines this identifier. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The resource type, which is always compute#instanceTemplate for instance templates. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The instance properties for this instance template. */
  var properties: js.UndefOr[InstanceProperties] = js.undefined
  
  /** [Output Only] The URL for this instance template. The server defines this URL. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The source instance used to create the template. You can provide this as a partial or full URL to the resource. For example, the following are valid values:
    * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance
    * - projects/project/zones/zone/instances/instance
    */
  var sourceInstance: js.UndefOr[String] = js.undefined
  
  /** The source instance params to use to create this instance template. */
  var sourceInstanceParams: js.UndefOr[SourceInstanceParams] = js.undefined
}
object InstanceTemplate {
  
  inline def apply(): InstanceTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTemplate]
  }
  
  extension [Self <: InstanceTemplate](x: Self) {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProperties(value: InstanceProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSourceInstance(value: String): Self = StObject.set(x, "sourceInstance", value.asInstanceOf[js.Any])
    
    inline def setSourceInstanceParams(value: SourceInstanceParams): Self = StObject.set(x, "sourceInstanceParams", value.asInstanceOf[js.Any])
    
    inline def setSourceInstanceParamsUndefined: Self = StObject.set(x, "sourceInstanceParams", js.undefined)
    
    inline def setSourceInstanceUndefined: Self = StObject.set(x, "sourceInstance", js.undefined)
  }
}
