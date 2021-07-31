package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateDownloadUrlResponse extends StObject {
  
  /** The generated Google Cloud Storage signed URL that should be used for function source code download. */
  var downloadUrl: js.UndefOr[String] = js.undefined
}
object GenerateDownloadUrlResponse {
  
  @scala.inline
  def apply(): GenerateDownloadUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDownloadUrlResponse]
  }
  
  @scala.inline
  implicit class GenerateDownloadUrlResponseMutableBuilder[Self <: GenerateDownloadUrlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
  }
}
