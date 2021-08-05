package typings.mailgunJs.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentParams extends StObject {
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var data: String | Buffer | ReadWriteStream
  
  var filename: js.UndefOr[String] = js.undefined
  
  var knownLength: js.UndefOr[Double] = js.undefined
}
object AttachmentParams {
  
  inline def apply(data: String | Buffer | ReadWriteStream): AttachmentParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentParams]
  }
  
  extension [Self <: AttachmentParams](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setData(value: String | Buffer | ReadWriteStream): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setKnownLength(value: Double): Self = StObject.set(x, "knownLength", value.asInstanceOf[js.Any])
    
    inline def setKnownLengthUndefined: Self = StObject.set(x, "knownLength", js.undefined)
  }
}
