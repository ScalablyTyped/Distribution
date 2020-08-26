package typings.grpcProtoLoader.mod

import typings.grpcProtoLoader.grpcProtoLoaderStrings.`Protocol Buffer 3 EnumDescriptorProto`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumTypeDefinition
  extends ProtobufTypeDefinition
     with _AnyDefinition {
  @JSName("format")
  var format_EnumTypeDefinition: `Protocol Buffer 3 EnumDescriptorProto` = js.native
}

object EnumTypeDefinition {
  @scala.inline
  def apply(
    fileDescriptorProtos: js.Array[Buffer],
    format: `Protocol Buffer 3 EnumDescriptorProto`,
    `type`: js.Object
  ): EnumTypeDefinition = {
    val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumTypeDefinition]
  }
  @scala.inline
  implicit class EnumTypeDefinitionOps[Self <: EnumTypeDefinition] (val x: Self) extends AnyVal {
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
    def setFormat(value: `Protocol Buffer 3 EnumDescriptorProto`): Self = this.set("format", value.asInstanceOf[js.Any])
  }
  
}

