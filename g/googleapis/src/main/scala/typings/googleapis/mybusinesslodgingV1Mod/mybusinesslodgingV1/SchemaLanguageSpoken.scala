package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLanguageSpoken extends StObject {
  
  /**
    * Required. The BCP-47 language code for the spoken language. Currently accepted codes: ar, de, en, es, fil, fr, hi, id, it, ja, ko, nl, pt, ru, vi, yue, zh.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * At least one member of the staff can speak the language.
    */
  var spoken: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Spoken exception.
    */
  var spokenException: js.UndefOr[String | Null] = js.undefined
}
object SchemaLanguageSpoken {
  
  inline def apply(): SchemaLanguageSpoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguageSpoken]
  }
  
  extension [Self <: SchemaLanguageSpoken](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setSpoken(value: Boolean): Self = StObject.set(x, "spoken", value.asInstanceOf[js.Any])
    
    inline def setSpokenException(value: String): Self = StObject.set(x, "spokenException", value.asInstanceOf[js.Any])
    
    inline def setSpokenExceptionNull: Self = StObject.set(x, "spokenException", null)
    
    inline def setSpokenExceptionUndefined: Self = StObject.set(x, "spokenException", js.undefined)
    
    inline def setSpokenNull: Self = StObject.set(x, "spoken", null)
    
    inline def setSpokenUndefined: Self = StObject.set(x, "spoken", js.undefined)
  }
}
