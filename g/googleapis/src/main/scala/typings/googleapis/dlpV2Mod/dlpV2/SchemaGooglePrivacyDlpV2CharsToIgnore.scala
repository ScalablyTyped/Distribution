package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Characters to skip when doing deidentification of a value. These will be
  * left alone and skipped.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CharsToIgnore extends StObject {
  
  var charactersToSkip: js.UndefOr[String] = js.native
  
  var commonCharactersToIgnore: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2CharsToIgnore {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CharsToIgnore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CharsToIgnore]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CharsToIgnoreMutableBuilder[Self <: SchemaGooglePrivacyDlpV2CharsToIgnore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharactersToSkip(value: String): Self = StObject.set(x, "charactersToSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharactersToSkipUndefined: Self = StObject.set(x, "charactersToSkip", js.undefined)
    
    @scala.inline
    def setCommonCharactersToIgnore(value: String): Self = StObject.set(x, "commonCharactersToIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonCharactersToIgnoreUndefined: Self = StObject.set(x, "commonCharactersToIgnore", js.undefined)
  }
}
