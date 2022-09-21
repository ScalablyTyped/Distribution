package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDetectLanguageRequest extends StObject {
  
  /**
    * The content of the input stored as a string.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The labels with user-defined metadata for the request. Label keys and values can be no longer than 63 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter. See https://cloud.google.com/translate/docs/advanced/labels for more information.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. The format of the source text, for example, "text/html", "text/plain". If left blank, the MIME type defaults to "text/html".
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The language detection model to be used. Format: `projects/{project-number-or-id\}/locations/{location-id\}/models/language-detection/{model-id\}` Only one language detection model is currently supported: `projects/{project-number-or-id\}/locations/{location-id\}/models/language-detection/default`. If not specified, the default model is used.
    */
  var model: js.UndefOr[String | Null] = js.undefined
}
object SchemaDetectLanguageRequest {
  
  inline def apply(): SchemaDetectLanguageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectLanguageRequest]
  }
  
  extension [Self <: SchemaDetectLanguageRequest](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
