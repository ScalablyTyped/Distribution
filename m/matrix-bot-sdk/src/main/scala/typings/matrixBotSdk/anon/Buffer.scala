package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer extends StObject {
  
  var buffer: typings.node.bufferMod.global.Buffer
  
  var file: OmitEncryptedFileurl
}
object Buffer {
  
  inline def apply(buffer: typings.node.bufferMod.global.Buffer, file: OmitEncryptedFileurl): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: typings.node.bufferMod.global.Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setFile(value: OmitEncryptedFileurl): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
