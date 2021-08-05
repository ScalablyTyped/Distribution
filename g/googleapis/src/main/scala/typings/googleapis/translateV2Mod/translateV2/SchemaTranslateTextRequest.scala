package typings.googleapis.translateV2Mod.translateV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The main translation request message for the Cloud Translation API.
  */
trait SchemaTranslateTextRequest extends StObject {
  
  /**
    * The format of the source text, in either HTML (default) or plain-text. A
    * value of &quot;html&quot; indicates HTML and a value of &quot;text&quot;
    * indicates plain-text.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * The `model` type requested for this translation. Valid values are listed
    * in public documentation.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * The input text to translate. Repeat this parameter to perform translation
    * operations on multiple text inputs.
    */
  var q: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The language of the source text, set to one of the language codes listed
    * in Language Support. If the source language is not specified, the API
    * will attempt to identify the source language automatically and return it
    * within the response.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The language to use for translation of the input text, set to one of the
    * language codes listed in Language Support.
    */
  var target: js.UndefOr[String] = js.undefined
}
object SchemaTranslateTextRequest {
  
  inline def apply(): SchemaTranslateTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranslateTextRequest]
  }
  
  extension [Self <: SchemaTranslateTextRequest](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setQ(value: js.Array[String]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setQVarargs(value: String*): Self = StObject.set(x, "q", js.Array(value :_*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
