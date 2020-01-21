package typings.jupyterlabServices.kernelKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Kernel {
  type IControlFuture[REQUEST /* <: typings.jupyterlabServices.messagesMod.KernelMessage.IControlMessage[typings.jupyterlabServices.messagesMod.KernelMessage.ControlMessageType] */, REPLY /* <: typings.jupyterlabServices.messagesMod.KernelMessage.IControlMessage[typings.jupyterlabServices.messagesMod.KernelMessage.ControlMessageType] */] = typings.jupyterlabServices.kernelKernelMod.Kernel.IFuture[REQUEST, REPLY]
  type IShellFuture[REQUEST /* <: typings.jupyterlabServices.messagesMod.KernelMessage.IShellMessage[typings.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType] */, REPLY /* <: typings.jupyterlabServices.messagesMod.KernelMessage.IShellMessage[typings.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType] */] = typings.jupyterlabServices.kernelKernelMod.Kernel.IFuture[REQUEST, REPLY]
}
