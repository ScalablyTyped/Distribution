package typings
package atGrpcProtoDashLoaderLib.atGrpcProtoDashLoaderMod.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enum extends js.Object {
  def toDescriptor(protoVersion: java.lang.String): (protobufjsLib.protobufjsMod.Message[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IEnumDescriptorProto */ _
  ]) with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IEnumDescriptorProto */ js.Any)
}

object Enum {
  @scala.inline
  def apply(
    toDescriptor: js.Function1[
      java.lang.String, 
      (protobufjsLib.protobufjsMod.Message[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IEnumDescriptorProto */ _
      ]) with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify descriptor.IEnumDescriptorProto */ js.Any)
    ]
  ): Enum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toDescriptor")(toDescriptor)
    __obj.asInstanceOf[Enum]
  }
}

