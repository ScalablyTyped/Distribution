package typings.googleapis.languageV1beta1Mod.languageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ################################################################ #
  * Represents the input to API methods.
  */
trait SchemaDocument extends StObject {
  
  /**
    * The content of the input in string format. Cloud audit logging exempt
    * since it is based on user data.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The Google Cloud Storage URI where the file content is located. This URI
    * must be of the form: gs://bucket_name/object_name. For more details, see
    * https://cloud.google.com/storage/docs/reference-uris. NOTE: Cloud Storage
    * object versioning is not supported.
    */
  var gcsContentUri: js.UndefOr[String] = js.undefined
  
  /**
    * The language of the document (if not specified, the language is
    * automatically detected). Both ISO and BCP-47 language codes are
    * accepted.&lt;br&gt; [Language Support](/natural-language/docs/languages)
    * lists currently supported languages for each API method. If the language
    * (either specified by the caller or automatically detected) is not
    * supported by the called API method, an `INVALID_ARGUMENT` error is
    * returned.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Required. If the type is not set or is `TYPE_UNSPECIFIED`, returns an
    * `INVALID_ARGUMENT` error.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaDocument {
  
  @scala.inline
  def apply(): SchemaDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocument]
  }
  
  @scala.inline
  implicit class SchemaDocumentMutableBuilder[Self <: SchemaDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setGcsContentUri(value: String): Self = StObject.set(x, "gcsContentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsContentUriUndefined: Self = StObject.set(x, "gcsContentUri", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
