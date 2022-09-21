package typings.googleapis.translateV3beta1Mod.translateV3beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTranslateDocumentRequest extends StObject {
  
  /**
    * Required. Input configurations.
    */
  var documentInputConfig: js.UndefOr[SchemaDocumentInputConfig] = js.undefined
  
  /**
    * Optional. Output configurations. Defines if the output file should be stored within Cloud Storage as well as the desired output format. If not provided the translated file will only be returned through a byte-stream and its output mime type will be the same as the input file's mime type.
    */
  var documentOutputConfig: js.UndefOr[SchemaDocumentOutputConfig] = js.undefined
  
  /**
    * Optional. Glossary to be applied. The glossary must be within the same region (have the same location-id) as the model, otherwise an INVALID_ARGUMENT (400) error is returned.
    */
  var glossaryConfig: js.UndefOr[SchemaTranslateTextGlossaryConfig] = js.undefined
  
  /**
    * Optional. The labels with user-defined metadata for the request. Label keys and values can be no longer than 63 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter. See https://cloud.google.com/translate/docs/advanced/labels for more information.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. The `model` type requested for this translation. The format depends on model type: - AutoML Translation models: `projects/{project-number-or-id\}/locations/{location-id\}/models/{model-id\}` - General (built-in) models: `projects/{project-number-or-id\}/locations/{location-id\}/models/general/nmt`, If not provided, the default Google model (NMT) will be used for translation.
    */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The BCP-47 language code of the input document if known, for example, "en-US" or "sr-Latn". Supported language codes are listed in Language Support. If the source language isn't specified, the API attempts to identify the source language automatically and returns the source language within the response. Source language must be specified if the request contains a glossary or a custom model.
    */
  var sourceLanguageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The BCP-47 language code to use for translation of the input document, set to one of the language codes listed in Language Support.
    */
  var targetLanguageCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaTranslateDocumentRequest {
  
  inline def apply(): SchemaTranslateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranslateDocumentRequest]
  }
  
  extension [Self <: SchemaTranslateDocumentRequest](x: Self) {
    
    inline def setDocumentInputConfig(value: SchemaDocumentInputConfig): Self = StObject.set(x, "documentInputConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentInputConfigUndefined: Self = StObject.set(x, "documentInputConfig", js.undefined)
    
    inline def setDocumentOutputConfig(value: SchemaDocumentOutputConfig): Self = StObject.set(x, "documentOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentOutputConfigUndefined: Self = StObject.set(x, "documentOutputConfig", js.undefined)
    
    inline def setGlossaryConfig(value: SchemaTranslateTextGlossaryConfig): Self = StObject.set(x, "glossaryConfig", value.asInstanceOf[js.Any])
    
    inline def setGlossaryConfigUndefined: Self = StObject.set(x, "glossaryConfig", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setSourceLanguageCode(value: String): Self = StObject.set(x, "sourceLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setSourceLanguageCodeNull: Self = StObject.set(x, "sourceLanguageCode", null)
    
    inline def setSourceLanguageCodeUndefined: Self = StObject.set(x, "sourceLanguageCode", js.undefined)
    
    inline def setTargetLanguageCode(value: String): Self = StObject.set(x, "targetLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setTargetLanguageCodeNull: Self = StObject.set(x, "targetLanguageCode", null)
    
    inline def setTargetLanguageCodeUndefined: Self = StObject.set(x, "targetLanguageCode", js.undefined)
  }
}
