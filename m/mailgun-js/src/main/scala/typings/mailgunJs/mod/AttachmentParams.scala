package typings.mailgunJs.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentParams extends StObject {
  
  var contentType: js.UndefOr[String] = js.native
  
  var data: String | Buffer | ReadWriteStream = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var knownLength: js.UndefOr[Double] = js.native
}
object AttachmentParams {
  
  @scala.inline
  def apply(data: String | Buffer | ReadWriteStream): AttachmentParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentParams]
  }
  
  @scala.inline
  implicit class AttachmentParamsMutableBuilder[Self <: AttachmentParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setData(value: String | Buffer | ReadWriteStream): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setKnownLength(value: Double): Self = StObject.set(x, "knownLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnownLengthUndefined: Self = StObject.set(x, "knownLength", js.undefined)
  }
}
