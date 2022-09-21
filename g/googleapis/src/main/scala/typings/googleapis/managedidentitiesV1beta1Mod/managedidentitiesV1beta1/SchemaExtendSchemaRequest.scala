package typings.googleapis.managedidentitiesV1beta1Mod.managedidentitiesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExtendSchemaRequest extends StObject {
  
  /**
    * Required. Description for Schema Change.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * File uploaded as a byte stream input.
    */
  var fileContents: js.UndefOr[String | Null] = js.undefined
  
  /**
    * File stored in Cloud Storage bucket and represented in the form projects/{project_id\}/buckets/{bucket_name\}/objects/{object_name\} File should be in the same project as the domain.
    */
  var gcsPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaExtendSchemaRequest {
  
  inline def apply(): SchemaExtendSchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendSchemaRequest]
  }
  
  extension [Self <: SchemaExtendSchemaRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFileContents(value: String): Self = StObject.set(x, "fileContents", value.asInstanceOf[js.Any])
    
    inline def setFileContentsNull: Self = StObject.set(x, "fileContents", null)
    
    inline def setFileContentsUndefined: Self = StObject.set(x, "fileContents", js.undefined)
    
    inline def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    inline def setGcsPathNull: Self = StObject.set(x, "gcsPath", null)
    
    inline def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
  }
}
