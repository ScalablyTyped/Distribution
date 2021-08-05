package typings.googleapis.translateV2Mod.translateV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTranslationsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The customization id for translate
    */
  var cid: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The format of the source text, in either HTML (default) or plain-text. A
    * value of "html" indicates HTML and a value of "text" indicates
    * plain-text.
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
object ParamsResourceTranslationsList {
  
  inline def apply(): ParamsResourceTranslationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTranslationsList]
  }
  
  extension [Self <: ParamsResourceTranslationsList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCid(value: js.Array[String]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
    
    inline def setCidVarargs(value: String*): Self = StObject.set(x, "cid", js.Array(value :_*))
    
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
