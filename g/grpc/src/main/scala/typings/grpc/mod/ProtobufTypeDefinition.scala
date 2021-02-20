package typings.grpc.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtobufTypeDefinition extends StObject {
  
  var fileDescriptorProtos: js.Array[Buffer] = js.native
  
  var format: String = js.native
  
  var `type`: js.Object = js.native
}
object ProtobufTypeDefinition {
  
  @scala.inline
  def apply(fileDescriptorProtos: js.Array[Buffer], format: String, `type`: js.Object): ProtobufTypeDefinition = {
    val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtobufTypeDefinition]
  }
  
  @scala.inline
  implicit class ProtobufTypeDefinitionMutableBuilder[Self <: ProtobufTypeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileDescriptorProtos(value: js.Array[Buffer]): Self = StObject.set(x, "fileDescriptorProtos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDescriptorProtosVarargs(value: Buffer*): Self = StObject.set(x, "fileDescriptorProtos", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
