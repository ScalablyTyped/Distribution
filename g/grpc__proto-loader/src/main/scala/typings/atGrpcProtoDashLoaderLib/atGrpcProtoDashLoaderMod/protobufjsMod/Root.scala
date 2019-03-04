package typings
package atGrpcProtoDashLoaderLib.atGrpcProtoDashLoaderMod.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root extends js.Object {
  def toDescriptor(protoVersion: java.lang.String): (protobufjsLib.protobufjsMod.Message[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IFileDescriptorSet */ _
  ]) with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IFileDescriptorSet */ js.Any)
}

object Root {
  @scala.inline
  def apply(
    toDescriptor: js.Function1[
      java.lang.String, 
      (protobufjsLib.protobufjsMod.Message[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IFileDescriptorSet */ _
      ]) with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IFileDescriptorSet */ js.Any)
    ]
  ): Root = {
    val __obj = js.Dynamic.literal(toDescriptor = toDescriptor)
  
    __obj.asInstanceOf[Root]
  }
}

