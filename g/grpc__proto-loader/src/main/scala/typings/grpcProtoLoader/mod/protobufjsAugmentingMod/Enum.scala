package typings.grpcProtoLoader.mod.protobufjsAugmentingMod

import typings.protobufjs.descriptorMod.IEnumDescriptorProto
import typings.protobufjs.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enum extends js.Object {
  def toDescriptor(protoVersion: String): Message[IEnumDescriptorProto] with IEnumDescriptorProto
}

object Enum {
  @scala.inline
  def apply(toDescriptor: String => Message[IEnumDescriptorProto] with IEnumDescriptorProto): Enum = {
    val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
  
    __obj.asInstanceOf[Enum]
  }
}

