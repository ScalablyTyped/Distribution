package typings.grpc.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtobufTypeDefinition extends js.Object {
  
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
  implicit class ProtobufTypeDefinitionOps[Self <: ProtobufTypeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileDescriptorProtosVarargs(value: Buffer*): Self = this.set("fileDescriptorProtos", js.Array(value :_*))
    
    @scala.inline
    def setFileDescriptorProtos(value: js.Array[Buffer]): Self = this.set("fileDescriptorProtos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Object): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
