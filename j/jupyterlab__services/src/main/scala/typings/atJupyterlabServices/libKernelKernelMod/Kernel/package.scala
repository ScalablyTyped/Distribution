package typings.atJupyterlabServices.libKernelKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Kernel {
  import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ControlMessageType
  import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IControlMessage
  import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IShellMessage
  import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ShellMessageType

  type IControlFuture[REQUEST /* <: IControlMessage[ControlMessageType] */, REPLY /* <: IControlMessage[ControlMessageType] */] = IFuture[REQUEST, REPLY]
  type IShellFuture[REQUEST /* <: IShellMessage[ShellMessageType] */, REPLY /* <: IShellMessage[ShellMessageType] */] = IFuture[REQUEST, REPLY]
}
