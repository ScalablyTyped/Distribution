package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceMeshAnalysisMessage extends StObject {
  
  /**
    * A UI can combine these args with a template (based on message_base.type) to produce an internationalized message.
    */
  var args: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * A human readable description of what the error means. It is suitable for non-internationalize display purposes.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details common to all types of Istio and ServiceMesh analysis messages.
    */
  var messageBase: js.UndefOr[SchemaServiceMeshAnalysisMessageBase] = js.undefined
  
  /**
    * A list of strings specifying the resource identifiers that were the cause of message generation. A "path" here may be: * MEMBERSHIP_ID if the cause is a specific member cluster * MEMBERSHIP_ID/(NAMESPACE\/)?RESOURCETYPE/NAME if the cause is a resource in a cluster
    */
  var resourcePaths: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaServiceMeshAnalysisMessage {
  
  inline def apply(): SchemaServiceMeshAnalysisMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceMeshAnalysisMessage]
  }
  
  extension [Self <: SchemaServiceMeshAnalysisMessage](x: Self) {
    
    inline def setArgs(value: StringDictionary[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMessageBase(value: SchemaServiceMeshAnalysisMessageBase): Self = StObject.set(x, "messageBase", value.asInstanceOf[js.Any])
    
    inline def setMessageBaseUndefined: Self = StObject.set(x, "messageBase", js.undefined)
    
    inline def setResourcePaths(value: js.Array[String]): Self = StObject.set(x, "resourcePaths", value.asInstanceOf[js.Any])
    
    inline def setResourcePathsNull: Self = StObject.set(x, "resourcePaths", null)
    
    inline def setResourcePathsUndefined: Self = StObject.set(x, "resourcePaths", js.undefined)
    
    inline def setResourcePathsVarargs(value: String*): Self = StObject.set(x, "resourcePaths", js.Array(value*))
  }
}
