package typings.atJupyterlabServices

import typings.atJupyterlabServices.libKernelKernelMod.Kernel.IModel
import typings.atJupyterlabServices.libKernelKernelMod.Kernel.ISpecModel
import typings.atJupyterlabServices.libKernelKernelMod.Kernel.ISpecModels
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/validate", JSImport.Namespace)
@js.native
object libKernelValidateMod extends js.Object {
  def validateMessage(msg: IMessage[MessageType]): Unit = js.native
  def validateModel(model: IModel): Unit = js.native
  def validateSpecModel(data: js.Any): ISpecModel = js.native
  def validateSpecModels(data: js.Any): ISpecModels = js.native
}

