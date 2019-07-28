package typings.atGrpcProtoDashLoader.atGrpcProtoDashLoaderMod

import typings.atGrpcProtoDashLoader.atGrpcProtoDashLoaderStrings.`Protocol Buffer 3 DescriptorProto`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTypeDefinition
  extends ProtobufTypeDefinition
     with _AnyDefinition {
  @JSName("format")
  var format_MessageTypeDefinition: `Protocol Buffer 3 DescriptorProto`
}

object MessageTypeDefinition {
  @scala.inline
  def apply(
    fileDescriptorProtos: js.Array[Buffer],
    format: `Protocol Buffer 3 DescriptorProto`,
    `type`: js.Object
  ): MessageTypeDefinition = {
    val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos, format = format)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MessageTypeDefinition]
  }
}

