package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing a set of files in Cloud Storage.
  */
trait SchemaGooglePrivacyDlpV2CloudStorageFileSet extends StObject {
  
  /**
    * The url, in the format `gs://&lt;bucket&gt;/&lt;path&gt;`. Trailing
    * wildcard in the path is allowed.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2CloudStorageFileSet {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CloudStorageFileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStorageFileSet]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CloudStorageFileSetMutableBuilder[Self <: SchemaGooglePrivacyDlpV2CloudStorageFileSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
