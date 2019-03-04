package typings
package atGrpcProtoDashLoaderLib.atGrpcProtoDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumTypeDefinition
  extends ProtobufTypeDefinition
     with AnyDefinition {
  @JSName("format")
  var format_EnumTypeDefinition: atGrpcProtoDashLoaderLib.atGrpcProtoDashLoaderLibStrings.`Protocol Buffer 3 EnumDescriptorProto`
}

object EnumTypeDefinition {
  @scala.inline
  def apply(
    fileDescriptorProtos: js.Array[nodeLib.Buffer],
    format: atGrpcProtoDashLoaderLib.atGrpcProtoDashLoaderLibStrings.`Protocol Buffer 3 EnumDescriptorProto`,
    `type`: js.Object
  ): EnumTypeDefinition = {
    val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos, format = format)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EnumTypeDefinition]
  }
}

