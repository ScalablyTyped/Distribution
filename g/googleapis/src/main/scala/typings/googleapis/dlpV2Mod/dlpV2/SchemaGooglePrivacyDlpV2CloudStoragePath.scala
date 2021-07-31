package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing a single file or path in Cloud Storage.
  */
trait SchemaGooglePrivacyDlpV2CloudStoragePath extends StObject {
  
  /**
    * A url representing a file or path (no wildcards) in Cloud Storage.
    * Example: gs://[BUCKET_NAME]/dictionary.txt
    */
  var path: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2CloudStoragePath {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CloudStoragePath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStoragePath]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CloudStoragePathMutableBuilder[Self <: SchemaGooglePrivacyDlpV2CloudStoragePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
