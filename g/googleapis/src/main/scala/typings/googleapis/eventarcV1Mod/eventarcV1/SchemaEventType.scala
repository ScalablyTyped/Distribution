package typings.googleapis.eventarcV1Mod.eventarcV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventType extends StObject {
  
  /**
    * Output only. Human friendly description of what the event type is about. For example "Bucket created in Cloud Storage".
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. URI for the event schema. For example "https://github.com/googleapis/google-cloudevents/blob/master/proto/google/events/cloud/storage/v1/events.proto"
    */
  var eventSchemaUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Filtering attributes for the event type.
    */
  var filteringAttributes: js.UndefOr[js.Array[SchemaFilteringAttribute]] = js.undefined
  
  /**
    * Output only. The full name of the event type (for example, "google.cloud.storage.object.v1.finalized"). In the form of {provider-specific-prefix\}.{resource\}.{version\}.{verb\}. Types MUST be versioned and event schemas are guaranteed to remain backward compatible within one version. Note that event type versions and API versions do not need to match.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaEventType {
  
  inline def apply(): SchemaEventType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventType]
  }
  
  extension [Self <: SchemaEventType](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEventSchemaUri(value: String): Self = StObject.set(x, "eventSchemaUri", value.asInstanceOf[js.Any])
    
    inline def setEventSchemaUriNull: Self = StObject.set(x, "eventSchemaUri", null)
    
    inline def setEventSchemaUriUndefined: Self = StObject.set(x, "eventSchemaUri", js.undefined)
    
    inline def setFilteringAttributes(value: js.Array[SchemaFilteringAttribute]): Self = StObject.set(x, "filteringAttributes", value.asInstanceOf[js.Any])
    
    inline def setFilteringAttributesUndefined: Self = StObject.set(x, "filteringAttributes", js.undefined)
    
    inline def setFilteringAttributesVarargs(value: SchemaFilteringAttribute*): Self = StObject.set(x, "filteringAttributes", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
