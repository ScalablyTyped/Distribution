package typings.jupyterlabOutputarea.widgetMod.Stdin

import typings.jupyterlabServices.kernelKernelMod.IShellFuture
import typings.jupyterlabServices.messagesMod.IShellMessage
import typings.jupyterlabServices.messagesMod.ShellMessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options to create a stdin widget.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The kernel future associated with the request.
    */
  var future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  
  /**
    * Whether the input is a password.
    */
  var password: Boolean = js.native
  
  /**
    * The prompt text.
    */
  var prompt: String = js.native
}
object IOptions {
  
  @scala.inline
  def apply(
    future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]],
    password: Boolean,
    prompt: String
  ): IOptions = {
    val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setFuture(value: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]]): Self = this.set("future", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: Boolean): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
  }
}
