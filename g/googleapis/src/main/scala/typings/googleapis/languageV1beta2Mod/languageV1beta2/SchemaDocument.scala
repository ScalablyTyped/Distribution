package typings.googleapis.languageV1beta2Mod.languageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDocument extends StObject {
  
  /**
    * Indicates how detected boilerplate(e.g. advertisements, copyright declarations, banners) should be handled for this document. If not specified, boilerplate will be treated the same as content.
    */
  var boilerplateHandling: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The content of the input in string format. Cloud audit logging exempt since it is based on user data.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Google Cloud Storage URI where the file content is located. This URI must be of the form: gs://bucket_name/object_name. For more details, see https://cloud.google.com/storage/docs/reference-uris. NOTE: Cloud Storage object versioning is not supported.
    */
  var gcsContentUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The language of the document (if not specified, the language is automatically detected). Both ISO and BCP-47 language codes are accepted. [Language Support](https://cloud.google.com/natural-language/docs/languages) lists currently supported languages for each API method. If the language (either specified by the caller or automatically detected) is not supported by the called API method, an `INVALID_ARGUMENT` error is returned.
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The web URI where the document comes from. This URI is not used for fetching the content, but as a hint for analyzing the document.
    */
  var referenceWebUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. If the type is not set or is `TYPE_UNSPECIFIED`, returns an `INVALID_ARGUMENT` error.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaDocument {
  
  inline def apply(): SchemaDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocument]
  }
  
  extension [Self <: SchemaDocument](x: Self) {
    
    inline def setBoilerplateHandling(value: String): Self = StObject.set(x, "boilerplateHandling", value.asInstanceOf[js.Any])
    
    inline def setBoilerplateHandlingNull: Self = StObject.set(x, "boilerplateHandling", null)
    
    inline def setBoilerplateHandlingUndefined: Self = StObject.set(x, "boilerplateHandling", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setGcsContentUri(value: String): Self = StObject.set(x, "gcsContentUri", value.asInstanceOf[js.Any])
    
    inline def setGcsContentUriNull: Self = StObject.set(x, "gcsContentUri", null)
    
    inline def setGcsContentUriUndefined: Self = StObject.set(x, "gcsContentUri", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setReferenceWebUri(value: String): Self = StObject.set(x, "referenceWebUri", value.asInstanceOf[js.Any])
    
    inline def setReferenceWebUriNull: Self = StObject.set(x, "referenceWebUri", null)
    
    inline def setReferenceWebUriUndefined: Self = StObject.set(x, "referenceWebUri", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
