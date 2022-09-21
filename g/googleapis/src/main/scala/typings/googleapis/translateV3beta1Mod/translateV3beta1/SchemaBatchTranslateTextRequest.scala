package typings.googleapis.translateV3beta1Mod.translateV3beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchTranslateTextRequest extends StObject {
  
  /**
    * Optional. Glossaries to be applied for translation. It's keyed by target language code.
    */
  var glossaries: js.UndefOr[StringDictionary[SchemaTranslateTextGlossaryConfig] | Null] = js.undefined
  
  /**
    * Required. Input configurations. The total number of files matched should be <= 100. The total content size should be <= 100M Unicode codepoints. The files must use UTF-8 encoding.
    */
  var inputConfigs: js.UndefOr[js.Array[SchemaInputConfig]] = js.undefined
  
  /**
    * Optional. The labels with user-defined metadata for the request. Label keys and values can be no longer than 63 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter. See https://cloud.google.com/translate/docs/labels for more information.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. The models to use for translation. Map's key is target language code. Map's value is model name. Value can be a built-in general model, or an AutoML Translation model. The value format depends on model type: - AutoML Translation models: `projects/{project-number-or-id\}/locations/{location-id\}/models/{model-id\}` - General (built-in) models: `projects/{project-number-or-id\}/locations/{location-id\}/models/general/nmt`, If the map is empty or a specific model is not requested for a language pair, then default google model (nmt) is used.
    */
  var models: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. Output configuration. If 2 input configs match to the same file (that is, same input path), we don't generate output for duplicate inputs.
    */
  var outputConfig: js.UndefOr[SchemaOutputConfig] = js.undefined
  
  /**
    * Required. Source language code.
    */
  var sourceLanguageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Specify up to 10 language codes here.
    */
  var targetLanguageCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBatchTranslateTextRequest {
  
  inline def apply(): SchemaBatchTranslateTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchTranslateTextRequest]
  }
  
  extension [Self <: SchemaBatchTranslateTextRequest](x: Self) {
    
    inline def setGlossaries(value: StringDictionary[SchemaTranslateTextGlossaryConfig]): Self = StObject.set(x, "glossaries", value.asInstanceOf[js.Any])
    
    inline def setGlossariesNull: Self = StObject.set(x, "glossaries", null)
    
    inline def setGlossariesUndefined: Self = StObject.set(x, "glossaries", js.undefined)
    
    inline def setInputConfigs(value: js.Array[SchemaInputConfig]): Self = StObject.set(x, "inputConfigs", value.asInstanceOf[js.Any])
    
    inline def setInputConfigsUndefined: Self = StObject.set(x, "inputConfigs", js.undefined)
    
    inline def setInputConfigsVarargs(value: SchemaInputConfig*): Self = StObject.set(x, "inputConfigs", js.Array(value*))
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setModels(value: StringDictionary[String]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsNull: Self = StObject.set(x, "models", null)
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    inline def setOutputConfig(value: SchemaOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    inline def setSourceLanguageCode(value: String): Self = StObject.set(x, "sourceLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setSourceLanguageCodeNull: Self = StObject.set(x, "sourceLanguageCode", null)
    
    inline def setSourceLanguageCodeUndefined: Self = StObject.set(x, "sourceLanguageCode", js.undefined)
    
    inline def setTargetLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "targetLanguageCodes", value.asInstanceOf[js.Any])
    
    inline def setTargetLanguageCodesNull: Self = StObject.set(x, "targetLanguageCodes", null)
    
    inline def setTargetLanguageCodesUndefined: Self = StObject.set(x, "targetLanguageCodes", js.undefined)
    
    inline def setTargetLanguageCodesVarargs(value: String*): Self = StObject.set(x, "targetLanguageCodes", js.Array(value*))
  }
}
