package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeobfuscationFilesUploadResponse extends StObject {
  
  var deobfuscationFile: js.UndefOr[SchemaDeobfuscationFile] = js.undefined
}
object SchemaDeobfuscationFilesUploadResponse {
  
  @scala.inline
  def apply(): SchemaDeobfuscationFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeobfuscationFilesUploadResponse]
  }
  
  @scala.inline
  implicit class SchemaDeobfuscationFilesUploadResponseMutableBuilder[Self <: SchemaDeobfuscationFilesUploadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeobfuscationFile(value: SchemaDeobfuscationFile): Self = StObject.set(x, "deobfuscationFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeobfuscationFileUndefined: Self = StObject.set(x, "deobfuscationFile", js.undefined)
  }
}
