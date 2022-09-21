package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2StoredInfoTypeStats extends StObject {
  
  /**
    * StoredInfoType where findings are defined by a dictionary of phrases.
    */
  var largeCustomDictionary: js.UndefOr[SchemaGooglePrivacyDlpV2LargeCustomDictionaryStats] = js.undefined
}
object SchemaGooglePrivacyDlpV2StoredInfoTypeStats {
  
  inline def apply(): SchemaGooglePrivacyDlpV2StoredInfoTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredInfoTypeStats]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2StoredInfoTypeStats](x: Self) {
    
    inline def setLargeCustomDictionary(value: SchemaGooglePrivacyDlpV2LargeCustomDictionaryStats): Self = StObject.set(x, "largeCustomDictionary", value.asInstanceOf[js.Any])
    
    inline def setLargeCustomDictionaryUndefined: Self = StObject.set(x, "largeCustomDictionary", js.undefined)
  }
}
