package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /** A unique id representing this image. */
  var id: js.UndefOr[String] = js.undefined
  
  /** A sha1 hash of the image. */
  var sha1: js.UndefOr[String] = js.undefined
  
  /** A sha256 hash of the image. */
  var sha256: js.UndefOr[String] = js.undefined
  
  /** A URL that will serve a preview of the image. */
  var url: js.UndefOr[String] = js.undefined
}
object Image {
  
  @scala.inline
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
