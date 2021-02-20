package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagesUploadResponse extends StObject {
  
  /** The uploaded image. */
  var image: js.UndefOr[Image] = js.native
}
object ImagesUploadResponse {
  
  @scala.inline
  def apply(): ImagesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagesUploadResponse]
  }
  
  @scala.inline
  implicit class ImagesUploadResponseMutableBuilder[Self <: ImagesUploadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
