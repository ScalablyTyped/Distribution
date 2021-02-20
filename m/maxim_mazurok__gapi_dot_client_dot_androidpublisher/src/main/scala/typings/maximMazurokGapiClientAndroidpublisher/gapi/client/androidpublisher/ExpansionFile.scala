package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpansionFile extends StObject {
  
  /**
    * If set, this field indicates that this APK has an expansion file uploaded to it: this APK does not reference another APK's expansion file. The field's value is the size of the
    * uploaded expansion file in bytes.
    */
  var fileSize: js.UndefOr[String] = js.native
  
  /** If set, this APK's expansion file references another APK's expansion file. The file_size field will not be set. */
  var referencesVersion: js.UndefOr[Double] = js.native
}
object ExpansionFile {
  
  @scala.inline
  def apply(): ExpansionFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionFile]
  }
  
  @scala.inline
  implicit class ExpansionFileMutableBuilder[Self <: ExpansionFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    @scala.inline
    def setReferencesVersion(value: Double): Self = StObject.set(x, "referencesVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesVersionUndefined: Self = StObject.set(x, "referencesVersion", js.undefined)
  }
}
