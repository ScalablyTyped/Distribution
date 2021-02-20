package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends StObject {
  
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Number of bytes saved. Leave out this field if the information is not
    * available.
    */
  var compression: js.UndefOr[Double] = js.native
  
  /**
    * Encoding used for response text field e.g `base64`.
    *
    * Leave out this field if the text field is HTTP decoded
    * (decompressed & unchunked), than trans-coded from its original character
    * set into UTF-8.
    */
  var encoding: js.UndefOr[String] = js.native
  
  /**
    * MIME type of the response text (value of the Content-Type response
    * header).
    *
    * The charset attribute of the MIME type is included (if available).
    */
  var mimeType: String = js.native
  
  /**
    * Length of the returned content in bytes.
    *
    * Should be equal to `response.bodySize` if there is no compression and
    * bigger when the content has been compressed.
    */
  var size: Double = js.native
  
  /**
    * Response body sent from the server or loaded from the browser cache.
    *
    * This field is populated with textual content only.
    *
    * The text field is either HTTP decoded text or a encoded (e.g. `base64`)
    * representation of the response body.
    *
    * Leave out this field if the information is not available.
    */
  var text: js.UndefOr[String] = js.native
}
object Content {
  
  @scala.inline
  def apply(mimeType: String, size: Double): Content = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCompression(value: Double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
