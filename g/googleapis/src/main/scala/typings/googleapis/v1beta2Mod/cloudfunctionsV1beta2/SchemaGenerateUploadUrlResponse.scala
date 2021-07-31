package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of `GenerateUploadUrl` method.
  */
trait SchemaGenerateUploadUrlResponse extends StObject {
  
  /**
    * The generated Google Cloud Storage signed URL that should be used for a
    * function source code upload. The uploaded file should be a zip archive
    * which contains a function.
    */
  var uploadUrl: js.UndefOr[String] = js.undefined
}
object SchemaGenerateUploadUrlResponse {
  
  @scala.inline
  def apply(): SchemaGenerateUploadUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateUploadUrlResponse]
  }
  
  @scala.inline
  implicit class SchemaGenerateUploadUrlResponseMutableBuilder[Self <: SchemaGenerateUploadUrlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
