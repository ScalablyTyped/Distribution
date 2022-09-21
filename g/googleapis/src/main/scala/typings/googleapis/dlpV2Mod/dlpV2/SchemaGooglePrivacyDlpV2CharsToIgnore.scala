package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2CharsToIgnore extends StObject {
  
  /**
    * Characters to not transform when masking.
    */
  var charactersToSkip: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Common characters to not transform when masking. Useful to avoid removing punctuation.
    */
  var commonCharactersToIgnore: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2CharsToIgnore {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CharsToIgnore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CharsToIgnore]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CharsToIgnore](x: Self) {
    
    inline def setCharactersToSkip(value: String): Self = StObject.set(x, "charactersToSkip", value.asInstanceOf[js.Any])
    
    inline def setCharactersToSkipNull: Self = StObject.set(x, "charactersToSkip", null)
    
    inline def setCharactersToSkipUndefined: Self = StObject.set(x, "charactersToSkip", js.undefined)
    
    inline def setCommonCharactersToIgnore(value: String): Self = StObject.set(x, "commonCharactersToIgnore", value.asInstanceOf[js.Any])
    
    inline def setCommonCharactersToIgnoreNull: Self = StObject.set(x, "commonCharactersToIgnore", null)
    
    inline def setCommonCharactersToIgnoreUndefined: Self = StObject.set(x, "commonCharactersToIgnore", js.undefined)
  }
}
