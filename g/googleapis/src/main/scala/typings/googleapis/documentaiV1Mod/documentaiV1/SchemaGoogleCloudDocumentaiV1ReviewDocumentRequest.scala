package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1ReviewDocumentRequest extends StObject {
  
  /**
    * The document schema of the human review task.
    */
  var documentSchema: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentSchema] = js.undefined
  
  /**
    * Whether the validation should be performed on the ad-hoc review request.
    */
  var enableSchemaValidation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An inline document proto.
    */
  var inlineDocument: js.UndefOr[SchemaGoogleCloudDocumentaiV1Document] = js.undefined
  
  /**
    * The priority of the human review task.
    */
  var priority: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1ReviewDocumentRequest {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1ReviewDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1ReviewDocumentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1ReviewDocumentRequest](x: Self) {
    
    inline def setDocumentSchema(value: SchemaGoogleCloudDocumentaiV1DocumentSchema): Self = StObject.set(x, "documentSchema", value.asInstanceOf[js.Any])
    
    inline def setDocumentSchemaUndefined: Self = StObject.set(x, "documentSchema", js.undefined)
    
    inline def setEnableSchemaValidation(value: Boolean): Self = StObject.set(x, "enableSchemaValidation", value.asInstanceOf[js.Any])
    
    inline def setEnableSchemaValidationNull: Self = StObject.set(x, "enableSchemaValidation", null)
    
    inline def setEnableSchemaValidationUndefined: Self = StObject.set(x, "enableSchemaValidation", js.undefined)
    
    inline def setInlineDocument(value: SchemaGoogleCloudDocumentaiV1Document): Self = StObject.set(x, "inlineDocument", value.asInstanceOf[js.Any])
    
    inline def setInlineDocumentUndefined: Self = StObject.set(x, "inlineDocument", js.undefined)
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
