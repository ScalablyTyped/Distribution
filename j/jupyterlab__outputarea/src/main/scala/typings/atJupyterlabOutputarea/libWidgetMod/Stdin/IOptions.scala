package typings.atJupyterlabOutputarea.libWidgetMod.Stdin

import typings.atJupyterlabServices.libKernelKernelMod.Kernel.IShellFuture
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IShellMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ShellMessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options to create a stdin widget.
  */
trait IOptions extends js.Object {
  /**
    * The kernel future associated with the request.
    */
  var future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]]
  /**
    * Whether the input is a password.
    */
  var password: Boolean
  /**
    * The prompt text.
    */
  var prompt: String
}

object IOptions {
  @scala.inline
  def apply(
    future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]],
    password: Boolean,
    prompt: String
  ): IOptions = {
    val __obj = js.Dynamic.literal(future = future, password = password, prompt = prompt)
  
    __obj.asInstanceOf[IOptions]
  }
}

