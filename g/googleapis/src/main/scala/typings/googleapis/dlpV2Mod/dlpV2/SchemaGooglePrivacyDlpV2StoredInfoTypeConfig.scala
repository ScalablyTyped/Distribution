package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for a StoredInfoType.
  */
@js.native
trait SchemaGooglePrivacyDlpV2StoredInfoTypeConfig extends StObject {
  
  /**
    * Description of the StoredInfoType (max 256 characters).
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Display name of the StoredInfoType (max 256 characters).
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * StoredInfoType where findings are defined by a dictionary of phrases.
    */
  var largeCustomDictionary: js.UndefOr[SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig] = js.native
}
object SchemaGooglePrivacyDlpV2StoredInfoTypeConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2StoredInfoTypeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredInfoTypeConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2StoredInfoTypeConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2StoredInfoTypeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLargeCustomDictionary(value: SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig): Self = StObject.set(x, "largeCustomDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeCustomDictionaryUndefined: Self = StObject.set(x, "largeCustomDictionary", js.undefined)
  }
}
