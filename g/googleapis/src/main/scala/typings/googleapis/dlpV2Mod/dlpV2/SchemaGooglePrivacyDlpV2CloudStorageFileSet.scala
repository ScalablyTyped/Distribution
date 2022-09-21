package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2CloudStorageFileSet extends StObject {
  
  /**
    * The url, in the format `gs:///`. Trailing wildcard in the path is allowed.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2CloudStorageFileSet {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CloudStorageFileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStorageFileSet]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CloudStorageFileSet](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
