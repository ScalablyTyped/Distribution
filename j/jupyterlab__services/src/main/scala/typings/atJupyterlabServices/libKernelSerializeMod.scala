package typings.atJupyterlabServices

import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.MessageType
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/serialize", JSImport.Namespace)
@js.native
object libKernelSerializeMod extends js.Object {
  def deserialize(data: String): IMessage[MessageType] = js.native
  def deserialize(data: ArrayBuffer): IMessage[MessageType] = js.native
  def serialize(msg: IMessage[MessageType]): String | ArrayBuffer = js.native
}

