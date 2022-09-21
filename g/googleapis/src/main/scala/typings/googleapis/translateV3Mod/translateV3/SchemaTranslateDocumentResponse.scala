package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTranslateDocumentResponse extends StObject {
  
  /**
    * Translated document.
    */
  var documentTranslation: js.UndefOr[SchemaDocumentTranslation] = js.undefined
  
  /**
    * The `glossary_config` used for this translation.
    */
  var glossaryConfig: js.UndefOr[SchemaTranslateTextGlossaryConfig] = js.undefined
  
  /**
    * The document's translation output if a glossary is provided in the request. This can be the same as [TranslateDocumentResponse.document_translation] if no glossary terms apply.
    */
  var glossaryDocumentTranslation: js.UndefOr[SchemaDocumentTranslation] = js.undefined
  
  /**
    * Only present when 'model' is present in the request. 'model' is normalized to have a project number. For example: If the 'model' field in TranslateDocumentRequest is: `projects/{project-id\}/locations/{location-id\}/models/general/nmt` then `model` here would be normalized to `projects/{project-number\}/locations/{location-id\}/models/general/nmt`.
    */
  var model: js.UndefOr[String | Null] = js.undefined
}
object SchemaTranslateDocumentResponse {
  
  inline def apply(): SchemaTranslateDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranslateDocumentResponse]
  }
  
  extension [Self <: SchemaTranslateDocumentResponse](x: Self) {
    
    inline def setDocumentTranslation(value: SchemaDocumentTranslation): Self = StObject.set(x, "documentTranslation", value.asInstanceOf[js.Any])
    
    inline def setDocumentTranslationUndefined: Self = StObject.set(x, "documentTranslation", js.undefined)
    
    inline def setGlossaryConfig(value: SchemaTranslateTextGlossaryConfig): Self = StObject.set(x, "glossaryConfig", value.asInstanceOf[js.Any])
    
    inline def setGlossaryConfigUndefined: Self = StObject.set(x, "glossaryConfig", js.undefined)
    
    inline def setGlossaryDocumentTranslation(value: SchemaDocumentTranslation): Self = StObject.set(x, "glossaryDocumentTranslation", value.asInstanceOf[js.Any])
    
    inline def setGlossaryDocumentTranslationUndefined: Self = StObject.set(x, "glossaryDocumentTranslation", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
