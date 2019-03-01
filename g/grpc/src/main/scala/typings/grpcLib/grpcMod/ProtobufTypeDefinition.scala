package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtobufTypeDefinition extends js.Object {
  var fileDescriptorProtos: js.Array[nodeLib.Buffer]
  var format: java.lang.String
  var `type`: js.Object
}

object ProtobufTypeDefinition {
  @scala.inline
  def apply(fileDescriptorProtos: js.Array[nodeLib.Buffer], format: java.lang.String, `type`: js.Object): ProtobufTypeDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("fileDescriptorProtos")(fileDescriptorProtos)
    __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[ProtobufTypeDefinition]
  }
}

