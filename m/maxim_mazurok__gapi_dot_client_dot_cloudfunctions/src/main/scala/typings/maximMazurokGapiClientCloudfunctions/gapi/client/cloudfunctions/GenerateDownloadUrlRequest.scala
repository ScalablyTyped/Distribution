package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateDownloadUrlRequest extends StObject {
  
  /** The optional version of function. If not set, default, current version is used. */
  var versionId: js.UndefOr[String] = js.native
}
object GenerateDownloadUrlRequest {
  
  @scala.inline
  def apply(): GenerateDownloadUrlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDownloadUrlRequest]
  }
  
  @scala.inline
  implicit class GenerateDownloadUrlRequestMutableBuilder[Self <: GenerateDownloadUrlRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
