package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentType extends StObject {
  
  var contentType: String
  
  var data: typings.node.bufferMod.global.Buffer
}
object ContentType {
  
  inline def apply(contentType: String, data: typings.node.bufferMod.global.Buffer): ContentType = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentType]
  }
  
  extension [Self <: ContentType](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setData(value: typings.node.bufferMod.global.Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
