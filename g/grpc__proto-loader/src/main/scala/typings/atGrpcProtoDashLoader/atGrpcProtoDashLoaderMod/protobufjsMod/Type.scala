package typings.atGrpcProtoDashLoader.atGrpcProtoDashLoaderMod.protobufjsMod

import typings.protobufjs.protobufjsMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  def toDescriptor(protoVersion: String): (Message[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IDescriptorProto */ _
  ]) with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IDescriptorProto */ js.Any)
}

object Type {
  @scala.inline
  def apply(
    toDescriptor: String => (Message[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IDescriptorProto */ _
    ]) with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IDescriptorProto */ js.Any)
  ): Type = {
    val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
  
    __obj.asInstanceOf[Type]
  }
}

