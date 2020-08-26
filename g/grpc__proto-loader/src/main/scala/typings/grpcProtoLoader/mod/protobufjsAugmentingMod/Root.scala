package typings.grpcProtoLoader.mod.protobufjsAugmentingMod

import typings.protobufjs.descriptorMod.IFileDescriptorSet
import typings.protobufjs.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Root extends js.Object {
  def toDescriptor(protoVersion: String): Message[IFileDescriptorSet] with IFileDescriptorSet = js.native
}

object Root {
  @scala.inline
  def apply(toDescriptor: String => Message[IFileDescriptorSet] with IFileDescriptorSet): Root = {
    val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
    __obj.asInstanceOf[Root]
  }
  @scala.inline
  implicit class RootOps[Self <: Root] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToDescriptor(value: String => Message[IFileDescriptorSet] with IFileDescriptorSet): Self = this.set("toDescriptor", js.Any.fromFunction1(value))
  }
  
}

