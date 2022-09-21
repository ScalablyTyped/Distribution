package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2ReplaceDictionaryConfig extends StObject {
  
  /**
    * A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
    */
  var wordList: js.UndefOr[SchemaGooglePrivacyDlpV2WordList] = js.undefined
}
object SchemaGooglePrivacyDlpV2ReplaceDictionaryConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ReplaceDictionaryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ReplaceDictionaryConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ReplaceDictionaryConfig](x: Self) {
    
    inline def setWordList(value: SchemaGooglePrivacyDlpV2WordList): Self = StObject.set(x, "wordList", value.asInstanceOf[js.Any])
    
    inline def setWordListUndefined: Self = StObject.set(x, "wordList", js.undefined)
  }
}
