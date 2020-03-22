package typings.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kernelKernelMod {
  type IControlFuture[REQUEST /* <: typings.jupyterlabServices.messagesMod.IControlMessage[typings.jupyterlabServices.messagesMod.ControlMessageType] */, REPLY /* <: typings.jupyterlabServices.messagesMod.IControlMessage[typings.jupyterlabServices.messagesMod.ControlMessageType] */] = typings.jupyterlabServices.kernelKernelMod.IFuture[REQUEST, REPLY]
  type IKernelConnection = typings.jupyterlabServices.kernelKernelMod.IKernelConnection_
  type IShellFuture[REQUEST /* <: typings.jupyterlabServices.messagesMod.IShellMessage[typings.jupyterlabServices.messagesMod.ShellMessageType] */, REPLY /* <: typings.jupyterlabServices.messagesMod.IShellMessage[typings.jupyterlabServices.messagesMod.ShellMessageType] */] = typings.jupyterlabServices.kernelKernelMod.IFuture[REQUEST, REPLY]
}
