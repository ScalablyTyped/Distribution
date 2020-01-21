package typings.grpcGrpcJs.makeClientMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtobufTypeDefinition extends js.Object {
  var fileDescriptorProtos: js.Array[Buffer]
  var format: String
  var `type`: js.Object
}

object ProtobufTypeDefinition {
  @scala.inline
  def apply(fileDescriptorProtos: js.Array[Buffer], format: String, `type`: js.Object): ProtobufTypeDefinition = {
    val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtobufTypeDefinition]
  }
}

