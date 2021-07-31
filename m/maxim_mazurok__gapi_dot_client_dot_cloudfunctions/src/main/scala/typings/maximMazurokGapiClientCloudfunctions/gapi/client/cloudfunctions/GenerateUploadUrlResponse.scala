package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateUploadUrlResponse extends StObject {
  
  /** The generated Google Cloud Storage signed URL that should be used for a function source code upload. The uploaded file should be a zip archive which contains a function. */
  var uploadUrl: js.UndefOr[String] = js.undefined
}
object GenerateUploadUrlResponse {
  
  @scala.inline
  def apply(): GenerateUploadUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateUploadUrlResponse]
  }
  
  @scala.inline
  implicit class GenerateUploadUrlResponseMutableBuilder[Self <: GenerateUploadUrlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
