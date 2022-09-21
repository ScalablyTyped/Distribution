package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceMeshAnalysisMessageBase extends StObject {
  
  /**
    * A url pointing to the Service Mesh or Istio documentation for this specific error type.
    */
  var documentationUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Represents how severe a message is.
    */
  var level: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Represents the specific type of a message.
    */
  var `type`: js.UndefOr[SchemaServiceMeshType] = js.undefined
}
object SchemaServiceMeshAnalysisMessageBase {
  
  inline def apply(): SchemaServiceMeshAnalysisMessageBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceMeshAnalysisMessageBase]
  }
  
  extension [Self <: SchemaServiceMeshAnalysisMessageBase](x: Self) {
    
    inline def setDocumentationUrl(value: String): Self = StObject.set(x, "documentationUrl", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUrlNull: Self = StObject.set(x, "documentationUrl", null)
    
    inline def setDocumentationUrlUndefined: Self = StObject.set(x, "documentationUrl", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelNull: Self = StObject.set(x, "level", null)
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setType(value: SchemaServiceMeshType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
