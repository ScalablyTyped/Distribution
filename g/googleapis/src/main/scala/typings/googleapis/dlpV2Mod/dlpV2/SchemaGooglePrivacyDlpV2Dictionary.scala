package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Dictionary extends StObject {
  
  /**
    * Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
    */
  var cloudStoragePath: js.UndefOr[SchemaGooglePrivacyDlpV2CloudStoragePath] = js.undefined
  
  /**
    * List of words or phrases to search for.
    */
  var wordList: js.UndefOr[SchemaGooglePrivacyDlpV2WordList] = js.undefined
}
object SchemaGooglePrivacyDlpV2Dictionary {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Dictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Dictionary]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Dictionary](x: Self) {
    
    inline def setCloudStoragePath(value: SchemaGooglePrivacyDlpV2CloudStoragePath): Self = StObject.set(x, "cloudStoragePath", value.asInstanceOf[js.Any])
    
    inline def setCloudStoragePathUndefined: Self = StObject.set(x, "cloudStoragePath", js.undefined)
    
    inline def setWordList(value: SchemaGooglePrivacyDlpV2WordList): Self = StObject.set(x, "wordList", value.asInstanceOf[js.Any])
    
    inline def setWordListUndefined: Self = StObject.set(x, "wordList", js.undefined)
  }
}
