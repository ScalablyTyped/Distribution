package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for a StoredInfoType.
  */
trait SchemaGooglePrivacyDlpV2StoredInfoTypeConfig extends StObject {
  
  /**
    * Description of the StoredInfoType (max 256 characters).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Display name of the StoredInfoType (max 256 characters).
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * StoredInfoType where findings are defined by a dictionary of phrases.
    */
  var largeCustomDictionary: js.UndefOr[SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig] = js.undefined
}
object SchemaGooglePrivacyDlpV2StoredInfoTypeConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2StoredInfoTypeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredInfoTypeConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2StoredInfoTypeConfig](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLargeCustomDictionary(value: SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig): Self = StObject.set(x, "largeCustomDictionary", value.asInstanceOf[js.Any])
    
    inline def setLargeCustomDictionaryUndefined: Self = StObject.set(x, "largeCustomDictionary", js.undefined)
  }
}
