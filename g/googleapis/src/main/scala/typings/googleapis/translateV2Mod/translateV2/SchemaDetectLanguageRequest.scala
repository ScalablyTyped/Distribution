package typings.googleapis.translateV2Mod.translateV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for language detection.
  */
trait SchemaDetectLanguageRequest extends StObject {
  
  /**
    * The input text upon which to perform language detection. Repeat this
    * parameter to perform language detection on multiple text inputs.
    */
  var q: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaDetectLanguageRequest {
  
  @scala.inline
  def apply(): SchemaDetectLanguageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectLanguageRequest]
  }
  
  @scala.inline
  implicit class SchemaDetectLanguageRequestMutableBuilder[Self <: SchemaDetectLanguageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQ(value: js.Array[String]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setQVarargs(value: String*): Self = StObject.set(x, "q", js.Array(value :_*))
  }
}
