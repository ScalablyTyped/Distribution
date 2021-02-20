package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAssetRequest extends StObject {
  
  /** Required. The filename of the asset, including the file extension. The filename must be UTF-8 encoded with a maximum size of 240 bytes. */
  var filename: js.UndefOr[String] = js.native
}
object CreateAssetRequest {
  
  @scala.inline
  def apply(): CreateAssetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssetRequest]
  }
  
  @scala.inline
  implicit class CreateAssetRequestMutableBuilder[Self <: CreateAssetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
  }
}
