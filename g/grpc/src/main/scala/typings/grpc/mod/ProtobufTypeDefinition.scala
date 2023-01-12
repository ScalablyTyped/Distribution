package typings.grpc.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtobufTypeDefinition extends StObject {
  
  var fileDescriptorProtos: js.Array[Buffer]
  
  var format: String
  
  var `type`: js.Object
}
object ProtobufTypeDefinition {
  
  inline def apply(fileDescriptorProtos: js.Array[Buffer], format: String, `type`: js.Object): ProtobufTypeDefinition = {
    val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtobufTypeDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtobufTypeDefinition] (val x: Self) extends AnyVal {
    
    inline def setFileDescriptorProtos(value: js.Array[Buffer]): Self = StObject.set(x, "fileDescriptorProtos", value.asInstanceOf[js.Any])
    
    inline def setFileDescriptorProtosVarargs(value: Buffer*): Self = StObject.set(x, "fileDescriptorProtos", js.Array(value*))
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
