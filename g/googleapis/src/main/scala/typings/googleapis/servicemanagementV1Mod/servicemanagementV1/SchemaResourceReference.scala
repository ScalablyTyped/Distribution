package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceReference extends StObject {
  
  /**
    * The resource type of a child collection that the annotated field references. This is useful for annotating the `parent` field that doesn't have a fixed resource type. Example: message ListLogEntriesRequest { string parent = 1 [(google.api.resource_reference) = { child_type: "logging.googleapis.com/LogEntry" \}; \}
    */
  var childType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource type that the annotated field references. Example: message Subscription { string topic = 2 [(google.api.resource_reference) = { type: "pubsub.googleapis.com/Topic" \}]; \} Occasionally, a field may reference an arbitrary resource. In this case, APIs use the special value * in their resource reference. Example: message GetIamPolicyRequest { string resource = 2 [(google.api.resource_reference) = { type: "*" \}]; \}
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceReference {
  
  inline def apply(): SchemaResourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceReference]
  }
  
  extension [Self <: SchemaResourceReference](x: Self) {
    
    inline def setChildType(value: String): Self = StObject.set(x, "childType", value.asInstanceOf[js.Any])
    
    inline def setChildTypeNull: Self = StObject.set(x, "childType", null)
    
    inline def setChildTypeUndefined: Self = StObject.set(x, "childType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
