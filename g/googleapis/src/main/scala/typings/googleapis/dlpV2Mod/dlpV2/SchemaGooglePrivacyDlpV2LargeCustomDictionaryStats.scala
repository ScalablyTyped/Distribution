package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2LargeCustomDictionaryStats extends StObject {
  
  /**
    * Approximate number of distinct phrases in the dictionary.
    */
  var approxNumPhrases: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2LargeCustomDictionaryStats {
  
  inline def apply(): SchemaGooglePrivacyDlpV2LargeCustomDictionaryStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LargeCustomDictionaryStats]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2LargeCustomDictionaryStats](x: Self) {
    
    inline def setApproxNumPhrases(value: String): Self = StObject.set(x, "approxNumPhrases", value.asInstanceOf[js.Any])
    
    inline def setApproxNumPhrasesNull: Self = StObject.set(x, "approxNumPhrases", null)
    
    inline def setApproxNumPhrasesUndefined: Self = StObject.set(x, "approxNumPhrases", js.undefined)
  }
}
