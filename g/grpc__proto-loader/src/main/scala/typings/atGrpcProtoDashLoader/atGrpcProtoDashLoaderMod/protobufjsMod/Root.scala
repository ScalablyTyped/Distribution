package typings.atGrpcProtoDashLoader.atGrpcProtoDashLoaderMod.protobufjsMod

import typings.protobufjs.protobufjsMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root extends js.Object {
  def toDescriptor(protoVersion: String): (Message[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IFileDescriptorSet */ _
  ]) with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IFileDescriptorSet */ js.Any)
}

object Root {
  @scala.inline
  def apply(
    toDescriptor: String => (Message[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IFileDescriptorSet */ _
    ]) with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IFileDescriptorSet */ js.Any)
  ): Root = {
    val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
  
    __obj.asInstanceOf[Root]
  }
}

