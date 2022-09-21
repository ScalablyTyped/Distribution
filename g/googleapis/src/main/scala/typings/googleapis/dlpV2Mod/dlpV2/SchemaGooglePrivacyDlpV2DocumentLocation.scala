package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2DocumentLocation extends StObject {
  
  /**
    * Offset of the line, from the beginning of the file, where the finding is located.
    */
  var fileOffset: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2DocumentLocation {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DocumentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DocumentLocation]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DocumentLocation](x: Self) {
    
    inline def setFileOffset(value: String): Self = StObject.set(x, "fileOffset", value.asInstanceOf[js.Any])
    
    inline def setFileOffsetNull: Self = StObject.set(x, "fileOffset", null)
    
    inline def setFileOffsetUndefined: Self = StObject.set(x, "fileOffset", js.undefined)
  }
}
