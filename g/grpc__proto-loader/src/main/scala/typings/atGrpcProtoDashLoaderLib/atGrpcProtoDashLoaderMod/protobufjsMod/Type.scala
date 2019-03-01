package typings
package atGrpcProtoDashLoaderLib.atGrpcProtoDashLoaderMod.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  def toDescriptor(protoVersion: java.lang.String): (protobufjsLib.protobufjsMod.Message[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IDescriptorProto */ _
  ]) with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IDescriptorProto */ js.Any)
}

object Type {
  @scala.inline
  def apply(
    toDescriptor: js.Function1[
      java.lang.String, 
      (protobufjsLib.protobufjsMod.Message[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IDescriptorProto */ _
      ]) with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IDescriptorProto */ js.Any)
    ]
  ): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toDescriptor")(toDescriptor)
    __obj.asInstanceOf[Type]
  }
}

